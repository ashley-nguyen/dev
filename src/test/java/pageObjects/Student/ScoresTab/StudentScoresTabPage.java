package pageObjects.Student.ScoresTab;

import org.openqa.selenium.By;
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


}
