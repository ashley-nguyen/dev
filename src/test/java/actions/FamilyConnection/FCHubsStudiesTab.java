package actions.FamilyConnection;

import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.FamilyConnection.FCHubsPage;
import stepDefs.Hooks;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;

/**
 * Created by jorgemaguina on 5/25/2016.
 */
public class FCHubsStudiesTab {
    public static WebDriver driver;

    public static void VerifyStudentFacultyRatioStudiesTopBar(String studentFacultyRatio) {
        driver = Hooks.driver;
        assertTrue("The Student Faculty Ratio is not correct", driver.findElement(By.xpath("//div[contains(text(), " +
                "'Student Faculty')]/../div[contains(text(), '" + studentFacultyRatio + "')]")).isDisplayed());
    }

    public static void VerifyStudentRetentionStudiesTopBar(String studentRetention) {
        driver = Hooks.driver;
        assertTrue("The Student Faculty Ratio is not correct", driver.findElement(By.xpath("//div[contains(text(), " +
                "'Student Retention')]/../div[contains(text(), '" + studentRetention + "')]")).isDisplayed());
    }

    public static void VerifyGraduationRateStudiesTopBar(String graduationRate) {
        driver = Hooks.driver;
        assertTrue("The Student Faculty Ratio is not correct", driver.findElement(By.xpath("//div[contains(text(), " +
                "'Graduation Rate')]/../div[contains(text(), '" + graduationRate + "')]")).isDisplayed());
    }

    public static void VerifyDegreesOfferedStudiesTopBar(List<String> degreesOffered) {
        boolean result = false;
        driver = Hooks.driver;
        for(int i = 0; i < degreesOffered.size(); i++) {
            if(driver.findElement(By.xpath("//div[@class='hub-data-pod__heading' and contains(text(), " +
                    "'Degrees Offered')]/../div[contains(text(), '" + degreesOffered.get(i) + "')]")).isDisplayed()) {
                result = true;
            } else {
                result = false;
                break;
            }
        }
        assertTrue("The Degrees Offered are not correct", result);
    }
}