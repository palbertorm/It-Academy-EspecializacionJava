package barcelonactiva.PauloAlberto.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GameDTO {
    private long gameId;
    private int dice1;
    private int dice2;
    private boolean won;
}
