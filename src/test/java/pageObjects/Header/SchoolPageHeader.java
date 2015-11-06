package pageObjects.Header;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pageObjects.BaseClass;
import stepDefs.Hooks;

/**
 * Created by csackrider on 11/6/2015.
 */
public class SchoolPageHeader extends BaseClass {

    public SchoolPageHeader(WebDriver driver){
        super(driver);
    }

    //### OBJECTS USED FOR GLOBAL SEARCH ###
    @FindBy(how= How.ID, using="search-for-student")
    public static WebElement lnkStudentSearch;

    @FindBy(how= How.ID, using="student-search-prototype")
    public static WebElement searchbox;




}
