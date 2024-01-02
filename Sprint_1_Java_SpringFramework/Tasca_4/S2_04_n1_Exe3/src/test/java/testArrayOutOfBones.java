import org.example.CatchArrayOutOfBounds;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class testArrayOutOfBones {

    @Test
// test positivo porque el metodo catch la exception
    public void testArrayOutOfBones(){
        Assertions.assertThrows(IndexOutOfBoundsException.class, CatchArrayOutOfBounds::arrayOutOfBones);
    }
}
