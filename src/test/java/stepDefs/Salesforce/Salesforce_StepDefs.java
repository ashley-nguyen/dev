package stepDefs.Salesforce;

import actions.Salesforce.Salesforce_Action;
import actions.Salesforce.Salesforce_Verify;
import cucumber.api.java.en.Then;

/**
 * Created by franksejas on 1/19/2016.
 */
public class Salesforce_StepDefs {

    @Then("^the subscription is submitted successfully$")
    public void the_subscription_is_submitted_successfully() throws Throwable {

        Salesforce_Verify.verifyAPICall();
    }

    @Then("^I submit a new product subscription$")
    public void I_submit_a_new_product_subscription() throws Throwable {
        Salesforce_Action.NavigateToSchoolAccount();
        Salesforce_Action.NavigateToManageSubscriptions();
        Salesforce_Action.CheckOffProduct();
        Salesforce_Action.ClickOnNextButton();
    }
}