package actions.Login;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import stepDefs.Hooks;

import static org.junit.Assert.assertTrue;

/**
 * Created by csackrider on 11/6/2015.
 */
public class LoginVerify {

    public static void verifyValidLogin() throws InterruptedException {
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("td.footnote")));
        String footnote = Hooks.driver.findElement(By.cssSelector("td.footnote")).getText();
        assertTrue("Text not found!", footnote.contains("Signed in as "));

    }

    public static void verifyInvalidLogin() throws InterruptedException {
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".bs-alert.top-alert.alert-error")));
        String footnote = Hooks.driver.findElement(By.cssSelector(".bs-alert.top-alert.alert-error")).getText();
        assertTrue("Text not found!", footnote.contains("Your account name, user name or password is incorrect. Passwords are case sensitive."));


    }
}
