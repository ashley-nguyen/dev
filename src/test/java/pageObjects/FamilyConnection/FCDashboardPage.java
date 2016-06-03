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
    @FindBy(how = How.XPATH, using = "//ul[@id = 'nav']/li/a[@href='/family-connection/colleges/']")
    public static WebElement tabColleges;

    public FCDashboardPage(WebDriver driver) {
        super(driver);
    }
}