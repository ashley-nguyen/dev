package pageObjects.FamilyConnection;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import pageObjects.BaseClass;

/**
 * Created by mbhangu on 12/13/2016.
 */
public class FCCollegeEventsPage extends BaseClass {
    @FindBy(how = How.CSS, using = "h1")
    public static WebElement labelCollegeEventsTitle;
    @FindBy(how = How.CSS, using = ".fc-fieldset__legend")
    public static WebElement CollegeEventsDetailsSignUpHere;
    @FindBy(how = How.CSS, using = ".fc-button--primary")
    public static WebElement clickSignUpButton;
    @FindBy(how = How.CSS, using = "h2:not([class=\"event-summary__college-name ng-binding\"]):not([class=\"ng-scope\"])")
    public static WebElement labelConfirmationMessage;

    public static String eventsListLocator = ".events-list event-summary";

    public FCCollegeEventsPage(WebDriver driver) {
        super(driver);
    }
}
