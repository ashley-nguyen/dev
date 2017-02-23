package actions.FamilyConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.FamilyConnection.FCCollegesPage;
import pageObjects.FamilyConnection.FCHubsPage;
import stepDefs.Hooks;

import java.util.List;
import java.util.concurrent.TimeUnit;
import static junit.framework.TestCase.assertTrue;

/**
 * Created by jorgemaguina on 5/25/2016.
 */
public class FCCollegesTab {
    public static WebDriver driver;

    public static void ClickCollegeMatchLink() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCCollegesPage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        FCCollegesPage.lnkCollegeMatch.click();
    }

    public static void EnterCollegeToSearch(String searchParameter) {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCCollegesPage.class);
        new WebDriverWait(Hooks.driver, 20).until(ExpectedConditions.elementToBeClickable
                (FCCollegesPage.textAreaSearchCollege));
        FCCollegesPage.textAreaSearchCollege.sendKeys(searchParameter);
    }

    public static void ClickGoButton() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCCollegesPage.class);
        FCCollegesPage.buttonGo.click();
    }

    public static void ClickCollegeInCollegeLookup(String college) {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCCollegesPage.class);
        if(FCCollegesPage.lnkSingleResultCollegeLookup.getText().contains(college)) {
            FCCollegesPage.lnkSingleResultCollegeLookup.click();
        }
    }

    public static void VerifyMessageCollegeLookup(String message) {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCCollegesPage.class);
        assertTrue("The message is not displayed in the College Lookup page",
                FCCollegesPage.labelStudiesOffering.getText().equals(message));
    }

    public static void VerifyCollegeMatchNotDisplayed() {
        driver = Hooks.driver;
        boolean result;
        PageFactory.initElements(driver, FCCollegesPage.class);
        try {
            FCCollegesPage.labelCollegeMatchTitle.isDisplayed();
            result = false;
        } catch (Exception e) {
            result = true;
            e.printStackTrace();
        }
        assertTrue("The message is not displayed in the College Lookup page", result);
    }

    public static void removeCollegeFromImThinkingAboutListLegacy(String college) {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCCollegesPage.class);
        WebElement collegeCheckbox = driver.findElement(By.xpath("//a[contains(text(), '" + college
                + "')]/ancestor::tr/td[1]"));
        collegeCheckbox.click();
        FCCollegesPage.buttonRemoveFromList.click();
    }

    public static void verifyCollegeVisitInfoPage() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCCollegesPage.class);
        assertTrue("The college visit information page is not displayed", FCCollegesPage.titleCollegeVisitInfo
                .isDisplayed());
    }

    public static void clickAddToThinkingAboutList() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCCollegesPage.class);
        FCCollegesPage.linkAddToImThinkingAboutList.click();
    }

    public static void goToSearchCollegeWithURL(String college) {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCCollegesPage.class);
        driver.get(FCCollegesPage.partialSearchCollegeIntURL + college);
    }
}