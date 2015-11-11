package actions.District;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import cucumber.api.DataTable;
import pageObjects.District.DistrictAdminPage;
import pageObjects.Header.DistrictPageHeader;
import stepDefs.Hooks;

/**
 * Created by csackrider on 11/6/2015.
 */
public class DistrictNavAction {
    public static WebDriver driver;

    public static void goToDistrictAdministration() throws InterruptedException {
        driver = Hooks.driver;
        PageFactory.initElements(driver, DistrictPageHeader.class);

        Actions action = new Actions(driver);
        action.moveToElement(DistrictPageHeader.districtcog).build().perform();
        DistrictPageHeader.lnkSetup.click();
    }

    public static void goToAdminFunction(String strFunction) throws InterruptedException {
        driver = Hooks.driver;
        PageFactory.initElements(driver, DistrictAdminPage.class);

        strFunction = strFunction.toLowerCase();
        switch (strFunction) {
            case "my account":
                DistrictAdminPage.lnkMyAccount.click();
                break;
            case "user administration":
                //click that link etc...
            default:

                break;
        }


    }

    public static void editProfile(DataTable MyAccount) {
        driver = Hooks.driver;
        PageFactory.initElements(driver, DistrictAdminPage.class);

        DistrictAdminPage.lnkEditMyProfile.click();

        List<List<String>> data = MyAccount.raw();

        System.out.println("prefix " + data.get(0).get(0));
        System.out.println("first name: " + data.get(0).get(1));


    }
}
