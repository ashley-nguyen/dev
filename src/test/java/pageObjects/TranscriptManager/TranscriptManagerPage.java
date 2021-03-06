package pageObjects.TranscriptManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import pageObjects.BaseClass;

/**
 * Created by franksejas on 2/01/2016.
 */
public class TranscriptManagerPage extends BaseClass {
    @FindBy(how = How.LINK_TEXT, using = "Enter school site")
    public static WebElement School;
    @FindBy(how = How.LINK_TEXT, using = "Transcript Request Manager")
    public static WebElement lnkTranscriptManager;
    @FindBy(how = How.NAME, using = "class")
    public static WebElement selClass;
    @FindBy(how = How.NAME, using = "processapps")
    public static WebElement formNameTable;
    @FindBy(how = How.CLASS_NAME, using = "grids")
    public static WebElement formNameStudent;
    @FindBy(how = How.CSS, using = "img[src=\"../../images/transcripts/transcripts_requests_tab_on.gif\"]")
    public static WebElement imgTranscriptManager;
    @FindBy(how = How.CSS, using = "body > div > table > tbody > tr:nth-child(1) > td:nth-child(2) > table > tbody > tr:nth-child(2) > td:nth-child(2) > table > tbody > tr:nth-child(2) > td:nth-child(2) > table > tbody > tr > td > table > tbody > tr:nth-child(5) > td.category11 > div > a:nth-child(2) > img")
    public static WebElement imgTranscriptManagerStudents;

    public TranscriptManagerPage(WebDriver driver) {
        super(driver);
    }
}
