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

    @FindBy(how = How.CSS, using = "a:contains(edit my profile)")
    public static WebElement txtEditMyProfile;

    public DistrictMyProfilePage(WebDriver driver) {
        super(driver);
    }
}
