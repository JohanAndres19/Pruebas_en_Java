package Steps;

import Logica.Repartidor;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * Unit test for simple App.
 */
public class test_repartidor_steps {

    public Repartidor repartidor;
    public ArrayList<String[]> resultado_Mano;

    @Given("un repartidor")
        public void  unRepartidor(){
        repartidor = new Repartidor();
    }

    @When("el juego inicia")
        public void elJuegoInicia(){
        resultado_Mano = repartidor.nueva_mano();
    }

    @Then("el repartidor toma dos cartas")
    public void elRepartidorTomaDosCartas(){
        assertEquals(2,repartidor.getMano().size());
    }
}
