package barcelonactiva.PauloAlberto.model.services;

import barcelonactiva.PauloAlberto.model.domain.Player;
import barcelonactiva.PauloAlberto.model.dto.PlayerDTO;
import barcelonactiva.PauloAlberto.model.repository.RepositoryPlayer;
import barcelonactiva.PauloAlberto.model.services.intefaces.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ServicesPlayer implements PlayerService {
    @Autowired
    private RepositoryPlayer repositoryPlayer;

    @Override
    public PlayerDTO addPlayer(PlayerDTO player) {
        return null;
    }

    @Override
    public PlayerDTO getOne(PlayerDTO player) {
        return null;
    }
    //maybe should change the type for PlayerDTO
    public Player findPlayerById(long playerId) {
        return repositoryPlayer.findById(playerId).orElseThrow(() -> new RuntimeException());
    }

    @Override
    public List<PlayerDTO> getAllplayers() {
        return null;
    }

    @Override
    public PlayerDTO updatePlayer(long playerId, PlayerDTO newPlayerDTO) {
        return null;
    }
}
