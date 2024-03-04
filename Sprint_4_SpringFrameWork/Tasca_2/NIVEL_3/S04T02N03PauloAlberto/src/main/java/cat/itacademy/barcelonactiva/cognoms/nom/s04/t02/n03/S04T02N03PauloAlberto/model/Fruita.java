package cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n03.S04T02N03PauloAlberto.model;

import jakarta.persistence.Id;
import lombok.Data;
import lombok.Generated;
import lombok.Getter;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collation = "fruitas")
@Data

public class Fruita {
    @Id
    private String id;
    private String name;
    private String weight;

    public Fruita(String name, String weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }
}
