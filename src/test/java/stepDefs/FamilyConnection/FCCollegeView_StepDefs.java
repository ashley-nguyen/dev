package stepDefs.FamilyConnection;

import actions.FamilyConnection.FCCollegeView;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

/**
 * Created by jorgemaguina on 5/31/2016.
 */
public class FCCollegeView_StepDefs {
    public static WebDriver driver;

    @Then("^I should see the Hubs Page Ribbon$")
    public void I_should_see_the_hubs_page_ribbon() throws Throwable {
        FCCollegeView.VerifyHubsBetaButton();
    }

    @When("^I close the Beta Button Ribbon$")
    public void I_close_the_beta_button_ribbon() throws Throwable {
        FCCollegeView.clickXBetaButtonRibbon();
    }

    @Then("^I should not see the Hubs Page Ribbon$")
    public void I_should_not_see_the_hubs_page_ribbon() throws Throwable {
        FCCollegeView.VerifyHubsPageRibbon();
    }
}