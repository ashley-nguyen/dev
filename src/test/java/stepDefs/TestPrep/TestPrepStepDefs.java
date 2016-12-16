package stepDefs.TestPrep;

import actions.TestPrep.TestPrep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by sangeetha.munuswamy on 12/7/2016.
 */
public class TestPrepStepDefs {

    @Given("^l am landed on Home page of naviance$")
    public void TestPrep() throws Throwable {

     }

    @When("^I access the Naviance TestPrep as a Schoolsiteadmin$")
    public void clickTestPrep() throws Throwable {
        TestPrep.clickTestPrepLink();
    }


    @Then("^I will skip the walkkthrough page if loaded$")
    public void skipWalkThroughPage() throws Throwable {
        TestPrep.skipWalkThroughPage();
    }

    @Given("^I am a Schoolsiteadmin$")
    public void iAmSchoolAdmin() throws Throwable {
    }

    @When("^I have proper credentials$")
    public void iHaveCredentials() throws Throwable {
    }

 }
