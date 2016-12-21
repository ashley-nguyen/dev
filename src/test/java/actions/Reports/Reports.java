package actions.Reports;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.Reports.ReportsPage;
import stepDefs.Hooks;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

/**
 * Created by franksejas on 1/13/2015.
 */
public class Reports {
    public static WebDriver driver;

    public static void NavigateToReports() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, ReportsPage.class);
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.linkText("Reports")));
        ReportsPage.Reports.click();
    }

    public static void ClickOnCustomizeLink() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, ReportsPage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        ReportsPage.Customize.click();
    }

    public static void ClickOnViewReportButton() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, ReportsPage.class);
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='customize-report']/div[2]/input[2]")));
        ReportsPage.ViewReport.click();
    }

    public static void verifyReports() throws InterruptedException {

        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.id("reporting-framework-container")));
        String errorVerification = ReportsPage.txtVerification.getText();
        String dataVerification = ReportsPage.txtVerification.getText();
        assertTrue("Error Verification!", !errorVerification.contains("Fatal Error"));
        assertTrue("Verify Data!", dataVerification.contains("Customize"));
    }

    public static void verifyUsageReports() throws InterruptedException {

        driver = Hooks.driver;
        PageFactory.initElements(driver, ReportsPage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        assertTrue("Verify Report exists!", new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.elementToBeClickable(ReportsPage.ViewUsageReport)).isDisplayed());
    }

    public static void verifyPlanningReports() throws InterruptedException {

        driver = Hooks.driver;
        PageFactory.initElements(driver, ReportsPage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        assertTrue("Verify Report exists!", new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.elementToBeClickable(ReportsPage.ViewPlanningReport)).isDisplayed());
    }

    public static void verifyOutcomeReports() throws InterruptedException {

        driver = Hooks.driver;
        PageFactory.initElements(driver, ReportsPage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        assertTrue("Verify Report exists!", new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.elementToBeClickable(ReportsPage.ViewOutcomeReport)).isDisplayed());
    }

    public static void verifyScholarshipReports() throws InterruptedException {

        driver = Hooks.driver;
        PageFactory.initElements(driver, ReportsPage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        assertTrue("Verify Report exists!", new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.elementToBeClickable(ReportsPage.ViewScholarshipReport)).isDisplayed());
    }

    public static void verifyCollegeReports() throws InterruptedException {

        driver = Hooks.driver;
        PageFactory.initElements(driver, ReportsPage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        assertTrue("Verify Report exists!", new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.elementToBeClickable(ReportsPage.ViewCollegeReport)).isDisplayed());
    }

    public static void verifyReports(String report) throws InterruptedException {

        driver = Hooks.driver;
        PageFactory.initElements(driver, ReportsPage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        int index = 0;
        int out = 0;

         List<WebElement> tableRows = ReportsPage.reportTable.findElements(By.cssSelector("#Student_reports>tbody>tr>td:nth-of-type(1)"));
        for(WebElement trElement : tableRows)
        {

            if (tableRows.get(index).getText().equals(report))
            {
               assertTrue("Verify Student Report exists!", tableRows.get(index).getText().contains(report));
                out = 1;
                break;
            }
            else
            {
                index = index +1;
            }

        }
           if (out ==0) {
               assertTrue("Error Verification!", !tableRows.get(index).getText().contains(report));
           }
    }

    public static void verifyCourseReporting(String CourseReport) throws InterruptedException {

        driver = Hooks.driver;
        PageFactory.initElements(driver, ReportsPage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        int index = 0;
        int out = 0;
        List<WebElement> tableRows = driver.findElements(By.cssSelector("#Course_reports>tbody>tr>td:nth-of-type(1)"));
        for(WebElement trElement : tableRows)
        {
            if (tableRows.get(index).getText().equals(CourseReport))
            {
                assertTrue("Course Report exists!", tableRows.get(index).getText().contains(CourseReport));
                out = 1;
                break;
            }
            else
            {
                index = index +1;
            }

        }
        if (out ==0) {
            assertTrue("Error Verification!", !tableRows.get(index).getText().contains(CourseReport));
        }
    }

    public static void verifyScoreReports() throws InterruptedException {

        driver = Hooks.driver;
        PageFactory.initElements(driver, ReportsPage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        assertTrue("Verify Report exists!", new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.elementToBeClickable(ReportsPage.ViewScoreReport)).isDisplayed());
    }

    public static void verifyCourseReports() throws InterruptedException {

        driver = Hooks.driver;
        PageFactory.initElements(driver, ReportsPage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        assertTrue("Verify Report exists!", new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.elementToBeClickable(ReportsPage.ViewCourseReport)).isDisplayed());
    }

    public static void verifyCTEReports() throws InterruptedException {

        driver = Hooks.driver;
        PageFactory.initElements(driver, ReportsPage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        assertTrue("Verify Report exists!", new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.elementToBeClickable(ReportsPage.ViewCTEReport)).isDisplayed());
    }

    public static void verifyPlannerReports() throws InterruptedException {

        driver = Hooks.driver;
        PageFactory.initElements(driver, ReportsPage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        assertTrue("Verify Report exists!", new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.elementToBeClickable(ReportsPage.ViewPlannerReport)).isDisplayed());
    }
}
