package actions.FamilyConnection;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageObjects.FamilyConnection.FCDashboardPage;
import stepDefs.Hooks;

import java.util.concurrent.TimeUnit;

/**
 * Created by jorgemaguina on 5/25/2016.
 */
public class FCDashboard {
    public static WebDriver driver;

    public static void ClickCollegesTab() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCDashboardPage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        FCDashboardPage.tabColleges.click();
    }
}