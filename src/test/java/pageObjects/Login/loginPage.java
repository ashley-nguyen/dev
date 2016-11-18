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
    @FindBy(how = How.CSS, using = "input[value=\"Log In\"]")
    public static WebElement fc_signin_button;
    @FindBy(how = How.CSS, using = "dd[class = 'login']")
    public static WebElement fc_logged_as_label;
    //The next locator must be updated onec the element is added
    //to the page
    @FindBy(how = How.CSS, using = ".errorMessage")
    public static WebElement fc_bad_credentials_message;
    @FindBy(how = How.CSS, using = "td.footnote")
    public static WebElement valid_foot_note_text;
    @FindBy(how = How.CSS, using = ".bs-alert.top-alert.alert-error")
    public static WebElement invalid_foot_note_text;
    public loginPage(WebDriver driver) {
        super(driver);
    }
}
