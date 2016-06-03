package actions.FamilyConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageObjects.FamilyConnection.FCCollegeViewPage;
import stepDefs.Hooks;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by jorgemaguina on 5/25/2016.
 */
public class FCHubs {
    public static WebDriver driver;

    public static void VerifyFeedbackRibbon() {
        driver = Hooks.driver;
        assertTrue("The Hubs Feedbak Ribbon is not displayed", driver.findElement(
                By.xpath("//div[@class='hub-beta-bar']")).isDisplayed());
    }
}