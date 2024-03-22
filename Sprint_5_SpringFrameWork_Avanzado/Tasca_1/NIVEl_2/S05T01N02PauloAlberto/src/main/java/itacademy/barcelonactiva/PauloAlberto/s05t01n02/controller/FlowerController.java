package itacademy.barcelonactiva.PauloAlberto.s05t01n02.controller;

import itacademy.barcelonactiva.PauloAlberto.s05t01n02.model.domain.FlowerEntity;
import itacademy.barcelonactiva.PauloAlberto.s05t01n02.model.dto.FlowerDTO;
import itacademy.barcelonactiva.PauloAlberto.s05t01n02.model.repository.FlowerRepository;
import itacademy.barcelonactiva.PauloAlberto.s05t01n02.model.service.FlowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value ="/flower")
public class FlowerController {
    @Autowired
    FlowerRepository flowerRepository;
    @Autowired
    FlowerService flowerService;


    @GetMapping("/getAll")
//    @ApiOperation(value = "Get all products", produces = "application/json") // Describe the operation
    public ResponseEntity<List<FlowerDTO>> getAllFlowers() {
        List<FlowerDTO> flowerDTOS = flowerService.getAllFlowers();
        return ResponseEntity.ok(flowerDTOS);
    }
    @PostMapping("/add")
    public ResponseEntity<FlowerDTO> createFlower(@RequestBody FlowerEntity flowerEntity){
        FlowerDTO response;
        try {
            response = flowerService.addFlower(flowerEntity);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
        }catch (Exception e){
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @PutMapping("/{id}")
    public  ResponseEntity<FlowerDTO> updateFlower(@PathVariable int id,@RequestBody FlowerEntity flowerEntity){
        FlowerDTO response;
        try {
            response = flowerService.updateFlower(flowerEntity, id);
            return ResponseEntity.status(HttpStatus.OK).body(response);
        }catch (Exception e){
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<FlowerDTO> deleteflower (@PathVariable int id){

        try {
            flowerService.deleteFlower(id);
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        }catch (Exception e){
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @GetMapping("/{id}")
    public ResponseEntity<FlowerDTO> getflowerById(@PathVariable int id){
        FlowerDTO response;
        try{
            response = flowerService.getFlowerById(id);
            return ResponseEntity.status(HttpStatus.OK).body(response);
        }catch (Exception e){
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }



}
