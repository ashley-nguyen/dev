package actions.Dashboard;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageObjects.Dashboard.DashboardPage;
import stepDefs.Hooks;

/**
 * Created by franksejas on 12/22/2015.
 */
public class Dashboard {
    public static WebDriver driver;

    public static void NavigateToDashboard() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, DashboardPage.class);
        DashboardPage.School.click();
        DashboardPage.Planner.click();
    }

    public static void verifyDashboard() throws InterruptedException {
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.id("course-management-container")));
        String recentupdates = Hooks.driver.findElement(By.id("course-management-container")).getText();
        String dataverification = Hooks.driver.findElement(By.id("dashboard-activity")).getText();
        assertTrue("Error Verification!", !recentupdates.contains("An error occurred!"));
        assertTrue("Verify Data!", dataverification.contains("Counselor"));
    }
}
