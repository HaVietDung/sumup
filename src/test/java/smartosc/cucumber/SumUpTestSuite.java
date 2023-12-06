package smartosc.cucumber;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = "pretty",
        features = "src/test/resources/features/sumup",
        glue = {"smartosc.hook", "smartosc.sumup"},
        tags = "@sumup"
)
public class SumUpTestSuite {
}
