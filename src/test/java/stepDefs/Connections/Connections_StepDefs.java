package stepDefs.Connections;

import actions.Connections.Connections;
import actions.FamilyConnection.FCDashboard;
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


    @And("^I click on letters of recommendation$")
    public void I_Click_On_Letters_Of_Recommendation() throws Throwable {
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
        Connections.selectOptionForCollege();
        Connections.selectCollege();
        Connections.clickSave();
    }



    @Then("^I see the default message$")
    public void i_See_The_Default_Message() throws Throwable {
        Connections.defaultMessage();
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
        Connections.selectOptionForCollege();
    }

    @And("^I click save$")
    public void i_Click_Save() throws Throwable {
        Connections.clickSave();
    }

    @Then("^I see my request in the list page with success message \"([^\"]*)\"$")
    public void iSeeMyRequestInTheListPageWithSuccessMessage(String strText) throws Throwable {
        Connections.successMessage(strText);
    }

    @When("^I click on cancel button$")
    public void iClickOnCancelButton() throws Throwable {
        Connections.clickCancel();
    }

    @And("^I click on Confirm button$")
    public void iClickOnConfirmButton() throws Throwable {
        Connections.clickConfirmCancel();
    }

    @Then("^The request is cancelled and I verify confirmation message \"(.*)\" and cancel tooltip \"(.*)\" text$")
    public void theRequestIsCancelledAndIVerifyConfirmationMessageAndCancelTooltipText(String info1, String info2) throws Throwable {
        Connections.cancelSuccessMessage(info1, info2);
    }
}