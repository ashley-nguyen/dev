package stepDefs.Login;

import actions.Colleges.CollegeAction;
import actions.Colleges.CollegeVerify;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
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

    @Then("^I should see the following college profile information '(.*)' '(.*)' '(.*)' '(.*)'$")
    public void I_should_see_the_following_college_profile_information_Admissions_Academics_Costandaid_Extracurriculars(String strAdmissions, String strAcademics, String strCostAid, String strExtracurriculars) throws Throwable {

        System.out.println("Admissions: " + strAdmissions);
        System.out.println("academics: " + strAcademics);
        System.out.println("cost and aid: " + strCostAid);
        System.out.println("extrac: " + strExtracurriculars);

        CollegeAction.clickCollegeProfileTab("admissions");
        CollegeVerify.verifyCollegeSearchResult(strAdmissions);
        CollegeAction.clickCollegeProfileTab("academics");
        CollegeVerify.verifyCollegeSearchResult(strAcademics);
        CollegeAction.clickCollegeProfileTab("cost & aid");
        CollegeVerify.verifyCollegeSearchResult(strCostAid);
        CollegeAction.clickCollegeProfileTab("extracurriculars");
        CollegeVerify.verifyCollegeSearchResult(strExtracurriculars);

    }

}