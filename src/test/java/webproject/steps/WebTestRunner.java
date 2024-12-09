package webproject.steps;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"html:target/cucumber-report.html", "pretty"},
        features = "src/test/resources/webdriver/features",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        tags = "@smoke"
        )
public class WebTestRunner
{

}
