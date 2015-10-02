package stepDefs;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty"},
        features = "C:\\SeleniumScripts\\NavianceQAAutomation\\Naviance_cucumber_automation\\src\\test\\resources")

public class RunCukesTest
{

}