package actions.FamilyConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageObjects.FamilyConnection.FCHubsProfilesTabPage;
import stepDefs.Hooks;

import static org.junit.Assert.assertTrue;

/**
 * Created by jorgemaguina on 9/6/2016.
 */
public class FCHubsProfilesTab {
    public static WebDriver driver;

    public static void ClickReadMoreInStudentProfile(String profileName) {
        driver = Hooks.driver;
        driver.findElement(By.xpath("//h4[contains(text(), '" + profileName + "')]/../span")).click();
    }

    public static void VerifyStudentProfileDetails() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsProfilesTabPage.class);
        assertTrue("The profile details are not displayed", FCHubsProfilesTabPage.buttonCloseInProfile.isDisplayed());
    }

    public static void ClickXButtonInProfile() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsProfilesTabPage.class);
        FCHubsProfilesTabPage.buttonCloseInProfile.click();
    }

    public static void VerifyStudentProfileDetailsCollapsed(String profileName) {
        driver = Hooks.driver;
        assertTrue("The profile was not collapsed", driver.findElement(By.xpath("//h4[contains(text(), '" +
                profileName + "')]/../span")).isDisplayed());
    }
}