package pageObjects.Connections;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import pageObjects.BaseClass;

/**
 * Created by franksejas on 12/22/2015.
 */
public class ConnectionsPage extends BaseClass {
    @FindBy(how = How.LINK_TEXT, using = "Connections")
    public static WebElement lnkConnections;

    @FindBy(how = How.LINK_TEXT, using = "E-mail")
    public static WebElement lnkEmail;

    @FindBy(how = How.LINK_TEXT, using = "Check status and view history of emails sent")
    public static WebElement lnkCheckStatusEmailSent;

    @FindBy(how = How.LINK_TEXT, using = "Enter school site")
    public static WebElement lnkEnterSchoolSite;

    @FindBy(how = How.LINK_TEXT, using = "Family Connection")
    public static WebElement lnkFamilyConnection;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr[3]/td/table/tbody/tr/td/table/tbody/tr[5]/td/table[3]/tbody/tr[10]/td[1]/a/img")
    public static WebElement lnkActiveMatch;

    @FindBy(how = How.ID, using = "cluetip-inner")
    public static WebElement idSubActiveMatch;

    @FindBy(how = How.LINK_TEXT, using = "Select and Update Optional Features")
    public static WebElement linkFCconfiguration;

    //@FindBy(how = How.XPATH, using = "html/body/div[1]/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr[3]/td/table/tbody/tr/td/table/tbody/tr[5]/td/table[3]/tbody/tr[9]/td[7]/input")
    //public static WebElement chkboxGrade = By.xpath("html/body/div[1]/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr[3]/td/table/tbody/tr/td/table/tbody/tr[5]/td/table[3]/tbody/tr[9]/td[7]/input");

    public ConnectionsPage(WebDriver driver) {
        super(driver);
    }
}
