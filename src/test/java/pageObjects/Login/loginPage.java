package pageObjects.Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import pageObjects.BaseClass;

/**
 * Created by csackrider on 11/6/2015.
 */
public class loginPage extends BaseClass {


    @FindBy(how = How.NAME, using = "hsid")
    public static WebElement Account;
    @FindBy(how = How.NAME, using = "username")
    public static WebElement UserName;
    @FindBy(how = How.NAME, using = "password")
    public static WebElement password;
    @FindBy(how = How.NAME, using = "Submit")
    public static WebElement signin_button;

    public loginPage(WebDriver driver) {
        super(driver);
    }
}
