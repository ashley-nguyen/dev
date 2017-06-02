package actions.FamilyConnection;

import org.openqa.selenium.*;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.FamilyConnection.FCCollegeEventsPage;
import pageObjects.FamilyConnection.FCCollegesPage;
import pageObjects.FamilyConnection.FCHubsBottomStickyBarPage;
import pageObjects.FamilyConnection.FCHubsPage;
import reusableComponents.WebdriverComponents;
import stepDefs.Hooks;

import java.util.*;

import static org.junit.Assert.assertTrue;

/**
 * Created by jorgemaguina on 7/27/2016.
 */
public class FCHubsBottomStickyBar {
    public static WebDriver driver;
    private static String tempVariable;
    private static WebdriverComponents navigation = new WebdriverComponents();

    public static void saveValueFromButtonStickyBar(String buttonLabel) {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsBottomStickyBarPage.class);
        PageFactory.initElements(driver, FCHubsPage.class);
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

        new WebDriverWait(Hooks.driver, 20).until(ExpectedConditions.elementToBeClickable
                (FCHubsPage.buttonCompareMeWithAllAcceptedApplicants));
        if (buttonElement.getText().equals("")) {
            tempVariable = "0";
        } else {
            tempVariable = buttonElement.getText();
        }

    }

    public static void clickStickyBarButton(String buttonName) {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsBottomStickyBarPage.class);
        WebElement buttonElement = null;
        switch (buttonName) {
            case "I'm Thinking About" : buttonElement = FCHubsBottomStickyBarPage.buttonImThinkingAbout;
                break;
            case "I'm Applying To" : buttonElement = FCHubsBottomStickyBarPage.buttonImApplyingTo;
                break;
            case "Recommended Events" : buttonElement = FCHubsBottomStickyBarPage.buttonRecommendedEvents;
                break;
            case "Upcoming Visits" : buttonElement = FCHubsBottomStickyBarPage.buttonUpcomingVisits;
                break;
        }
        new WebDriverWait(Hooks.driver, 20).until(ExpectedConditions.elementToBeClickable(buttonElement));
        buttonElement.click();
    }

    public static void verifyListFromStickyBar(String listName) {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCCollegesPage.class);
        PageFactory.initElements(driver, FCCollegeEventsPage.class);
        int listSize = 0;
        List<WebElement> list = new ArrayList<WebElement>();
        String listLocator;
        switch (listName) {
            case "I'm Thinking About" : listLocator = FCCollegesPage.imThinkingAboutListElementsString;
                list = driver.findElements(By.cssSelector(listLocator));
                listSize = list.size();
                break;
            case "I'm Applying To" : listLocator = FCCollegesPage.imApplyingToListLocator;
                try {
                    if (FCCollegesPage.labelNoCollegesImApplyingTo.getText().equals("+ add colleges to this list")) {
                        listSize = 0;
                    }
                } catch (NoSuchElementException e) {
                    list = driver.findElements(By.cssSelector(listLocator));
                    listSize = list.size();
                }
                break;
            case "Recommended Events" : listLocator = FCCollegeEventsPage.eventsListLocator;
                new WebDriverWait(Hooks.driver, 20).until(ExpectedConditions.elementToBeClickable
                        (FCCollegeEventsPage.firstEventRecommendedLabel));
                list = driver.findElements(By.cssSelector(listLocator));
                listSize = list.size();
                break;
            case "Upcoming Visits" : listLocator = FCCollegesPage.collegeVisitsLocator;
                if (FCCollegesPage.labelNoVisitsScheduled.getText().equals("No visits scheduled.")) {
                    listSize = 0;
                } else {
                    list = driver.findElements(By.cssSelector(listLocator));
                    listSize = list.size();
                }
                break;
        }

        if (tempVariable.equals("")) {
            tempVariable = "0";
        }
        assertTrue("The number of elements in the list is not the same than the number in the sticky bar button",
                listSize == Integer.parseInt(tempVariable));
    }
}