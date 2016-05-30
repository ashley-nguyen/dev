package stepDefs.Student_Test_Scores;

import actions.Student.Search.ScoresTab.Scores;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

/**
 * Created by csackrider on 10/9/2015.
 */
public class Scores_StepDefs {

    @And("^I enter AP test scores (.*) (.*) (.*) (.*)$")
    public void I_enter_AP_test_scores_testtype_score_year_grade(String testtype, String score, String year, String grade) throws Throwable {
        Scores.enterAPTestScores(testtype, score, year, grade);

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

    @And("^I enter ASPIRE test score (.*) for (.*) for grade (.*)$")
    public void I_enter_ASPIRE_test_score_score_for_subject_for_grade_grade(String score, String subject, String grade) throws Throwable {

        Scores.enterASPIRETestScores(subject, grade, score);
    }

    @Then("^I will see a warning (.*)$")
    public void I_will_see_a_warning_message(String strmessage) throws Throwable {

        Scores.verifyASPIRETestScoreWarning(strmessage);

    }

    @And("^I enter PSAT scores (.*) (.*) (.*) (.*) (.*) (.*) (.*) (.*) (.*)$")
    public void I_enter_PSAT_scores_evidenceReading_reading_writing_mathematics_score_math_test_totalscore_month_year_grade(String strEvReading, String strReading, String strWriting, String strMathematicsScore, String strMathTest, String strTotalScore, String strMonth, String strYear, String strGrade) throws Throwable {

        Scores.enterPSATTestScores(strEvReading, strReading, strWriting, strMathematicsScore, strMathTest, strTotalScore, strMonth, strYear, strGrade);

    }

    @Then("^I should see PSAT (.*)$")
    public void I_should_see_PSAT_warning(String strWarning) throws Throwable {

        Scores.verifyPSATWarning(strWarning);

    }

    @And("^I enter PSAT legacy scores (.*) (.*) (.*) (.*) (.*) (.*) (.*)$")
    public void I_enter_PSAT_legacy_scores_criticalreading_math_writing_totalscore_month_year_grade(String strCritialReading, String strMath, String strWriting, String strTotal, String strMonth, String strYear, String strGrade) throws Throwable {


        Scores.enterPSATLegacyTestScores(strCritialReading, strMath, strWriting, strTotal, strMonth, strYear, strGrade);
    }
}
