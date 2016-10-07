package stepDefs.FamilyConnection;

import actions.FamilyConnection.FCSurvey;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;

import java.util.List;

/**
 * Created by jorgemaguina on 5/31/2016.
 */
public class FCSurvey_StepDefs {
    public static WebDriver driver;

    @Then("^I should see the survey page$")
    public void I_should_see_the_survey_page() throws Throwable {
        FCSurvey.VerifySurveyPage();
    }

    @And("^I fill the survey with the following data:$")
    public void I_fill_the_survey_with_the_following_data(List<String> surveyOptions) throws Throwable {
        FCSurvey.FillSurvey(surveyOptions.get(0), surveyOptions.get(1), surveyOptions.get(2));
    }

    @And("^I submit the survey$")
    public void I_submit_the_survey() throws Throwable {
        FCSurvey.ClickDoneButton();
    }

    @Then("^I should be able to close the survey page$")
    public void I_should_be_able_to_close_the_survey_page() throws Throwable {
        FCSurvey.VerifyCloseSurveyPage();
    }

    @And("^I close the Survey page$")
    public void iCloseTheSurveyPage() throws Throwable {
        FCSurvey.CloseSurveyPage();
    }
}