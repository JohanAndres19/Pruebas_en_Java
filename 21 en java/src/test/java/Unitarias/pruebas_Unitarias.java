package Unitarias;

import Logica.Repartidor;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class pruebas_Unitarias {

    Repartidor repartidor = new Repartidor();

    @Test
    public void test_Nueva_Mano()
    {
        repartidor.nueva_mano();
        assertEquals(2,repartidor.getMano().size());
    }
}
