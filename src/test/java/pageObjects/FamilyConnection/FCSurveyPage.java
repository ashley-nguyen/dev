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
    @FindBy(how = How.CSS, using = "h2[data-icon=\"D\"]")
    public static WebElement buttonClosePreview;
    @FindBy(how = How.CSS, using = "button[type=\"submit\"]")
    public static WebElement buttonNext;
    @FindBy(how = How.CSS, using = "div.survey-submit-actions.center-text.clearfix button:nth-of-type(2)")
    public static WebElement buttonNext2;

    public FCSurveyPage(WebDriver driver) {
        super(driver);
    }
}