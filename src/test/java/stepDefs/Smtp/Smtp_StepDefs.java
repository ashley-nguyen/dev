package stepDefs.Smtp;

import actions.Smtp.SmtpAction;
import actions.Smtp.Smtp_Verify;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static actions.Setup.SSO_Action.GoToSetup;

/**
 * Created by franksejas on 1/18/2016.
 */
public class Smtp_StepDefs {

    @When("^I add new user with First Name as \"(.*)\" Last Name as \"(.*)\" User Name as \"(.*)\" Email as \"(.*)\" Confirm Email as \"(.*)\" Role as \"(.*)\"$")
    public void i_add_new_user(String firstName, String lastName, String userName, String email, String confirmEmail, String role) throws Throwable {

        GoToSetup();
        SmtpAction.NavigateToAddNewUser();
        SmtpAction.FillTheFirstName(firstName);
        SmtpAction.FillTheLastName(lastName);
        SmtpAction.FillTheUserName(userName);
        SmtpAction.FillTheEmail(email);
        SmtpAction.FillTheConfirmEmail(confirmEmail);
        SmtpAction.SelectTheRole(role);
        SmtpAction.ClickOnAddUserButton();
    }

    @Then("^I verify new user with First Name as \"(.*)\" Last Name as \"(.*)\" and User Name as \"(.*)\" was added without errors$")
    public void i_verify_new_user_was_added(String firstName, String lastName, String userName) throws Throwable {
        Smtp_Verify.verifyEmail(firstName);
        Smtp_Verify.verifyEmail(lastName);
        Smtp_Verify.verifyEmail(userName);
    }
}