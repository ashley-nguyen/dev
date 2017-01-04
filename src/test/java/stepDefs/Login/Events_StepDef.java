package stepDefs.Login;

import actions.FamilyConnection.FCCollegeEvents;
import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import pageObjects.FamilyConnection.FCCollegeEventsPage;

/**
 * Created by mbhangu on 12/13/2016.
 */
public class Events_StepDef {
    public static WebDriver driver;

    @Then("^I should see College Events Details$")
    public void I_should_see_college_Events_Details() throws Throwable {
        FCCollegeEvents.verifyCollegeEventsDetails();
    }

    @Then("^Sign Up Here page displayed for \"([^\"]*)\" School event$")
    public void Sign_Up_Here_Page_Displayed_For_School_Event(String eventSignup) throws Throwable {
        FCCollegeEvents.verifySignUpHereText(eventSignup);
    }

    @When("^I signup for Adrian School Event$")
    public void I_Signup_For_Adrian_School_Event() throws Throwable {
        FCCollegeEvents.clickSignUpButton();
    }

    @Then("^Message displayed \"([^\"]*)\"$")
    public void Message_Displayed(String confirmationMessage) throws Throwable {
        FCCollegeEvents.verifyConfirmationMessageEvents(confirmationMessage);
    }

    @When("^SignUp for school \"([^\"]*)\" for Event \"([^\"]*)\"$")
    public void Signup_For_School_For_Event(String nameSchool, String nameEvent) throws Throwable {
        FCCollegeEvents.clickSignUpButtonForCollegeandForEvent(nameSchool,nameEvent);
    }

    @When("^I Return to All Events Page$")
    public void I_ReturnTo_AllEventsPage() throws Throwable {
        FCCollegeEvents.clickReturntoAllEventslink();
    }

    @When("^I click on See Recommended Events$")
    public void I_Click_On_See_RecommendedEvents() throws Throwable {
        FCCollegeEvents.clickRecommendedEventslink();
    }

    @Then("^Recommended events are displayed on screen$")
    public void RecommendedEvents_Are_DisplayedOnScreen() throws Throwable {
        FCCollegeEvents.verifyRecommendedEventsText();
    }

}


