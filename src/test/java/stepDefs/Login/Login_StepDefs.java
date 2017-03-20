package stepDefs.Login;

import actions.Login.Login;
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

        Login.DoLogin("blueqa1", "frank.district", "password");


    }

    @When("^I complete the fields on the login page for a school user$")
    public void i_complete_the_fields_on_the_login_page_for_a_school_user() throws Throwable {

        Login.DoLogin("blue1hs", "stan.smith", "stan01!");

    }

    @When("^I complete the fields on the login page for an invalid school user$")
    public void I_complete_the_fields_on_the_login_page_for_an_invalid_school_user() throws Throwable {

        Login.DoLogin("blue1hs", "stan.smith", "stan00!");

    }

    @Then("^I will be signed into naviance$")
    public void i_will_be_signed_into_naviance() throws Throwable {

        Login.verifyValidLogin();

    }

    @Then("^I will not be signed into naviance$")
    public void i_will__not_be_signed_into_naviance() throws Throwable {

        Login.verifyInvalidLogin();

    }


    @Given("^I am logged into naviance as an admin user$")
    public void I_am_logged_into_naviance_as_an_admin_user() throws Throwable {
        Login.DoLogin("etcs", "sallysupport", "sallysupport01!");
    }


    @Given("^when I log in with the following user details:$")
    public void when_I_log_in_with_the_following_user_details(List<String> usercreds) throws Throwable {

        Login.DoLogin(usercreds.get(0), usercreds.get(1), usercreds.get(2));

    }
	
    //Usage: I am logged into naviance "Account" as "Username" with "Password"
    @Given("^I am logged into Naviance \"(.*)\" as \"(.*)\" with \"(.*)\"$")
    public void I_am_logged_into_naviance_account_as_user_with_password(String account, String user, String pass) throws Throwable {
        Login.DoLogin(account, user, pass);
    }

    //Usage: I am logged into naviance  "Username" with "Password"
    @Given("^I am logged into Naviance with \"(.*)\" with \"(.*)\"$")
    public void I_am_logged_into_naviance_user_with_password(String user, String pass) throws Throwable {
        Login.IAMLogin(user, pass);
    }

    @Given("^I am on the following url \"(.*)\"$")
    public void I_am_on_the_following_url(String url) throws Throwable {
        Login.GoToUrl(url);
    }

    @When("^I log into family connection \"(.*)\" as \"(.*)\" and \"(.*)\"$")
    public void I_log_into_family_connection_as_and(String strAccount, String strUsername, String strPassword) throws Throwable {

        Login.DoFCLogin(strAccount, strUsername, strPassword);
    }

    @Then("^I will be signed into Family Connection$")
    public void I_will_be_signed_into_Family_Connection() throws Throwable {

        Login.verifyValidLoginFamilyConnection();

    }

    @Given("^I log in to Family Connection with the following user details:$")
    public void I_log_in_to_Family_Connection_with_the_following_user_details(List<String> usercreds) throws Throwable {

        Login.DoFCLogin(usercreds.get(0), usercreds.get(1), usercreds.get(2));

    }

    @Then("^I see a credentials error message$")
    public void I_see_a_credentials_error_message() throws Throwable {

        Login.verifyValidLoginFamilyConnection();

    }

    @Given("^I log in to Family Connection as a parent with the following user details:$")
    public void I_log_in_to_Family_Connection_as_a_parent_with_the_following_user_details(List<String> usercreds)
            throws Throwable {
        Login.DoFCLoginParent(usercreds.get(0), usercreds.get(1), usercreds.get(2), usercreds.get(3));
    }
}
