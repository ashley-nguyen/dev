package pageObjects.AlumniTracker;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import pageObjects.BaseClass;

/**
 * Created by franksejas on 12/22/2015.
 */
public class AlumniTrackerPage extends BaseClass {
    @FindBy(how = How.LINK_TEXT, using = "Alumni Tracker")
    public static WebElement lnkAlumnitracker;

    @FindBy(how = How.LINK_TEXT, using = "Prepare an alumni profiles file")
    public static WebElement lnkPepareanalumniprofilesfile;

    @FindBy(how = How.CLASS_NAME, using = "page_change_text")
    public static WebElement lnkPeparealumnifiles;

    @FindBy(how = How.CLASS_NAME, using = "top-nav")
    public static WebElement txtFatalError;

    @FindBy(how = How.ID,  using = "generate_file_button")
    public static WebElement lnkSendFile;

    @FindBy(how = How.NAME, using = "classYear[]")
    public static WebElement chkboxSelected;

    @FindBy(how = How.XPATH, using = "//a[@href='school_signin.php?hsid=180837USPU']")
    public static WebElement lnkSelectedSchoolA;

    @FindBy(how = How.XPATH, using = "//a[@href='school_signin.php?hsid=180846USPU']")
    public static WebElement lnkSelectedSchoolE;

    public AlumniTrackerPage(WebDriver driver) {
        super(driver);
    }
}
