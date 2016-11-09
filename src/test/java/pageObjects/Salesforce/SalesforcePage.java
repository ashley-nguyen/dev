package pageObjects.Salesforce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import pageObjects.BaseClass;

/**
 * Created by franksejas on 1/19/2016.
 */
public class SalesforcePage extends BaseClass {
    @FindBy(how = How.LINK_TEXT, using = "School Account")
    public static WebElement SchoolAccount;

    @FindBy(how = How.LINK_TEXT, using = "Enter school site")
    public static WebElement School;

    @FindBy(how = How.LINK_TEXT, using = "Manage Subscriptions")
    public static WebElement ManageSubscriptions;

    @FindBy(how = How.ID, using = "button")
    public static WebElement Next;

    @FindBy(how = How.ID, using = "processRenewal")
    public static WebElement Submit;

    @FindBy(how = How.ID, using = "checkbox_14")
    public static WebElement Product;

    @FindBy(how = How.ID, using = "payment_form")
    public static WebElement FormPayment;

    @FindBy(how = How.ID, using = "expiration_14")
    public static WebElement EndDate;

    @FindBy(how = How.ID, using = "start_date_14")
    public static WebElement startDate;

    @FindBy(how = How.ID, using = "po_number")
    public static WebElement PONumber;

    @FindBy(how = How.CSS, using = "html > body > div:nth-of-type(1) > table > tbody > tr:nth-of-type(1) > td:nth-of-type(2) > table:nth-of-type(1) > tbody > tr:nth-of-type(2) > td:nth-of-type(2) > div > h3")
    public static WebElement txtDataVerification;



    public SalesforcePage(WebDriver driver) {
        super(driver);
    }
}
