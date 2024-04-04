package barcelonactiva.PauloAlberto.model.services.intefaces;

import barcelonactiva.PauloAlberto.model.dto.PlayerDTO;

import java.util.List;

public interface PlayerService {
    PlayerDTO addPlayer(PlayerDTO player);
    PlayerDTO getOne(PlayerDTO player);
    List<PlayerDTO> getAllplayers();
    PlayerDTO updatePlayer(long playerId, PlayerDTO newPlayerDTO);
}
