package pageObjects.Header;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import pageObjects.BaseClass;

/**
 * Created by csackrider on 11/6/2015.
 */
public class DistrictPageHeader extends BaseClass {

    //### OBJECTS ADMIN UTILS ###
    @FindBy(how = How.CSS, using = ".icon-cog")
    public static WebElement districtcog;


    @FindBy(how = How.LINK_TEXT, using = "Setup")
    public static WebElement lnkSetup;

    @FindBy(how = How.LINK_TEXT, using = "Logout")
    public static WebElement lnkLogout;

    @FindBy(how = How.LINK_TEXT, using = "My Account")
    public static WebElement lnkMyAccount;

    public DistrictPageHeader(WebDriver driver) {
        super(driver);
    }


    //### add in mnuItems

}
