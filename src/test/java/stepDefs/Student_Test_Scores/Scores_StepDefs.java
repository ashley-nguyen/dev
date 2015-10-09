package stepDefs.Student_Test_Scores;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import stepDefs.Student_Test_Scores.Scores;

/**
 * Created by csackrider on 10/9/2015.
 */
public class Scores_StepDefs {

    @And("^I enter AP test scores (.*) (.*) (.*) (.*)$")
    public void I_enter_AP_test_scores_testtype_score_year_grade(String testtype, String score, String year, String grade) throws Throwable {
        Scores.etnerAPTestScores(testtype, score, year, grade);

    }

    @Then("^their AP test scores will be displayed (.*) (.*) (.*) (.*)$")
    public void their_AP_test_scores_will_be_displayed_testtype_score_year_grade(String testtype, String score, String year, String grade) throws Throwable {

        Scores.verifyAPTestScores(testtype, score, year, grade);
        Scores.removeAPTestScores(testtype);

    }


    @Then("^their ACT legacy test scores will be displayed (.*) (.*) (.*) (.*) (.*) (.*) (.*) (.*) (.*)$")
    public void their_ACT_legacy_test_scores_will_be_displayed_english_math_reading_science_writing_sub_comb_eng_wri_composite_date_grade(String strEnglish, String strMath, String strReading, String strScience, String strWritSub, String strCombEngWri, String strComposite, String strDate, String strGrade) throws Throwable {


        Scores.verifyLegacyACTScores(strEnglish, strMath, strReading, strScience, strWritSub, strCombEngWri, strComposite, strDate, strGrade);

    }
}
