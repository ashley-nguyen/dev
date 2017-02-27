package pageObjects.ReusableComponents;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import pageObjects.BaseClass;

/**
 * Created by Dayasagar on 25 Jan 2017
 */
public class webDriverComponentsPage extends BaseClass {
    @FindBy(how = How.LINK_TEXT, using = "Enter school site")
    public static WebElement School;
    @FindBy(how = How.LINK_TEXT, using = "Planner")
    public static WebElement Planner;
    @FindBy(how = How.XPATH, using = "//ul[@class ='dropdown active']/li/a[text() = 'assign and manage']")
    public static WebElement AssignAndManage;
    @FindBy(how = How.XPATH, using = "//ul[@class ='dropdown active']/li/a[text() = 'tasks']")
    public static WebElement Tasks;


    public webDriverComponentsPage(WebDriver driver) {
        super(driver);
    }
}
