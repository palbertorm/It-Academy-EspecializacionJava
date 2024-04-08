package barcelonactiva.PauloAlberto.model.utils;

import barcelonactiva.PauloAlberto.model.domain.Game;
import barcelonactiva.PauloAlberto.model.dto.GameDTO;

public class GameConverter {
    public static GameDTO entityToDTO(Game game) {
        GameDTO gameDTO = new GameDTO();
        gameDTO.setGameId(game.getGameId());
        gameDTO.setDice1(gameDTO.getDice1());
        gameDTO.setDice2(gameDTO.getDice2());
        gameDTO.setWon(game.isWon());
        return gameDTO;
    }
}
