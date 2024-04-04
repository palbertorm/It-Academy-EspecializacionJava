package cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n03.S04T02N03PauloAlberto.controller;

import cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n03.S04T02N03PauloAlberto.model.domain.Flower;
import cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n03.S04T02N03PauloAlberto.model.service.FlowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class FlowerController {
    @Autowired
    FlowerService flowerService;
    @Autowired
    private WebClient webClient;
    @GetMapping("/getAll")
//    @ApiOperation(value = "Get all products", produces = "application/json") // Describe the operation
    public ResponseEntity<Flux<Flower>> getAllFlowers() {
        try {
        return new ResponseEntity<>(flowerService.getFlowerList(), HttpStatus.OK);

        }catch (RuntimeException e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @GetMapping("/{id}")
    public ResponseEntity<Mono<Flower>>getByid(@PathVariable int id){
        try {
            return new ResponseEntity<>(flowerService.getflowerId(id), HttpStatus.OK);
        }catch (RuntimeException e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/create")
    public ResponseEntity<Mono<Flower>>create(@RequestBody Flower flower){
        try {
            return  new ResponseEntity<>(flowerService.createFlower(flower), HttpStatus.CREATED);
        }catch (RuntimeException e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}