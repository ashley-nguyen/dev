package actions.FamilyConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.lift.HamcrestWebDriverTestCase;
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

    public static void VerifyTotalStudentsEthnicityData(String totalStudents) {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsStudentLifeTabPage.class);
        assertTrue("The Total Students number in Ethnicity Data is incorrect",
                FCHubsStudentLifeTabPage.labelTotalStudentsEthnicityData.getText().equals(totalStudents));
    }

    public static void VerifyEthnicGroupPercentage(String ethnicGroup, String value) {
        driver = Hooks.driver;
        WebElement percent = driver.findElement(By.xpath("//div[contains(text(), 'Ethnicity Data')]" +
                "/../../div/div/div/div[contains(text(), '" + ethnicGroup + "')]/following-sibling::div"));
        assertTrue("The percent for " + ethnicGroup + " is not correct", percent.getText().equals(value));
    }

    public static void VerifyTotalStudentsGenderData(String totalStudentsGender) {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsStudentLifeTabPage.class);
        assertTrue("The Total Students number in Gender Data is incorrect",
                FCHubsStudentLifeTabPage.labelTotalStudentsGenderData.getText().equals(totalStudentsGender));
    }

    public static void VerifyGenderPercentage(String gender, String value) {
        driver = Hooks.driver;
        WebElement genderPercent = driver.findElement(By.xpath("//div[contains(text(), 'Gender Data')]" +
                "/../../div/div/div/div[contains(text(), '" + gender + "')]/following-sibling::div"));
        assertTrue("The percent for " + gender + " is not correct", genderPercent.getText().equals(value));
    }

    public static void VerifyTotalStudentsAge(String totalStudentsAge) {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsStudentLifeTabPage.class);
        assertTrue("The Total Students number in Age is incorrect",
                FCHubsStudentLifeTabPage.labelTotalStudentsAgeData.getText().equals(totalStudentsAge));
    }

    public static void VerifyAgePercentage(String ageGroup, String value) {
        driver = Hooks.driver;
        WebElement agePercent = driver.findElement(By.xpath("//div[contains(text(), 'Age')]" +
                "/../../div/div/div/div[contains(text(), '" + ageGroup + "')]/following-sibling::div"));
        assertTrue("The percent for " + ageGroup + " is not correct", agePercent.getText().equals(value));
    }

    public static void VerifyHousingInformation(String hiLabel, String hiValue) {
        driver = Hooks.driver;
        WebElement housingValue = driver.findElement(By.xpath("//*[@id='housing-information']/div/div/dl/dt[contains" +
                "(text(),'" + hiLabel + "')]/../dd"));
        assertTrue("The Housing Information Value for" + hiLabel + "is not correct", housingValue.getText().equals(hiValue));
    }
}
