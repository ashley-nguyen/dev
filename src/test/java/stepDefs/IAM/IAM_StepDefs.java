package stepDefs.IAM;

import actions.IAM.IAM;
import actions.Login.Login;
import cucumber.api.java.en.When;

/**
 * Created by franksejas on 1/22/2016.
 */
public class IAM_StepDefs {

    @When("^I will not be logged into the district and not able to perform normal administrative functions$")
    public void i_will_not_be_logged_into_the_district_and_not_able_to_perform_normal_administrative_functions() throws Throwable {

        IAM.VerifyNotBeLogged();
    }

    @When("^I will logged into the district and able to perform normal administrative functions$")
    public void i_will_be_logged_into_the_district_and_able_to_perform_normal_administrative_functions() throws Throwable {

        Login.verifyValidLogin();
    }
}