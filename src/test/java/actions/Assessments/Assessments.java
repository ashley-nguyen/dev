package actions.Assessments;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.Assessments.AssessmentsPage;
import stepDefs.Hooks;

/**
 * Created by franksejas on 1/14/2016.
 */
public class Assessments {
    public static WebDriver driver;

    public static void ClickOnAssessments() throws InterruptedException {
        driver = Hooks.driver;
        PageFactory.initElements(driver, AssessmentsPage.class);
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.linkText("Assessments")));
        AssessmentsPage.Assessments.click();
    }

    public static void verifyAssessment() throws InterruptedException {
        String dataVerification = Hooks.driver.findElement(By.className("student-assessments")).getText();
        assertTrue("Error Verification!", !dataVerification.contains("Whoops, looks like something went wrong."));
    }
}
