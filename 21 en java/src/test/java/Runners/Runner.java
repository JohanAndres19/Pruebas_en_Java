package Runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "Steps",
        features = "./src/test/Features/Repartidor.feature",
        monochrome = true,
        dryRun = false)

public class Runner {

}
