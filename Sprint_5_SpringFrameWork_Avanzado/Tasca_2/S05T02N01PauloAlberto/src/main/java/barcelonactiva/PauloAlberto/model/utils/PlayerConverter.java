package barcelonactiva.PauloAlberto.model.utils;

import barcelonactiva.PauloAlberto.model.domain.Player;
import barcelonactiva.PauloAlberto.model.dto.PlayerDTO;

import java.time.LocalDate;

public class PlayerConverter {
    public static Player DTOtoEntity(PlayerDTO playerDTO) {
        Player player = new Player();
        player.setPlayerId(playerDTO.getPlayerId());
        player.setName(playerDTO.getName());
        player.setRegistrationDate(player.getRegistrationDate());
        return player;
    }

    public static PlayerDTO EntitytoDTO(Player player) {
        PlayerDTO playerDTO = new PlayerDTO();
        playerDTO.setPlayerId(player.getPlayerId());
        playerDTO.setName(player.getName());
        playerDTO.setRegistrationDate(LocalDate.from(player.getRegistrationDate()));
        playerDTO.setSuccessRate(player.calculateSuccessRate());
        return playerDTO;
    }
}
