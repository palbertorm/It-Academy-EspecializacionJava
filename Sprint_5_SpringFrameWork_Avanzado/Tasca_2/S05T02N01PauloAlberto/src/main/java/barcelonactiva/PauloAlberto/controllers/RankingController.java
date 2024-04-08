package barcelonactiva.PauloAlberto.controllers;

import barcelonactiva.PauloAlberto.model.dto.PlayerDTO;
import barcelonactiva.PauloAlberto.model.services.intefaces.PlayerRankingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/player")
public class RankingController {
    @Autowired
    private PlayerRankingService playerRankingService;

    @GetMapping("/ranking")
    public ResponseEntity<?> getSuccessAveragePlayers (){
        Double successAverage = playerRankingService.getSuccessRateAverage();
        return new ResponseEntity<>(successAverage, HttpStatus.OK);
    }

    @GetMapping("/ranking/winner")
    public ResponseEntity<?> getWinner (){
        PlayerDTO winner = playerRankingService.getWinner();
        return new ResponseEntity<>(winner, HttpStatus.OK);
    }

    @GetMapping("/ranking/loser")
    public ResponseEntity<?> getLoser (){
        PlayerDTO loser = playerRankingService.getLoser();
        return new ResponseEntity<>(loser, HttpStatus.OK);
    }
}
