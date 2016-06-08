package stepDefs.FamilyConnection;

import actions.FamilyConnection.FCHubs;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;

/**
 * Created by jorgemaguina on 5/31/2016.
 *  click on Next on FirstTutorial dialog - Created by Mandeep 06/08/2016
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

    @Then("^I should see FirstTutorial dialog$")
    public void I_should_see_firstTutorialDialog() throws Throwable {
        FCHubs.VerifyFirstTutorialDialog();
    }

    @And("^I click on Next on FirstTutorial dialog$")
    public void I_click_next_on_first_tutorial_dialog() throws Throwable {
        FCHubs.ClickNextOnFirstDialog();

    }

    @Then("^I should see SecondTutorial dialog$")
    public void I_should_see_second_tutorial_dialog() throws Throwable {
        FCHubs.VerifySecondTutorialDialog();
    }
}