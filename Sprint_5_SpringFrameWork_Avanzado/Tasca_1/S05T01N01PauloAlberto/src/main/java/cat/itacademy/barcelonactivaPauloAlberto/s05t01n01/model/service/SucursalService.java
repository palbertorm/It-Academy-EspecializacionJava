package cat.itacademy.barcelonactivaPauloAlberto.s05t01n01.model.service;

import cat.itacademy.barcelonactivaPauloAlberto.s05t01n01.model.domain.Sucursal;
import cat.itacademy.barcelonactivaPauloAlberto.s05t01n01.model.dto.SucursalDTO;
import cat.itacademy.barcelonactivaPauloAlberto.s05t01n01.model.mapper.Mapper;
import cat.itacademy.barcelonactivaPauloAlberto.s05t01n01.model.repository.SucursalRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class SucursalService {
    private final SucursalRepository sucursalRepository;
    @Autowired
    private Mapper mapper;

    @Autowired
    public SucursalService(SucursalRepository sucursalRepository) {
        this.sucursalRepository = sucursalRepository;
    }

//    public List<Sucursal> getSucursalCountry(String name) {
//        if (name == null) {
//            return sucursalRepository.findAll();
//        }else {
//            return sucursalRepository.findCountryByName(name);
//        }
//    }
    public SucursalDTO addSucursal(Sucursal sucursal) {
        sucursalRepository.save(sucursal);
        return mapper.toDto(sucursal);
    }
    public SucursalDTO updateSucursal (Sucursal sucursal, int id){
        Optional<Sucursal> sucursalData = sucursalRepository.findById(id);
        if (sucursalData.isEmpty()){
            throw new EntityNotFoundException(" arrombado" + id + " does not exist");
        }
        Sucursal sucursalToReturn = sucursalData.get();
        sucursalToReturn.setCountrySucursal(sucursal.getCountrySucursal());
        sucursalToReturn.setNameSucursal(sucursal.getNameSucursal());
        sucursalRepository.save(sucursalToReturn);
        return mapper.toDto(sucursalToReturn);

    }

    public void deleteSucursal(int id) {

        if (!sucursalRepository.existsById(id)) {
            throw new EntityNotFoundException("Sucursal with ID " + id + " not found");
        }

        sucursalRepository.deleteById(id);
    }



    public Sucursal getSucursalById(int id) {
        Optional<Sucursal> sucursalOptional = sucursalRepository.findById(id);
        if (sucursalOptional.isEmpty()){
            throw new EntityNotFoundException(" arrombado" + id + " does not exist");
        }
        return sucursalOptional.get();
    }
    public List<SucursalDTO> getAllSucursals(){
       List<Sucursal> sucursal = sucursalRepository.findAll();
       return sucursal.stream().map(mapper::toDto).collect(Collectors.toList());
    }
}
