package stepDefs;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty"},
        features = "C:\\SeleniumScripts\\NavianceCucumberAutomation\\src\\test\\resources")

public class RunCukesTest {

}