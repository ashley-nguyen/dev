package actions.FamilyConnection;

//import org.openqa.jetty.html.List;
import com.gargoylesoftware.htmlunit.ElementNotFoundException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.FamilyConnection.FCCollegeEventsPage;
import pageObjects.FamilyConnection.FCCollegesPage;
import pageObjects.FamilyConnection.FCHubsCostsTabPage;
import pageObjects.FamilyConnection.FCHubsPage;
import stepDefs.Hooks;
import java.util.List;

import static org.junit.Assert.assertTrue;
import static pageObjects.FamilyConnection.FCCollegeEventsPage.eventsList;

/**
 * Created by mbhangu on 12/13/2016.
 */
public class FCCollegeEvents {
    public static WebDriver driver;

    public static void verifyCollegeEventsDetails() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCCollegeEventsPage.class);
        assertTrue("The College Events page is Not Displayed ", FCCollegeEventsPage.labelCollegeEventsTitle.isDisplayed());
    }

    public static void verifySignUpHereText(String eventSignup) {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCCollegeEventsPage.class);
        assertTrue("The College Events Details page is Not Displayed ", FCCollegeEventsPage.CollegeEventsDetailsSignUpHere.isDisplayed());
    }

    public static void clickSignUpButton() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCCollegeEventsPage.class);
        FCCollegeEventsPage.clickSignUpButton.click();
    }

    public static void verifyConfirmationMessageEvents(String confirmationMessage) {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCCollegeEventsPage.class);
        assertTrue("The confirmation message is not correct", FCCollegeEventsPage.labelConfirmationMessage.getText().equals(confirmationMessage));
    }

    public static void clickSignUpButtonForCollegeandForEvent(String nameSchool, String nameEvent) {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCCollegeEventsPage.class);
        FCCollegeEventsPage.buttonSignUponCollegeEvents.click();
    }

    public static void clickReturntoAllEventslink() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCCollegeEventsPage.class);
        FCCollegeEventsPage.linkReturntoAllEvents.click();
    }

    public static void clickRecommendedEventslink() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCCollegeEventsPage.class);
        FCCollegeEventsPage.recommendedEvents.click();
    }

    public static void verifyRecommendedEventsText() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCCollegeEventsPage.class);
        assertTrue("Text is Not Displayed for Recommended Events ", FCCollegeEventsPage.verifyRecommendedEventsText.isDisplayed());
    }

    public static void clicklinkUpcomingCollegeEvents() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCCollegeEventsPage.class);
        FCCollegeEventsPage.UpcomingCollegeEvents.click();
    }

    public static void clickMoreOptions() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCCollegeEventsPage.class);
        FCCollegeEventsPage.eventsMoreOptions.click();

    }

    public static void VerifyFindEventsByOptions() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCCollegeEventsPage.class);
        assertTrue("The Text is not displayed on screen", FCCollegeEventsPage.VerifyFindEventsByOptionsText.isDisplayed());
    }

    public static void selectDistanceandEnterZipCode(String distance, String Zipcode) {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCCollegeEventsPage.class);
        try{
            FCCollegeEventsPage.closeEventToolTip.isDisplayed();
            FCCollegeEventsPage.closeEventToolTip.click();

            }catch (ElementNotFoundException e){

            Select distanceDropDown = new Select(FCCollegeEventsPage.selectDistanceandEnterZipCodeValue);
            distanceDropDown.selectByVisibleText(distance);
            FCCollegeEventsPage.eventsTextBoxForZipCode.sendKeys(Zipcode);
        }

        Select distanceDropDown = new Select(FCCollegeEventsPage.selectDistanceandEnterZipCodeValue);
        distanceDropDown.selectByVisibleText(distance);

        new WebDriverWait(Hooks.driver, 20).until(ExpectedConditions.elementToBeClickable
         (FCCollegeEventsPage.eventsTextBoxForZipCode));
        FCCollegeEventsPage.eventsTextBoxForZipCode.sendKeys(Zipcode);

    }

    public static void clickShowResults() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCCollegeEventsPage.class);
        FCCollegeEventsPage.clickShowResults.click();
    }

    public static void verifyFilteredEvents(String eventName) {
        driver = Hooks.driver;
        boolean result = false;
        List<WebElement> arrayOfEvents;

        PageFactory.initElements(driver, FCCollegeEventsPage.class);
        arrayOfEvents = driver.findElements(By.cssSelector(FCCollegeEventsPage.eventsList));
        for(int i = 0; i < arrayOfEvents.size(); i++)
        {
            System.out.println("Values in the list are :" + arrayOfEvents.get(i).getText());
            if (arrayOfEvents.get(i).getText().equals(eventName)){
            result = true;
            }

        }
        assertTrue("The Event Name not present or it displays incorrect data", result);

    }
}
