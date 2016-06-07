package pageObjects.FamilyConnection;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import pageObjects.BaseClass;

/**
 * Created by jorgemaguina on 5/25/2016.
 */
public class FCSurveyPage extends BaseClass {
    @FindBy(how = How.XPATH, using = "//button[contains(text(), 'Done')]")
    public static WebElement buttonDone;

    public FCSurveyPage(WebDriver driver) {
        super(driver);
    }
}