package pageObjects.Reports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import pageObjects.BaseClass;

/**
 * Created by franksejas on 1/13/2016.
 */
public class ReportsPage extends BaseClass {
    @FindBy(how = How.LINK_TEXT, using = "Reports")
    public static WebElement Reports;

    @FindBy(how = How.LINK_TEXT, using = "Customize")
    public static WebElement Customize;

    @FindBy(how = How.XPATH, using = "//*[@id=\'customize-report\']/div[2]/input[2]")
    public static WebElement ViewReport;

    public ReportsPage(WebDriver driver) {
        super(driver);
    }
}
