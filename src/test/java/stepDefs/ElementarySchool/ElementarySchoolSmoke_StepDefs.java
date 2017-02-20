package stepDefs.ElementarySchool;

import actions.ElementarySchool.ElementaryAssignALessonSequence;
import actions.ElementarySchool.ElementaryProductPage;
import actions.ElementarySchool.ElementarySchoolActivity;
import actions.ElementarySchool.ElementaryViewAllLessonPlans;
import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by sahara.navia on 2/16/17.
 */
public class ElementarySchoolSmoke_StepDefs {

    @When("^I navigate to Naviance Elementary School$")
    public void iNavigateToNavianceElementarySchool() throws Throwable
    {
        ElementaryProductPage.clickElementarySchoolLink();
    }

    @Then("^I am able to navigate through the Elementary options links$")
    public void iAmAbleToNavigateThroughTheElementaryOptionsLinks() throws Throwable {
        ElementaryProductPage.verifyElementaryProductPage();
        ElementaryProductPage.clickViewAllLessonPlansLink();
        ElementaryViewAllLessonPlans.verifyViewAllLessonPlansPage();
        ElementaryProductPage.clickAssignALessonSequenceLink();
        ElementaryAssignALessonSequence.verifyAssignALessonSequencePage();
        ElementaryProductPage.clickSchoolActivityLink();
        ElementarySchoolActivity.verifySchoolActivityPage();

    }
}
