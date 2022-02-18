package co.com.fruiz.sostenibilidad.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
@RunWith(CucumberWithSerenity.class)
@CucumberOptions (features = "src/test/resources/features/x.feature",
        tags = "@tag1",
        glue = " co.com.fruiz.sostenibilidad.stepdefinitions",
        snippets = SnippetType.CAMELCASE )

public class RunnerTags {
}
