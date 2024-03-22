package itacademy.barcelonactiva.PauloAlberto.s05t01n02.model.mapper;

import itacademy.barcelonactiva.PauloAlberto.s05t01n02.model.domain.FlowerEntity;
import itacademy.barcelonactiva.PauloAlberto.s05t01n02.model.dto.FlowerDTO;
import org.springframework.stereotype.Component;

@Component
public class Mapper {
    public FlowerDTO toDto(FlowerEntity flowerEntity){
//        int id = flowerEntity.getId();
        String nameFlowerMapper = flowerEntity.getNameFlower();
        String countryFlowerMapper = flowerEntity.getCountryFlower();
        FlowerDTO flowerDTO = new FlowerDTO(nameFlowerMapper, countryFlowerMapper);
//        flowerDTO.setNameFlower(flowerEntity.getNameFlower());
//        flowerDTO.setCountryFlower(flowerEntity.getCountryFlower());
        flowerDTO.setTypeFlower(flowerDTO.isFlowerDTO()? "Flower from UE" : "isn't from UE");
        return flowerDTO;
    }
//    public FlowerEntity toEntity ( FlowerDTO flowerDTO){
//        String nameFlower = flowerDTO.getNameFlower();
//        String countryFlower = flowerDTO.getCountryFlower();
//        FlowerEntity flowerEntity = new FlowerEntity();
//        flowerEntity.setNameFlower(flowerDTO.getNameFlower());
//        flowerEntity.setCountryFlower(flowerDTO.getCountryFlower());
//        return flowerEntity;
//    }
}
