package cat.itacademy.barcelonactiva.cognoms.nom.s05.t01.n01.model.mapper;

import cat.itacademy.barcelonactiva.cognoms.nom.s05.t01.n01.model.domain.Sucursal;
import cat.itacademy.barcelonactiva.cognoms.nom.s05.t01.n01.model.dto.SucursalDTO;
import org.springframework.stereotype.Component;


@Component
public class Mapper {
//private static final ModelMapper modelMapper = new ModelMapper();

    public SucursalDTO toDto(Sucursal sucursal) {
//        SucursalDTO sucursalDTO = modelMapper.map(sucursal, SucursalDTO.class);
        String name = sucursal.getNameSucursal();
        String country = sucursal.getCountrySucursal();
        SucursalDTO sucursalDTO = new SucursalDTO(name,country);
        sucursalDTO.setSucursalType(sucursalDTO.isSucursalUE() ? "es UE" : " NO es UEW");
        return sucursalDTO;

    }

}
