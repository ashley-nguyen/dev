package actions.Connections;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageObjects.Connections.ConnectionsPage;
import stepDefs.Hooks;

/**
 * Created by franksejas on 1/28/2016.
 */
public class ConnectionsAction {
    public static WebDriver driver;

    public static void ClickOnCheckStatusEmailLink() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, ConnectionsPage.class);
        ConnectionsPage.lnkEnterSchoolSite.click();
        ConnectionsPage.lnkConnections.click();
        ConnectionsPage.lnkEmail.click();
        ConnectionsPage.lnkCheckStatusEmailSent.click();
    }

    public static void ClickOnFamilyConnectionLink() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, ConnectionsPage.class);
        ConnectionsPage.lnkEnterSchoolSite.click();
        ConnectionsPage.lnkConnections.click();
        ConnectionsPage.lnkFamilyConnection.click();
    }
}
