package pageObjects.SuccessPlanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import pageObjects.BaseClass;

/**
 * Created by sangeetha.munuswamy on 2/20/2017.
 */
public class TasksPage extends BaseClass {

    @FindBy(how = How.CSS, using = "legend")
    public static WebElement headingOfPage;

    public TasksPage(WebDriver driver) {
        super(driver);
    }
}
