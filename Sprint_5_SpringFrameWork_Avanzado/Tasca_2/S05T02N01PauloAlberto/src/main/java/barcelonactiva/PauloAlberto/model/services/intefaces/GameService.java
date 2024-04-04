package barcelonactiva.PauloAlberto.model.services.intefaces;

import barcelonactiva.PauloAlberto.model.dto.GameDTO;

import java.util.List;

public interface GameService {
    GameDTO playGame (long playerId);
    List<GameDTO> getAllGames (long playerId);
    void deleteAllGames (long playerId);
}
