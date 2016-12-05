package stepDefs.FamilyConnection;

import actions.FamilyConnection.FCCollegesTab;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefs.Hooks;

import static junit.framework.TestCase.assertTrue;

/**
 * Created by jorgemaguina on 5/25/2016.
 */
public class FCCollegesTab_StepDefs {


    @When("^I open the college match list$")
    public void I_open_the_college_match_list() throws Throwable {
        FCCollegesTab.ClickCollegeMatchLink();
    }
    @Then("^The college match list should not be displayed$")
    public static void The_college_match_should_not_be_displayed() throws InterruptedException {
        FCCollegesTab.VerifyCollegeMatchNotDisplayed();
    }

    @When("^I search for the college \"([^\"]*)\"$")
    public void I_search_for_the_college(String college) throws Throwable {
        FCCollegesTab.EnterCollegeToSearch(college);
        FCCollegesTab.ClickGoButton();
    }

    @When("^I click the college \"([^\"]*)\" in the college lookup list$")
    public void I_click_the_college_in_the_college_lookup_list(String collegeString) throws Throwable {
        FCCollegesTab.ClickCollegeInCollegeLookup(collegeString);
    }

    @Then("^I should see the message \"([^\"]*)\" in the College Lookup page$")
    public void iShouldSeeTheMessageInTheCollegeLookupPage(String message) throws Throwable {
        FCCollegesTab.VerifyMessageCollegeLookup(message);
    }

    @When("^I sign up to the college visit$")
    public void I_sign_up_to_the_college_visit() throws Throwable {
        FCCollegesTab.clickSignUpButton();
    }

    @Then("^I should see a confirmation message$")
    public void I_should_see_a_confirmation_message() throws Throwable {
        FCCollegesTab.verifyCollegeVisitConfirmationMessage();
    }

    @And("^Remove myself from the college visit$")
    public void Remove_myself_from_the_college_visit() throws Throwable {
        FCCollegesTab.clickRemoveFromList();
    }

    @Then("^I should see the college visit information page$")
    public void I_should_see_the_college_visit_information_page() throws Throwable {
        FCCollegesTab.verifyCollegeVisitInfoPage();
    }
}