package pageObjects.Colleges;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import pageObjects.BaseClass;

/**
 * Created by csackrider on 11/25/2015.
 */
public class CollegePage extends BaseClass {

    @FindBy(how = How.NAME, using = "collegename")
    public static WebElement txtCollegename;

    @FindBy(how = How.NAME, using = "nameSearch")
    public static WebElement btnSearch;

    @FindBy(how = How.XPATH, using = "//img[alt='admissions']")
    public static WebElement tabAdmissions;



    public CollegePage(WebDriver driver) {
        super(driver);
    }
}
