package actions.Dashboard;

import org.openqa.selenium.By;
import stepDefs.Hooks;

import static org.junit.Assert.assertTrue;

/**
 * Created by franksejas on 12/22/2015.
 */
public class DashboardVerify {

    public static void verifyDashboard() throws InterruptedException {
        String recentupdates = Hooks.driver.findElement(By.id("course-management-container")).getText();
        String dataverification = Hooks.driver.findElement(By.id("dashboard-activity")).getText();
        assertTrue("Error Verification!", !recentupdates.contains("An error occurred!"));
        assertTrue("Verify Data!", dataverification.contains("Counselor"));
    }
}
