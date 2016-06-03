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
        assertTrue("The Hubs Beta Button is not displayed", driver.findElement(
                By.xpath("//a[@class='hubsBetaBarButton']")).isDisplayed());
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
        driver.switchTo().window(tabs.get(1));
    }

    public static void VerifyHubsPageRibbon() {
        driver = Hooks.driver;
        assertFalse("The Hubs Beta Button Ribbon is displayed", driver.findElement(
                By.xpath("//div[@class='hubsBetaBar']")).isDisplayed());
    }
}