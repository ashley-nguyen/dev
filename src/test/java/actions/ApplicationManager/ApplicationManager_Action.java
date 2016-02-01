package actions.ApplicationManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageObjects.ApplicationManager.ApplicationManagerPage;
import stepDefs.Hooks;

/**
 * Created by franksejas on 1/29/2016.
 */
public class ApplicationManager_Action {
    public static WebDriver driver;

    public static void NavigateToApplicationManager() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, ApplicationManagerPage.class);
        ApplicationManagerPage.School.click();
        ApplicationManagerPage.lnkApplicationManager.click();
    }
}
