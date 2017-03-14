package pageObjects.ElementarySchool;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import pageObjects.BaseClass;

/**
 * Created by sahara.navia on 2/20/17.
 */
public class AssignLessonSequencePage extends BaseClass {

    @FindBy(how = How.CSS, using = "select.ns-select")
    public static WebElement selLessonSequence;

    @FindBy(how = How.XPATH, using = "//input[@placeholder='Search by instructor name']")
    public static WebElement txtAssignInstructor;

    @FindBy(how = How.XPATH, using = "//input[@placeholder='Find a student group by name']")
    public static WebElement txtAssignGroupName;

    @FindBy(how = How.CSS, using = "button.ns-button:nth-child(1)")
    public static WebElement btnAssignCancel;

    @FindBy(how = How.CSS, using = "button.ns-button:nth-child(2)")
    public static WebElement btnAssignSave;

    public static By locatorAssignSaveBtn = By.cssSelector("button.ns-button:nth-child(2)");
    public static By locatorSequenceDropdown = By.cssSelector("select.ns-select");

    public AssignLessonSequencePage(WebDriver driver) {
        super(driver);
    }
}
