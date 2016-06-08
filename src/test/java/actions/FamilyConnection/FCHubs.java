package actions.FamilyConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.FamilyConnection.FCHubsPage;
import stepDefs.Hooks;

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

    public static void ClickFeedbackButton() {
        driver = Hooks.driver;
        new WebDriverWait(Hooks.driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath
                ("//div[@class='hub-beta-bar']/a")));
        PageFactory.initElements(driver, FCHubsPage.class);
        FCHubsPage.buttonFeedback.click();
        FCHubsPage.buttonFeedback.sendKeys(Keys.RETURN);
    }

    public static void VerifyFirstTutorialDialog() {
        driver = Hooks.driver;
        new WebDriverWait(Hooks.driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath
                ("//span[contains(text(), 'Favorite this college')]")));
        assertTrue("The First Tutorial Dialog is not displayed", driver.findElement(By.xpath
                ("//span[contains(text(), 'Favorite this college')]")).isDisplayed());
    }

    public static void ClickNextOnFirstDialog() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsPage.class);
        FCHubsPage.linkNextFirstDialog.click();
    }

    public static void VerifySecondTutorialDialog() {
        driver = Hooks.driver;
        assertTrue("The Second Tutorial Dialog is displayed ", driver.findElement(By.xpath
                ("//span[contains(text(), 'Plan your applications')]")).isDisplayed());
    }
}