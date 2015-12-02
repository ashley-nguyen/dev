package stepDefs.Login;

import actions.Colleges.CollegeAction;
import actions.Colleges.CollegeVerify;
import actions.Login.LoginAction;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

/**
 * Created by csackrider on 11/25/2015.
 */
public class College_StepDefs {


    @Given("^I view \"([^\"]*)\" profile$")
    public void I_view_profile(String strCollege) throws Throwable {

        CollegeAction.goToCollegeProfile(strCollege);

    }

    @And("^I should see \"([^\"]*)\"$")
    public void I_should_see(String strText) throws Throwable {

        CollegeVerify.verifyCollegeSearchResult(strText);

    }



    @When("^I click \"([^\"]*)\" tab on college profile$")
    public void I_click_tab_on_college_profile(String strTab) throws Throwable {

        CollegeAction.clickCollegeProfileTab(strTab);
    }
}
