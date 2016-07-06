package actions.FamilyConnection;

import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.FamilyConnection.FCHubsPage;
import stepDefs.Hooks;

import java.util.ArrayList;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/**
 * Created by jorgemaguina on 5/25/2016.
 */
public class FCHubs {
    public static WebDriver driver;

    public static void VerifyFeedbackRibbon() {
        driver = Hooks.driver;
        assertTrue("The Hubs Feedbak Ribbon is not displayed", driver.findElement(
                By.xpath("//div[@class='hub-beta-bar']")).isDisplayed());
    }

    public static void ClickFeedbackButton() {
        driver = Hooks.driver;
        new WebDriverWait(Hooks.driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath
                ("//div[@class='hub-beta-bar']/a")));
        PageFactory.initElements(driver, FCHubsPage.class);
        FCHubsPage.buttonFeedback.click();
        FCHubsPage.buttonFeedback.sendKeys(Keys.RETURN);
    }

    public static void VerifyFirstTutorialDialog() {
        driver = Hooks.driver;
        new WebDriverWait(Hooks.driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath
                ("//span[contains(text(), 'Favorite this college')]")));
        assertTrue("The First Tutorial Dialog is not displayed", driver.findElement(By.xpath
                ("//span[contains(text(), 'Favorite this college')]")).isDisplayed());
    }

    public static void ClickNextOnFirstDialog() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsPage.class);
        FCHubsPage.linkNextFirstDialog.click();
    }

    public static void VerifySecondTutorialDialog() {
        driver = Hooks.driver;
        assertTrue("The Second Tutorial Dialog is displayed ", driver.findElement(By.xpath
                ("//span[contains(text(), 'Plan your applications')]")).isDisplayed());
    }
    public static void ClickNextOnSecondDialog() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsPage.class);
        FCHubsPage.linkNextSecondDialog.click();

    }

    public static void VerifyThirdTutorialDialog() {
        driver = Hooks.driver;
        assertTrue("The Third Tutorial Dialog is displayed ", driver.findElement(By.xpath("//span[contains (text( )," +
                "'Tell us what you think!')]")).isDisplayed());
    }

    public static void VerifyIdentifierModule() {
        driver = Hooks.driver;
        assertTrue("The Identifier Module is not present", driver.findElement
                (By.xpath("//div[@class='fc-grid__row fc-grid__row--xs-center fc-grid__row--lg-start fc-grid__" +
                        "row--xs-middle']")).isDisplayed());
    }

    public static void VerifyLogoInIdentifierModule() {
        driver = Hooks.driver;
        assertTrue("The logo in the Identifier Module is not present", driver.findElement
                (By.xpath("//div[@class='fc-grid__row fc-grid__row--xs-center fc-grid__row--lg-start fc-grid__row--xs-" +
                        "middle']/div/img[@class='masthead__logo-image']")).isDisplayed());
    }

    public static void ClickURLInIdentifierModule() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsPage.class);
        FCHubsPage.linkURLIdentifierModule.click();
        ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs.get(tabs.size() - 1));
    }

    public static void VerifyURLContainsText(String url) {
        driver = Hooks.driver;
        String currentURL = driver.getCurrentUrl();
        assertTrue("The current URL does not match " + url, currentURL.equals(url));
    }

    public static void ClickRequestInfoButton() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsPage.class);
        FCHubsPage.buttonRequestInfo.click();
        ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs.get(tabs.size() - 1));
    }

    public static void ClickApplyOnlineButton() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsPage.class);
        FCHubsPage.buttonApplyOnline.click();
        ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs.get(tabs.size() - 1));
    }

    public static void ClickLearnMoreButton() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsPage.class);
        FCHubsPage.buttonLearnMore.click();
        ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs.get(tabs.size() - 1));
    }

    public static void ClickLearnMoreLink(String link) {
        driver = Hooks.driver;
        WebElement learnMoreLink = driver.findElement(By.xpath("//a[contains(text(), '" + link + "')]"));
        learnMoreLink.click();
        ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs.get(tabs.size() - 1));
    }

    public static void ClickRightArrow(int numberOfTimes) {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsPage.class);
        for (int i = 0; i < numberOfTimes; i++) {
            FCHubsPage.buttonRightArrow.click();
        }
    }

    public static void VerifyVisibilityOfLastWebTourElement() {
        driver = Hooks.driver;
        assertTrue("Last element of Web Tour is not visible", driver.findElement(By.xpath
                ("//span[@id='webtourElement26']")).isDisplayed());
    }

    public static void VerifyVisibilityOfPlayButton() {
        driver = Hooks.driver;
        assertTrue("Play button in Youtube video is not visible", driver.findElement(By.xpath
                ("//span[@id='webtourElement26']/div/*[name()='svg']")).isDisplayed());
    }

    public static void ClickWebTourElementAtPosition(int elementPosition) {
        driver = Hooks.driver;
        WebElement webTourElement = driver.findElement(By.xpath("//span[@id='webtourElement" + elementPosition + "']"));
        webTourElement.click();
    }

    public static void VerifyPresenceOfImageInModal() {
        driver = Hooks.driver;
        assertTrue("Image was not open in a modal dialog", driver.findElement(By.xpath
                ("//div[@id='webtourViewer']/div")).isDisplayed());
    }

    public static void VerifyContentBelowImageInModal() {
        driver = Hooks.driver;
        assertTrue("The content below the image is not present in the modal dialog", driver.findElement(By.xpath
                ("//div[@id='webtourCaption']/p")).isDisplayed());
    }

    public static void ClickLinkInContentInModal(String linkText) {
        driver = Hooks.driver;
        WebElement linkInContent = driver.findElement(By.xpath
                ("//div[@id='webtourCaption']/p/a[contains(text(), '" + linkText + "')]"));
        linkInContent.click();
        ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs.get(tabs.size() - 1));
    }

    public static void ClickXInModalDialog() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsPage.class);
        FCHubsPage.buttonX.click();
    }

    public static void VerifyModalDialogIsNotDisplayed() {
        driver = Hooks.driver;
        try{
            if(driver.findElement(By.xpath
                    ("//div[@id='webtourViewer']/div")).isDisplayed()) {
                assertTrue(false);
            }
        } catch(NoSuchElementException e) {
            assertTrue(true);
        } catch(Exception f) {
            f.printStackTrace();
        }
    }

    public static void VerifyNavigationTabs() {
        driver = Hooks.driver;
        assertTrue("The Navigation Tabs are not displayed", driver.findElement(By.xpath
                ("//ul[@id='hubNavBar']")).isDisplayed());
    }

    public static void VerifySchoolNameAppMailingAdd(String schoolName) {
        driver = Hooks.driver;
        assertTrue("The School Name is not correct", driver.findElement(By.xpath
                ("//div[@class='contactsMail ng-binding']" +
                        "[contains(text(), '" + schoolName + "')]")).isDisplayed());
    }

    public static void VerifyAttnApplicationsAppMailingAdd() {
        driver = Hooks.driver;
        WebElement appMailingAddText = driver.findElement(By.xpath("//div[@class='contactsMail ng-binding']"));
        assertTrue("'Attn: Applications' is not displayed", appMailingAddText.getText().contains("Attn: Applications"));
    }

    public static void VerifyAddressAppMailingAdd(String address) {
        driver = Hooks.driver;
        WebElement appMailingAddText = driver.findElement(By.xpath("//div[@class='contactsMail ng-binding']"));
        assertTrue("Address data is not correct", appMailingAddText.getText().contains(address));
    }

    public static void VerifyCityAppMailingAdd(String city) {
        driver = Hooks.driver;
        WebElement appMailingAddText = driver.findElement(By.xpath("//div[@class='contactsMail ng-binding']"));
        assertTrue("Address data is not correct", appMailingAddText.getText().contains(city));
    }

    public static void VerifyZipAddressAppMailingAdd(String zipAddress) {
        driver = Hooks.driver;
        WebElement appMailingAddText = driver.findElement(By.xpath("//div[@class='contactsMail ng-binding']"));
        assertTrue("Address data is not correct", appMailingAddText.getText().contains(zipAddress));
    }

    public static void VerifyPhoneAdmissions(String phone) {
        driver = Hooks.driver;
        WebElement admissionsText = driver.findElement(By.xpath("//div[@class='contactsAdmissions ng-binding']"));
        assertTrue("Phone data is not correct", admissionsText.getText().contains(phone));
    }

    public static void VerifyFaxAdmissions(String fax) {
        driver = Hooks.driver;
        WebElement admissionsText = driver.findElement(By.xpath("//div[@class='contactsAdmissions ng-binding']"));
        assertTrue("Phone data is not correct", admissionsText.getText().contains(fax));
    }

    public static void VerifyFinantialAidNumberAdmissions(String phoneNumber) {
        driver = Hooks.driver;
        WebElement admissionsText = driver.findElement(By.xpath("//div[@class='contactsAdmissions ng-binding']"));
        assertTrue("Phone data is not correct", admissionsText.getText().contains(phoneNumber));
    }

    public static void VerifyEmailAdmissions(String email) {
        driver = Hooks.driver;
        WebElement admissionsText = driver.findElement(By.xpath("//div[@class='contactsAdmissions ng-binding']"));
        assertTrue("Phone data is not correct", admissionsText.getText().contains(email));
    }

    public static void VerifyWebsiteQuickFacts(String webSite) {
        driver = Hooks.driver;
        WebElement admissionsText = driver.findElement(By.xpath("//div[@class='fc-grid ng-pristine ng-untouched " +
                "ng-valid ng-not-empty']/div/div/div/div/div/div[@class='fc-grid__col fc-grid__col--xs-6 summary__" +
                "data']/a[@ng-if='vm.profile.displayUrl']\n"));
        assertTrue("Website data is not correct", admissionsText.getText().equals(webSite));
    }

    public static void VerifySchoolTypeQuickFacts(String schoolType) {
        driver = Hooks.driver;
        WebElement admissionsText = driver.findElement(By.xpath("//div[@class='fc-grid ng-pristine ng-untouched " +
                "ng-valid ng-not-empty']/div/div/div/div/div/div[contains(text(), 'School')]/following::div[1]"));
        assertTrue("School Type data is not correct", admissionsText.getText().equals(schoolType));
    }

    public static void VerifyUndergraduateEnrollmentQuickFacts(String undergraduateEnrollment) {
        driver = Hooks.driver;
        WebElement admissionsText = driver.findElement(By.xpath("//div[@class='fc-grid ng-pristine ng-untouched " +
                "ng-valid ng-not-empty']/div/div/div/div/div/div[contains(text(), " +
                "'Undergraduate')]/following::div[1]"));
        assertTrue("Undergraduate Enrollment data is not correct",
                admissionsText.getText().equals(undergraduateEnrollment));
    }

    public static void VerifyStudentToFacultyRatioQuickFacts(String studentFacultyRatio) {
        driver = Hooks.driver;
        WebElement admissionsText = driver.findElement(By.xpath("//div[@class='fc-grid ng-pristine ng-untouched " +
                "ng-valid ng-not-empty']/div/div/div/div/div/div[contains(text(), 'Student')]/following::div[1]"));
        assertTrue("Student-to-Faculty ratio data is not correct",
                admissionsText.getText().equals(studentFacultyRatio));
    }

    public static void VerifyReligiousAffiliationQuickFacts(String religion) {
        driver = Hooks.driver;
        WebElement admissionsText = driver.findElement(By.xpath("//div[@class='fc-grid ng-pristine ng-untouched " +
                "ng-valid ng-not-empty']/div/div/div/div/div/div[contains(text(), 'Religious')]/following::div[1]"));
        assertTrue("Student-to-Faculty ratio data is not correct",
                admissionsText.getText().equals(religion));
    }

    public static void VerifyCampusSurroundings(String surroundings) {
        driver = Hooks.driver;
        WebElement admissionsText = driver.findElement(By.xpath("//div[@class='fc-grid ng-pristine ng-untouched " +
                "ng-valid ng-not-empty']/div/div/div/div/div/div[contains(text(), 'Campus')]/following::div[1]"));
        assertTrue("Campus Surroundings data is not correct",
                admissionsText.getText().equals(surroundings));
    }

    public static void VerifyDegreesOfferedQuickFacts(String degree) {
        driver = Hooks.driver;
        assertTrue("The degree is not present", driver.findElement(By.xpath("//div[@class='fc-grid__col " +
                "fc-grid__col--xs-6 summary__data']/ul/li[contains(text(), '" + degree + "')]")).isDisplayed());
    }

    public static void VerifyScoreValuesScoreComp(String scoreType, String value) {
        driver = Hooks.driver;
        assertTrue("The Student's " +  scoreType + " is not correct", driver.findElement(By.xpath("//center" +
                "[contains(text(), '" + scoreType + "')]/../div/div[contains(text(), 'You')]" +
                "/span[contains(text(), '" + value + "')]")).isDisplayed());
    }

    public static void VerifyAvgValuesScoreComp(String avgScoreType, String avgValue) {
        driver = Hooks.driver;
        assertTrue("The average " + avgScoreType  + " is not correct", driver.findElement(By.xpath("//center" +
                "[contains(text(), '" + avgScoreType +"')]/../div/div[contains(text(), 'Admitted Average')]/span" +
                "[contains(text(), '" + avgValue + "')]")).isDisplayed());
    }

    public static void VerifyScoreTextScoreComp(String scoreType, String scoreText) {
        driver = Hooks.driver;
        assertTrue("The score text is not correct", driver.findElement(By.xpath("//center[contains(text()" +
                ", '" + scoreType + "')]/../div/div[contains(text(), '" + scoreText + "')]")).isDisplayed());
    }

    public static void VerifyOverallAverageTextScoreComp(String overallAvgText) {
        driver = Hooks.driver;
        boolean isPresent = false;
        WebElement upperText = driver.findElement(By.xpath("//div[@ng-if='vm.diff.overall < vm.good']"));
        WebElement bottomText = driver.findElement(By.xpath("//div[@ng-if='vm.improves.length > 0' and " +
                "@class='fc-grid__row fc-grid__row--xs-center ng-scope']/div/span/font"));
        if(upperText.getText().equals(overallAvgText) || bottomText.getText().equals(overallAvgText)) {
            isPresent = true;
        }
        assertTrue("The Overall Average text is not present", isPresent);
    }

    public static void VerifyQuestionMarkScoreComp(String scoreType) {
        driver = Hooks.driver;
        assertTrue("The score text is not correct", driver.findElement(By.xpath("//center[contains(text(), " +
                "'" + scoreType + "')]/../div/div/div/div[contains(text(), '?')]")).isDisplayed());
    }
}