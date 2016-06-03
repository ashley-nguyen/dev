package pageObjects.Marketing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import pageObjects.BaseClass;

/**
 * Created by franksejas on 05/30/2016.
 */
public class marketingPage extends BaseClass {

    @FindBy(how = How.CLASS_NAME, using = "marketing-content")
    public static WebElement Content;
    @FindBy(how = How.XPATH, using = "//img[contains(@src,'img/nsi2016_2.jpg')]")
    public static WebElement Image;
    @FindBy(how = How.XPATH, using = "//img[contains(@src,'/images/navmarketplace_badge.png')]")
    public static WebElement ImageContents;

    public marketingPage(WebDriver driver) {
        super(driver);
    }
}
