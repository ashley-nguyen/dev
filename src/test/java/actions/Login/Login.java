package actions.Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.Login.loginPage;
import stepDefs.Hooks;

import static org.junit.Assert.assertTrue;

/**
 * Created by csackrider on 9/22/2015.
 */
public class Login {
    public static WebDriver driver;

    public static void DoLogin(String strAccount, String strUserName, String strPassword) {
        driver = Hooks.driver;
        PageFactory.initElements(driver, loginPage.class);

        loginPage.Account.sendKeys(strAccount);

        loginPage.UserName.sendKeys(strUserName);

        loginPage.password.sendKeys(strPassword);

        loginPage.signin_button.click();
    }

    public static void DoFCLogin(String fcAccount, String strUserName, String strPassword) throws InterruptedException {
        Hooks.driver.get(Hooks.strBaseURL + "/family-connection/" + fcAccount);

        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.partialLinkText("forgot your password")));

        loginPage.UserName.sendKeys(strUserName);

        loginPage.password.sendKeys(strPassword);

        loginPage.fc_signin_button.click();

        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.linkText("log out")));
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
}
