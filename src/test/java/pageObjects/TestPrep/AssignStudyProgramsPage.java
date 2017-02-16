package pageObjects.TestPrep;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by sahara.navia on 2/8/17.
 */
public class AssignStudyProgramsPage {

    @FindBy(how = How.CSS, using = "div.assign > h1")
    public static WebElement titleAssignStudyProgran;

    @FindBy(how = How.CSS, using = "input[value=\"Save\"]")
    public static WebElement btnSave;

    @FindBy(how = How.CSS, using = "div.ns-alert.ns-alert--success.ns-alert--success__font-weight-500.ng-scope > " +
            "span:nth-child(3) > strong")
    public static WebElement lblSuccessMessage;

    @FindBy(how = How.CSS, using = "div.ns-layout__main > div > ng-view > assign-programs > div > form > " +
                                   "div:nth-child(1) > div > tag-editor > div > div > div > div > input")
    public static WebElement txtStudyProgramsToAssign;


    @FindBy(how = How.CSS, using = "div.ns-layout__main > div > ng-view > assign-programs > div > form > " +
                                   "div:nth-child(2) > div > tag-editor > div > div > div > div > input")
    public static WebElement txtInstructorsToAssign;

    @FindBy(how = How.CSS, using = "div.ns-layout__main > div > ng-view > assign-programs > div > form > " +
                                   "div:nth-child(3) > div > tag-editor > div > div > div > div > input")
    public static WebElement txtGroupsToAssign;
}
