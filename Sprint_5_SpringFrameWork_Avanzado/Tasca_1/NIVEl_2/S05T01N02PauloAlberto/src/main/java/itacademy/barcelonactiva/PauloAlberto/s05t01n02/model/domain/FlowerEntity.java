package itacademy.barcelonactiva.PauloAlberto.s05t01n02.model.domain;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name = "FlowerEntity")
public class FlowerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name_flower")
    private String nameFlower;
    @Column(name = "country_flower")
    private String countryFlower;

}
