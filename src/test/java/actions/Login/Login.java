package actions.Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.Login.loginPage;
import stepDefs.Hooks;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

/**
 * Created by csackrider on 9/22/2015.
 */
public class Login {
    public static WebDriver driver;

    public static void DoLogin(String strAccount, String strUserName, String strPassword) {
        driver = Hooks.driver;
        PageFactory.initElements(driver, loginPage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        loginPage.Account.sendKeys(strAccount);

        loginPage.UserName.sendKeys(strUserName);

        loginPage.password.sendKeys(strPassword);

        loginPage.signin_button.click();
    }

    public static void IAMLogin(String strUserName, String strPassword) {
        driver = Hooks.driver;
        PageFactory.initElements(driver, loginPage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        loginPage.UserName.sendKeys(strUserName);

        loginPage.password.sendKeys(strPassword);

        loginPage.signin_button.click();
    }

    public static void DoFCLogin(String fcAccount, String strUserName, String strPassword) throws InterruptedException {
        driver = Hooks.driver;
        PageFactory.initElements(driver, loginPage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(Hooks.strBaseURL + "/family-connection/" + fcAccount);

        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.partialLinkText("forgot your password")));

        loginPage.UserName.sendKeys(strUserName);

        loginPage.password.sendKeys(strPassword);

        loginPage.fc_signin_button.click();

        new WebDriverWait(Hooks.driver, 20).until(ExpectedConditions.elementToBeClickable(By.linkText("log out")));
    }

    public static void verifyValidLoginFamilyConnection() throws InterruptedException {
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("dd[class = 'login']")));
        String footnote = loginPage.fc_logged_as_label.getText();
        assertTrue("Text not found!", footnote.contains("Logged in as"));
    }

    public static void GoToUrl(String url) throws InterruptedException {
        Hooks.driver.get(url);
    }

    public static void verifyValidLogin() throws InterruptedException {
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("td.footnote")));
        String footnote = loginPage.valid_foot_note_text.getText();
        assertTrue("Text not found!", footnote.contains("Signed in as "));
    }

    public static void verifyInvalidLogin() throws InterruptedException {
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".bs-alert.top-alert.alert-error")));
        String footnote = loginPage.invalid_foot_note_text.getText();
        assertTrue("Text not found!", footnote.contains("Your account name, user name or password is incorrect. Passwords are case sensitive."));
    }

    public static void verifyInvalidLoginFamilyConnection() throws InterruptedException {
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.name("username")));
        Boolean messagepresent = loginPage.fc_bad_credentials_message.isDisplayed();
        assertTrue("Message not found!", messagepresent);
    }

    public static void DoFCLoginParent(String fcAccount, String strUserName, String strPassword, String strStudentName) {
        driver = Hooks.driver;
        PageFactory.initElements(driver, loginPage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(Hooks.strBaseURL + "/family-connection/" + fcAccount);

        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.partialLinkText("forgot your password")));

        loginPage.UserName.sendKeys(strUserName);

        loginPage.password.sendKeys(strPassword);

        loginPage.fc_signin_button.click();

        if (!strStudentName.equals("singleStudent")) {
            Select childDropDown = new Select(loginPage.childDropDown);
            childDropDown.selectByVisibleText(strStudentName);
            loginPage.buttonGo.click();
        }

        new WebDriverWait(Hooks.driver, 20).until(ExpectedConditions.elementToBeClickable(By.linkText("log out")));
    }
}
