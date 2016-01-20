package stepDefs.Salesforce;

import actions.Salesforce.Salesforce_Action;
import actions.Salesforce.Salesforce_Verify;
import cucumber.api.java.en.When;

/**
 * Created by franksejas on 1/19/2016.
 */
public class Salesforce_StepDefs {

    @When("^I am navigate to School account$")
    public void i_am_navigate_to_school_account() throws Throwable {

        Salesforce_Action.NavigateToSchoolAccount();
    }

    @When("^I am navigate to Manage Subscriptions$")
    public void i_am_navigate_to_manage_subscriptions() throws Throwable {

        Salesforce_Action.NavigateToManageSubscriptions();
    }

    @When("^I click on Next button$")
    public void i_click_on_next_button() throws Throwable {

        Salesforce_Action.ClickOnNextButton();
    }

    @When("^I click on Submit button$")
    public void i_click_on_submit_button() throws Throwable {

        Salesforce_Action.ClickOnSubmitButton();
    }

    @When("^I select a product$")
    public void i_select_a_product() throws Throwable {

        Salesforce_Action.CheckOffProduct();
    }

    @When("^I select Start Date$")
    public void i_select_a_start_date() throws Throwable {

        Salesforce_Action.SelectStartDate();
    }

    @When("^I select End Date$")
    public void i_select_a_end_date() throws Throwable {

        Salesforce_Action.SelectEndDate();
    }

    @When("^I select a form of payment$")
    public void i_select_a_form_of_payment() throws Throwable {

        Salesforce_Action.SelectFormOfPayment();
    }

    @When("^I write PO Number$")
    public void i_write_PO_Number() throws Throwable {

        Salesforce_Action.WritePONumber();
    }

    @When("^I verify that API Calls do not produce an error$")
    public void i_verify_that_API_calls_do_not_produce_an_error() throws Throwable {

        Salesforce_Verify.verifyAPICall();
    }
}