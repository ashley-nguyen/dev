package actions.DefaultDB;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.DefaultDB.DefaultDBPage;
import stepDefs.Hooks;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

/**
 * Created by franksejas on 1/20/2016.
 */
public class DefaultDB {
    public static WebDriver driver;

    public static void  NavigateToCourses() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, DefaultDBPage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.linkText("Courses")));
        DefaultDBPage.Courses.click();
    }

    public static void verifyHomePage() throws InterruptedException {
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.linkText("home")));
        String verifyHomeLink = Hooks.driver.findElement(By.linkText("home")).getText();
        String verifyReportLink = Hooks.driver.findElement(By.linkText("Reports")).getText();
        String verifyPlannerLink = Hooks.driver.findElement(By.linkText("Planner")).getText();
        String verifyCoursesLink = Hooks.driver.findElement(By.linkText("Courses")).getText();
        String verifyScholarshipsLink = Hooks.driver.findElement(By.linkText("Scholarships")).getText();
        String verifyCollegesLink = Hooks.driver.findElement(By.linkText("Colleges")).getText();
        String verifyConnectionsink = Hooks.driver.findElement(By.linkText("Connections")).getText();
        String dataverification = Hooks.driver.findElement(By.className("main-navigation")).getText();
        assertTrue("Error Verification!", verifyHomeLink.contains("home"));
        assertTrue("Error Verification!", verifyReportLink.contains("Reports"));
        assertTrue("Error Verification!", verifyPlannerLink.contains("Planner"));
        assertTrue("Error Verification!", verifyCoursesLink.contains("Courses"));
        assertTrue("Error Verification!", verifyScholarshipsLink.contains("Scholarships"));
        assertTrue("Error Verification!", verifyCollegesLink.contains("Colleges"));
        assertTrue("Error Verification!", verifyConnectionsink.contains("Connections"));
        assertTrue("Verify Home Page!", !dataverification.contains("Fatal Error"));
    }

    public static void verifyCourseCatalog() throws InterruptedException {
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.linkText("Middle School Course Catalog")));
        String dataverification = Hooks.driver.findElement(By.id("main-content-container")).getText();
        assertTrue("Verify Home Page!", !dataverification.contains("Fatal Error"));
    }
}
