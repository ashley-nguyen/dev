package stepDefs.Connections;

import actions.Connections.Connections;
import actions.FamilyConnection.FCDashboard;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by franksejas on 1/28/2016.
 */
public class Connections_StepDefs {

    @Then("^I enter to Check status and view history of emails sent$")
    public void i_enter_to_check_status_and_view_history_of_emails_sent() throws Throwable {
        Connections.ClickOnCheckStatusEmailLink();
    }

    @Then("^I enter to Family Connection$")
    public void i_enter_to_family_connection() throws Throwable {
        Connections.ClickOnFamilyConnectionLink();
    }

    @Then("^I should not see errors in Check Status Email$")
    public void i_should_not_see_errors_in_check_status_email() throws Throwable {
        Connections.verifyNoErrorsInCheckStatusEmail();
    }

    @Then("^I should not see errors in Email$")
    public void i_should_not_see_errors_in_email() throws Throwable {
        Connections.verifyNoErrorsInEmail();
    }

    @Then("^I should not see errors in Connections$")
    public void i_should_not_see_errors_in_connections() throws Throwable {
        Connections.verifyNoErrorsInConnections();
    }

    @Then("^I should not see errors in Family Connection in \"(.*)\" grade level$")
    public void i_should_not_see_errors_in_family_connection(int grade) throws Throwable {
        Connections.verifyNoErrorsInFamilyConnection();
        Connections.clickOnConfigurationLink();
        Connections.verifyEnableGrade(grade);
    }

    @Then("^I click on Select and Update Optional Features link$")
    public void i_click_on_select_and_update_optional_features_link() throws Throwable {
        Connections.clickOnConfigurationLink();
    }

    @Then("^I verify the Active Match information \"(.*)\"$")
    public void i_verify_the_text(String info) throws Throwable {
        Connections.clickOnConfigurationLink();
        Connections.verifyText(info);
    }

    @Then("^I click on Grade Level \"(.*)\"$")
    public void i_verify_enable_grade(int grade) throws Throwable {
        Connections.verifyEnableGrade(grade);
    }

    //LOR StepDefs

    @And("^I click on letters of recommendation$")
    public void I_Click_On_Letters_Of_Recommendation() throws Throwable {
        Connections.clickOnLettersOfRecommendation();
    }

    @And("^I request new letters of recommendation$")
    public void I_request_new_letters_of_recommendation() throws Throwable {
        FCDashboard.ClickCollegesTab();
        Connections.clickOnLettersOfRecommendation();
    }

    @When("^I cancel LOR for me$")
    public void I_cancel_LOR_for_me() throws Throwable {
        FCDashboard.ClickCollegesTab();
        Connections.clickOnLettersOfRecommendation();
        Connections.clickCancel();
        Connections.clickConfirmCancel();
    }

    @When("^I add request selecting \"(.*)\"$")
    public void I_add_request_selecting(String item) throws Throwable {
        FCDashboard.ClickCollegesTab();
        Connections.clickOnLettersOfRecommendation();
        Connections.clickAddRequest();
        Connections.selectTeacher(item);
        Connections.selectSpecificCollege();
        Connections.selectCollege();
        Connections.clickSave();

    }

    @When("^I click on Add Request$")
    public void i_Click_On_Add_Request() throws Throwable {
        Connections.clickAddRequest();
    }

    @And("^I select a teacher  \"([^\"]*)\"$")
    public void iSelectATeacher(String item) throws Throwable {
        Connections.selectTeacher(item);
    }

    @And("^I select a college$")
    public void i_Select_A_College() throws Throwable {
        Connections.selectCollege();
    }

    @And("^I select option for college$")
    public void i_select_option_for_college() throws Throwable {
        Connections.selectSpecificCollege();
    }

    @And("^I click save$")
    public void i_Click_Save() throws Throwable {
        Connections.clickSave();
    }


    @When("^I click on cancel button$")
    public void iClickOnCancelButton() throws Throwable {
        Connections.clickCancel();
    }

    @When("^I cancel LOR request$")
    public void I_cancel_LOR_request() throws Throwable {
        Connections.clickCancel();
        Connections.clickConfirmCancel();
    }

    @When("^I verify LOR request is automatically updated to \"([^\"]*)\"$")
    public void I_verify_LOR_request_is_automatically_updated(String text) throws Throwable {
        Connections.submitVerification(text);
    }

    @When("^I click on Submitted status$")
    public void I_click_on_Submitted_status() throws Throwable {
        Connections.clickOnSubmittedLink();
    }

    @When("^I verify the Submitted status text \"([^\"]*)\"$")
    public void I_verify_the_Submitted_status_text(String text) throws Throwable {
        Connections.submitTextVerification(text);
    }

    @And("^I click on Confirm button$")
    public void iClickOnConfirmButton() throws Throwable {
        Connections.clickConfirmCancel();
    }


    @When("^I add a new request for All Applications for teacher \"([^\"]*)\"$")
    public void iAddANewRequestForAllApplicationsForTeacher(String item) throws Throwable {
        Connections.clickAddRequest();
        Connections.selectTeacher(item);
        Connections.selectAllApplications();
        Connections.clickSave();
    }

    @Then("^I see the new request in List Page with success message \"([^\"]*)\"$")
    public void iSeeTheNewRequestInListPageWithSuccessMessage(String strText) throws Throwable {
        Connections.successMessage(strText);
    }

    @When("^I add a new request for Specific College for teacher \"([^\"]*)\"$")
    public void iAddANewRequestForSpecificCollegeForTeacher(String item) throws Throwable {
        Connections.clickAddRequest();
        Connections.selectTeacher(item);
        Connections.selectSpecificCollege();
        Connections.selectCollege();
        Connections.clickSave();
    }

    @When("^I add a new request for All Applications for the same teacher \"([^\"]*)\"$")
    public void iAddANewRequestForAllApplicationsForTheSameTeacher(String item) throws Throwable {
        Connections.clickAddRequest();
        Connections.selectTeacher(item);
    }

    @Then("^I see error message for selecting the same teacher for All Applications \"([^\"]*)\"$")
    public void iSeeErrorMessageForSelectingTheSameTeacherForAllApplications(String strText) throws Throwable {
        Connections.duplicateTeacherRequestErrorMessage(strText);

    }

    @And("^I see error message for selecting the same teacher for Specific College \"([^\"]*)\"$")
    public void iSeeErrorMessageForSelectingTheSameTeacherForSpecificCollege(String strText) throws Throwable {
        Connections.selectSpecificCollege();
        Connections.sameStaffErrorMessage(strText);
    }

    @When("^I am in Request Page$")
    public void iAmInRequestPage() throws Throwable {
        Connections.clickAddRequest();
    }

    @Then("^I verify All Applications option info tooltip \"([^\"]*)\"\"([^\"]*)\"$")
    public void iVerifyAllApplicationsOptionInfoTooltip(String strText1, String strText2) throws Throwable {
        Connections.clickAllApplicationsTooltip();
        Connections.allApplicationsInfoMessage(strText1,strText2);
    }

    @Then("^The request is cancelled and I verify confirmation message \"(.*)\"$")
    public void theRequestIsCancelledAndIVerifyConfirmationMessage(String strText) throws Throwable {
        Connections.cancelSuccessMessage(strText);
    }

}