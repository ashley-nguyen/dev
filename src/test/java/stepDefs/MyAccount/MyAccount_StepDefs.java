package stepDefs.MyAccount;

import actions.District.DistrictNav;
import actions.MyAccount.MyAccount_Verify;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by franksejas on 2/02/2016.
 */
public class MyAccount_StepDefs {

    @When("^I go to My Account$")
    public void i_go_to_myaccount() throws Throwable {
        //go to my account
        DistrictNav.goToAdminFunction("My Account");
    }

    @Then("^I will see data in My Account")
    public void i_will_see_data_in_my_account() throws Throwable {
        MyAccount_Verify.verifyMyAccount();
    }
}