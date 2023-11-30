import org.example.Mesos;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class MesosTest {

    Mesos mesos = new Mesos();
    List<String> meses = mesos.obtenirLlistaMesos();
    @Test
    public void test1(){
        Assertions.assertEquals("agosto", meses.get(7));
        Assertions.assertEquals(11, meses.size());
        Assertions.assertNotNull(meses);
    }

}
