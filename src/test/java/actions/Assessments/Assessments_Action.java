package actions.Assessments;

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
public class Assessments_Action {
    public static WebDriver driver;

    public static void ClickOnAssessments() throws InterruptedException {
        driver = Hooks.driver;
        PageFactory.initElements(driver, AssessmentsPage.class);
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.linkText("Assessments")));
        AssessmentsPage.Assessments.click();
    }
}
