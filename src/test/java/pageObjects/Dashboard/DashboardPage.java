package pageObjects.Dashboard;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import pageObjects.BaseClass;

/**
 * Created by franksejas on 12/22/2015.
 */
public class DashboardPage extends BaseClass {
    @FindBy(how = How.LINK_TEXT, using = "Enter school site")
    public static WebElement School;
    @FindBy(how = How.LINK_TEXT, using = "Planner")
    public static WebElement Planner;
    @FindBy(how = How.ID, using = "course-management-container")
    public static WebElement txtRecentUpdates;
    @FindBy(how = How.ID, using = "dashboard-activity")
    public static WebElement txtDashboard;

    public DashboardPage(WebDriver driver) {
        super(driver);
    }
}
