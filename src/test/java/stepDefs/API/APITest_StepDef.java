package stepDefs.API;

import API.StudentGroups.APIExample_Action;
import cucumber.api.java.en.When;
import org.openqa.selenium.remote.Response;



/**
 * Created by csackrider on 12/10/2015.
 */
public class APITest_StepDef {



    @When("^I call this Rest API$")
    public void I_call_this_Rest_API() throws Throwable {

        APIExample_Action.DoGet();

    }
}
