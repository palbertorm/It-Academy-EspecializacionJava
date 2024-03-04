package cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n01.S04T02N01PauloAlberto.repository;

import cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n01.S04T02N01PauloAlberto.domain.Fruita;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface FruitaRepository extends JpaRepository<Fruita, Integer> {
    List<Fruita> findByName(String name);
}
