package pageObjects.Student.SuccessPlanTab;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import pageObjects.BaseClass;

/**
 * Created by franksejas on 06/15/2015.
 */
public class SuccessPlanTabPage extends BaseClass {

    @FindBy(how = How.LINK_TEXT, using = "Success Plan")
    public static WebElement tabSuccessPlan;

    @FindBy(how = How.LINK_TEXT, using = "add custom task")
    public static WebElement lnkAddCustomTask;

    @FindBy(how = How.LINK_TEXT, using = "assign school tasks")
    public static WebElement lnkAssignSchoolTasks;

    @FindBy(how = How.LINK_TEXT, using = "assign district tasks")
    public static WebElement lnkAssignDistrictTasks;

    @FindBy(how = How.NAME, using = "new_task_name")
    public static WebElement txtNewTask;

    @FindBy(how = How.NAME, using = "deadline_date")
    public static WebElement txtDueDate;

    @FindBy(how = How.NAME, using = "send-reminder")
    public static WebElement chbSendReminder;

    @FindBy(how = How.CSS, using = "#custom-task > tbody > tr:nth-of-type(5) > td > input:nth-of-type(2)")
    public static WebElement btnSave;

    @FindBy(how = How.CSS, using = "table[class='tablesorter current_tasks']")
    public static WebElement tableTaskList;

    @FindBy(how = How.ID, using = "activities_left")
    public static WebElement divTask;

    @FindBy(how = How.ID, using = "dactivities_left")
    public static WebElement divDistrictTask;

    @FindBy(how = How.CSS, using = "select[class='csleft']")
    public static WebElement txtTask;

    @FindBy(how = How.CSS, using = "#tasklist > form > fieldset > fieldset > input:nth-of-type(1)")
    public static WebElement btnAdd;

    @FindBy(how = How.CSS, using = "#dtasklist > form > fieldset > fieldset > input:nth-of-type(1)")
    public static WebElement btnDistrictAdd;

    @FindBy(how = How.CSS, using = "#tasklist > form > input:nth-of-type(2)")
    public static WebElement btnAssignSave;

    @FindBy(how = How.CSS, using = "#dtasklist > form > input:nth-of-type(2)")
    public static WebElement btnDistrictAssignSave;

    public SuccessPlanTabPage(WebDriver driver) {
        super(driver);
    }

}
