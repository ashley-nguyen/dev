package actions.Dashboard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.Dashboard.DashboardPage;
import stepDefs.Hooks;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

/**
 * Created by franksejas on 12/22/2015.
 */
public class Dashboard {
    public static WebDriver driver;

    public static void NavigateToDashboard() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, DashboardPage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.linkText("Enter school site")));
        DashboardPage.School.click();
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.linkText("Planner")));
        DashboardPage.Planner.click();
    }

    public static void verifyDashboard() throws InterruptedException {
        driver = Hooks.driver;
        PageFactory.initElements(driver, DashboardPage.class);
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.id("course-management-container")));
        String recentUpdates = DashboardPage.txtRecentUpdates.getText();
        String dataverification = DashboardPage.txtDashboard.getText();
        assertTrue("Error Verification!", !recentUpdates.contains("An error occurred!"));
        assertTrue("Verify Data!", dataverification.contains("Counselor"));
    }
}
