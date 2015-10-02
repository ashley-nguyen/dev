package stepDefs;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class Stepdefs {
    //public static WebDriver driver;

    //private static String strBaseURL = "https://succeed-internal.naviance.com";
    //@Before
    //public static void createdriver()
    //{
    //    driver = new FirefoxDriver();
    //}


    @Given("^I am a counselor$")
    public void i_am_a_counselor() throws Throwable {
        //for now just get the base url to go to the login page.
        //Hooks.driver.get(Hooks.strBaseURL);
    }

    @When("^I complete the fields on the login page for a district user$")
    public void i_complete_the_fields_on_the_login_page_for_a_district_user() throws Throwable {

    Login.DoLogin("qadistrict", "jtester", "jtester01!");


    }

    @When("^I complete the fields on the login page for a school user$")
    public void i_complete_the_fields_on_the_login_page_for_a_school_user() throws Throwable {

        Login.DoLogin("etcs", "cathycounselor", "testtest");

    }

    @When("^I complete the fields on the login page for an invalid school user$")
    public void I_complete_the_fields_on_the_login_page_for_an_invalid_school_user() throws Throwable {

        Login.DoLogin("etcs", "abc123", "testtest");

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
}
