package actions.Reports;

import org.openqa.selenium.By;
import stepDefs.Hooks;

import static org.junit.Assert.assertTrue;

/**
 * Created by franksejas on 12/22/2015.
 */
public class Reports_Verify {

    public static void verifyReports() throws InterruptedException {
        String errorVerification = Hooks.driver.findElement(By.id("reporting-framework-container")).getText();
        String dataverification = Hooks.driver.findElement(By.id("reporting-framework-container")).getText();
        assertTrue("Error Verification!", !errorVerification.contains("Fatal Error"));
        assertTrue("Verify Data!", dataverification.contains("Customize"));
    }
}
