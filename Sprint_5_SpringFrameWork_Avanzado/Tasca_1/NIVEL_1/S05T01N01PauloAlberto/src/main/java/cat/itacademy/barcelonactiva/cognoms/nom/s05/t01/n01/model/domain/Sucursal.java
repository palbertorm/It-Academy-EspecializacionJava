package cat.itacademy.barcelonactiva.cognoms.nom.s05.t01.n01.model.domain;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.lang.NonNull;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
@Entity
@Table(name = "sucursal")
public class Sucursal {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "name_sucursal")
    private String nameSucursal;
    @Column(name = "country_sucursal")
    private String countrySucursal;


    public Sucursal(String nameSucursal, String countrySucursal) {
        this.nameSucursal = nameSucursal;
        this.countrySucursal = countrySucursal;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameSucursal() {
        return nameSucursal;
    }

    public void setNameSucursal(String nameSucursal) {
        this.nameSucursal = nameSucursal;
    }

    public String getCountrySucursal() {
        return countrySucursal;
    }

    public void setCountrySucursal(String countrySucursal) {
        this.countrySucursal = countrySucursal;
    }
}
