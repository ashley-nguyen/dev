package actions.IAM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageObjects.IAM.IAMPage;
import stepDefs.Hooks;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

/**
 * Created by franksejas on 1/22/2016.
 */
public class IAM {
    public static WebDriver driver;

    public static void VerifyNotBeLogged() throws InterruptedException {
        driver = Hooks.driver;
        PageFactory.initElements(driver, IAMPage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        assertTrue("Verify Not logged!", IAMPage.Login.isDisplayed());
    }
}
