package actions.Assessments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageObjects.Assessments.AssessmentsPage;
import stepDefs.Hooks;

/**
 * Created by franksejas on 1/14/2016.
 */
public class Assessments_Action {
    public static WebDriver driver;

    public static void ClickOnAssessments() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, AssessmentsPage.class);
        AssessmentsPage.Assessments.click();
    }
}
