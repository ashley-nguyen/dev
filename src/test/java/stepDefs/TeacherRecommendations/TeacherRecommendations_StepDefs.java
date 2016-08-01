package stepDefs.TeacherRecommendations;

import actions.TeacherRecommmendations.TeacherRecommendations;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
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

    @Given("^I click on Settings tab$")
    public void I_click_on_settings_tab() throws Throwable {
        TeacherRecommendations.ClickOnSettingsTab();
    }

    @Given("^I click on Summary tab$")
    public void I_click_on_summary_tab() throws Throwable {
        TeacherRecommendations.ClickOnSummaryTab();
    }

    @Given("^I click on Recommendation requests do not require approval$")
    public void I_click_on_recommendations_requests_do_not_require_approval() throws Throwable {
        TeacherRecommendations.ClickOnRecommendationRequestsDoNotRequireApprovalRadioButton();
    }


    @Given("^I select \"(.*)\" request from Grade Class$")
    public void I_select_requests_from_grade_class(String grade) throws Throwable {
        TeacherRecommendations.SelectGradeClass(grade);
    }

    @Given("^I select \"(.*)\" request from Grade Class range$")
      public void I_select_requests_from_grade_class_range(String grade) throws Throwable {
        TeacherRecommendations.SelectGradeClassRange(grade);
    }

    @Given("^I select \"(.*)\" request to Grade Class range$")
    public void I_select_requests_to_grade_class_range(String grade) throws Throwable {
        TeacherRecommendations.SelectGradeToClassRange(grade);
    }

    @Given("^I click on show me Go button$")
    public void I_click_on_go_button() throws Throwable {
        TeacherRecommendations.ClickShowMeGoButton();
    }

    @Given("^I select \"(.*)\" show me options$")
    public void I_select_show_me_options(String item) throws Throwable {
        TeacherRecommendations.SelectShowMeOptions(item);
    }

    @Then("^I click on Save setting button$")
    public void i_click_on_save_setting_button() throws Throwable {

        TeacherRecommendations.ClickOnSaveSettingButton();
    }

    @Then("^I click on Go summary button$")
    public void i_click_on_go_summary_button() throws Throwable {

        TeacherRecommendations.ClickOnGoSummaryButton();
    }

}
