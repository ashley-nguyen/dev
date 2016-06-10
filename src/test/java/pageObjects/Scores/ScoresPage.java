package pageObjects.Scores;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import pageObjects.BaseClass;

/**
 * Created by franksejas on 06/09/2016.
 */
public class ScoresPage extends BaseClass {
    @FindBy(how = How.LINK_TEXT, using = "Scores")
    public static WebElement tabScores;

    @FindBy(how = How.LINK_TEXT, using = "key test scores")
    public static WebElement lnkKeyTestScores;

    @FindBy(how = How.CLASS_NAME, using = "page-action")
    public static WebElement btnAddScore;

    @FindBy(how = How.CSS, using = "select[class='ns-select ng-pristine ng-untouched ng-empty ng-invalid ng-invalid-required']")
    public static WebElement selClass;

    @FindBy(how = How.NAME, using = "month")
    public static WebElement selClassDate;

    @FindBy(how = How.NAME, using = "day")
    public static WebElement strDayTaken;

    @FindBy(how = How.NAME, using = "year")
    public static WebElement strYearTaken;

    @FindBy(how = How.CSS, using = "select[class='ns-select ng-pristine ng-untouched ng-valid ng-empty']")
    public static WebElement selClassGrade;

    @FindBy(how = How.NAME, using = "ebrw")
    public static WebElement strEBRWScore;

    @FindBy(how = How.NAME, using = "readingTest")
    public static WebElement strReadingTestScore;

    @FindBy(how = How.NAME, using = "mathSection")
    public static WebElement strMathematicsTestScore;

    @FindBy(how = How.NAME, using = "writingAndLanguageTest")
    public static WebElement strWritingTestScore;

    @FindBy(how = How.NAME, using = "mathTest")
    public static WebElement strMathTestScore;

    @FindBy(how = How.NAME, using = "total")
    public static WebElement strTotalTestScore;

    @FindBy(how = How.CSS, using = "button[class='ns-button ns-button--primary']")
    public static WebElement btnSaveScores;

    @FindBy(how = How.CSS, using = "div[class='ns-alert ns-alert--danger ns-alert--block ng-scope']")
    public static WebElement txtMessage;

    @FindBy(how = How.CSS, using = "span[class='collapsible__title ng-binding']")
    public static WebElement txtAddedScoreMessage;

    public ScoresPage(WebDriver driver) {
        super(driver);
    }
}
