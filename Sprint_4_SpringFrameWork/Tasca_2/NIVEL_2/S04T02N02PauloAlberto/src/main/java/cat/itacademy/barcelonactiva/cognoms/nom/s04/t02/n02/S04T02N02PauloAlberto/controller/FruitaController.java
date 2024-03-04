package cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n02.S04T02N02PauloAlberto.controller;

import cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n02.S04T02N02PauloAlberto.model.Fruita;
import cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n02.S04T02N02PauloAlberto.repository.FruitasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:9001")
@RestController
public class FruitaController {
    @Autowired
    FruitasRepository fruitasRepository;

    @GetMapping("/fruitas")
    public ResponseEntity<List<Fruita>> getAllFruitas(@RequestParam String name) {
        try {
            List<Fruita> listFruitas = new ArrayList<Fruita>();
            if (name == null) {
                fruitasRepository.findAll().forEach(listFruitas::add);
            } else {
                fruitasRepository.findByName(name).forEach(listFruitas::add);
            }
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/fruitas/{id}")
    public ResponseEntity<Fruita> getFruitasById(@PathVariable("id") long id) {
        Optional<Fruita> fruitaData = fruitasRepository.findById(id);
        if (fruitaData.isPresent()) {
            return new ResponseEntity<>(fruitaData.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/fruitas/add")
    public ResponseEntity<Fruita> createFruita(@RequestBody Fruita fruita) {
        try {
            Fruita fruita_ = fruitasRepository.save(new Fruita(fruita.getName(), fruita.getWeight()));
            return new ResponseEntity<>(fruita_, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/fruitas/update/{id}")
    public ResponseEntity<Fruita> updateFruita(@PathVariable long id, @RequestBody Fruita fruita) {
        Optional<Fruita> fruitaData = fruitasRepository.findById(id);

        if (fruitaData.isPresent()) {
            Fruita fruita_ = fruitaData.get();
            fruita_.setName(fruita.getName());
            return new ResponseEntity<>(fruitasRepository.save(fruita_), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/fruita/delete/{id}")
    public ResponseEntity<HttpStatus> deleteFruita(@PathVariable long id) {
        try {
            fruitasRepository.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
