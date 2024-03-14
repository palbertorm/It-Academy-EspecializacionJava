package cat.itacademy.barcelonactivaPauloAlberto.s05t01n01.model.domain;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
@Entity
@Table(name = "sucursal")

public class Sucursal {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    @Column(name = "name_sucursal")
    private String nameSucursal;
    @Column(name = "country_sucursal")
    private String countrySucursal;
}
