package stepDefs.Setup;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static actions.Setup.SSO_Action.GoToSetup;
import static actions.Setup.SSO_Action.GoToSingleSignInOptions;
import static actions.Setup.SSO_Verify.VerifyPowerSchoolSSO;

/**
 * Created by csackrider on 1/5/2016.
 */
public class Setup_StepDefs {
    @Given("^I am in Naviance district setup$")
    public void I_am_in_Naviance_district_setup() throws Throwable {

        GoToSetup();

    }

    @When("^I navigate to Single Sign-in Options$")
    public void I_navigate_to_Single_Sign_in_Options() throws Throwable {
        GoToSingleSignInOptions();
    }

    @Then("^PowerSchool SSO configuration will be displayed$")
    public void PowerSchool_SSO_configuration_will_be_displayed() throws Throwable {

        VerifyPowerSchoolSSO();
    }
}
