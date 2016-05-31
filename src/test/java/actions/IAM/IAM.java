package actions.IAM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageObjects.IAM.IAMPage;
import stepDefs.Hooks;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

/**
 * Created by franksejas on 1/22/2016.
 */
public class IAM {
    public static WebDriver driver;

    public static void VerifyNotBeLogged() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, IAMPage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        IAMPage.Login.isDisplayed();
    }

    public static void verifyDashboard() throws InterruptedException {
        String recentupdates = Hooks.driver.findElement(By.id("course-management-container")).getText();
        String dataverification = Hooks.driver.findElement(By.id("dashboard-activity")).getText();
        assertTrue("Error Verification!", !recentupdates.contains("An error occurred!"));
        assertTrue("Verify Data!", dataverification.contains("Counselor"));
    }
}
