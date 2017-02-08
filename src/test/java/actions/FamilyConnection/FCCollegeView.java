package actions.FamilyConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageObjects.FamilyConnection.FCCollegeViewPage;
import stepDefs.Hooks;

import java.util.ArrayList;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/**
 * Created by jorgemaguina on 5/25/2016.
 */
public class FCCollegeView {
    public static WebDriver driver;

    public static void VerifyHubsBetaButton() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCCollegeViewPage.class);
        assertTrue("The Hubs Beta Button is not displayed", FCCollegeViewPage.buttonHubsBeta.isDisplayed());
    }

    public static void clickXBetaButtonRibbon() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCCollegeViewPage.class);
        FCCollegeViewPage.buttonXBetaButtonRibbon.click();
    }

    public static void clickBetaButton() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCCollegeViewPage.class);
        FCCollegeViewPage.buttonHubsBeta.click();
        ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs.get(tabs.size() - 1));
    }

    public static void VerifyHubsPageRibbon() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCCollegeViewPage.class);
        assertFalse("The Hubs Beta Button Ribbon is displayed", FCCollegeViewPage.buttonHubsBeta.isDisplayed());
    }

    public static void clickAuthorizeButton() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCCollegeViewPage.class);
        FCCollegeViewPage.buttonAuthorize.click();
    }
}