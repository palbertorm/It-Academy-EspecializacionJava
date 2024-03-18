package cat.itacademy.barcelonactivaPauloAlberto.s05t01n01.controller;

import cat.itacademy.barcelonactivaPauloAlberto.s05t01n01.model.domain.Sucursal;
import cat.itacademy.barcelonactivaPauloAlberto.s05t01n01.model.dto.SucursalDTO;
import cat.itacademy.barcelonactivaPauloAlberto.s05t01n01.model.mapper.Mapper;
import cat.itacademy.barcelonactivaPauloAlberto.s05t01n01.model.service.SucursalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

//@CrossOrigin(origins = "http://localhost:9000")
@Controller
@RequestMapping("sucursal/")
public class SucursalController {
    @Autowired
    private SucursalService sucursalService;
    @Autowired
    private Mapper mapper;
    @GetMapping("/create")
    public String showSignUpForm(Model model) {
        Sucursal sucursal = new Sucursal();
        model.addAttribute("create", sucursal);
        return "add-sucurs";
    }

    @PostMapping("/add")
    public String createSucursal(@ModelAttribute("create") Sucursal sucursal){
        sucursalService.addSucursal(sucursal);
        return "redirect:index";
    }
    @GetMapping("/index")
    public String showSucursal(Model model){
        model.addAttribute("sucurs", sucursalService.getAllSucursals());
        return "index";
    }
    @GetMapping("/edit/{id}")
    public String editByid(@PathVariable int id, Model model) {
        model.addAttribute("sucur",  sucursalService.getSucursalById(id));
        return "update-sucurs";
    }

    @GetMapping("/getById/{id}")
    public String getById(@PathVariable int id, Model model) {
       model.addAttribute("sucurs", mapper.toDto(sucursalService.getSucursalById(id)));
        return "index";
    }

@PostMapping("edit/update/{id}")
public String updateSucursal(@PathVariable int id, @ModelAttribute Sucursal sucursal) {
    SucursalDTO updatedSucursalDTO = sucursalService.updateSucursal(sucursal, id);
    return "redirect:/sucursal/index";
}

    @GetMapping("/delete/{id}")
    public String deleteFruita(@PathVariable int id) {
        sucursalService.deleteSucursal(id);
        return "redirect:/sucursal/index";
    }
}
