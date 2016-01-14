package pageObjects.Assessments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import pageObjects.BaseClass;

/**
 * Created by franksejas on 1/14/2016.
 */
public class AssessmentsPage extends BaseClass {
    @FindBy(how = How.LINK_TEXT, using = "Assessments")
    public static WebElement Assessments;

    public AssessmentsPage(WebDriver driver) {
        super(driver);
    }
}
