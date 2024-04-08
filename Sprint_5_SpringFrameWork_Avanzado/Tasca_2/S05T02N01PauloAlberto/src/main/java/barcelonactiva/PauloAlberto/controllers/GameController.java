package barcelonactiva.PauloAlberto.controllers;

import barcelonactiva.PauloAlberto.model.dto.GameDTO;
import barcelonactiva.PauloAlberto.model.services.ServicesGame;
import barcelonactiva.PauloAlberto.model.services.ServicesPlayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/player")
public class GameController {
    @Autowired
    private ServicesGame servicesGame;
    @Autowired
    private ServicesPlayer servicesPlayer;

    @PostMapping("/{id}/games")
    public ResponseEntity<?> playGame (@PathVariable long id){
        GameDTO gameDTO = servicesGame.playGame(id);
        return new ResponseEntity<>(gameDTO, HttpStatus.CREATED);
    }
    @GetMapping("/{id}/games")
    public ResponseEntity<?> getAllGames (@PathVariable long id){
        List<GameDTO> gameDTOList = servicesGame.getAllGames(id);
        return new ResponseEntity<>(gameDTOList, HttpStatus.OK);
    }
    @DeleteMapping("/{id}/games")
    public ResponseEntity<?> deleteAllGames (@PathVariable long id){
        servicesGame.deleteAllGames(id);
        return new ResponseEntity<>("Games have been deleted.", HttpStatus.OK);
    }
}

