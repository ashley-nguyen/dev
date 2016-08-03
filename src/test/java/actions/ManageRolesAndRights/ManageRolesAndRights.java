package actions.ManageRolesAndRights;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.ManageRolesAndRights.ManageRolesAndRightsPage;
import stepDefs.Hooks;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

/**
 * Created by franksejas on 06/21/2016.
 */
public class ManageRolesAndRights {
    public static WebDriver driver;

    public static void ClickOnUserAdminLink() throws InterruptedException {
        driver = Hooks.driver;
        PageFactory.initElements(driver, ManageRolesAndRightsPage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.elementToBeClickable(ManageRolesAndRightsPage.lnkUserAdmin)).click();
    }

    public static void ClickOnManageRolesAndRightsLink() throws InterruptedException {
        driver = Hooks.driver;
        PageFactory.initElements(driver, ManageRolesAndRightsPage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.elementToBeClickable(ManageRolesAndRightsPage.lnkManageRolesAndRights)).click();
    }

    public static void ClickOnManageLink() throws InterruptedException {
        driver = Hooks.driver;
        PageFactory.initElements(driver, ManageRolesAndRightsPage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.elementToBeClickable(ManageRolesAndRightsPage.lnkManage)).click();
    }

    public static void ClickOnModifyPermissionsLink() throws InterruptedException {
        driver = Hooks.driver;
        PageFactory.initElements(driver, ManageRolesAndRightsPage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.elementToBeClickable(ManageRolesAndRightsPage.lnkModifyPermissions)).click();
    }

    public static void CheckViewAllTeacherRecForms() throws InterruptedException {
        driver = Hooks.driver;
        PageFactory.initElements(driver, ManageRolesAndRightsPage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        if (!ManageRolesAndRightsPage.chkViewAllTeacherRecForm.isEnabled())
        {
            new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.elementToBeClickable(ManageRolesAndRightsPage.chkViewAllTeacherRecForm)).click();
        }
    }

    public static void ClickOnSubmitButton() throws InterruptedException {
        driver = Hooks.driver;
        PageFactory.initElements(driver, ManageRolesAndRightsPage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.elementToBeClickable(ManageRolesAndRightsPage.btnSubmit)).click();
    }

    public static void VerifyConfirmationMessage(String confirmationMessage) throws InterruptedException {
        driver = Hooks.driver;
        PageFactory.initElements(driver, ManageRolesAndRightsPage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        assertTrue("The confirmation message is correct", driver.findElement(By.xpath("//td[@class=" +
                "'bodytext'][contains(text(), '" + confirmationMessage + "')]")).isDisplayed());
    }
}
