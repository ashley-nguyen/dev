package actions.MyAccount;

import actions.District.DistrictNavAction;
import org.openqa.selenium.WebDriver;

/**
 * Created by franksejas on 2/02/2016.
 */
public class MyAccount_Action {
    public static WebDriver driver;

    public static void NavigateToMyAccount() throws InterruptedException {
        DistrictNavAction.goToAdminFunction("My Account");
    }
}
