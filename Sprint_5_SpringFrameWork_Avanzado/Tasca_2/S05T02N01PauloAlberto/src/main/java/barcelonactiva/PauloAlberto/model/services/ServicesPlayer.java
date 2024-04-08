package barcelonactiva.PauloAlberto.model.services;

import barcelonactiva.PauloAlberto.exceptions.PlayerAlreadyExists;
import barcelonactiva.PauloAlberto.exceptions.PlayerNotFound;
import barcelonactiva.PauloAlberto.model.domain.Player;
import barcelonactiva.PauloAlberto.model.dto.PlayerDTO;
import barcelonactiva.PauloAlberto.model.repository.RepositoryPlayer;
import barcelonactiva.PauloAlberto.model.services.intefaces.PlayerService;
import barcelonactiva.PauloAlberto.model.utils.PlayerConverter;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

public class ServicesPlayer implements PlayerService {
    @Autowired
    private RepositoryPlayer repositoryPlayer;

    @Override
    public PlayerDTO addPlayer(PlayerDTO playerDTO) {
        if (playerDTO.getName() == null || playerDTO.getName().isBlank() || playerDTO.getName().equalsIgnoreCase("Unknown")){
            playerDTO.setName("UNKNOWN");
        } else if(repositoryPlayer.existsByNameIgnoreCase(playerDTO.getName())) {
            throw new PlayerAlreadyExists("Ups! Player already exists.");
        }
        return setNewPlayer(playerDTO);
    }
    private PlayerDTO setNewPlayer (PlayerDTO playerDTO){

        playerDTO.setName(playerDTO.getName());
        playerDTO.setRegistrationDate(LocalDate.from(LocalDateTime.now()));
        Player player = PlayerConverter.DTOtoEntity(playerDTO);
        repositoryPlayer.save(player);
        return PlayerConverter.EntitytoDTO(player);

    }
    @Override
    public PlayerDTO getOne(long playerId) {
        Player playerExists = findPlayerById(playerId);
        return PlayerConverter.EntitytoDTO(playerExists);
        }
    //maybe should change the type for PlayerDTO
    public Player findPlayerById(long playerId) {
        return repositoryPlayer.findById(playerId).orElseThrow(() -> new PlayerNotFound("Player not found"));
    }

    @Override
    public List<PlayerDTO> getAllplayers() {
        List<Player> players = repositoryPlayer.findAll();

        if(players.isEmpty()){
            throw new PlayerNotFound("No players in the system.");
        }
        return players.stream()
                .map(PlayerConverter::EntitytoDTO)
                .collect(Collectors.toList());
    }

    @Override
    public PlayerDTO updatePlayer(long playerId, PlayerDTO newPlayerDTO) {
        Player playerToUpdate = findPlayerById(playerId);

        if (newPlayerDTO.getName() == null || newPlayerDTO.getName().isBlank()){
            newPlayerDTO.setName("UNKNOWN");
        } else if(repositoryPlayer.existsByNameIgnoreCase(newPlayerDTO.getName())) {
            throw new PlayerAlreadyExists("Ups! Player already exists.");
        }
        playerToUpdate.setName(newPlayerDTO.getName());
        repositoryPlayer.save(playerToUpdate);
        return PlayerConverter.EntitytoDTO(playerToUpdate);
    }

    @Override
    public void deletePlayer (long playerId){
        Player playerToDelete = repositoryPlayer.findById(playerId)
                .orElseThrow(() -> new PlayerNotFound("Player not found."));
        repositoryPlayer.deleteById(playerId);
    }
    }
}
