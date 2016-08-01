package actions.FamilyConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import pageObjects.FamilyConnection.FCHubsAdmissionsTabPage;
import pageObjects.FamilyConnection.FCHubsStudentLifeTabPage;
import stepDefs.Hooks;

import java.util.List;

import static org.junit.Assert.assertTrue;

/**
 * Created by jorgemaguina on 8/01/2016.
 */
public class FCHubsStudentLifeTab {
    public static WebDriver driver;

    public static void VerifySchoolSize(String schoolSize) {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsStudentLifeTabPage.class);
        assertTrue("The School Size is not correct",
                FCHubsStudentLifeTabPage.labelSchoolSizeOverview.getText().equals(schoolSize));
    }

    public static void VerifySchoolSizeDetail(String sectionName, String number) {
        driver = Hooks.driver;
        WebElement section = driver.findElement(By.xpath("//div[contains(text(), 'SCHOOL SIZE')]" +
                "/../div[contains(text(), '" + sectionName + "')]"));
        assertTrue("The " + sectionName + " number is incorrect", section.getText().contains(number));
    }

    public static void VerifyStudentLifeTopBarValues(String sectionName, String value) {
        driver = Hooks.driver;
        WebElement section = driver.findElement(By.xpath("//div[contains(text(), '" + sectionName + "')]" +
                "/../div[contains(text(), '" + value + "')]"));
        assertTrue("The " + sectionName + " value is incorrect", section.getText().equals(value));
    }
}