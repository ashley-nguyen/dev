package actions.Setup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.District.DistrictSetupPage;
import pageObjects.Header.DistrictPageHeader;
import stepDefs.Hooks;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

/**
 * Created by csackrider on 1/5/2016.
 */
public class SSO {

    public static WebDriver driver;

    public static void GoToSetup() throws InterruptedException {
        driver = Hooks.driver;
        Thread.sleep(3000);
        PageFactory.initElements(driver, DistrictPageHeader.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        Actions action = new Actions(driver);
        Thread.sleep(3000);
        action.moveToElement(DistrictPageHeader.districtcog).build().perform();
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.linkText("Setup")));
        DistrictPageHeader.lnkSetup.click();
        //wait for something on the setup page to load before trying to click on something else.
        //new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.partialLinkText("Zones")));

    }

    public static void GoToSingleSignInOptions() throws InterruptedException {
        driver = Hooks.driver;
        PageFactory.initElements(driver, DistrictSetupPage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        DistrictSetupPage.lnkSingleSignInOptions.click();
    }

    public static void VerifyPowerSchoolSSO() throws InterruptedException {
        driver = Hooks.driver;
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        assertTrue("text not found: PowerSchool SSO - for parents", driver.getPageSource().contains("PowerSchool SSO - for parents"));
    }

}
