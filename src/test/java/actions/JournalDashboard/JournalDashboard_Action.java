package actions.JournalDashboard;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageObjects.JournalDashboard.JournalDashboardPage;
import stepDefs.Hooks;

/**
 * Created by franksejas on 2/01/2016.
 */
public class JournalDashboard_Action {
    public static WebDriver driver;

    public static void NavigateToJournalDashboard() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, JournalDashboardPage.class);
        JournalDashboardPage.School.click();
        JournalDashboardPage.lnkJournalDashboard.click();
    }
}
