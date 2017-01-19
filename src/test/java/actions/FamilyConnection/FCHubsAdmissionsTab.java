package actions.FamilyConnection;

import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.FamilyConnection.FCHubsAdmissionsTabPage;
import pageObjects.FamilyConnection.FCHubsPage;
import pageObjects.FamilyConnection.FCHubsStudiesTabPage;
import stepDefs.Hooks;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;

/**
 * Created by jorgemaguina on 7/27/2016.
 */
public class FCHubsAdmissionsTab {
    public static WebDriver driver;

    public static void VerifyRegularDeadlineDecision(String decisionDeadline) {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsAdmissionsTabPage.class);
        boolean result = false;
        String month = decisionDeadline.split(" ")[0];
        String day = decisionDeadline.split(" ")[1];

        if(FCHubsAdmissionsTabPage.labelMonthRegDecisionDeadline.getText().equals(month)
                && FCHubsAdmissionsTabPage.labelDayRegDecisionDeadline.getText().equals(day)) {
            result = true;
        }

        assertTrue("The Regular Decision Deadline is incorrect", result);
    }

    public static void VerifyAcceptanceRate(String acceptanceRate) {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsAdmissionsTabPage.class);
        assertTrue("Acceptance Rate is not correct",
                FCHubsAdmissionsTabPage.labelAcceptanceRate.getText().equals(acceptanceRate));
    }

    public static void VerifyApplicationFees(String applicationFees) {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsAdmissionsTabPage.class);
        assertTrue("Application Fees is not correct",
                FCHubsAdmissionsTabPage.labelApplicationFees.getText().equals(applicationFees));
    }

    public static void VerifyImportantPolicies(List<String> importantPolicies) {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsAdmissionsTabPage.class);
        boolean result = true;
        List<WebElement> policyElements = FCHubsAdmissionsTabPage.sectionImportantPolicies.findElements
                (By.tagName("div"));
        for (WebElement policyElement : policyElements) {
            result = importantPolicies.contains(policyElement.getText());
        }
        assertTrue("The displayed Important Policies are not correct", result);
    }

    public static void ClickSectionInAppRequirements(String section) {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsAdmissionsTabPage.class);
        WebElement sectionElement = null;
        new WebDriverWait(Hooks.driver, 20).until(ExpectedConditions.elementToBeClickable(By.cssSelector
                (".fc-button-group.fc-button-group--section-switch")));
        switch (section) {
            case "Freshman": sectionElement = FCHubsAdmissionsTabPage.buttonAppReqFreshman;
                break;
            case "Transfer": sectionElement = FCHubsAdmissionsTabPage.buttonAppReqTransfer;
                break;
            case "International": sectionElement = FCHubsAdmissionsTabPage.buttonAppReqInternational;
                break;
        }
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", sectionElement);
        jse.executeScript("scroll(0, -250);");
        sectionElement.sendKeys(Keys.RETURN);
    }

    public static void VerifyApplicationRequirements(String reqType, List<String> applicationRequirements) {
        driver = Hooks.driver;
        boolean result = false;
        for(int i = 0; i < applicationRequirements.size(); i++) {
            if(driver.findElement(By.cssSelector("div[ng-show=\"vm.activeRequirementList.data." + reqType.toUpperCase()
                    + "\"] li:nth-of-type(" + (i + 1) + ")")).getText().equals(applicationRequirements.get(i))) {
                result = true;
            } else {
                result = false;
                break;
            }
        }
        assertTrue("The " + reqType + " requirements are not correct", result);
    }

    public static void ClickApplicationInformationTab(String tab) {
        driver = Hooks.driver;
        WebElement appInfoTab = null;
        PageFactory.initElements(driver, FCHubsAdmissionsTabPage.class);
        switch (tab) {
            case "Deadlines": appInfoTab = FCHubsAdmissionsTabPage.buttonAppReqDeadlines;
                break;
            case "Important Policies": appInfoTab = FCHubsAdmissionsTabPage.buttonAppReqImportantPolicies;
                break;
            case "Fees": appInfoTab = FCHubsAdmissionsTabPage.buttonAppReqFees;
                break;
        }
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", appInfoTab);
        appInfoTab.sendKeys(Keys.RETURN);
    }

    public static void VerifyDeadline(String deadlineName, String date) {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsAdmissionsTabPage.class);
        List<WebElement> deadlinesList = driver.findElements(By.cssSelector(FCHubsAdmissionsTabPage.listDeadlinesLocator));
        boolean result = false;

        for (int i = 0; i < deadlinesList.size(); i++) {
            WebElement elementText = deadlinesList.get(i).findElement(By.cssSelector("span"));
            if (elementText.getText().equals(deadlineName)) {
                WebElement monthElement = deadlinesList.get(i).findElement(By.cssSelector
                        ("div.hub-deadline__month"));
                WebElement dayElement = deadlinesList.get(i).findElement(By.cssSelector("div " +
                        "div:nth-of-type(2)"));
                if(monthElement.getText().equals(date.split(" ")[0])
                    && dayElement.getText().equals(date.split(" ")[1])) {
                    result = true;
                }
            }
        }

        assertTrue("The deadline is not correct", result);
    }
}