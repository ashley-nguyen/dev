package pageObjects.District;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import pageObjects.BaseClass;

/**
 * Created by csackrider on 11/6/2015.
 */
public class DistrictAdminPage extends BaseClass {

    @FindBy(how = How.PARTIAL_LINK_TEXT, using = "My")
    //had trouble with "My Account" for link text.  weird.
    public static WebElement lnkMyAccount;
    @FindBy(how = How.PARTIAL_LINK_TEXT, using = "profile")
    public static WebElement lnkEditMyProfile;


    public DistrictAdminPage(WebDriver driver) {
        super(driver);
    }


}
