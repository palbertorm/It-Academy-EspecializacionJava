package itacademy.barcelonactiva.PauloAlberto.s05t01n02.model.repository;

import itacademy.barcelonactiva.PauloAlberto.s05t01n02.model.domain.FlowerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlowerRepository extends JpaRepository<FlowerEntity, Integer> {
}
