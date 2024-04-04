package barcelonactiva.PauloAlberto.model.services;

import barcelonactiva.PauloAlberto.model.domain.Game;
import barcelonactiva.PauloAlberto.model.domain.Player;
import barcelonactiva.PauloAlberto.model.dto.GameDTO;
import barcelonactiva.PauloAlberto.model.repository.RepositoryGame;
import barcelonactiva.PauloAlberto.model.repository.RepositoryPlayer;
import barcelonactiva.PauloAlberto.model.services.intefaces.GameService;
import barcelonactiva.PauloAlberto.model.services.intefaces.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Random;

public class ServicesGame implements GameService {
    @Autowired
    private RepositoryGame repositoryGame;
    @Autowired
    private ServicesPlayer servicesPlayer;
    @Transactional
    @Override
    public GameDTO playGame(long playerId) {
        Player player = servicesPlayer.findPlayerById(playerId);
        Game newGame = new Game();
        newGame.setPlayer(player);
        rollDice(newGame);
        player.addGame(newGame);
        repositoryGame.save(newGame);
        // devolver dto
        return null;
    }
    private void rollDice (Game game) {
        Random random = new Random();
        int dice1 = random.nextInt(6)+1;
        int dice2 = random.nextInt(6) +1;
        game.setDice1(dice1);
        game.setDice2(dice2);
        game.setWon(game.isWon());
    }

    @Transactional
    @Override
    public List<GameDTO> getAllGames(long playerId) {
        Player player = servicesPlayer.findPlayerById(playerId);
        List<Game> games = repositoryGame.findByPlayer_id(player.getPlayerId());
        if (games == null || games.isEmpty()) {
            throw new IllegalStateException("No games found");
        }
        //  retornar game dto
        return null;
    }

    @Transactional
    @Override
    public void deleteAllGames(long playerId) {
        Player player = servicesPlayer.findPlayerById(playerId);
        List<Game> games = player.getGames();
        if (games == null || games.isEmpty()) {
            throw new IllegalStateException("No games found");
        }
        games.clear();
        repositoryGame.deleteByPlayer_id(player.getPlayerId());
    }



}
