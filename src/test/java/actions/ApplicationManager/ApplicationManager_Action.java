package actions.ApplicationManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
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
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.linkText("Enter school site")));
        ApplicationManagerPage.School.click();
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.linkText("Application Manager")));
        ApplicationManagerPage.lnkApplicationManager.click();
    }
}
