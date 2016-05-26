package stepDefs.Survey;

import actions.FamilyConnection.FCAboutMe;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefs.Hooks;

/**
 * Created by csackrider on 10/7/2015.
 */
public class Survey_StepDefs {

    @Given("^I have a survey created in a primary district$")
    public void I_have_a_survey_created_in_a_primary_district() throws Throwable {
        // FOR FUTURE USE TO TURN ON/OFF A DISTRICT DEPENDING ON THE TEST.

    }


    @Then("^I will be able to take the survey \"(.*)\"$")
    public void I_will_be_able_to_take_the_survey(String strSurvey) throws Throwable {
        // ASSERT STUDENT CAN VIEW THE SURVEYS
        WebElement lnkAboutMe = Hooks.driver.findElement(By.linkText("about me"));
        lnkAboutMe.click();

        FCAboutMe.verifySurvey(strSurvey);
    }

    @Given("^I have a survey created in a secondary district$")
    public void I_have_a_survey_created_in_a_secondary_district() throws Throwable {
        // Express the Regexp above with the code you wish you had
        //throw new PendingException();
    }

    @Given("^I have a survey created in a primary and secondary district$")
    public void I_have_a_survey_created_in_a_primary_and_secondary_district() throws Throwable {
        // Express the Regexp above with the code you wish you had
        //throw new PendingException();
    }

    @Given("^I have a survey created in a primary, secondary district and high school$")
    public void I_have_a_survey_created_in_a_primary_secondary_district_and_high_school() throws Throwable {
        // Express the Regexp above with the code you wish you had
        //throw new PendingException();
    }

    @Given("^I have a survey created in an inactive primary district and active secondary district and high school$")
    public void I_have_a_survey_created_in_an_inactive_primary_district_and_active_secondary_district_and_high_school() throws Throwable {
        // Express the Regexp above with the code you wish you had
        //throw new PendingException();
    }

    @Then("^I will not be able to take the survey for the inactive tennant$")
    public void I_will_not_be_able_to_take_the_survey_for_the_inactive_tennant() throws Throwable {
        // Express the Regexp above with the code you wish you had
        //throw new PendingException();
    }


}
