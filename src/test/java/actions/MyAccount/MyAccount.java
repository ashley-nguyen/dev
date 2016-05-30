package actions.MyAccount;

import actions.District.DistrictNav;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import stepDefs.Hooks;

import static org.junit.Assert.assertTrue;

/**
 * Created by franksejas on 2/02/2016.
 */
public class MyAccount {
    public static WebDriver driver;

    public static void NavigateToMyAccount() throws InterruptedException {
        DistrictNav.goToAdminFunction("My Account");
    }

    public static void verifyMyAccount() throws InterruptedException {
        String nameVerification = Hooks.driver.findElement(By.className("dark_textheader14")).getText();
        assertTrue("Error Verification!", nameVerification.contains(" My Account"));
    }
}
