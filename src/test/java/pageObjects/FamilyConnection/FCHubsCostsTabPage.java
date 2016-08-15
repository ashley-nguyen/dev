package pageObjects.FamilyConnection;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import pageObjects.BaseClass;

/**
 * Created by jorgemaguina on 8/15/2016.
 */
public class FCHubsCostsTabPage extends BaseClass {
    @FindBy(how = How.XPATH, using = "//div[@id = 'cost-module']")
    public static WebElement costModuleLabel;

    public FCHubsCostsTabPage(WebDriver driver) {
        super(driver);
    }
}



