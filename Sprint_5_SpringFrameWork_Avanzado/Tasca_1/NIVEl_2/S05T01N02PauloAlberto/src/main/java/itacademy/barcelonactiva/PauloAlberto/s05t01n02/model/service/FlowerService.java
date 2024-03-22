package itacademy.barcelonactiva.PauloAlberto.s05t01n02.model.service;

import itacademy.barcelonactiva.PauloAlberto.s05t01n02.model.domain.FlowerEntity;
import itacademy.barcelonactiva.PauloAlberto.s05t01n02.model.dto.FlowerDTO;
import itacademy.barcelonactiva.PauloAlberto.s05t01n02.model.mapper.Mapper;
import itacademy.barcelonactiva.PauloAlberto.s05t01n02.model.repository.FlowerRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class FlowerService {
    private final FlowerRepository repository;

    @Autowired
    private Mapper mapper;

    @Autowired
    public FlowerService(FlowerRepository repository) {
        this.repository = repository;
    }

    public List<FlowerDTO> getAllFlowers() {
        List<FlowerEntity> flowerEntities = repository.findAll();
        return flowerEntities.stream().map(mapper::toDto).collect(Collectors.toList());
    }
    public FlowerDTO addFlower(FlowerEntity flowerEntity) {
        repository.save(flowerEntity);
        return mapper.toDto(flowerEntity);
    }
    public FlowerDTO updateFlower(FlowerEntity flowerEntity, int id) {
        Optional<FlowerEntity> dataFlowerEntity = repository.findById(id);
        if (dataFlowerEntity.isEmpty()) {
            throw new EntityNotFoundException(" arrombado" + id + " does not exist");
        }
        FlowerEntity entityToReturn = dataFlowerEntity.get();
        entityToReturn.setNameFlower(flowerEntity.getNameFlower());
        entityToReturn.setCountryFlower(flowerEntity.getCountryFlower());
        repository.save(entityToReturn);
        return mapper.toDto(entityToReturn);
    }
    public FlowerDTO getFlowerById(int id){
        Optional<FlowerEntity> dataFlowerEntity = repository.findById(id);
        if (dataFlowerEntity.isEmpty()) {
            throw new EntityNotFoundException(" arrombado" + id + " does not exist");
        }
        FlowerEntity entityToReturn = dataFlowerEntity.get();
        return mapper.toDto(entityToReturn);

    }
    public void deleteFlower (int id){
        if (!repository.existsById(id)){
            throw new EntityNotFoundException("flower with ID " + id + " not found");
        }
        repository.deleteById(id);
    }


}
