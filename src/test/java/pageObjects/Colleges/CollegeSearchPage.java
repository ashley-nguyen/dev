package pageObjects.Colleges;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import pageObjects.BaseClass;

/**
 * Created by csackrider on 1/6/2016.
 */
public class CollegeSearchPage  extends BaseClass {


    @FindBy(how = How.NAME, using = "Advanced")
    public static WebElement lnkAdvancedCollegeSearch;


    @FindBy(how = How.NAME, using = "collegesearch")
    public static WebElement btnAdvancedSearchGo;

    public CollegeSearchPage(WebDriver driver) {
        super(driver);
    }
}
