package pageObjects.IAM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import pageObjects.BaseClass;

/**
 * Created by franksejas on 1/22/2016.
 */
public class IAMPage extends BaseClass {
    @FindBy(how = How.NAME, using = "login")
    public static WebElement Login;

    public IAMPage(WebDriver driver) {
        super(driver);
    }
}
