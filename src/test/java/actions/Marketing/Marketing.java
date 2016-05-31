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

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

/**
 * Created by franksejas on 1/15/2016.
 */
public class Marketing {

    public static WebDriver driver;

    public static void NavigateToUrl() {
        driver = Hooks.driver;
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public static void verifyImageInLogin() throws InterruptedException {
        //Changing the frame to test
        driver  = Hooks.driver.switchTo().frame(0);
        //Driver for iframe section can't be mapped for now
        Boolean imageVerification = driver.findElement(By.xpath("//img[contains(@src,'img/nsi2016_2.jpg')]")).isDisplayed();
        assertTrue("Verify image exists!", imageVerification);
    }

    public static void verifyBanner() throws InterruptedException {
       driver = Hooks.driver;
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//img[contains(@src,'/images/navmarketplace_badge.png')]")));
       Boolean bannerVerification =  Hooks.driver.findElement(By.xpath("//img[contains(@src,'/images/navmarketplace_badge.png')]")).isDisplayed();
        assertTrue("Verify banner exists!", bannerVerification);
    }

    public static void Logout() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, DistrictPageHeader.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

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
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.partialLinkText("Enter school site")));
        DashboardPage.School.click();
    }
}
