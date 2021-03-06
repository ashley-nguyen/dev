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
        PageFactory.initElements(driver, FCHubsStudiesTabPage.class);
        new WebDriverWait(Hooks.driver, 20).until(ExpectedConditions.elementToBeClickable(By.cssSelector
                (".hub-data-pod--ratio.hub-data-pod--studies.ng-binding")));
        assertTrue("The Student Faculty Ratio is not correct", FCHubsStudiesTabPage.labelStuFacRatio.getText()
                .equals(studentFacultyRatio));
    }

    public static void VerifyStudentRetentionStudiesTopBar(String studentRetention) {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsStudiesTabPage.class);
        assertTrue("The Student Faculty Ratio is not correct", FCHubsStudiesTabPage.labelStuRetention.getText()
                .equals(studentRetention));
    }

    public static void VerifyGraduationRateStudiesTopBar(String graduationRate) {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsStudiesTabPage.class);
        assertTrue("The Student Faculty Ratio is not correct",FCHubsStudiesTabPage.labelGradRate.getText()
                .equals(graduationRate));
    }

    public static void VerifyDegreesOfferedStudiesTopBar(List<String> degreesOffered) {
        boolean result = false;
        driver = Hooks.driver;
        WebElement degreesList = driver.findElement(By.cssSelector
                ("div[ng-if=\"vm.profile.friendlyDegrees.length > 0\"]"));
        List<WebElement> degreeElements = degreesList.findElements(By.cssSelector("div[ng-repeat=" +
                "\"degree in vm.profile.friendlyDegrees\"]"));
        for(int i = 0; i < degreesOffered.size(); i++) {
            if(degreeElements.get(i).getText().equals(degreesOffered.get(i))) {
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
        WebElement areasOfStudyList = driver.findElement(By.cssSelector
                (".fc-grid__row.studies-popular.studies-programs__block"));
        List<WebElement> areasOfStudyElements = areasOfStudyList.findElements(By.cssSelector
                ("div:not([ng-if=\"vm.dataAge\"])"));
        for(int i = 0; i < areasOfStudy.size(); i++) {
            if(areasOfStudyElements.get(i).getText().equals(areasOfStudy.get(i))) {
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
        WebElement majorsOfferedDegree = null;
        PageFactory.initElements(driver, FCHubsStudiesTabPage.class);
        switch (degree) {
            case "All" : majorsOfferedDegree = FCHubsStudiesTabPage.buttonMajorsOfferedAll;
                break;
            case "Associates" : majorsOfferedDegree = FCHubsStudiesTabPage.buttonMajorsOfferedAssociates;
                break;
            case "Bachelors" : majorsOfferedDegree = FCHubsStudiesTabPage.buttonMajorsOfferedBachelors;
                break;
            case "Masters" : majorsOfferedDegree = FCHubsStudiesTabPage.buttonMajorsOfferedMasters;
                break;
            case "Doctoral" : majorsOfferedDegree = FCHubsStudiesTabPage.buttonMajorsOfferedDoctoral;
                break;
            case "Certificate" : majorsOfferedDegree = FCHubsStudiesTabPage.buttonMajorsOfferedCertificate;
                break;
            case "Graduate Certificate" : majorsOfferedDegree = FCHubsStudiesTabPage.buttonMajorsOfferedGradCertificate;
                break;
        }
        majorsOfferedDegree.click();
    }

    public static void ClickProgramInMajorsOfferedList(String program) {
        driver = Hooks.driver;
        WebElement programLink = driver.findElement(By.xpath("//h3[contains(text(), 'Majors Offered at')]" +
                "/../../div/div/div/ul/li/a[text() = '" + program + "']"));
        programLink.click();
        ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs.get(tabs.size() - 1));
    }

    public static void VerifyStudyOptions(String status, List<String> studyOptions) {
        driver = Hooks.driver;
        boolean result = false;
        List<WebElement> availableStudyOptions = new ArrayList<>();
        List<WebElement> unavailableStudyOptions = new ArrayList<>();
        for(int i = 2; i < 20; i++) {
            WebElement studyOption = driver.findElement(By.cssSelector(".study-option.fc-grid__row." +
                    "fc-grid__row--xs-center.fc-grid__row--md-start div:nth-of-type(" + i + ") div div"));
            if(studyOption.getAttribute("class").contains("study-option__program--unavailable")) {
                unavailableStudyOptions.add(studyOption);
            } else {
                availableStudyOptions.add(studyOption);
            }
        }
        if(status.equals("available")) {
            for(int j = 0; j < studyOptions.size(); j++) {
                if(availableStudyOptions.get(j).getText().equals(studyOptions.get(j))) {
                    result = true;
                } else {
                    result = false;
                    break;
                }
            }
        } else {
            for(int j = 0; j < studyOptions.size(); j++) {
                if(unavailableStudyOptions.get(j).getText().equals(studyOptions.get(j))) {
                    result = true;
                } else {
                    result = false;
                    break;
                }
            }
        }
        assertTrue("The study options are not correctly displayed", result);
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