package cat.itacademy.barcelonactiva.cognoms.nom.s04.t01.n01.S04T01N01AlbertoMoura.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping("/HelloWorld")
    public String saluda(@RequestParam(defaultValue = "UNKNONW") String nombre){
        return  "Hola " + nombre + " Estàs executant un projecte Maven con RequestParam";
    }

    @GetMapping("/HelloWorld2/{nombre}")
    public String saluda2(@PathVariable String nombre){
        return  "Hola " + nombre + " Estàs executant un projecte Maven con PathVariable";
    }
}
