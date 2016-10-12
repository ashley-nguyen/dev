package stepDefs.API;

import API.StudentGroups.APIExample_Action;
import cucumber.api.java.en.When;



/**
 * Created by csackrider on 12/10/2015.
 * Updated by franksejas on 08/23/2016.
 */
public class APITest_StepDef {



    @When("^I call this Rest API$")
    public void I_call_this_Rest_API() throws Throwable {

        APIExample_Action.DoGet();

    }

    @When("^I call LOR Request API with \"(.*)\" token and \"(.*)\" with \"(.*)\"$")
    public void I_call_to_LOR_Request_API(String token, String url, String params) throws Throwable {

        APIExample_Action.GetLorRequests(token, url, params);

    }
}
