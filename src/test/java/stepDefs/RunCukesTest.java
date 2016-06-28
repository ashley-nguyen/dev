package stepDefs;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by jaswinder.johal
 */
@RunWith(Cucumber.class)
@CucumberOptions(strict = false,
                glue = "stepDefs",
                features = "src/test/resources",
                format = { "pretty",
                                "html:target/site/cucumber-pretty",
                                "json:target/cucumber.json" },
                tags = "@login")
public class RunCukesTest {
    //Test
}