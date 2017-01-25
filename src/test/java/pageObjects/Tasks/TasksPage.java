package pageObjects.Tasks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import pageObjects.BaseClass;

/**
 * Created by M1020406 on 1/24/2017.
 */
public class TasksPage extends BaseClass {
    @FindBy(how = How.LINK_TEXT, using = "Planner")
    public static WebElement Planner;
    @FindBy(how = How.LINK_TEXT, using = "Tasks")
    public static WebElement tasksLink;
    @FindBy(how = How.CSS, using = "#course-management-container>fieldset>legend")
    public static WebElement taskLibraryLegend;
    @FindBy(how = How.CSS, using = ".tablesorter.hoverPoverClose")
    public static WebElement taskLibraryTable;

    public TasksPage(WebDriver driver) {
        super(driver);
    }

}
