package actions.Smtp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageObjects.Smtp.SmtpPage;
import stepDefs.Hooks;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

/**
 * Created by franksejas on 1/19/2016.
 */
public class Smtp {

    public static WebDriver driver;

    public static void verifyEmail(String newUser) throws InterruptedException {
        String pageVerification = Hooks.driver.findElement(By.xpath("/html/body/div/table/tbody/tr[1]/td[2]/table/tbody/tr[4]/td[2]/table")).getText();
        assertTrue("Error Verification!", !pageVerification.contains("Fatal error"));
        assertTrue("Verify Data!", pageVerification.contains(newUser));
    }

    public static void NavigateToAddNewUser() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, SmtpPage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        SmtpPage.UserAdministration.click();
        SmtpPage.AddNewUser.click();
    }

    public static void FillTheFirstName(String firstName) {
        driver = Hooks.driver;
        PageFactory.initElements(driver, SmtpPage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        SmtpPage.FirstName.sendKeys(firstName);
    }

    public static void FillTheLastName(String lastName) {
        driver = Hooks.driver;
        PageFactory.initElements(driver, SmtpPage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        SmtpPage.LastName.sendKeys(lastName);
    }

    public static void FillTheUserName(String userName) {
        driver = Hooks.driver;
        PageFactory.initElements(driver, SmtpPage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        SmtpPage.UserName.sendKeys(userName);
    }

    public static void FillTheEmail(String email) {
        driver = Hooks.driver;
        PageFactory.initElements(driver, SmtpPage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        SmtpPage.Email.sendKeys(email);
    }

    public static void FillTheConfirmEmail(String confirmEmail) {
        driver = Hooks.driver;
        PageFactory.initElements(driver, SmtpPage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        SmtpPage.ConfirmEmail.sendKeys(confirmEmail);
    }

    public static void SelectTheRole(String role) {
        driver = Hooks.driver;
        PageFactory.initElements(driver, SmtpPage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        SmtpPage.SelectRole.isSelected();
    }

    public static void ClickOnAddUserButton() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, SmtpPage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        SmtpPage.AddUser.click();
    }
}
