package cat.itacademy.barcelonactiva.cognoms.nom.s05.t01.n01.model.dto;

import java.util.List;
/*
all the data necessary to create a user and sends it to the server in a single request
*/
public class SucursalCreationDTO {
    private String name;
    private String countrySucursal;
    private List<String> countries;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountrySucursal() {
        return countrySucursal;
    }

    public void setCountrySucursal(String countrySucursal) {
        this.countrySucursal = countrySucursal;
    }

    public List<String> getCountries() {
        return countries;
    }

    public void setCountries(List<String> countries) {
        this.countries = countries;
    }
}
