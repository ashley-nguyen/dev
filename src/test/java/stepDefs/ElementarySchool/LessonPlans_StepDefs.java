package stepDefs.ElementarySchool;

import actions.ElementarySchool.ElementaryProductPage;
import actions.ElementarySchool.ElementaryViewAllLessonPlans;
import actions.TestPrep.TestPrep;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

import pageObjects.ElementarySchool.ElementaryPage;

import java.util.List;

/**
 * Created by sahara.navia on 3/9/17.
 */
public class LessonPlans_StepDefs {

    @When("^I navigate to View All Lesson Plans and select grade \"([^\"]*)\"$")
    public void I_navigate_to_View_All_Lesson_Plans_and_select(String grade) throws Throwable
    {
        // Navigate to View All Lesson Plans
        ElementaryProductPage.clickElementarySchoolLink();
        ElementaryProductPage.clickViewAllLessonPlansLink();

        // Select Grade
        TestPrep.FilterTestPrep(ElementaryPage.selElementaryGrade, grade);
    }

    @Then("^The lesson plans should be similar to the table:$")
    public void The_Lesson_Plans_Should_Be_Similar_To_The_Table(DataTable lessonsData) throws Throwable {

        List<List<String>> table = lessonsData.raw();
        // Verify Lesson Plans data table
        ElementaryViewAllLessonPlans.verifyLessonPlansTableData(table);
    }
}
