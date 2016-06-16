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

    @FindBy(how = How.NAME, using = "new_task_name")
    public static WebElement txtNewTask;

    @FindBy(how = How.NAME, using = "deadline_date")
    public static WebElement txtDueDate;

    @FindBy(how = How.NAME, using = "send-reminder")
    public static WebElement chbSendReminder;

    @FindBy(how = How.XPATH, using = "//*[@id=\"custom-task\"]/tbody/tr[5]/td/input[2]")
    public static WebElement btnSave;

    @FindBy(how = How.CSS, using = "table[class='tablesorter current_tasks']")
    public static WebElement tableTaskList;

    @FindBy(how = How.ID, using = "custom-task")
    public static WebElement tableCustomTask;

    public SuccessPlanTabPage(WebDriver driver) {
        super(driver);
    }

}
