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
    @FindBy(how = How.CSS, using = ".btn.small.done-button.survey-page-button.user-generated.notranslate")
    public static WebElement buttonDone;

    public FCSurveyPage(WebDriver driver) {
        super(driver);
    }
}