package cat.itacademy.barcelonactivaPauloAlberto.s05t01n01.model.repository;

import cat.itacademy.barcelonactivaPauloAlberto.s05t01n01.model.domain.Sucursal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface SucursalRepository extends JpaRepository<Sucursal, Integer> {
//    List<Sucursal> findCountryByName(String CountryName);
}
