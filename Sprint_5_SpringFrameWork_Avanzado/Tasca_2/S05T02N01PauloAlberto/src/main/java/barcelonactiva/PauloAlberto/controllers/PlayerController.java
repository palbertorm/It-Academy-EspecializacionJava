package barcelonactiva.PauloAlberto.controllers;

import barcelonactiva.PauloAlberto.model.dto.PlayerDTO;
import barcelonactiva.PauloAlberto.model.services.ServicesPlayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/player")
public class PlayerController {
    @Autowired
    private ServicesPlayer servicesPlayer;

    @PostMapping
    public ResponseEntity<PlayerDTO> addPlaer (@RequestBody PlayerDTO playerDTO){
        PlayerDTO newPlayer = servicesPlayer.addPlayer(playerDTO);
        return new ResponseEntity<>(newPlayer, HttpStatus.CREATED);
    }
    @PutMapping("/update/{id}")
    public ResponseEntity<PlayerDTO> updatePlayer (@PathVariable long id, @RequestBody PlayerDTO newPlayerDTO){
        PlayerDTO playerToUpdate = servicesPlayer.updatePlayer(id,newPlayerDTO);
        return new ResponseEntity<>(playerToUpdate,HttpStatus.CREATED);
    }

    @GetMapping("/allPlayers")
    public ResponseEntity<List<PlayerDTO>> getAllPlayers (){
        List<PlayerDTO> players = servicesPlayer.getAllplayers();
        return new ResponseEntity<>(players,HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deletePlayer (@PathVariable long id){
        servicesPlayer.deletePlayer(id);
        return new ResponseEntity<>("Player deleted.",HttpStatus.OK);
    }
}
