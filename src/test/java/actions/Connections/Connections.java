package actions.Connections;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.Connections.ConnectionsPage;
import stepDefs.Hooks;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

/**
 * Created by franksejas on 1/28/2016.
 */
public class Connections {
    public static WebDriver driver;

    public static void ClickOnCheckStatusEmailLink() throws InterruptedException {
        driver = Hooks.driver;
        PageFactory.initElements(driver, ConnectionsPage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.linkText("Enter school site")));
        ConnectionsPage.lnkEnterSchoolSite.click();
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.linkText("Connections")));
        ConnectionsPage.lnkConnections.click();
        Thread.sleep(3000);
        ConnectionsPage.lnkEmail.click();
        new WebDriverWait(Hooks.driver, 25).until(ExpectedConditions.presenceOfElementLocated(By.linkText("Check status and view history of emails sent")));
        ConnectionsPage.lnkCheckStatusEmailSent.click();
    }

    public static void ClickOnFamilyConnectionLink() throws InterruptedException {
        driver = Hooks.driver;
        PageFactory.initElements(driver, ConnectionsPage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.linkText("Enter school site")));
        ConnectionsPage.lnkEnterSchoolSite.click();
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.linkText("Connections")));
        ConnectionsPage.lnkConnections.click();
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.linkText("Family Connection")));
        ConnectionsPage.lnkFamilyConnection.click();
    }

    public static void verifyNoErrorsInCheckStatusEmail() throws InterruptedException {
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.className("ContextHeader")));
        String dataVerification = Hooks.driver.findElement(By.className("ContextHeader")).getText();
        assertTrue("Error Verification!", dataVerification.contains("E-mail Message History"));
    }

    public static void verifyNoErrorsInEmail() throws InterruptedException {
        assertTrue("Error Verification!", !Hooks.driver.getPageSource().contains("view_bounce.php"));
    }

    public static void verifyNoErrorsInConnections() throws InterruptedException {
        assertTrue("Error Verification!", !Hooks.driver.getPageSource().contains("Fatal error"));
    }

    public static void verifyNoErrorsInFamilyConnection() throws InterruptedException {
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.className("table-heading")));
        String dataVerification = Hooks.driver.findElement(By.className("table-heading")).getText();
        assertTrue("Error Verification!", dataVerification.contains("Family Connection"));
    }

    public static void clickOnConfigurationLink() throws InterruptedException {
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.elementToBeClickable(ConnectionsPage.linkFCconfiguration)).click();
    }

    public static void verifyText(String info) throws InterruptedException {

        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr[3]/td/table/tbody/tr/td/table/tbody/tr[5]/td/table[3]/tbody/tr[9]/td[1]/a/img")));
        WebElement activeMatchElement =  ConnectionsPage.lnkActiveMatch;
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.id("cluetip-inner")));
        WebElement activeMatchSubElement = ConnectionsPage.idSubActiveMatch;
        Actions action = new Actions(driver);
        Actions hoverOverRegistrar = action.moveToElement(activeMatchElement);
        hoverOverRegistrar.clickAndHold(activeMatchElement).perform();
        String textVerification = activeMatchSubElement.getText();
        System.out.println("Active Match pop up verification" + textVerification);
        assertTrue("Error Verification Active Match Info!", textVerification.contains(info));
    }

    public static void verifyEnableGrade(int grade) throws InterruptedException {

        driver = Hooks.driver;
        PageFactory.initElements(driver, Connections.class);
        driver.findElements(By.xpath("html/body/div[1]/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr[3]/td/table/tbody/tr/td/table/tbody/tr[5]/td/table[3]/tbody/tr[9]/td[7]/input")).get(0).click();
        driver.findElements(By.xpath("html/body/div[1]/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr[3]/td/table/tbody/tr/td/table/tbody/tr[5]/td/table[3]/tbody/tr[9]/td[7]/input")).get(0).click();
        driver = Hooks.driver;
        PageFactory.initElements(driver, Connections.class);
        Boolean verifyAgreeButton = driver.findElement(By.className("btn-container")).isDisplayed();
        System.out.println("VaLOR" + verifyAgreeButton);
        assertTrue("Error Verification Buttons not found!", verifyAgreeButton);
    }


}