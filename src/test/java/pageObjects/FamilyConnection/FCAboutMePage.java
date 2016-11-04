package pageObjects.FamilyConnection;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import pageObjects.BaseClass;

/**
 * Created by csackrider on 11/13/2015.
 */
public class FCAboutMePage extends BaseClass {

    @FindBy(how = How.XPATH, using = "//div[2]/h1")
    public static WebElement txtSurvey;

    public FCAboutMePage(WebDriver driver) {
        super(driver);
    }
}
