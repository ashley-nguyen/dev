package stepDefs.TeacherRecommendations;

import actions.Setup.AlumniTracker;
import actions.TeacherRecommmendations.TeacherRecommendations;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
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

    @Then("^I can set Teacher Recommendation$")
    public void I_can_set_Teacher_Recommendation() throws Throwable {

        TeacherRecommendations.ClickOnSaveSettingButton();
    }



    @Then("^I click on Go summary button$")
    public void i_click_on_go_summary_button() throws Throwable {

        TeacherRecommendations.ClickOnGoSummaryButton();
    }

    @Then("^I can go to Summary Teacher Recommendation$")
    public void I_can_go_to_Summary_Teacher_Recommendation() throws Throwable {

        TeacherRecommendations.ClickOnGoSummaryButton();
    }


    @When("^I go to request Teacher recommendation with \"(.*)\" \"(.*)\" \"(.*)\"$")
    public void I_go_to_request_Teacher_recommendation(String request, String item, String school) throws Throwable {
        AlumniTracker.clickOnSchoolSelected(school);
        TeacherRecommendations.ClickOnTeacherRecommendationsLink();
        TeacherRecommendations.ClickOnRequestsTab();
        TeacherRecommendations.SelectGradeClass(request);
        TeacherRecommendations.SelectShowMeOptions(item);
    }

    @Then("^I can view request for Teacher Recommendation$")
    public void I_can_view_request_for_Teacher_Recommendation() throws Throwable {

        TeacherRecommendations.VerifySuccessRequestCreationAction();
    }

    @When("^I go to set Teacher Recommendation with \"(.*)\"$")
    public void I_go_to_set_Teacher_Recommmendation(String school) throws Throwable {
        AlumniTracker.clickOnSchoolSelected(school);
        TeacherRecommendations.ClickOnTeacherRecommendationsLink();
        TeacherRecommendations.ClickOnSettingsTab();
        TeacherRecommendations.ClickOnRecommendationRequestsDoNotRequireApprovalRadioButton();

    }

    @When("^I go to summary of Teacher Recommendation with \"(.*)\" \"(.*)\" \"(.*)\"$")
    public void I_go_to_summary_of_Teacher_Recommendation(String school, String gradefrom, String gradeto) throws Throwable {
        AlumniTracker.clickOnSchoolSelected(school);
        TeacherRecommendations.ClickOnTeacherRecommendationsLink();
        TeacherRecommendations.ClickOnSummaryTab();
        TeacherRecommendations.SelectGradeClassRange(gradefrom);
        TeacherRecommendations.SelectGradeToClassRange(gradeto);
    }


}
