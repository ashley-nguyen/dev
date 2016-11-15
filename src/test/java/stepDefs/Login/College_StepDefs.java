package stepDefs.Login;

import actions.Colleges.College;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static actions.Colleges.College.*;

/**
 * Created by csackrider on 11/25/2015.
 */
public class College_StepDefs {


    @Given("^I view \"([^\"]*)\" profile$")
    public void I_view_profile(String strCollege) throws Throwable {

        College.goToCollegeProfile(strCollege);

    }

    @And("^I should see \"([^\"]*)\"$")
    public void I_should_see(String strText) throws Throwable {

        College.verifyCollegeSearchResult(strText);

    }


    @When("^I click \"([^\"]*)\" tab on college profile$")
    public void I_click_tab_on_college_profile(String strTab) throws Throwable {

        College.clickCollegeProfileTab(strTab);
    }

    @Then("^I should see the following college profile information '(.*)' '(.*)' '(.*)' '(.*)'$")
    public void I_should_see_the_following_college_profile_information_Admissions_Academics_Costandaid_Extracurriculars(String strAdmissions, String strAcademics, String strCostAid, String strExtracurriculars) throws Throwable {

        System.out.println("Admissions: " + strAdmissions);
        System.out.println("academics: " + strAcademics);
        System.out.println("cost and aid: " + strCostAid);
        System.out.println("extrac: " + strExtracurriculars);
        College.clickCollegeProfileTab("admissions");
        College.verifyCollegeSearchResult(strAdmissions);
        College.clickCollegeProfileTab("academics");
        College.verifyCollegeSearchResult(strAcademics);
        College.clickCollegeProfileTab("cost & aid");
        College.verifyCollegeSearchResult(strCostAid);
        College.clickCollegeProfileTab("extracurriculars");
        College.verifyCollegeSearchResult(strExtracurriculars);

    }

    @When("^I go to the advanced college search screen$")
    public void I_go_to_the_advanced_college_search_screen() throws Throwable {

        goToAdvancedCollegeSearch();

    }

    @When("^I go to find college \"([^\"]*)\"$")
    public void I_go_to_find_college_search_screen(String strCollegeName) throws Throwable {

        goToFindColleges(strCollegeName);

    }


    @Then("^I will be able to search using the following criteria '(.*)' '(.*)' '(.*)' '(.*)'$")
    public void I_will_be_able_to_search_using_the_following_criteria_SearchCategory_SearchValue_SearchData_SearchResult_(String strCategory, String strValue, String strData, String strResult) throws Throwable {
        DoAdvancedCollegeSearch(strCategory, strValue, strData, strResult);

    }

    @Then("^I will see \"([^\"]*)\" search category$")
    public void I_will_see_search_category(String strCategory) throws Throwable {

        verifyAdvancedSearchCategory(strCategory);

    }

    @Then("^I should not see errors in find College \"([^\"]*)\"$")
    public void I_should_not_see_errors_in_find_college(String strCategory) throws Throwable {

      verifyFindCollege(strCategory);

    }
}
