package actions.IAM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageObjects.IAM.IAMPage;
import stepDefs.Hooks;

/**
 * Created by franksejas on 1/22/2016.
 */
public class IAM_Action {
    public static WebDriver driver;

    public static void VerifyNotBeLogged() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, IAMPage.class);
        IAMPage.Login.isDisplayed();
    }
}
