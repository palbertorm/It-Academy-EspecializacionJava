package barcelonactiva.PauloAlberto.model.repository;

import barcelonactiva.PauloAlberto.model.domain.Game;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RepositoryGame extends JpaRepository<Game, Long> {
    List<Game> findByPlayer_id (long playerId);
    void deleteByPlayer_id (long playerId);
}
