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

/**
 * Created by csackrider on 1/5/2016.
 */
public class SSO_Action {

    public static WebDriver driver;

    public static void GoToSetup() throws InterruptedException {
        driver = Hooks.driver;
        PageFactory.initElements(driver, DistrictPageHeader.class);

        Actions action = new Actions(driver);
        action.moveToElement(DistrictPageHeader.districtcog).build().perform();
        DistrictPageHeader.lnkSetup.click();
        //wait for something on the setup page to load before trying to click on something else.
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.partialLinkText("Zones")));

    }

    public static void GoToSingleSignInOptions() throws InterruptedException {
        driver = Hooks.driver;
        PageFactory.initElements(driver, DistrictSetupPage.class);

        DistrictSetupPage.lnkSingleSignInOptions.click();



    }


}
