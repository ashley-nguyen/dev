package pageObjects.District;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import pageObjects.BaseClass;

/**
 * Created by csackrider on 11/13/2015.
 */
public class DistrictMyProfilePage extends BaseClass {

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'edit my profile')]")
    public static WebElement lnkEditMyProfile;

    public DistrictMyProfilePage(WebDriver driver) {
        super(driver);
    }
}
