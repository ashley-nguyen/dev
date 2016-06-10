package stepDefs.Scores;

import actions.Scores.Scores;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by franksejas on 1/14/2016.
 */
public class Scores_StepDefs {

    @When("^I click on Scores tab$")
    public void i_click_on_scores_tab() throws Throwable {
        Scores.ClickOnScores();
    }

    // Click on Key Test Scores
    @When("^I click on \"(.*)\" link$")
    public void I_click_on_link(String link) throws Throwable {

        Scores.ClickOnKeyTestScores(link);
    }

    @When("^I click on Add Score button$")
    public void I_click_on_add_score_button() throws Throwable {

        Scores.ClickOnAddScoreButton();
    }

    @When("^I select the \"(.*)\" test$")
    public void I_select_a_test(String test) throws Throwable {

        Scores.SelectATest(test);
    }

    @When("^I select the \"(.*)\" taken")
    public void I_select_date_taken(String test) throws Throwable {

        Scores.SelectDateTaken(test);
    }

    @When("^I wrote the \"(.*)\" day")
    public void I_wrote_the_date_taken(Integer day) throws Throwable {

        Scores.SelectDayTaken(day);
    }

    @When("^I wrote the \"(.*)\" year")
    public void I_wrote_the_year_taken(Integer day) throws Throwable {

        Scores.SelectYearTaken(day);
    }

    @When("^I select the \"(.*)\" when taken$")
    public void I_select_the_grade_when_taken(String grade) throws Throwable {

        Scores.SelectGradeWhenTaken(grade);
    }

    @When("^I wrote the \"(.*)\" value for EBRW test score")
    public void I_wrote_the_ebrw_test_score(Integer ebrw) throws Throwable {

        Scores.fillEBRWScore(ebrw);
    }

    @When("^I wrote the \"(.*)\" value for reading test score")
    public void I_wrote_the_reading_test_score(Integer reading) throws Throwable {

        Scores.fillReadingTestcore(reading);
    }

    @When("^I wrote the \"(.*)\" value for writing test score")
    public void I_wrote_the_writing_test_score(Integer writing) throws Throwable {

        Scores.fillWritingTestcore(writing);
    }

    @When("^I wrote the \"(.*)\" value for mathematics test score")
    public void I_wrote_the_mathematics_test_score(Integer mathematics) throws Throwable {

        Scores.fillMathematicsTestcore(mathematics);
    }

    @When("^I wrote the \"(.*)\" value for math test score")
    public void I_wrote_the_math_test_score(Integer math) throws Throwable {

        Scores.fillMathTestcore(math);
    }

    @When("^I wrote the \"(.*)\" value for total test score")
    public void I_wrote_the_total_test_score(Integer total) throws Throwable {

        Scores.fillTotalTestcore(total);
    }

    @When("^I click on Save Scores button")
    public void I_click_on_save_scores_button() throws Throwable {

        Scores.clickSaveScores();
    }

    @Then("^I verify the test scores with \"(.*)\" message displayed$")
    public void i_verify_test_scores(String message) throws Throwable {
        Scores.verifyMessages(message);
    }

}