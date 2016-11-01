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
        driver = Hooks.driver;
        PageFactory.initElements(driver, DefaultDBPage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String verifyReportLink = DefaultDBPage.lnkReports.getText();
        String verifyPlannerLink = DefaultDBPage.lnkPlanner.getText();
        String verifyCoursesLink = DefaultDBPage.lnkCourses.getText();
        String verifyScholarshipsLink = DefaultDBPage.lnkScholarships.getText();
        String verifyCollegesLink = DefaultDBPage.lnkColleges.getText();
        String verifyConnectionsink = DefaultDBPage.lnkConnections.getText();
        String dataverification = DefaultDBPage.txtErrorsMessage.getText();
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
        String dataverification =  DefaultDBPage.txtMessage.getText();
        assertTrue("Verify Home Page!", !dataverification.contains("Fatal Error"));
    }
}
