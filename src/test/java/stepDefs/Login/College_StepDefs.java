package stepDefs.Login;

import actions.Colleges.CollegeAction;
import actions.Colleges.CollegeVerify;
import actions.Login.LoginAction;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

/**
 * Created by csackrider on 11/25/2015.
 */
public class College_StepDefs {


    @Given("^I view \"([^\"]*)\" profile$")
    public void I_view_profile(String strCollege) throws Throwable {

        CollegeAction.goToCollegeProfile(strCollege);

    }

    @And("^I should see \"([^\"]*)\"$")
    public void I_should_see(String strCollege) throws Throwable {

        CollegeVerify.verifyCollegeSearchResult(strCollege);

    }
}
