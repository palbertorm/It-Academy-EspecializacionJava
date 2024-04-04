package barcelonactiva.PauloAlberto.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PlayerDTO {
    private long playerId;
    private String name;
    private LocalDate registrationDate;
    private float successRate;
}
