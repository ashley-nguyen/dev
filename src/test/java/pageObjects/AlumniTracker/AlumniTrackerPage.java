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

    @FindBy(how = How.LINK_TEXT, using = "Prepare Alumni Files")
    public static WebElement lnkPeparealumnifiles;

    @FindBy(how = How.LINK_TEXT, using = "Send File")
    public static WebElement lnkSendFile;

    public AlumniTrackerPage(WebDriver driver) {
        super(driver);
    }
}
