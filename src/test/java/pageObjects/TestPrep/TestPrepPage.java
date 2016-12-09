package pageObjects.TestPrep;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by sangeetha.munuswamy on 12/7/2016.
 */
public class TestPrepPage {
    @FindBy(how = How.CLASS_NAME, using = "ns-button")
    public static WebElement gotItButton;
}
