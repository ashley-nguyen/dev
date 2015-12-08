package pageObjects.Student.GeneralTab;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import pageObjects.BaseClass;

/**
 * Created by csackrider on 11/6/2015.
 */
public class StudentGeneralTabPage extends BaseClass {


    @FindBy(how = How.CSS, using = "img[alt=\"add parent\"]")
    public static WebElement btnAddParent;


    public StudentGeneralTabPage(WebDriver driver) {
        super(driver);
    }
}
