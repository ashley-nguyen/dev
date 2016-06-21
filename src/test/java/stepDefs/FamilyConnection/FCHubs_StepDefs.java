package stepDefs.FamilyConnection;

import actions.FamilyConnection.FCHubs;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
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

    @And("^I click on Next on SecondTutorial dialog$")
    public void I_click_Next_on_second_tutorial_dialog() throws Throwable {
        FCHubs.ClickNextOnSecondDialog();

    }

    @Then("^I should see ThirdTutorial dialog$")
    public void I_should_see_third_tutorial_dialog() throws Throwable {
        FCHubs.VerifyThirdTutorialDialog();

    }

    @Then("^I should see the Identifier module$")
    public void I_should_see_the_identifier_module() throws Throwable {
        FCHubs.VerifyIdentifierModule();
    }

    @Then("^I should see the logo in the Identifier module$")
    public void I_should_see_the_logo_in_the_identifier_module() throws Throwable {
        FCHubs.VerifyLogoInIdentifierModule();
    }

    @When("^I click the URL at the side of the logo$")
    public void I_click_the_URL_at_the_side_of_the_logo() throws Throwable {
        FCHubs.ClickURLInIdentifierModule();
    }

    @Then("^I should see the URL for \"([^\"]*)\" open in a new page$")
    public void I_should_see_the_URL_for_open_in_a_new_page(String site) throws Throwable {
        FCHubs.VerifyURLContainsText(site);
    }
}