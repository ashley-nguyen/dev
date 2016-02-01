package stepDefs.ApplicationManager;

import actions.ApplicationManager.ApplicationManager_Action;
import actions.ApplicationManager.ApplicationManager_Verify;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by franksejas on 1/29/2016.
 */
public class ApplicationManager_StepDefs {

    @When("^I go to Application Manager$")
    public void i_go_to_application_manager() throws Throwable {

        ApplicationManager_Action.NavigateToApplicationManager();
    }

    @Then("^I will see data in Application Manager selecting \"(.*)\"")
    public void i_will_see_data_in_recent_updates(String item) throws Throwable {
        ApplicationManager_Verify.verifyApplicationManager();
            ApplicationManager_Verify.SelectFormOfPayment(item);

    }
}