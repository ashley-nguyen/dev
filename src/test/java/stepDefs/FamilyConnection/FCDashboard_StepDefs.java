package stepDefs.FamilyConnection;

import actions.FamilyConnection.FCDashboard;
import cucumber.api.java.en.When;

/**
 * Created by jorgemaguina on 5/25/2016.
 */
public class FCDashboard_StepDefs {

    @When("^I click on the Colleges tab$")
    public void I_click_on_the_Colleges_tab() throws Throwable {
        FCDashboard.ClickCollegesTab();
    }
}