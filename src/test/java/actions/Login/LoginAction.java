package actions.Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageObjects.Login.loginPage;
import stepDefs.Hooks;

/**
 * Created by csackrider on 9/22/2015.
 */
public class LoginAction {
    public static WebDriver driver;

    public static void DoLogin(String strAccount, String strUserName, String strPassword) {
        driver = Hooks.driver;
        PageFactory.initElements(driver, loginPage.class);

        //WebElement txtaccount = Hooks.driver.findElement(By.cssSelector(LoginPage_Account));
        loginPage.Account.sendKeys(strAccount);

        //WebElement txtusername = Hooks.driver.findElement(By.cssSelector(LoginPage_UserName));
        //txtusername.sendKeys(strUserName);
        loginPage.UserName.sendKeys(strUserName);

        //WebElement txtpassword = Hooks.driver.findElement(By.cssSelector(LoginPage_Password));
        //txtpassword.sendKeys(strPassword);
        loginPage.password.sendKeys(strPassword);

        //WebElement btnSignin = Hooks.driver.findElement(By.cssSelector(LoginPage_LoginButton));
        //btnSignin.click();
        loginPage.signin_button.click();

    }

    public static void DoFCLogin(String fcAccount, String strUserName, String strPassword) throws InterruptedException {
        System.out.println("URL######" + Hooks.strBaseURL + "/family-connection/" + fcAccount);
        Hooks.driver.get(Hooks.strBaseURL + "/family-connection/" + fcAccount);

        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.partialLinkText("forgot your password")));

        WebElement txtaccount = Hooks.driver.findElement(By.name("username"));
        txtaccount.sendKeys(strUserName);

        WebElement txtpassword = Hooks.driver.findElement(By.name("password"));
        txtpassword.sendKeys(strPassword);

        WebElement btnSignin = Hooks.driver.findElement(By.xpath("//input[@value='Log In']"));
        btnSignin.click();

        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.linkText("log out")));
    }


}
