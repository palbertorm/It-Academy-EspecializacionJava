package cat.itacademy.barcelonactiva.cognoms.nom.s05.t01.n01.model.dto;

import lombok.*;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
//@RequiredArgsConstructor
@Data

public class SucursalDTO {
    private static final List<String> countries = Arrays.asList("Àustria", "Bèlgica", "Bulgària", "Croàcia", "República de Xipre", "República Txeca", "Dinamarca", "Estònia", "Finlàndia", "França", "Alemanya", "Grècia", "Hongria", "Irlanda", "Itàlia", "Letònia", "Lituània", "Luxemburg", "Malta", "Països Baixos", "Polònia", "Portugal", "Romania", "Eslovàquia", "Eslovènia", "Espanya", "Suècia");
    private String name;
    private String country;
    private String SucursalType;

    public SucursalDTO(String name, String country) {
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getSucursalType() {
        return SucursalType;
    }

    public void setSucursalType(String sucursalType) {
        SucursalType = sucursalType;
    }
    public boolean isSucursalUE() {
        return countries.contains(this.country);
    }
}
