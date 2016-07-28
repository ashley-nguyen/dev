package pageObjects.FamilyConnection;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import pageObjects.BaseClass;

/**
 * Created by jorgemaguina on 5/25/2016.
 */
public class FCCollegesPage extends BaseClass {
    @FindBy(how = How.XPATH, using = "//a[contains(text(), 'college match')]")
    public static WebElement lnkCollegeMatch;
    @FindBy(how = How.XPATH, using = "//table[@class = 'standard']/caption[contains(text(), 'Colleges Looking For Students Like You')]")
    public static WebElement titleCollegeMatchList;
    @FindBy(how = How.NAME, using = "collegename")
    public static WebElement textAreaSearchCollege;
    @FindBy(how = How.XPATH, using = "//form[@id='search']/fieldset/input[@value='Go']")
    public static WebElement buttonGo;
    @FindBy(how = How.XPATH, using = "//div[@id='main-content']/h3")
    public static WebElement labelStudiesOffering;

    public FCCollegesPage(WebDriver driver) {
        super(driver);
    }
}