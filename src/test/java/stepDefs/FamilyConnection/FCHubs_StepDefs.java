package stepDefs.FamilyConnection;

import actions.FamilyConnection.FCHubs;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;

/**
 * Created by jorgemaguina on 5/31/2016.
 */
public class FCHubs_StepDefs {
    public static WebDriver driver;

    @Then("^I should see the Feedback Ribbon$")
    public void I_should_see_the_feedback_ribbon() throws Throwable {
        FCHubs.VerifyFeedbackRibbon();
    }

    @And("^I click the Feedback Button$")
    public void I_click_the_feedback_button() throws Throwable {
        FCHubs.ClickFeedbackButton();
    }
}