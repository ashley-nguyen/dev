package pageObjects.ApplicationManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import pageObjects.BaseClass;

/**
 * Created by franksejas on 2/01/2016.
 */
public class ApplicationManagerPage extends BaseClass {
    @FindBy(how = How.LINK_TEXT, using = "Enter school site")
    public static WebElement School;
    @FindBy(how = How.LINK_TEXT, using = "Application Manager")
    public static WebElement lnkApplicationManager;
    @FindBy(how = How.NAME, using = "class")
    public static WebElement selClass;
    @FindBy(how = How.NAME, using = "quicklist")
    public static WebElement formNameTable;
    @FindBy(how = How.CSS, using = "img[src=\"../../images/processapps/apps_pending_tab_on.gif\"]")
    public static WebElement imgApps;

    public ApplicationManagerPage(WebDriver driver) {
        super(driver);
    }
}
