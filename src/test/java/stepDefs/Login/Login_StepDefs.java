package stepDefs.Login;

import actions.Login.LoginAction;
import actions.Login.LoginVerify;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

/**
 * Created by csackrider on 10/9/2015.
 */
public class Login_StepDefs {


    @When("^I complete the fields on the login page for a district user$")
    public void i_complete_the_fields_on_the_login_page_for_a_district_user() throws Throwable {

        LoginAction.DoLogin("qadistrict", "jtester", "jtester01!");


    }

    @When("^I complete the fields on the login page for a school user$")
    public void i_complete_the_fields_on_the_login_page_for_a_school_user() throws Throwable {

        LoginAction.DoLogin("etcs", "cathycounselor", "testtest");

    }

    @When("^I complete the fields on the login page for an invalid school user$")
    public void I_complete_the_fields_on_the_login_page_for_an_invalid_school_user() throws Throwable {

        LoginAction.DoLogin("etcs", "abc123", "testtest");

    }

    @Then("^I will be signed into naviance$")
    public void i_will_be_signed_into_naviance() throws Throwable {

        LoginVerify.verifyValidLogin();

    }

    @Then("^I will not be signed into naviance$")
    public void i_will__not_be_signed_into_naviance() throws Throwable {

        LoginVerify.verifyInvalidLogin();

    }


    @Given("^I am logged into naviance as an admin user$")
    public void I_am_logged_into_naviance_as_an_admin_user() throws Throwable {
        LoginAction.DoLogin("etcs", "sallysupport", "sallysupport01!");
    }


    @Given("^when I log in with the following user details:$")
    public void when_I_log_in_with_the_following_user_details(List<String> usercreds) throws Throwable {

        LoginAction.DoLogin(usercreds.get(0), usercreds.get(1), usercreds.get(2));

    }
	
	 /**Frank Refactor **/
    @When("^I am logged into a school \"(.*)\" as \"(.*)\" with \"(.*)\"$")
    public void i_am_logged_into_a_school_as_user_password(String school, String user, String password) throws Throwable {

        LoginAction.DoLogin(school, user, password);
    }
	
    //Usage: I am logged into naviance "Account" as "Username" with "Password"
    @Given("^I am logged into naviance (.*) as (.*) with (.*)$")
    public void I_am_logged_into_naviance_account_as_user_with_password(String account, String user, String pass) throws Throwable {
        LoginAction.DoLogin(account, user, pass);
    }

    @When("^I log into family connection \"(.*)\" as \"(.*)\" and \"(.*)\"$")
    public void I_log_into_family_connection_as_and(String strAccount, String strUsername, String strPassword) throws Throwable {

        LoginAction.DoFCLogin(strAccount, strUsername, strPassword);
    }
}
