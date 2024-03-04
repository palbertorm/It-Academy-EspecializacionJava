package cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n03.S04T02N03PauloAlberto.controller;

import cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n03.S04T02N03PauloAlberto.model.Fruita;
import cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n03.S04T02N03PauloAlberto.repository.FruitaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@CrossOrigin("http://localhost:9001")
@RestController
public class FruitaController {
    @Autowired
    FruitaRepository fruitaRepository;

    @GetMapping("/fruitas")
    public ResponseEntity<List<Fruita>> getAllFruitas(@RequestParam(required = false) String name) {
        try {
            List<Fruita> listFruitas = new ArrayList<Fruita>();
            if (name == null) {
                fruitaRepository.findAll().forEach(listFruitas::add);
            } else {
                fruitaRepository.findByName(name).forEach(listFruitas::add);
            }
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/fruitas/getOne/{id}")
    public ResponseEntity<Fruita> getFruitaById(@PathVariable("id") String id) {

        Optional<Fruita> fruitaData = fruitaRepository.findById(id);
        if (fruitaData.isPresent()) {
            return new ResponseEntity<>(fruitaData.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/fruitas/add")
    public ResponseEntity<Fruita> createFruita(@RequestBody Fruita fruita) {

        try {
            Fruita fruita1 = fruitaRepository.save(new Fruita(fruita.getName(), fruita.getWeight()));
            return new ResponseEntity<>(fruita1, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/tutorials/update/{id}")
    public ResponseEntity<Fruita> updateFruita(@PathVariable("id") String id, @RequestBody Fruita fruita) {
        Optional<Fruita> fruitaData = fruitaRepository.findById(id);

        if (fruitaData.isPresent()) {
            Fruita fruita_ = fruitaData.get();
            fruita_.setName(fruita.getName());
            return new ResponseEntity<>(fruitaRepository.save(fruita_), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/fruitas/delete/{id}")
    public ResponseEntity<HttpStatus> deleteFruita(@PathVariable("id") String id) {
        try {
            fruitaRepository.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

}
