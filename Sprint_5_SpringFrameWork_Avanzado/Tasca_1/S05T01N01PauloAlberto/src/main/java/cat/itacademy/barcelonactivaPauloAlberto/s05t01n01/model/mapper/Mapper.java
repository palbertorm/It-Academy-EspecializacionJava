package cat.itacademy.barcelonactivaPauloAlberto.s05t01n01.model.mapper;

import cat.itacademy.barcelonactivaPauloAlberto.s05t01n01.model.domain.Sucursal;
import cat.itacademy.barcelonactivaPauloAlberto.s05t01n01.model.dto.SucursalDTO;
import org.springframework.stereotype.Component;

@Component
public class Mapper {
    public SucursalDTO toDto(Sucursal sucursal) {
//        SucursalDTO sucursalDTO = modelMapper.map(sucursal, SucursalDTO.class);
        int id = sucursal.getId();
        String name = sucursal.getNameSucursal();
        String country = sucursal.getCountrySucursal();
        SucursalDTO sucursalDTO = new SucursalDTO(id, name, country);
        sucursalDTO.setSucursalType(sucursalDTO.isSucursalUE() ? "es UE" : " NO es UE");
        return sucursalDTO;

    }
}
