package actions.District;

import cucumber.api.DataTable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import pageObjects.District.DistrictAdminPage;
import pageObjects.District.DistrictMyProfilePage;
import pageObjects.Header.DistrictPageHeader;
import stepDefs.Hooks;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by csackrider on 11/6/2015.
 */
public class DistrictNav {
    public static WebDriver driver;

    public static void goToDistrictAdministration() throws InterruptedException {
        driver = Hooks.driver;
        PageFactory.initElements(driver, DistrictPageHeader.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Actions action = new Actions(driver);
        action.moveToElement(DistrictPageHeader.districtcog).build().perform();
        DistrictPageHeader.lnkSetup.click();
    }

    public static void goToAdminFunction(String strFunction) throws InterruptedException {
        driver = Hooks.driver;
        PageFactory.initElements(driver, DistrictAdminPage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        strFunction = strFunction.toLowerCase();
        switch (strFunction) {
            case "my account":
                driver = Hooks.driver;
                PageFactory.initElements(driver, DistrictPageHeader.class);
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                Actions action = new Actions(driver);
                action.moveToElement(DistrictPageHeader.districtcog).build().perform();
                DistrictPageHeader.lnkMyAccount.click();
                break;
            case "user administration":
                //click that link etc...
            default:

                break;
        }


    }

    public static void editProfile(DataTable MyAccount) throws InterruptedException {
        driver = Hooks.driver;
        PageFactory.initElements(driver, DistrictMyProfilePage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(2000);
        WebElement test = Hooks.driver.findElement(By.xpath("//a[contains(text(),'edit my profile')]"));
        test.click();


        //DistrictMyProfilePage.lnkEditMyProfile.click();


        List<List<String>> data = MyAccount.raw();
        //to be completed later
        System.out.println("prefix " + data.get(0).get(0));
        System.out.println("first name: " + data.get(0).get(1));


    }
}
