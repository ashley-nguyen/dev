package pageObjects.District;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import pageObjects.BaseClass;

/**
 * Created by csackrider on 1/5/2016.
 */
public class DistrictSetupPage extends BaseClass {


    @FindBy(how = How.PARTIAL_LINK_TEXT, using = "Single Sign")
    public static WebElement lnkSingleSignInOptions;


    public DistrictSetupPage(WebDriver driver) {
        super(driver);
    }
}
