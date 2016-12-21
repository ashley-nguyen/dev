package stepDefs.Login;

import actions.FamilyConnection.FCCollegeEvents;
import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

/**
 * Created by mbhangu on 12/13/2016.
 */
public class Events_StepDef {
    public static WebDriver driver;

    @Then("^I should see College Events Details$")
    public void I_should_see_college_Events_Details() throws Throwable {
        FCCollegeEvents.verifyCollegeEventsDetails();
    }


    @When("^I open \"([^\"]*)\" School Event$")
    public void I_Open_School_Event(String SchoolEvent) throws Throwable {
        FCCollegeEvents.ClickSignUpforCollegeEvent(SchoolEvent);

    }

    @Then("^Sign Up Here page displayed for \"([^\"]*)\" School event$")
    public void Sign_Up_Here_Page_Displayed_For_School_Event(String EventSignup) throws Throwable {
        FCCollegeEvents.verifySignUpHereText(EventSignup);
    }

    @When("^I signup for Adrian School Event$")
    public void I_Signup_For_Adrian_School_Event() throws Throwable {
        FCCollegeEvents.ClickSignUpButton();


    }

    @Then("^Message displayed \"([^\"]*)\"$")
    public void Message_Displayed(String confirmationMessage) throws Throwable {
        FCCollegeEvents.VerifyConfirmationMessageEvents(confirmationMessage);


    }
}


