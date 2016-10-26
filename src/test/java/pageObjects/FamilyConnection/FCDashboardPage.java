package pageObjects.FamilyConnection;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import pageObjects.BaseClass;

/**
 * Created by jorgemaguina on 5/25/2016.
 */
public class FCDashboardPage extends BaseClass {
    @FindBy(how = How.CSS, using = "#nav li [href=\"/family-connection/colleges/\"]")
    public static WebElement tabColleges;
    @FindBy(how = How.LINK_TEXT, using = "Add Request")
    public static WebElement as;

    public FCDashboardPage(WebDriver driver) {
        super(driver);
    }
}