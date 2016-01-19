package stepDefs.Smtp;

import actions.Smtp.SmtpAction;
import actions.Smtp.Smtp_Verify;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by franksejas on 1/18/2016.
 */
public class Smtp_StepDefs {

    @When("^I go to the Add New User")
    public void i_go_to_planner_dashboard() throws Throwable {

        SmtpAction.NavigateToAddNewUser();
    }

    @When("^I fill the First Name as \"(.*)\"$")
    public void i_fill_the_first_name(String firstName ) throws Throwable {

        SmtpAction.FillTheFirstName(firstName);
    }

    @When("^I fill the Last Name as \"(.*)\"$")
    public void i_fill_the_last_name(String lastName ) throws Throwable {

        SmtpAction.FillTheLastName(lastName);
    }

    @When("^I fill the User Name as \"(.*)\"$")
    public void i_fill_the_user_name(String userName ) throws Throwable {

        SmtpAction.FillTheUserName(userName);
    }

    @When("^I fill the Email as \"(.*)\"$")
    public void i_fill_the_email(String email ) throws Throwable {

        SmtpAction.FillTheEmail(email);
    }

    @When("^I fill the Confirm Email as \"(.*)\"$")
    public void i_fill_the_confirm_email(String confirmEmail ) throws Throwable {

        SmtpAction.FillTheConfirmEmail(confirmEmail);
    }

    @When("^I select the Role as \"(.*)\"$")
    public void i_select_the_role(String role ) throws Throwable {

        SmtpAction.SelectTheRole(role);
    }

    @When("^I click on Add User button$")
    public void i_click_on_add_user_button() throws Throwable {

        SmtpAction.ClickOnAddUserButton();
    }

    @Then("^I verify new user \"(.*)\" was added without errors$")
    public void i_verify_new_user_was_added(String newUser) throws Throwable {
        Smtp_Verify.verifyEmail(newUser);
    }
}