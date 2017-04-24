package actions.FamilyConnection;

import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.FamilyConnection.FCHubsInternationalTabPage;
import stepDefs.Hooks;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;

/**
 * Created by jorgemaguina on 4/6/2017.
 */
public class FCHubsInternationalTab {
    public static WebDriver driver;

    public static void verifyDeadlineIntTopBar(String deadline) {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsInternationalTabPage.class);
        new WebDriverWait(Hooks.driver, 20).until(ExpectedConditions.elementToBeClickable
                (FCHubsInternationalTabPage.labelDeadlineIntTopBar));
        assertTrue("The deadline date is not correct", FCHubsInternationalTabPage.labelDeadlineIntTopBar.getText()
                .equals(deadline));
    }

    public static void verifyIntFeesIntTopBar(List<String> feesList) {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsInternationalTabPage.class);
        boolean result = false;
        List<String> feesValuesList = new ArrayList<>();
        List<WebElement> uiFeesList = driver.findElements(By.cssSelector(FCHubsInternationalTabPage
                .intFeesIntTopbarLocator));
        for (String feeElement : feesList) {
            feesValuesList.add(feeElement.split(";")[1]);
        }
        for (WebElement uiElement : uiFeesList) {
            if (feesValuesList.contains(uiElement.getText())) {
                result = true;
            } else {
                result = false;
                break;
            }
        }
        assertTrue("The International fees are not correct", result);
    }

    public static void verifyIntTestReq(List<String> intTestReqList) {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsInternationalTabPage.class);
        boolean result = false;
        List<String> intTestReqValuesList = new ArrayList<>();
        List<WebElement> uiIntTestReqList = driver.findElements(By.cssSelector(FCHubsInternationalTabPage
                .intTestReqIntTopBarLocator));
        for (String intTestReqElement : intTestReqList) {
            intTestReqValuesList.add(intTestReqElement.split(";")[1]);
        }
        for (WebElement uiElement : uiIntTestReqList) {
            if (intTestReqValuesList.contains(uiElement.getText())) {
                result = true;
            } else {
                result = false;
                break;
            }
        }
        assertTrue("The International fees are not correct", result);
    }

    public static void verifyIntAppIntTopBar(List<String> intAppList) {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsInternationalTabPage.class);
        boolean result = false;
        List<String> intAppValuesList = new ArrayList<>();
        List<WebElement> uiIntAppList = driver.findElements(By.cssSelector(FCHubsInternationalTabPage
                .intAppIntTopBarLocator));
        for (String intAppElement : intAppList) {
            intAppValuesList.add(intAppElement.split(";")[1]);
        }
        for (WebElement uiElement : uiIntAppList) {
            if (intAppValuesList.contains(uiElement.getText())) {
                result = true;
            } else {
                result = false;
                break;
            }
        }
        assertTrue("The International Applications are not correct", result);
    }

    public static void clickLinkIntTopBar(String linkText) {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsInternationalTabPage.class);
        WebElement linkElement = null;
        switch (linkText) {
            case "See all deadlines": linkElement = FCHubsInternationalTabPage.linkSeeAllDeadlines;
                break;
        }
        linkElement.sendKeys(Keys.RETURN);
    }

    public static void verifyIntQualifications(List<String> intQualificationsList) {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsInternationalTabPage.class);
        boolean result = false;
        List<String> intQualificationsValuesList = new ArrayList<>();
        List<WebElement> uiIntQualificationsList = driver.findElements(By.cssSelector(FCHubsInternationalTabPage
                .intQualificationsLocator));
        for (String intQualificationElement : intQualificationsList) {
            intQualificationsValuesList.add(intQualificationElement.split(";")[1]);
        }
        for (WebElement uiElement : uiIntQualificationsList) {
            if (intQualificationsValuesList.contains(uiElement.getText())) {
                result = true;
            } else {
                result = false;
                break;
            }
        }
        assertTrue("The International Qualifications are not correct", result);
    }

    public static void verifyTestScores(List<String> testScoresList) {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsInternationalTabPage.class);
        boolean result = false;
        List<WebElement> rowList = driver.findElements(By.cssSelector(FCHubsInternationalTabPage.intTestScoresRowsLocator));
        for (int j = 0; j < rowList.size(); j++) {
            List<WebElement> uiRowElements = rowList.get(j).findElements(By.cssSelector("div"));
            String[] dataRowElements = testScoresList.get(j).split(";");
            for (int i = 0; i < uiRowElements.size(); i++) {
                System.out.println("Data: " + dataRowElements[i]);
                System.out.println("UI: " + uiRowElements.get(i).getText());
                if (uiRowElements.get(i).getText().equals(dataRowElements[i])) {
                    result = true;
                } else {
                    result = false;
                    break;
                }
            }
            if (!result) break;
        }
        assertTrue("The test scores are not correct", result);
    }

    public static void clickInternationalStudentProfileDetails(String intstudentProfile) {
            driver = Hooks.driver;
            driver.findElement(By.xpath("//h4[contains(text(), '" + intstudentProfile + "')]/../span")).click();
        }

    public static void verifyInternationalStudentProfileDetails() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsInternationalTabPage.class);
        assertTrue("The profile details are not displayed", FCHubsInternationalTabPage.intstudentProfilecloselink.isDisplayed());

    }

    public static void ClickXonInternationalProfile() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsInternationalTabPage.class);
        new WebDriverWait(Hooks.driver, 30).until(ExpectedConditions.elementToBeClickable
                (FCHubsInternationalTabPage.intstudentProfilecloselink));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",
                FCHubsInternationalTabPage.internationalheaderToLocateProfile);
        FCHubsInternationalTabPage.intstudentProfilecloselink.sendKeys(Keys.RETURN);
    }

    public static void verifyInternationalStudentProfileDetailsCollapsed(String InternationalprofileName) {
        driver = Hooks.driver;
        assertTrue("The profile was not collapsed", driver.findElement(By.xpath("//h4[contains(text(), '" +
                InternationalprofileName + "')]/../span")).isDisplayed());
    }
}
