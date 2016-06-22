package actions.FamilyConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.FamilyConnection.FCHubsPage;
import stepDefs.Hooks;

import java.util.ArrayList;

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
    public static void ClickNextOnSecondDialog() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsPage.class);
        FCHubsPage.linkNextSecondDialog.click();

    }

    public static void VerifyThirdTutorialDialog() {
        driver = Hooks.driver;
        assertTrue("The Third Tutorial Dialog is displayed ", driver.findElement(By.xpath("//span[contains (text( )," +
                "'Tell us what you think!')]")).isDisplayed());
    }

    public static void VerifyIdentifierModule() {
        driver = Hooks.driver;
        assertTrue("The Identifier Module is not present", driver.findElement
                (By.xpath("//div[@class='fc-grid__row fc-grid__row--xs-center fc-grid__row--lg-start fc-grid__" +
                        "row--xs-middle']")).isDisplayed());
    }

    public static void VerifyLogoInIdentifierModule() {
        driver = Hooks.driver;
        assertTrue("The logo in the Identifier Module is not present", driver.findElement
                (By.xpath("//div[@class='fc-grid__row fc-grid__row--xs-center fc-grid__row--lg-start fc-grid__row--xs-" +
                        "middle']/div/img[@class='masthead__logo-image']")).isDisplayed());
    }

    public static void ClickURLInIdentifierModule() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsPage.class);
        FCHubsPage.linkURLIdentifierModule.click();
        ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs.get(tabs.size() - 1));
    }

    public static void VerifyURLContainsText(String url) {
        driver = Hooks.driver;
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String currentURL = driver.getCurrentUrl();
        assertTrue("The current URL does not match " + url, currentURL.equals(url));
    }

    public static void ClickRequestInfoButton() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsPage.class);
        FCHubsPage.buttonRequestInfo.click();
        ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs.get(tabs.size() - 1));
    }

    public static void ClickApplyOnlineButton() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsPage.class);
        FCHubsPage.buttonApplyOnline.click();
        ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs.get(tabs.size() - 1));
    }

    public static void ClickLearnMoreButton() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsPage.class);
        FCHubsPage.buttonLearnMore.click();
        ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs.get(tabs.size() - 1));
    }

    public static void ClickLearnMoreLink(String link) {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsPage.class);
        WebElement learnMoreLink = driver.findElement(By.xpath("//a[contains(text(), '" + link + "')]"));
        learnMoreLink.click();
        ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs.get(tabs.size() - 1));
    }
}