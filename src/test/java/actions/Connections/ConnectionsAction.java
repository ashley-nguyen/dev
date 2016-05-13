package actions.Connections;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.Connections.ConnectionsPage;
import stepDefs.Hooks;

/**
 * Created by franksejas on 1/28/2016.
 */
public class ConnectionsAction {
    public static WebDriver driver;

    public static void ClickOnCheckStatusEmailLink() throws InterruptedException {
        driver = Hooks.driver;
        PageFactory.initElements(driver, ConnectionsPage.class);
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
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.linkText("Enter school site")));
        ConnectionsPage.lnkEnterSchoolSite.click();
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.linkText("Connections")));
        ConnectionsPage.lnkConnections.click();
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.linkText("Family Connection")));
        ConnectionsPage.lnkFamilyConnection.click();
    }
}
