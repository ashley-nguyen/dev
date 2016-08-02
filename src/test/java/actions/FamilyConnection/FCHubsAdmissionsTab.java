package actions.FamilyConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
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
        boolean result = false;
        for(int i = 0;  i < importantPolicies.size(); i++) {
            if(driver.findElement(By.xpath("//h2[contains(text(), 'Important Policies')]" +
                    "/../div[contains(text(), '" + importantPolicies.get(i) + "')]")).isDisplayed()) {
                result = true;
            } else {
                result = false;
                break;
            }
        }
        assertTrue("The displayed Important Policies are not correct", result);
    }

    public static void ClickSectionInAppRequirements(String section) {
        driver = Hooks.driver;
        WebElement sectionElement = driver.findElement(By.xpath("//h2[contains(text(), 'Application Requirements')]" +
                "/../ul/li[contains(text(), '" + section + "')]"));
        sectionElement.click();
    }

    public static void VerifyApplicationRequirements(String reqType, List<String> applicationRequirements) {
        driver = Hooks.driver;
        boolean result = false;
        for(int i = 0; i < applicationRequirements.size(); i++) {
            if(driver.findElement(By.xpath("//h4[contains(text(), '" + reqType + "')]" +
                    "/../ul/li[contains(text(), '" + applicationRequirements.get(i) + "')]")).isDisplayed()) {
                result = true;
            }
        }
        assertTrue("The " + reqType + " requirements are not correct", result);
    }

    public static void ClickApplicationInformationTab(String tab) {
        driver = Hooks.driver;
        WebElement appInfoTab = driver.findElement(By.xpath("//h2[contains(text(), 'Application Information')]" +
                "/../div/div/span[contains(text(), '" + tab + "')]"));
        appInfoTab.click();
    }

    public static void VerifyDeadline(String deadlineName, String date) {
        driver = Hooks.driver;
        boolean result = false;
        if(driver.findElement(By.xpath("//h2[contains(text(), 'Application Information')]" +
                "/../div/div/div/div/div/span[text() = '" + deadlineName + "']/../div/div[text() = '" + date.split(" ")[0] + "']")).isDisplayed()
                && driver.findElement(By.xpath("//h2[contains(text(), 'Application Information')]" +
                "/../div/div/div/div/div/span[text() = '" + deadlineName + "']/../div/div[text() = '" + date.split(" ")[1] + "']")).isDisplayed()) {
            result = true;
        }
        assertTrue("The deadline is not correct", result);
    }
}