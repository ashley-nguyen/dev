package pageObjects.DefaultDB;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import pageObjects.BaseClass;

/**
 * Created by franksejas on 1/20/2016.
 */
public class DefaultDBPage extends BaseClass {
    @FindBy(how = How.LINK_TEXT, using = "Enter school site")
    public static WebElement School;
    @FindBy(how = How.LINK_TEXT, using = "Courses")
    public static WebElement Courses;
    @FindBy(how = How.LINK_TEXT, using = "Course Catalog")
    public static WebElement CourseCatalog;

    public DefaultDBPage(WebDriver driver) {
        super(driver);
    }
}
