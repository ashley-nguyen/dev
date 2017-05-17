package actions.FamilyConnection;

import net.serenitybdd.core.annotations.findby.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.FamilyConnection.FCHubsInternationalWebLinksTabPage;
import stepDefs.Hooks;

import java.util.ArrayList;

import static actions.FamilyConnection.FCHubs.driver;
import static junit.framework.TestCase.assertTrue;

/**
 * Created by mbhangu on 5/1/2017.
 */
public class FCHubsInternationalWebLinksTab {

    public static void ClickIntCommunicate() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsInternationalWebLinksTabPage.class);
        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(FCHubsInternationalWebLinksTabPage.topButtonIntCommunicate));
        FCHubsInternationalWebLinksTabPage.topButtonIntCommunicate.click();
    }

    public static void IntRequestInformationLink() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsInternationalWebLinksTabPage.class);
        new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(FCHubsInternationalWebLinksTabPage.buttonIntRequestInfo));
        FCHubsInternationalWebLinksTabPage.buttonIntRequestInfo.click();
        ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs.get(tabs.size() - 1));
    }

    public static void ClickIntLearnMoreButton() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsInternationalWebLinksTabPage.class);
        new WebDriverWait(Hooks.driver,20).until(ExpectedConditions.elementToBeClickable(FCHubsInternationalWebLinksTabPage.LearnMoreLinks));
        FCHubsInternationalWebLinksTabPage.LearnMoreLinks.click();
        }

    public static void ClickIntLearnMoreAdmissionsLink() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsInternationalWebLinksTabPage.class);
        FCHubsInternationalWebLinksTabPage.LinkLearnAdmissionsRequirements.click();

        ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs.get(tabs.size() - 1));

    }

    public static void VerifyAdmissionsRequirementsURLContainsText(String intURL) {
        driver = Hooks.driver;
        new WebDriverWait(Hooks.driver,20).until(ExpectedConditions.elementToBeClickable(By.cssSelector("html")));
        String currentURL = driver.getCurrentUrl();
        assertTrue("The current URL does not match" + intURL, currentURL.contains(intURL));
    }
}