package cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n02.S04T02N02PauloAlberto.repository;

import cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n02.S04T02N02PauloAlberto.model.Fruita;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FruitasRepository extends JpaRepository<Fruita, Long> {
    List<Fruita> findByName(String name);
}
