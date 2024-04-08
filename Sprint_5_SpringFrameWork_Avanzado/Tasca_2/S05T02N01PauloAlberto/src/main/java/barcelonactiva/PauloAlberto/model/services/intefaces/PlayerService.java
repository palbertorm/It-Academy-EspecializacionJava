package barcelonactiva.PauloAlberto.model.services.intefaces;

import barcelonactiva.PauloAlberto.model.dto.PlayerDTO;

import java.util.List;

public interface PlayerService {
    PlayerDTO addPlayer(PlayerDTO player);
    PlayerDTO getOne(long playerId);
    List<PlayerDTO> getAllplayers();
    PlayerDTO updatePlayer(long playerId, PlayerDTO newPlayerDTO);
    void deletePlayer(long id);
}
