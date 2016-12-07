package pageObjects.FamilyConnection;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import pageObjects.BaseClass;

/**
 * Created by jorgemaguina on 5/25/2016.
 */
public class FCCollegesPage extends BaseClass {
    @FindBy(how = How.CSS, using = "#main-content div:nth-of-type(2).block div.block-l ul li:nth-of-type(1)")
    public static WebElement lnkCollegeMatch;
    @FindBy(how = How.NAME, using = "collegename")
    public static WebElement textAreaSearchCollege;
    @FindBy(how = How.CSS, using = ".button")
    public static WebElement buttonGo;
    @FindBy(how = How.CSS, using = "#main-content h3")
    public static WebElement labelStudiesOffering;
    @FindBy(how = How.CSS, using = "tbody td:nth-of-type(1) a")
    public static WebElement lnkSingleResultCollegeLookup;
    @FindBy(how = How.CSS, using = "#main-content table:nth-of-type(1) caption")
    public static WebElement labelCollegeMatchTitle;
    @FindBy(how = How.ID, using = "amRemoveProspective")
    public static WebElement buttonRemoveFromList;
    @FindBy(how = How.NAME, using = "signUp")
    public static WebElement buttonSignUp;
    @FindBy(how = How.CSS, using = ".confirmation.alert")
    public static WebElement labelConfirmationAlert;
    @FindBy(how = How.NAME, using = "remove")
    public static WebElement buttonRemoveMeFromList;
    @FindBy(how = How.CSS, using = "#main-content h1")
    public static WebElement titleCollegeVisitInfo;

    public FCCollegesPage(WebDriver driver) {
        super(driver);
    }
}