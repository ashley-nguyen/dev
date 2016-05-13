package actions.Marketing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.Dashboard.DashboardPage;
import pageObjects.Header.DistrictPageHeader;
import stepDefs.Hooks;

/**
 * Created by franksejas on 1/15/2016.
 */
public class Marketing_Action {
    public static WebDriver driver;

    public static void NavigateToUrl() {
        driver = Hooks.driver;
    }

    public static void Logout() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, DistrictPageHeader.class);

        Actions action = new Actions(driver);
        action.moveToElement(DistrictPageHeader.districtcog).build().perform();
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.linkText("Logout")));
        DistrictPageHeader.lnkLogout.click();
        //wait for something on the setup page to load before trying to click on something else.
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.partialLinkText("Sign In")));
    }

    public static void NavigateToSchool() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, DashboardPage.class);
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.partialLinkText("Enter school site")));
        DashboardPage.School.click();
    }
}
