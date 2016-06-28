package stepDefs.Connections;

import actions.Connections.Connections;

import cucumber.api.java.en.Then;

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

    @Then("^I should not see errors in Family Connection$")
    public void i_should_not_see_errors_in_family_connection() throws Throwable {
        Connections.verifyNoErrorsInFamilyConnection();
    }

    @Then("^I click on Select and Update Optional Features link$")
    public void i_click_on_select_and_update_optional_features_link() throws Throwable {
        Connections.clickOnConfigurationLink();
//        Thread.sleep(800000);
    }

    @Then("^I verify the Active Match information \"(.*)\"$")
    public void i_verify_the_text(String info) throws Throwable {
        Connections.verifyText(info);
    }

    @Then("^I click on Grade Level \"(.*)\"$")
    public void i_verify_enable_grade(int grade) throws Throwable {
        Connections.verifyEnableGrade(grade);
    }



}