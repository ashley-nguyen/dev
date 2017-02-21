package pageObjects.ElementarySchool;

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

    @FindBy(how = How.CSS, using = "table.ns-table > tbody > tr")
    public static WebElement tblElementaryGroups;

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

    @FindBy(how = How.CSS, using = ".tag-editor__new__input")
    public static WebElement txtAssignInstructor;

    @FindBy(how = How.CSS, using = ".ns-textbox")
    public static WebElement txtAssignGroupName;

    @FindBy(how = How.CSS, using = "button.ns-button:nth-child(1)")
    public static WebElement btnAssignCancel;

    @FindBy(how = How.CSS, using = "button.ns-button:nth-child(2)")
    public static WebElement btnAssignSave;

    @FindBy(how = How.CSS, using = "select.ns-select")
    public static WebElement selActivityDate;

    @FindBy(how = How.CSS, using = ".bright-green-control")
    public static WebElement icDownloadCSV;

    public ElementaryPage(WebDriver driver) {
        super(driver);
    }

}
