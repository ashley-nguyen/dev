package pageObjects.Student.ScoresTab;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import pageObjects.BaseClass;
import stepDefs.Hooks;

/**
 * Created by csackrider on 11/6/2015.
 */
public class StudentScoresTabPage extends BaseClass {

    public StudentScoresTabPage(WebDriver driver){
        super(driver);
    }

    //#### AP TEST SCORE OBJECTS ON EDIT SCREEN ####

    @FindBy(how= How.PARTIAL_LINK_TEXT, using="add/edit")
    public static WebElement lnkaddeditscores;

    @FindBy(how= How.NAME, using="ap_id[1]")
    public static WebElement ddlTestType;

    @FindBy(how= How.NAME, using="ap_score[1]")
    public static WebElement txtscore;

    @FindBy(how= How.NAME, using="ap_year[1]")
    public static WebElement ddlyear;

    @FindBy(how= How.NAME, using="ap_grade[1]")
    public static WebElement ddlgrade;

    @FindBy(how= How.XPATH, using="//input[@name='updateScores']")
    public static WebElement btnUpdateScores;

    @FindBy(how= How.PARTIAL_LINK_TEXT, using="delete_ap[0]")
    public static WebElement chkDelete;

    //#### aspire ####

    @FindBy(how= How.NAME, using="aspire[1][grade]")
    public static WebElement cboGrade;

    //#### PSAT ####
    @FindBy(how= How.XPATH, using="//*[@id='psat[1][ev_based_read_write]']")
    public static WebElement txtEvReadWrit;

    @FindBy(how= How.XPATH, using="//*[@id='psat[1][reading]']")
    public static WebElement txtReading;

    @FindBy(how= How.XPATH, using="//*[@id='psat[1][writing]']")
    public static WebElement txtWriting;

    @FindBy(how= How.XPATH, using="//*[@id='psat[1][mathematics]']")
    public static WebElement txtMathematics;

    @FindBy(how= How.XPATH, using="//*[@id='psat[1][math]']")
    public static WebElement txtMath;

    @FindBy(how= How.XPATH, using="//*[@id='psat[1][total]']")
    public static WebElement txtTotalScore;

    @FindBy(how= How.NAME, using="psat[1][month]")
    public static WebElement selMonth;

    @FindBy(how= How.NAME, using="psat[1][year]")
    public static WebElement selYear;

    @FindBy(how= How.NAME, using="psat[1][grade]")
    public static WebElement selGrade;


    //#### PSAT legacy ####

    @FindBy(how= How.NAME, using="psat_verbal[1]")
    public static WebElement txtCritalReading;

    @FindBy(how= How.NAME, using="psat_math[1]")
    public static WebElement txtPSATLegacyMath;

    @FindBy(how= How.NAME, using="psat_writing[1]")
    public static WebElement txtPSATLegacyWriting;

    @FindBy(how= How.NAME, using="psat_select[1]")
    public static WebElement txtTotal;

    @FindBy(how= How.NAME, using="psat_month[1]")
    public static WebElement selPSATLegacyMonth;

    @FindBy(how= How.NAME, using="psat_year[1]")
    public static WebElement selPSATLegacyyear;

    @FindBy(how= How.NAME, using="psat_grade[1]")
    public static WebElement selPSATLegacyGrade;





}
