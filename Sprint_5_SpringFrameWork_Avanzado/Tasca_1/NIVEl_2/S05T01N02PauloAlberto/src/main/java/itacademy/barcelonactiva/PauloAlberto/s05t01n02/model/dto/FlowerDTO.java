package itacademy.barcelonactiva.PauloAlberto.s05t01n02.model.dto;

import lombok.*;

import java.util.Arrays;
import java.util.List;
//@AllArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class FlowerDTO {
    private static final List<String> countries = Arrays.asList("Austria", "Belgium", "Bulgaria", "Croatia", "Republic of Cyprus", "Czech Republic", "Denmark", "Estonia", "Finland", "France", "Germany", "Greece", "Hungary", "Ireland", "Italy", "Latvia", "Lithuania", "Luxembourg", "Malta", "Netherlands", "Poland", "Portugal", "Romania", "Slovakia", "Slovenia", "Spain", "Sweden");
//    @NonNull
//    private int id;
    @NonNull
    private String nameFlower;
    @NonNull
    private String countryFlower;
    private String typeFlower;
    public boolean isFlowerDTO(){
        return countries.contains(this.countryFlower);
    }
}
