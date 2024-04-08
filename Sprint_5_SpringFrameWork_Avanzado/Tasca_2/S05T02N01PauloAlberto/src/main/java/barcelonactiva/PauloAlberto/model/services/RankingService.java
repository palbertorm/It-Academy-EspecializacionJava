package barcelonactiva.PauloAlberto.model.services;

import barcelonactiva.PauloAlberto.model.domain.Player;
import barcelonactiva.PauloAlberto.model.dto.PlayerDTO;
import barcelonactiva.PauloAlberto.model.repository.RepositoryPlayer;
import barcelonactiva.PauloAlberto.model.services.intefaces.PlayerRankingService;
import barcelonactiva.PauloAlberto.model.utils.PlayerConverter;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Comparator;
import java.util.List;

public class RankingService implements PlayerRankingService {
    @Autowired
    private RepositoryPlayer repositoryPlayer;

    @Override
    public double getSuccessRateAverage() {
        List<Player> players = repositoryPlayer.findAll();
        if(players.isEmpty()){
            throw new IllegalStateException("No players found");
        }
        double totalSuccessRate = players.stream()
                .mapToDouble(Player::calculateSuccessRate)
                .sum();
        return Math.round(totalSuccessRate / players.size());
    }

    @Override
    public PlayerDTO getWinner() {
        List<Player> players = repositoryPlayer.findAll();
        if(players.isEmpty()){
            throw new IllegalStateException("Players not found in the system.");
        }
        Player winner = players.stream().max(Comparator.comparing(Player::calculateSuccessRate))
                .orElse(null);
        return PlayerConverter.EntitytoDTO(winner);
    }

    @Override
    public PlayerDTO getLoser() {
        List<Player> players = repositoryPlayer.findAll();
        if(players.isEmpty()){
            throw new IllegalStateException("Players not found in the system.");
        }
        Player loser = players.stream().min(Comparator.comparing(Player::calculateSuccessRate))
                .orElse(null);
        return PlayerConverter.EntitytoDTO(loser);
    }
}
