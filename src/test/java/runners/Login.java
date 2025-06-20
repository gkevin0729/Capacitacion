package runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/inicio.feature",
        tags = "@Escenario1",
        glue = "runners",
        plugin = "pretty",
        snippets = CucumberOptions.SnippetType.CAMELCASE)
public class Login {

}
