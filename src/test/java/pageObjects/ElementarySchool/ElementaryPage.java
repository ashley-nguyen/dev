package pageObjects.ElementarySchool;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import pageObjects.BaseClass;

/**
 * Created by sahara.navia on 2/16/17.
 */
public class ElementaryPage extends BaseClass {

    @FindBy(how = How.CSS, using = "h1")
    public static WebElement titleElementaryProductPage;

    @FindBy(how = How.ID, using = "sequence-filter")
    public static WebElement selElementarySequence;

    @FindBy(how = How.ID, using = "instructor-filter")
    public static WebElement selElementaryInstructor;

    @FindBy(how = How.CSS, using = "table.ns-table > tbody")
    public static WebElement tblElementaryTBodyGroups;

    @FindBy(how = How.CSS, using = "table.ns-table > thead > tr > th")
    public static WebElement tblElementaryTHeadGroups;

    @FindBy(how = How.LINK_TEXT, using = "View All Lesson Plans")
    public static WebElement lnkViewAllLessonPlans;

    @FindBy(how = How.LINK_TEXT, using = "Assign a Lesson Sequence")
    public static WebElement lnkAssignALessonSequence;

    @FindBy(how = How.LINK_TEXT, using = "School Activity")
    public static WebElement lnkSchoolActivity;

    @FindBy(how = How.CSS, using = "select.ns-select:nth-child(2)")
    public static WebElement selElementaryGrade;

    @FindBy(how = How.CSS, using = "select.ns-select:nth-child(4)")
    public static WebElement selElementaryTheme;

    @FindBy(how = How.CSS, using = "select.ns-select")
    public static WebElement selLessonSequence;

    @FindBy(how = How.CSS, using = "select.ns-select")
    public static WebElement selActivityDate;

    @FindBy(how = How.CSS, using = ".bright-green-control")
    public static WebElement icDownloadCSV;

    @FindBy(how = How.CSS, using = ".ns-alert")
    public static WebElement lblRemovingMessage;

    @FindBy(how = How.CSS, using = "button.ns-button:nth-child(2)")
    public static WebElement btnRemoveGroup;

    @FindBy(how = How.CSS, using = ".ns-alert--success")
    public static WebElement lblAfterRemoving;

    public static By locatorElementaryGroupTable = By.cssSelector("table.ns-table > tbody > tr");
    public static By locatorGroupNameElemProdPage = By.tagName("h2");
    public static By locatorPrimarySeqElemProdPage = By.cssSelector("div:nth-child(2)");
    public static By locatorInstructorElemProdPage = By.cssSelector("div:nth-child(3)");
    public static By locatorPageTitle = By.cssSelector("h1");
    public static By locatorSuccessMessage = By.cssSelector(".ns-alert--success");

    public ElementaryPage(WebDriver driver) {
        super(driver);
    }

}
