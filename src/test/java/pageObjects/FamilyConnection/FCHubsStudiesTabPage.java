package pageObjects.FamilyConnection;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import pageObjects.BaseClass;

/**
 * Created by jorgemaguina on 7/19/2016.
 */
public class FCHubsStudiesTabPage extends BaseClass {
    @FindBy(how = How.XPATH, using = "//label[contains(text(), 'Search')]/../input")
    public static WebElement textBoxSearch;

    public FCHubsStudiesTabPage(WebDriver driver) {
        super(driver);
    }
}



