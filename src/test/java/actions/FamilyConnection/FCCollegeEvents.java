package actions.FamilyConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import pageObjects.FamilyConnection.FCCollegeEventsPage;
import pageObjects.FamilyConnection.FCHubsPage;
import stepDefs.Hooks;

import static org.junit.Assert.assertTrue;

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

    public static void SignUpforCollegeEvent(String SchoolEvent) {
        driver = Hooks.driver;
        PageFactory.initElements(driver,FCCollegeEvents.class);
        FCCollegeEventsPage.SignUpforCollegeEvent.click();

    }

    public static void verifySignUpHereText(String eventSignup) {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCCollegeEventsPage.class);
        assertTrue("The College Events Details page is Not Displayed ", FCCollegeEventsPage.CollegeEventsDetailsSignUpHere.isDisplayed());


    }

    public static void ClickSignUpButton() {
        driver = Hooks.driver;
        PageFactory.initElements(driver,FCCollegeEventsPage.class);
        FCCollegeEventsPage.clickSignUpButton.click();
    }

    public static void VerifyConfirmationMessageEvents(String confirmationMessage) {
        driver = Hooks.driver;
        PageFactory.initElements(driver,FCCollegeEventsPage.class);
        assertTrue("The confirmation message is not correct",FCCollegeEventsPage.labelConfirmationMessage.getText().equals(confirmationMessage));

    }

    public static void ClickSignUpButtonForCollegeandForEvent(String nameSchool, String nameEvent) {
        driver = Hooks.driver;
        PageFactory.initElements(driver,FCCollegeEventsPage.class);
        FCCollegeEventsPage.buttonSignUponCollegeEvents.click();

    }

    public static void ClickReturntoAllEventslink() {
        driver = Hooks.driver;
        PageFactory.initElements(driver,FCCollegeEventsPage.class);
        FCCollegeEventsPage.LinkReturntoAllEvents.click();
    }
}
