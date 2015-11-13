package actions.Login;

import org.openqa.selenium.By;
import stepDefs.Hooks;

import static org.junit.Assert.assertTrue;

/**
 * Created by csackrider on 11/6/2015.
 */
public class LoginVerify {

    public static void verifyValidLogin() {
        String bodyText = Hooks.driver.findElement(By.tagName("body")).getText();
        assertTrue("Text not found!", bodyText.contains("Signed in as "));
    }

    public static void verifyInvalidLogin() {
        String bodyText = Hooks.driver.findElement(By.tagName("body")).getText();
        assertTrue("Text not found!", bodyText.contains("Your account name, user name or password is incorrect. Passwords are case sensitive."));
    }
}
