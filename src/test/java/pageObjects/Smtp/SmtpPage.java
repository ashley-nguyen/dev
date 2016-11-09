package pageObjects.Smtp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import pageObjects.BaseClass;

/**
 * Created by franksejas on 1/18/2016.
 */
public class SmtpPage extends BaseClass {
    @FindBy(how = How.LINK_TEXT, using = "User Administration")
    public static WebElement UserAdministration;
    @FindBy(how = How.LINK_TEXT, using = "Add New User")
    public static WebElement AddNewUser;

    @FindBy(how = How.NAME, using = "first_name")
    public static WebElement FirstName;

    @FindBy(how = How.NAME, using = "last_name")
    public static WebElement LastName;

    @FindBy(how = How.NAME, using = "username")
    public static WebElement UserName;

    @FindBy(how = How.NAME, using = "email")
    public static WebElement Email;

    @FindBy(how = How.NAME, using = "email2")
    public static WebElement ConfirmEmail;

    @FindBy(how = How.NAME, using = "role_id")
    public static WebElement SelectRole;

    @FindBy(how = How.ID, using = "addUser")
    public static WebElement AddUser;

    @FindBy(how = How.CSS, using = "html > body > div > table > tbody > tr:nth-of-type(1) > td:nth-of-type(2) > table > tbody > tr:nth-of-type(4) > td:nth-of-type(2) > table")
    public static WebElement txtDataVerification;

    public SmtpPage(WebDriver driver) {
        super(driver);
    }
}
