package pageObjects.AssignAndManage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import pageObjects.BaseClass;

/**
 * Created by Dayasagar on 24 Jan 2017
 */
public class AssignAndManagePage extends BaseClass {

    @FindBy(how = How.CSS, using = "legend")
    public static WebElement headingOfPage;

    public AssignAndManagePage(WebDriver driver) {
        super(driver);
    }
}
