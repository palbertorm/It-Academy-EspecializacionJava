import org.example.CalculoDni;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.AssertionsKt;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CalculoDniTest {

    @Test
    public void compruebaTipoParam(){
        CalculoDni calculoDni = new CalculoDni( 23445678,"");
        int a =calculoDni.getNumeroDni();
        Assertions.assertInstanceOf(Integer.class, a);
        Assertions.assertNotNull(calculoDni.compruebaDni(a));

    }
    // TODO @ParameterizedTest

    @ParameterizedTest
    @CsvSource({
            "00000000A, 0",
            "00000000B, 1",
            "00000000C, 2",
            "00000000D, 3",
            "00000000E, 4",
            "00000000F, 5",
            "00000000G, 6",
            "00000000H, 7",
            "00000000I, 8"
    })
    public void testCalculoNumeroDni(String dni, int digitoControlEsperado){
        CalculoDni calculoDni;
        calculoDni = new CalculoDni(digitoControlEsperado, dni);
        Assertions.assertEquals(digitoControlEsperado, calculoDni.getNumeroDni());
    }


}
