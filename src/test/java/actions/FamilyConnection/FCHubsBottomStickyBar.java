package actions.FamilyConnection;

import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.FamilyConnection.FCCollegeEventsPage;
import pageObjects.FamilyConnection.FCCollegesPage;
import pageObjects.FamilyConnection.FCHubsBottomStickyBarPage;
import pageObjects.FamilyConnection.FCHubsPage;
import stepDefs.Hooks;

import java.util.List;

import static org.junit.Assert.assertTrue;

/**
 * Created by jorgemaguina on 7/27/2016.
 */
public class FCHubsBottomStickyBar {
    public static WebDriver driver;
    private static String tempVariable;

    public static void saveValueFromButtonStickyBar(String buttonLabel) {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsBottomStickyBarPage.class);
        WebElement buttonElement = null;
        switch (buttonLabel) {
            case "I'm Thinking About" : buttonElement = FCHubsBottomStickyBarPage.buttonNumberImThinkingAbout;
                break;
            case "I'm Applying To" : buttonElement = FCHubsBottomStickyBarPage.buttonNumberImApplyingTo;
                break;
            case "Recommended Events" : buttonElement = FCHubsBottomStickyBarPage.buttonNumberRecommendedEvents;
                break;
            case "Upcoming Visits" : buttonElement = FCHubsBottomStickyBarPage.buttonNumberUpcomingVisits;
                break;
        }
        tempVariable = buttonElement.getText();
    }

    public static void clickStickyBarButton(String buttonName) {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsBottomStickyBarPage.class);
        WebElement buttonElement = null;
        switch (buttonName) {
            case "I'm Thinking About" : buttonElement = FCHubsBottomStickyBarPage.buttonNumberImThinkingAbout;
                break;
            case "I'm Applying To" : buttonElement = FCHubsBottomStickyBarPage.buttonNumberImApplyingTo;
                break;
            case "Recommended Events" : buttonElement = FCHubsBottomStickyBarPage.buttonNumberRecommendedEvents;
                break;
            case "Upcoming Visits" : buttonElement = FCHubsBottomStickyBarPage.buttonNumberUpcomingVisits;
                break;
        }
        new WebDriverWait(Hooks.driver, 20).until(ExpectedConditions.elementToBeClickable(buttonElement));
        buttonElement.click();
    }

    public static void verifyListFromStickyBar(String listName) {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCCollegesPage.class);
        PageFactory.initElements(driver, FCCollegeEventsPage.class);
        String listLocator = "";
        switch (listName) {
            case "I'm Thinking About" : listLocator = FCCollegesPage.imThinkingAboutListElementsString;
                break;
            case "I'm Applying To" : listLocator = FCCollegesPage.imApplyingToListLocator;
                break;
            case "Recommended Events" : listLocator = FCCollegeEventsPage.eventsListLocator;
                break;
            case "Upcoming Visits" : listLocator = FCCollegesPage.collegeVisitsLocator;
                break;
        }
        List<WebElement> list = driver.findElements(By.cssSelector(listLocator));
        assertTrue("The number of elements in the list is not the same than the number in the sticky bar button",
                list.size() == Integer.parseInt(tempVariable));
    }
}