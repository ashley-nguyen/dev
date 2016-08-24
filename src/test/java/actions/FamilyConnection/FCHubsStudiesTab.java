package actions.FamilyConnection;

import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.FamilyConnection.FCHubsPage;
import pageObjects.FamilyConnection.FCHubsStudentLifeTabPage;
import pageObjects.FamilyConnection.FCHubsStudiesTabPage;
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

    public static void VerifyTopAreasOfStudy(List<String> areasOfStudy) {
        boolean result = false;
        driver = Hooks.driver;
        for(int i = 0; i < areasOfStudy.size(); i++) {
            if(driver.findElement(By.xpath("//div[@class = 'fc-grid__row studies-popular']/div/h5" +
                    "[contains(text(), '" + areasOfStudy.get(i) + "')]")).isDisplayed()) {
                result = true;
            } else {
                result = false;
                break;
            }
        }
        assertTrue("The Top Areas of Study are not correct", result);
    }

    public static void EnterSearchStringMajorsOffered(String searchText) {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsStudiesTabPage.class);
        FCHubsStudiesTabPage.textBoxSearch.sendKeys(searchText);
    }

    public static void VerifyProgramsList(List<String> programs) {
        boolean result = false;
        driver = Hooks.driver;
        for(int i = 0; i < programs.size(); i++) {
            if(driver.findElement(By.xpath("//div[@class='studies-programs__content']/div/ul/li/a" +
                    "[contains(text(), '" + programs.get(i) + "')]")).isDisplayed()) {
                result = true;
            } else {
                result = false;
                break;
            }
        }
        assertTrue("The Programs List does not have the correct value", result);
    }

    public static void ClickDegreesMajorsOffered(String degree) {
        driver = Hooks.driver;
        WebElement degreeButton = driver.findElement(By.xpath("//li[@role='button' and " +
                "contains(text(), '" + degree + "')]"));
    }

    public static void ClickProgramInMajorsOfferedList(String program) {
        driver = Hooks.driver;
        WebElement programLink = driver.findElement(By.xpath("//h3[contains(text(), 'Majors Offered at')]" +
                "/../../div/div/div/ul/li/a[text() = '" + program + "']"));
        programLink.click();
        ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs.get(tabs.size() - 1));
    }

    public static void VerifyStudyOptions(String studyOption, String studyOptionAvailability) {
        driver = Hooks.driver;
        WebElement currentStudyOption = driver.findElement(By.xpath("//div/h2[contains(text(), 'Study Options')]" +
                "/../../div/div/div[text() = '" + studyOption + "']/span"));
        if(studyOptionAvailability.equals("available")) {
            assertTrue("The study Options are not correct",
                    currentStudyOption.getAttribute("class").equals("study-option__program--yes"));
        } else if(studyOptionAvailability.equals("not available")) {
            assertTrue("The study Options are not correct",
                    currentStudyOption.getAttribute("class").equals("study-option__program--no"));
        }

    }

    public static void ClickLinkInStudentLifeTopBar(String linkText) {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsStudentLifeTabPage.class);
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.linkText(linkText)));
        WebElement link = driver.findElement(By.linkText(linkText));
        link.click();
        ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs.get(tabs.size() - 1));
    }
}