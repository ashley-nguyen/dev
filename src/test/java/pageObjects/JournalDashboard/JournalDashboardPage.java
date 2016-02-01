package pageObjects.JournalDashboard;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import pageObjects.BaseClass;

/**
 * Created by franksejas on 2/01/2016.
 */
public class JournalDashboardPage extends BaseClass {
    @FindBy(how = How.LINK_TEXT, using = "Enter school site")
    public static WebElement School;
    @FindBy(how = How.LINK_TEXT, using = "Journal Dashboard")
    public static WebElement lnkJournalDashboard;

    public JournalDashboardPage(WebDriver driver) {
        super(driver);
    }
}
