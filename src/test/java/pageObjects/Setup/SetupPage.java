package pageObjects.Setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import pageObjects.BaseClass;

/**
 * Created by franksejas on 1/29/2016.
 */
public class SetupPage extends BaseClass {
    @FindBy(how = How.LINK_TEXT, using = "Data Export")
    public static WebElement lnkDataExport;

    public SetupPage(WebDriver driver) {
        super(driver);
    }
}
