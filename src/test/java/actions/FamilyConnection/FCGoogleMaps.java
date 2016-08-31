package actions.FamilyConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.FamilyConnection.FCSurveyPage;
import stepDefs.Hooks;

import java.util.ArrayList;

import static org.junit.Assert.assertTrue;

/**
 * Created by jorgemaguina on 8/18/2016.
 */
public class FCGoogleMaps {
    public static WebDriver driver;

    public static void VerifyGoogleMapsURL() {
        driver = Hooks.driver;
        String currentURL = driver.getCurrentUrl();
        assertTrue("The current URL does not contain www.google.com/maps", currentURL.contains("www.google.com/maps"));
    }
}