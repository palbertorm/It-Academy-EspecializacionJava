package cat.itacademy.barcelonactivaPauloAlberto.s05t01n01.model.dto;

import lombok.*;

import java.util.Arrays;
import java.util.List;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@RequiredArgsConstructor
@Data

public class SucursalDTO {
    private static final List<String> countries = Arrays.asList("Austria", "Belgium", "Bulgaria", "Croatia", "Republic of Cyprus", "Czech Republic", "Denmark", "Estonia", "Finland", "France", "Germany", "Greece", "Hungary", "Ireland", "Italy", "Latvia", "Lithuania", "Luxembourg", "Malta", "Netherlands", "Poland", "Portugal", "Romania", "Slovakia", "Slovenia", "Spain", "Sweden");
    @NonNull
    private String name;
    @NonNull
    private String country;
    private String SucursalType;
    public boolean isSucursalUE() {
        return countries.contains(this.country);
    }
}
