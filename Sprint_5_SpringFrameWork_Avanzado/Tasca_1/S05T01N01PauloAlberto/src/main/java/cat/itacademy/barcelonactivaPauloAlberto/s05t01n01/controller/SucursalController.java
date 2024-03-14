package cat.itacademy.barcelonactivaPauloAlberto.s05t01n01.controller;

import cat.itacademy.barcelonactivaPauloAlberto.s05t01n01.model.domain.Sucursal;
import cat.itacademy.barcelonactivaPauloAlberto.s05t01n01.model.dto.SucursalDTO;
import cat.itacademy.barcelonactivaPauloAlberto.s05t01n01.model.mapper.Mapper;
import cat.itacademy.barcelonactivaPauloAlberto.s05t01n01.model.service.SucursalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@CrossOrigin(origins = "http://localhost:9000")
@RestController
@RequestMapping("/sucursal")
public class SucursalController {
    @Autowired
    private SucursalService sucursalService;
    @Autowired
    private Mapper mapper;
    @GetMapping("/signup")
    public String showSignUpForm(SucursalDTO sucursalDTO) {
        return "add-user";
    }

    @PostMapping("/add")
    public ResponseEntity<SucursalDTO> createSucursal(@RequestBody Sucursal sucursal){
        try{
            SucursalDTO _sucursaDTO = mapper.toDto(sucursalService.addSucursal(sucursal));
            return new ResponseEntity<>(_sucursaDTO, HttpStatus.CREATED);
        }catch (Exception e){
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @GetMapping("/getAll")
    public List<SucursalDTO> getAllSucursal() {
        return sucursalService.getAllSucursals()
                .stream()
                .map(mapper::toDto)
                .collect(Collectors.toList());
    }

    @GetMapping("/getById/{id}")
    public SucursalDTO getById(@PathVariable int id) {
        return mapper.toDto(sucursalService.getSucursalById(id));

    }
    @PutMapping("/update/{id}")
    public ResponseEntity<SucursalDTO> updateSucursal(@PathVariable int id, @RequestBody Sucursal sucursal) {
        try {
            SucursalDTO updatedSucursalDTO = sucursalService.updateSucursal(sucursal, id);
            return ResponseEntity.ok(updatedSucursalDTO);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//            return ResponseEntity.notFound().build();
        }
    }
    @GetMapping("/delete/{id}")
    public ResponseEntity<HttpStatus> deleteFruita(@PathVariable int id) {

        try {
            sucursalService.deleteSucursal(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
