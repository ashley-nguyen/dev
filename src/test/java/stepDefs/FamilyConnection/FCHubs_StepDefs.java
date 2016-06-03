package stepDefs.FamilyConnection;

import actions.FamilyConnection.FCCollegeView;
import actions.FamilyConnection.FCHubs;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import stepDefs.Hooks;

/**
 * Created by jorgemaguina on 5/31/2016.
 */
public class FCHubs_StepDefs {
    public static WebDriver driver;

    @Then("^I should see the Feedback Ribbon$")
    public void I_should_see_the_feedback_ribbon() throws Throwable {
        FCHubs.VerifyFeedbackRibbon();
    }
}