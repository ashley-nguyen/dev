package pageObjects.FamilyConnection;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import pageObjects.BaseClass;

/**
 * Created by jorgemaguina on 5/25/2016.
 */
public class FCDashboardPage extends BaseClass {
    @FindBy(how = How.XPATH, using = "//ul[@id = 'nav']/li/a[@href='/family-connection/colleges/']")
    public static WebElement tabColleges;
    @FindBy(how = How.LINK_TEXT, using = "letters of recommendation")
    public static WebElement lr;
    @FindBy(how = How.LINK_TEXT, using = "Add Request")
    public static WebElement as;
    @FindBy(how = How.XPATH, using = "//button[@class='fc-button fc-button--primary']")
    public static WebElement sb;
    @FindBy(how = How.XPATH, using = "//*[@name=\"addReq\"]/section/div[1]/div[2]/select")
    public static WebElement selectTeacher;
    @FindBy(how = How.XPATH, using = "//*[@name=\"addReq\"]/section/div[2]/div[2]/table/tbody/tr[1]/td[1]/input")
    public static WebElement selectCollege;


    public FCDashboardPage(WebDriver driver) {
        super(driver);
    }
}