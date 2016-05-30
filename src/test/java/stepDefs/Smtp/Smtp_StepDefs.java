package stepDefs.Smtp;

import actions.Smtp.Smtp;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static actions.Setup.SSO.GoToSetup;

/**
 * Created by franksejas on 1/18/2016.
 */
public class Smtp_StepDefs {

    @When("^I add new user with First Name as \"(.*)\" Last Name as \"(.*)\" User Name as \"(.*)\" Email as \"(.*)\" Confirm Email as \"(.*)\" Role as \"(.*)\"$")
    public void i_add_new_user(String firstName, String lastName, String userName, String email, String confirmEmail, String role) throws Throwable {

        GoToSetup();
        Smtp.NavigateToAddNewUser();
        Smtp.FillTheFirstName(firstName);
        Smtp.FillTheLastName(lastName);
        Smtp.FillTheUserName(userName);
        Smtp.FillTheEmail(email);
        Smtp.FillTheConfirmEmail(confirmEmail);
        Smtp.SelectTheRole(role);
        Smtp.ClickOnAddUserButton();
    }

    @Then("^I verify new user with First Name as \"(.*)\" Last Name as \"(.*)\" and User Name as \"(.*)\" was added without errors$")
    public void i_verify_new_user_was_added(String firstName, String lastName, String userName) throws Throwable {
        Smtp.verifyEmail(firstName);
        Smtp.verifyEmail(lastName);
        Smtp.verifyEmail(userName);
    }
}