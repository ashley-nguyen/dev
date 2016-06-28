package stepDefs.TeacherRecommendations;

import actions.TeacherRecommmendations.TeacherRecommendations;
import cucumber.api.java.en.Given;
import org.openqa.selenium.WebDriver;

/**
 * Created by Frank Sejas on 06/20/2016.
 */
public class TeacherRecommendations_StepDefs {

    public static WebDriver driver;

    @Given("^I click on Teacher Recommendations link$")
    public void I_click_on_teacher_recommendations_link() throws Throwable {
        TeacherRecommendations.ClickOnTeacherRecommendationsLink();
    }

    @Given("^I click on Requests tab$")
    public void I_click_on_requests_tab() throws Throwable {
        TeacherRecommendations.ClickOnRequestsTab();
    }

    @Given("^I select \"(.*)\" request from Grade Class$")
    public void I_select_requests_from_grade_class(String grade) throws Throwable {
        TeacherRecommendations.SelectGradeClass(grade);
    }

    @Given("^I click on show me Go button$")
    public void I_click_on_go_button() throws Throwable {
        TeacherRecommendations.ClickShowMeGoButton();
    }

    @Given("^I select \"(.*)\" show me options$")
    public void I_select_show_me_options(String item) throws Throwable {
        TeacherRecommendations.SelectShowMeOptions(item);
    }

}
