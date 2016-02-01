package actions.JournalDashboard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import stepDefs.Hooks;

import static org.junit.Assert.assertTrue;

/**
 * Created by franksejas on 2/01/2016.
 */
public class JournalDashboard_Verify {
    public static WebDriver driver;

    public static void verifyJournalDashboard() throws InterruptedException {
        String dataVerification = Hooks.driver.findElement(By.className("pageheader")).getText();
        assertTrue("Error Verification!", !dataVerification.contains("Whoops, looks like something went wrong."));
        assertTrue("Title Verification!", dataVerification.contains("JOURNAL DASHBOARD"));
    }
}
