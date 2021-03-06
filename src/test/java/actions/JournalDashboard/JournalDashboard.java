package actions.JournalDashboard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageObjects.JournalDashboard.JournalDashboardPage;
import stepDefs.Hooks;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

/**
 * Created by franksejas on 2/01/2016.
 */
public class JournalDashboard {
    public static WebDriver driver;

    public static void NavigateToJournalDashboard() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, JournalDashboardPage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        JournalDashboardPage.School.click();
        JournalDashboardPage.lnkJournalDashboard.click();
    }

    public static void verifyJournalDashboard() throws InterruptedException {
        String dataVerification = Hooks.driver.findElement(By.className("pageheader")).getText();
        assertTrue("Error Verification!", !dataVerification.contains("Whoops, looks like something went wrong."));
        assertTrue("Title Verification!", dataVerification.contains("JOURNAL DASHBOARD"));
    }
}
