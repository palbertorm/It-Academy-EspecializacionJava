package cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n03.S04T02N03PauloAlberto.repository;

import cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n03.S04T02N03PauloAlberto.model.Fruita;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface FruitaRepository extends MongoRepository<Fruita, Integer> {
    List<Fruita> findByName(String name);
}
