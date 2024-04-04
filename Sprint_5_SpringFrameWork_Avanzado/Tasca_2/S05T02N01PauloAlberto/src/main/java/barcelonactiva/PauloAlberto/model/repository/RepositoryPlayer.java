package barcelonactiva.PauloAlberto.model.repository;

import barcelonactiva.PauloAlberto.model.domain.Player;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RepositoryPlayer extends JpaRepository<Player, Long> {
    Optional<Player> findByname(String name);
    boolean existsByNameIgnoreCase(String name );
}

