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
    @FindBy(how = How.CSS, using = "img[src*=img/nsi2016_2.jpg]")
    public static WebElement Image;
    @FindBy(how = How.CSS, using = "img[src*=navmarketplace_badge.png]")
    public static WebElement ImageContents;
    @FindBy(how = How.CSS, using = "img[src*='upgraded-by-hobsons.jpg']")
    public static WebElement imgVerification;
    @FindBy(how = How.CSS, using = "img[src*='navmarketplace_badge.png']")
    public static WebElement bannerVerification;

    public marketingPage(WebDriver driver) {
        super(driver);
    }
}
