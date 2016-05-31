package actions.FamilyConnection;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageObjects.FamilyConnection.FCDashboardPage;
import stepDefs.Hooks;

/**
 * Created by jorgemaguina on 5/25/2016.
 */
public class FCDashboard {
    public static WebDriver driver;

    public static void ClickCollegesTab() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCDashboardPage.class);
        FCDashboardPage.tabColleges.click();
    }
}