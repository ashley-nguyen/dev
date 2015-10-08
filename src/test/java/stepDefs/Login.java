package stepDefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.*;

/**
 * Created by csackrider on 9/22/2015.
 */
public class Login {

    public static void DoLogin(String strAccount, String strUserName, String strPassword)
    {
        WebElement txtaccount = Hooks.driver.findElement(By.name("hsid"));
        txtaccount.sendKeys(strAccount);

        WebElement txtusername = Hooks.driver.findElement(By.name("username"));
        txtusername.sendKeys(strUserName);

        WebElement txtpassword = Hooks.driver.findElement(By.name("password"));
        txtpassword.sendKeys(strPassword);

        WebElement btnSignin = Hooks.driver.findElement(By.name("Submit"));
        btnSignin.click();

    }

    public static void DoFCLogin(String fcAccount, String strUserName, String strPassword) throws InterruptedException {
        System.out.println("URL######"+Hooks.strBaseURL+"/family-connection/"+fcAccount);
        Hooks.driver.get(Hooks.strBaseURL+"/family-connection/"+fcAccount);

        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.partialLinkText("forgot your password")));

        WebElement txtaccount = Hooks.driver.findElement(By.name("username"));
        txtaccount.sendKeys(strUserName);

        WebElement txtpassword = Hooks.driver.findElement(By.name("password"));
        txtpassword.sendKeys(strPassword);

        WebElement btnSignin = Hooks.driver.findElement(By.xpath("//input[@value='Log In']"));
        btnSignin.click();

        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.linkText("log out")));
    }

    public static void verifyValidLogin()
    {
        String bodyText = Hooks.driver.findElement(By.tagName("body")).getText();
        assertTrue("Text not found!", bodyText.contains("Signed in as "));
    }

    public static void verifyInvalidLogin()
    {
        String bodyText = Hooks.driver.findElement(By.tagName("body")).getText();
        assertTrue("Text not found!", bodyText.contains("Your account name, user name or password is incorrect. Passwords are case sensitive."));
    }

}
