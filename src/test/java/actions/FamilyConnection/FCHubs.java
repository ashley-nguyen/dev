package actions.FamilyConnection;

import junit.framework.TestCase;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.FamilyConnection.FCCollegesPage;
import pageObjects.FamilyConnection.FCHubsAdmissionsTabPage;
import pageObjects.FamilyConnection.FCHubsCostsTabPage;
import pageObjects.FamilyConnection.FCHubsPage;
import stepDefs.Hooks;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/**
 * Created by jorgemaguina on 5/25/2016.
 */
public class FCHubs {
    public static WebDriver driver;

    public static void VerifyFeedbackRibbon() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsPage.class);
        assertTrue("The Hubs Feedbak Ribbon is not displayed", FCHubsPage.buttonFeedback.isDisplayed());
    }

    public static void ClickFeedbackButton() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsPage.class);
        new WebDriverWait(Hooks.driver, 20).until(ExpectedConditions.elementToBeClickable(FCHubsPage.buttonFeedback));
        FCHubsPage.buttonFeedback.click();
    }

    public static void VerifyFirstTutorialDialog() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsPage.class);
        new WebDriverWait(Hooks.driver, 20).until(ExpectedConditions.elementToBeClickable(FCHubsPage.linkNextFirstDialog));
        assertTrue("The First Tutorial Dialog is not displayed", FCHubsPage.linkNextFirstDialog.isDisplayed());
    }

    public static void ClickNextOnFirstDialog() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsPage.class);
        new WebDriverWait(Hooks.driver, 20).until(ExpectedConditions.elementToBeClickable(FCHubsPage.linkNextFirstDialog));
        FCHubsPage.linkNextFirstDialog.click();
    }

    public static void VerifySecondTutorialDialog() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsPage.class);
        assertTrue("The Second Tutorial Dialog is displayed ", FCHubsPage.labelScattergramsDialog.isDisplayed());
    }
    public static void ClickNextOnSecondDialog() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsPage.class);
        FCHubsPage.linkNextSecondDialog.click();
    }

    public static void VerifyThirdTutorialDialog() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsPage.class);
        assertTrue("The Third Tutorial Dialog is displayed ", FCHubsPage.linkNextThirdDialog.isDisplayed());
    }

    public static void VerifyIdentifierModule() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsPage.class);
        assertTrue("The Identifier Module is not present", FCHubsPage.linkURLIdentifierModule.isDisplayed());
    }

    public static void VerifyLogoInIdentifierModule() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsPage.class);
        new WebDriverWait(Hooks.driver, 20).until(ExpectedConditions.elementToBeClickable(FCHubsPage.imgLogo));
        assertTrue("The logo in the Identifier Module is not present", FCHubsPage.imgLogo.isDisplayed());
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
        new WebDriverWait(Hooks.driver, 20).until(ExpectedConditions.elementToBeClickable(By.cssSelector
                ("html")));
        String currentURL = driver.getCurrentUrl();
        assertTrue("The current URL does not match " + url, currentURL.contains(url));
    }

    public static void ClickApplyOnlineButton() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsPage.class);
        new WebDriverWait(Hooks.driver, 20).until(ExpectedConditions.elementToBeClickable(FCHubsPage.buttonApplyOnline));
        FCHubsPage.buttonApplyOnline.click();
        ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs.get(tabs.size() - 1));
    }

    public static void ClickLearnMoreButton() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsPage.class);
        new WebDriverWait(Hooks.driver, 20).until(ExpectedConditions.elementToBeClickable(FCHubsPage.buttonLearnMore));
        FCHubsPage.buttonLearnMore.click();
    }

    public static void ClickLearnMoreEventsLink(String link) {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsPage.class);
        if (FCHubsPage.linklearnMoreEvents.getText().contains(link)) {
            FCHubsPage.linklearnMoreEvents.click();
        }
        ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs.get(tabs.size() - 1));
    }

    public static void ClickRightArrow(int numberOfTimes) {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsPage.class);
        new WebDriverWait(Hooks.driver, 20).until(ExpectedConditions.elementToBeClickable(FCHubsPage.buttonRightArrow));
        for (int i = 0; i < numberOfTimes; i++) {
            FCHubsPage.buttonRightArrow.click();
        }
    }

    public static void VerifyVisibilityOfLastWebTourElement() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsPage.class);
        assertTrue("Last element of Web Tour is not visible", FCHubsPage.webTourLastImage.isDisplayed());
    }

    public static void VerifyVisibilityOfPlayButton() {
        driver = Hooks.driver;
        assertTrue("Play button in Youtube video is not visible", driver.findElement(By.xpath
                ("//span[@id='webtourElement17']/div/*[name()='svg']")).isDisplayed());
    }

    public static void ClickWebTourElementAtPosition(int elementPosition) {
        driver = Hooks.driver;
        WebElement webTourElement = driver.findElement(By.id("hubsWebtourImage" + elementPosition));
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
            if(driver.findElement(By.id
                    ("webtourViewer")).isDisplayed()) {
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
        PageFactory.initElements(driver, FCHubsPage.class);
        assertTrue("The Navigation Tabs are not displayed", FCHubsPage.navTabs.isDisplayed());
    }

    public static void VerifySchoolNameAppMailingAdd(String schoolName) {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsPage.class);
        assertTrue("The School Name is not correct", FCHubsPage.appMailingAddress.isDisplayed());
    }

    public static void VerifyAttnApplicationsAppMailingAdd() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsPage.class);
        assertTrue("'Attn: Applications' is not displayed", FCHubsPage.appMailingAddress.getText()
                .contains("Attn: Applications"));
    }

    public static void VerifyAddressAppMailingAdd(String address) {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsPage.class);
        assertTrue("Address data is not correct", FCHubsPage.appMailingAddress.getText().contains(address));
    }

    public static void VerifyCityAppMailingAdd(String city) {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsPage.class);
        assertTrue("Address data is not correct", FCHubsPage.appMailingAddress.getText().contains(city));
    }

    public static void VerifyZipAddressAppMailingAdd(String zipAddress) {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsPage.class);
        assertTrue("Address data is not correct", FCHubsPage.appMailingAddress.getText().contains(zipAddress));
    }

    public static void VerifyPhoneAdmissions(String phone) {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsPage.class);
        assertTrue("Phone data is not correct", FCHubsPage.contactInfoAdmissions.getText().contains(phone));
    }

    public static void VerifyFaxAdmissions(String fax) {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsPage.class);
        assertTrue("Fax data is not correct", FCHubsPage.contactInfoAdmissions.getText().contains(fax));
    }

    public static void VerifyFinantialAidNumberAdmissions(String phoneNumber) {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsPage.class);
        assertTrue("Financial Aid number data is not correct", FCHubsPage.contactInfoAdmissions.getText().contains(phoneNumber));
    }

    public static void VerifyEmailAdmissions(String email) {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsPage.class);
        assertTrue("Email data is not correct", FCHubsPage.contactInfoAdmissions.getText().contains(email));
    }

    public static void VerifyWebsiteQuickFacts(String webSite) {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsPage.class);
        assertTrue("Website data is not correct", FCHubsPage.quickFactsWebsite.getText().equals(webSite));
    }

    public static void VerifySchoolTypeQuickFacts(String schoolType) {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsPage.class);
        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(FCHubsPage.quickFactsSchoolType));
        assertTrue("School Type data is not correct", FCHubsPage.quickFactsSchoolType.getText().equals(schoolType));
    }

    public static void VerifyUndergraduateEnrollmentQuickFacts(String undergraduateEnrollment) {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsPage.class);
        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(FCHubsPage.quickFactsUndergradEnroll));
        assertTrue("Undergraduate Enrollment data is not correct",
                FCHubsPage.quickFactsUndergradEnroll.getText().equals(undergraduateEnrollment));
    }

    public static void VerifyStudentToFacultyRatioQuickFacts(String studentFacultyRatio) {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsPage.class);
        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(FCHubsPage.quickFactsStudentFacultyRatio));
        assertTrue("Student-to-Faculty ratio data is not correct",
                FCHubsPage.quickFactsStudentFacultyRatio.getText().equals(studentFacultyRatio));
    }

    public static void VerifyReligiousAffiliationQuickFacts(String religion) {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsPage.class);
        assertTrue("Student-to-Faculty ratio data is not correct",
                FCHubsPage.quickFactsReligion.getText().equals(religion));
    }

    public static void VerifyCampusSurroundings(String surroundings) {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsPage.class);
        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(FCHubsPage.quickFactsCampusSurr));
        assertTrue("Campus Surroundings data is not correct",
                FCHubsPage.quickFactsCampusSurr.getText().equals(surroundings));
    }

    public static void VerifyDegreesOfferedQuickFacts(List<String> degrees) {
        driver = Hooks.driver;
        boolean result = false;
        for (int i = 1; i == degrees.size(); i++) {
            WebElement degreeElement = driver.findElement(By.cssSelector("li.ng-binding.ng-scope:nth-of-type" +
                    "(" + i + ")"));
            if (degreeElement.getText().equals(degrees.get( i - 1))) {
                result = true;
            } else {
                result = false;
                break;
            }
        }
        assertTrue("The displayed degrees are not correct", result);
    }

    public static void VerifyScoreValuesScoreComp(List<String> scoreValueList) {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsPage.class);
        boolean result = true;
        WebElement valueElement = null;
        for (String scoreValueElement : scoreValueList) {
            switch (scoreValueElement.split(";")[0]) {
                case "GPA" : valueElement = FCHubsPage.labelGPAValue;
                    break;
                case "SAT" : valueElement = FCHubsPage.labelSATValue;
                    break;
                case "ACT" : valueElement = FCHubsPage.labelACTValue;
                    break;
            }
            new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(FCHubsPage.labelGPAValue));
            if (scoreValueElement.split(";")[1].equals(valueElement.getText().trim())) {
                result = true;
            } else {
                result = false;
                break;
            }
        }
        assertTrue("The score values are not correct", result);
    }

    public static void VerifyAvgValuesScoreComp(List<String> avgScoreValueList) {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsPage.class);
        boolean result = true;
        WebElement valueElement = null;
        for (String scoreValueElement : avgScoreValueList) {

            switch (scoreValueElement.split(";")[0]) {
                case "GPA" : valueElement = FCHubsPage.labelAvgGPAValue;
                    break;
                case "SAT" : valueElement = FCHubsPage.labelAvgSATValue;
                    break;
                case "ACT" : valueElement = FCHubsPage.labelAvgACTValue;
                    break;
            }
            System.out.println("UI: " + valueElement.getText());
            System.out.println("Data: " + scoreValueElement.split(";")[1]);
            new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(FCHubsPage.labelAvgGPAValue));
            if (valueElement.getText().contains(scoreValueElement.split(";")[1])) {
                result = true;
            } else {
                result = false;
                break;
            }
        }
        assertTrue("The score values are not correct", result);
    }

    public static void verifyScoreTextScoreComp(List<String> scoresList) {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsPage.class);
        boolean result = false;
        boolean resultForEmptyData = false;
        WebElement scoreUIElement = null;

        for (String scoreStringElement : scoresList) {
            switch (scoreStringElement.split(";")[0]) {
                case "GPA" : scoreUIElement = FCHubsPage.labelScoreQualificationGPA;
                    break;
                case "SAT" : scoreUIElement = FCHubsPage.labelScoreQualificationSAT;
                    break;
                case "ACT" : scoreUIElement = FCHubsPage.labelScoreQualificationACT;
                    break;
                case "OVERALL AVERAGE" : scoreUIElement = FCHubsPage.labelScoreQualificationOverallAvg;
                    break;
            }
            new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(scoreUIElement));
            System.out.println("UI: " + scoreUIElement.getText());
            System.out.println("Datos: " + scoreStringElement.split(";")[1]);

            if (scoreStringElement.split(";")[1].equals("empty") && scoreUIElement.getText().equals("")) {
                resultForEmptyData = true;
            } else {
                if (scoreUIElement.getText().equals(scoreStringElement.split(";")[1])) {
                    result = true;
                } else {
                    result = false;
                    break;
                }
            }
        }

        assertTrue("The score qualifications are not correct", result && resultForEmptyData);
    }

    public static void VerifyOverallAverageTextScoreComp(String overallAvgText) {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsPage.class);
        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable
                (FCHubsPage.labelOverallAvgConclusionText));
        assertTrue("The Overall Average text is not present", FCHubsPage.labelOverallAvgConclusionText.getText().equals
                (overallAvgText));
    }

    public static void VerifyQuestionMarkScoreComp(String scoreType) {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsPage.class);
        WebElement dialOrQuestionElement = null;
        switch (scoreType) {
            case "ACT" : dialOrQuestionElement = FCHubsPage.labelACTQuestionMark;
                break;
            case "SAT" : dialOrQuestionElement = FCHubsPage.labelSATQuestionMark;
                break;
        }
        assertTrue("The score text is not correct", dialOrQuestionElement.isDisplayed());
    }

    public static void VerifyAvgTotalCostInfoTopBar(List<String> incomeList) {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsPage.class);
        boolean result = false;
        Select incomeDropDown = new Select(driver.findElement(By.cssSelector(FCHubsPage.incomeDropDownLocator)));
        for (String incomeElement : incomeList) {
            incomeDropDown.selectByVisibleText(incomeElement.split(";")[0]);
            result = incomeElement.split(";")[1]
                    .equals(FCHubsPage.labelAvgNetPrice.getText());
        }
        assertTrue("The Average Total Cost is not correct", result);
    }

    public static void VerifyGraduationRateInfoTopBar(String graduationRate) {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsPage.class);
        assertTrue("The Graduation Rate is not correct", FCHubsPage.labelGradRate.getText().equals(graduationRate));
    }

    public static void VerifyAcceptanceRateInfoTopBar(String acceptanceRate) {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsPage.class);
        assertTrue("The Acceptance Rate is not correct", FCHubsPage.labelAcceptanceRate.getText().equals(acceptanceRate));
    }

    public static void VerifyPriorityDateInfoTopBar(String month, String priorityDate) {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsPage.class);
        boolean monthAssertion = FCHubsPage.labelOverviewTabDeadlineMonth.getText().equals(month);
        boolean dayAssertion = FCHubsPage.labelOverviewTabDeadlineDay.getText().equals(priorityDate);
        assertTrue("The Priority date is not correct", (monthAssertion && dayAssertion));
    }

    public static void VerifyEmailInFieldContactForm(String email) {
        driver = Hooks.driver;
        WebElement iframe = driver.findElement(By.xpath("//iframe"));
        driver.switchTo().frame(iframe);
        WebElement emailField = driver.findElement(By.xpath("//input[@id='email']"));
        assertTrue("The email in the Email Field is not correct", emailField.getAttribute("value").equals(email));
    }

    public static void VerifyPhoneInFieldContactForm(String phoneNumber) {
        driver = Hooks.driver;
        WebElement iframe = driver.findElement(By.xpath("//iframe"));
        driver.switchTo().frame(iframe);
        WebElement phoneField = driver.findElement(By.xpath("//input[@id='phone']"));
        assertTrue("The phone number in the Phone Field is not correct",
                phoneField.getAttribute("value").equals(phoneNumber));
    }

    public static void VerifyUserCanEnterMessageContactForm(String testMessage) {
        driver = Hooks.driver;
        WebElement iframe = driver.findElement(By.xpath("//iframe"));
        driver.switchTo().frame(iframe);
        PageFactory.initElements(driver, FCHubsPage.class);
        FCHubsPage.textBoxMessageField.sendKeys(testMessage);
        assertTrue("The user cannot enter content in the Message Field",
                FCHubsPage.textBoxMessageField.getText().equals(testMessage));
    }

    public static void enterSubjectContactForm(String subject) {
        driver = Hooks.driver;
        WebElement iframe = driver.findElement(By.xpath("//iframe"));
        driver.switchTo().frame(iframe);
        PageFactory.initElements(driver, FCHubsPage.class);
        FCHubsPage.textBoxSubjectField.sendKeys(subject);
        driver.switchTo().defaultContent();
    }

    public static void enterMessageContactForm(String message) {
        driver = Hooks.driver;
        WebElement iframe = driver.findElement(By.xpath("//iframe"));
        driver.switchTo().frame(iframe);
        PageFactory.initElements(driver, FCHubsPage.class);
        FCHubsPage.textBoxMessageField.sendKeys(message);
        driver.switchTo().defaultContent();
    }

    public static void ClickSendMessageContactForm() {
        driver = Hooks.driver;
        WebElement iframe = driver.findElement(By.xpath("//iframe"));
        driver.switchTo().frame(iframe);
        PageFactory.initElements(driver, FCHubsPage.class);
        FCHubsPage.buttonSendMail.click();
        driver.switchTo().defaultContent();
    }

    public static void VerifyConfirmationMessageContactForm(String confirmationMessage) {
        driver = Hooks.driver;
        WebElement iframe = driver.findElement(By.xpath("//iframe"));
        driver.switchTo().frame(iframe);
        assertTrue("The confirmation message is not correct", driver.findElement(By.xpath("//div[@class=" +
                "'hubsV3EmailInfo hubsV3EmailError'][contains(text(), '" + confirmationMessage + "')]")).isDisplayed());
    }

    public static void ClearFieldContactForm(String fieldType) {
        driver = Hooks.driver;
        WebElement iframe = driver.findElement(By.xpath("//iframe"));
        driver.switchTo().frame(iframe);
        PageFactory.initElements(driver, FCHubsPage.class);
        if(fieldType.equals("email")) {
            FCHubsPage.textBoxEmail.clear();
        } else if(fieldType.equals("phone")) {
            FCHubsPage.textBoxPhone.clear();
        }
        driver.switchTo().defaultContent();
    }

    public static void ClickXInFirstTutorialDialog() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsPage.class);
        FCHubsPage.buttonXOnFirstTutorial.click();

    }

    public static void VerifyFirstTutorialDialogClosed() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsPage.class);
        try{
            if(FCHubsPage.buttonXOnFirstTutorial.isDisplayed()) {
                assertTrue(false);
            }
        } catch(NoSuchElementException e) {
            assertTrue(true);
        } catch(Exception f) {
            f.printStackTrace();
        }

    }

    public static void ClickXInSecondTutorialDialog() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsPage.class);
        FCHubsPage.buttonXOnSecondTutorial.click();
    }

    public static void VerifySecondTutorialDialogClosed(){
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsPage.class);
        try {
            if (FCHubsPage.buttonXOnSecondTutorial.isDisplayed())
            {
                assertTrue((false));
            }
        } catch(NoSuchElementException e)
        {assertTrue(true);
        } catch(Exception f)
        {
            f.printStackTrace();
        }
    }
    public static void ClickStudiesTab() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsPage.class);
        FCHubsPage.tabStudies.click();
        }

    public static void ClickAdmissionsTab() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsPage.class);
        FCHubsPage.tabAdmissions.click();
    }

    public static void ClickStudentLifeTab() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsPage.class);
        FCHubsPage.tabStudentLife.click();
    }

    public static void VerifyActiveTab(String tabName) {
        String cssSelectorString = "";
        driver = Hooks.driver;
        switch(tabName) {
            case "Overview": cssSelectorString = "1";
                break;
            case "Studies": cssSelectorString = "2";
                break;
            case "Student Life": cssSelectorString = "3";
                break;
            case "Admissions": cssSelectorString = "4";
                break;
            case "Costs": cssSelectorString = "5";
                break;
            case "Profiles": cssSelectorString = "6";
                break;
        }
        WebElement tabElement = driver.findElement(By.cssSelector(".tabs.hubs-top-tabs-bar span:nth-child(" +
                cssSelectorString + ")"));

        assertTrue("The tab " + tabName + " is not active", tabElement.getAttribute("class").contains("active"));
    }

    public static void ClickLinkInOverviewInfoTopBar(String linkText) {
        driver = Hooks.driver;

        String cssSelectorPart = "";
        switch (linkText) {
            case "More about Cost & Aid": cssSelectorPart = "costs-link a";
                break;
            case "More about Learning Environment": cssSelectorPart = "studies-tab-link a";
                break;
            case "Check out Scattergrams to see how this relates to you": cssSelectorPart = "admissions-tab-link " +
                    "a:not(.ng-hide)";
                break;
            case "See all deadlines": cssSelectorPart = "deadline-link a";
                break;
        }
        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.cssSelector
                (".hub-data-pod__subtext.admissions-" + cssSelectorPart)));
        driver.findElement(By.cssSelector(".hub-data-pod__subtext.admissions-" + cssSelectorPart)).click();
    }

    public static void VerifySectionLabelInCosts(String sectionLabel) {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsCostsTabPage.class);
        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(FCHubsCostsTabPage.costModuleLabel));
        assertTrue("The section " + sectionLabel + " is not displayed",
                FCHubsCostsTabPage.costModuleLabel.getText().equals(sectionLabel));
    }

    public static void VerifySectionLabelInAdmissions(String sectionLabel) {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsAdmissionsTabPage.class);
        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable
                (FCHubsAdmissionsTabPage.buttonAppReqDeadlines));
        assertTrue("The section " + sectionLabel + " is not displayed",
                FCHubsAdmissionsTabPage.buttonAppReqDeadlines.isDisplayed());
    }

    public static void VerifyDateLabelsInOverviewTopBar(String text) {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsPage.class);
        boolean result = false;
        if(FCHubsPage.labelDateAvgNetPrice.getText().equals(text) &&
                FCHubsPage.labelDateGradRate.getText().equals(text) &&
                FCHubsPage.labelDateAccepRate.getText().equals(text)) {
            result = true;
        }
        assertTrue("The date label is not present or it displays incorrect data", result);
    }

    public static void ClickCostsTab() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsPage.class);
        FCHubsPage.tabCosts.click();
    }

    public static void ClickProfilesTab() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsPage.class);
        FCHubsPage.tabProfiles.click();
    }

    public static void ClickCommunicate() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsPage.class);
        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(FCHubsPage.buttonApplyOnline));
        FCHubsPage.buttonCommunicate.click();
    }

    public static void Requestinformationlink(String link) {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsPage.class);
        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(FCHubsPage.buttonRequestInfo));
        FCHubsPage.buttonRequestInfo.click();
        ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs.get(tabs.size() - 1));
    }

    public static void VerifySendAMessageTextOnDialogBox( String text) {
        driver = Hooks.driver;
        WebElement SendMessageText = driver.findElement(By.xpath("//div[@class='contactsAdmissions ng-binding']"));
        assertTrue("Phone data is not correct", SendMessageText.getText().contains(text));

    }

    public static void VerifyOverlapsNumber(String jsonText) {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsPage.class);
        JSONArray overlapsJson = null;
        try {
            overlapsJson = new JSONArray(jsonText);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        assertTrue("The number in Overlaps does not equal the number of elements in the json overlaps list",
                overlapsJson.length() == Integer.parseInt(FCHubsPage.labelOverlapsNumber.getText()));
    }

    public static void clickLearnMoreOverlaps() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsPage.class);
        FCHubsPage.buttonOverlapsLearnMore.click();
    }

    public static void verifyJsonContainsColleges(String jsonText) {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsPage.class);
        List<String> overlapsNames = new ArrayList<>();
        List<String> overlapsLegacyList = new ArrayList<>();
        JSONArray jsonArrayElement = null;
        boolean result = false;
        ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs.get(tabs.size() - 1));
        try {
            jsonArrayElement = new JSONArray(jsonText);
            for (int i = 0; i < jsonArrayElement.length(); i++) {
                JSONObject jsonObjectElement = jsonArrayElement.getJSONObject(i);
                overlapsLegacyList.add(jsonObjectElement.getString("name"));
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }

        List<WebElement> overlapsLegacyListUI = driver.findElements(By.cssSelector(".standard td a"));
        for (int i = 0; i < overlapsLegacyListUI.size(); i++) {
            overlapsNames.add(overlapsLegacyListUI.get(i).getText());
        }

        for (String overlapElement : overlapsNames) {
            overlapElement = overlapElement.replace("State", "");
            overlapElement = overlapElement.replace(" ", "");
            overlapElement = overlapElement.replace("U", "");
            overlapElement = overlapElement.replace("Coll", "");
            overlapElement = overlapElement.replace("of", "");
            overlapElement = overlapElement.replace("Ag", "");
            overlapElement = overlapElement.replace("CC", "");
            overlapElement = overlapElement.trim();
        }

        for (int j = 0; j < overlapsNames.size(); j++) {
            for (int k = 0; k < overlapsLegacyList.size(); k++) {
                if (overlapsLegacyList.get(j).contains(overlapsLegacyList.get(j))) {
                    result = true;
                } else {
                    result = false;
                    break;
                }
            }
        }
        assertTrue("The legacy overlaps list does not correspond to the json data", result);
    }


    public static void clickRecommendedEvents() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsPage.class);
        FCHubsPage.buttonRecommendedEvents.click();
    }
  
    public static void clickWhiteHeartThinkingAboutList() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsPage.class);
        FCHubsPage.buttonAddToCollegesImThinkingAbout.click();
    }

    public static void verifyHeartStatusClicked() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsPage.class);
        boolean result = false;
        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable
                (FCHubsPage.buttonAddToCollegesImThinkingAboutFull));
        if (FCHubsPage.buttonAddToCollegesImThinkingAboutFull.isDisplayed()) {
            result = true;
        }
        assertTrue("The heart was not clicked", result);
    }

    public static void verifyCollegeAddedtoImThinkingAboutList(String college) {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsPage.class);
        boolean result = false;
        driver.get(FCHubsPage.URLimThinkingAboutList);
        List<WebElement> imThinkingAboutListElements = driver.findElements(By.cssSelector(".less-pad.standard.striped " +
                "td:nth-of-type(2)"));
        for (WebElement collegeInList : imThinkingAboutListElements) {
            if (collegeInList.getText().contains(college)) {
                result = true;
            }
        }
        assertTrue("College was not added to the I'm thinking about list", result);
    }

    public static void clickPinkHeartThinkingAboutList() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsPage.class);
        FCHubsPage.imgLogo.click();
        new WebDriverWait(Hooks.driver, 20).until(ExpectedConditions.elementToBeClickable
                (FCHubsPage.tabCollegesTopBar));
        FCHubsPage.buttonAddToCollegesImThinkingAbout.click();
        new WebDriverWait(Hooks.driver, 20).until(ExpectedConditions.elementToBeClickable
                (FCHubsPage.buttonAddToCollegesImThinkingAboutPinkBar));
    }

    public static void verifyCollegeIsNotInImThinkingAboutList(String college) {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsPage.class);
        PageFactory.initElements(driver, FCCollegesPage.class);
        boolean result = false;
        if(driver.getCurrentUrl().contains("https://static.naviance.com")) {
            FCHubsPage.buttonImThinkingAboutStickybar.click();
        }
        List<WebElement> imThinkingAboutListElements = driver.findElements
                (By.cssSelector(FCCollegesPage.imThinkingAboutListElementsString));
        for (WebElement collegeInList : imThinkingAboutListElements) {
            if (collegeInList.getText().contains(college)) {
                System.out.println("Valor: " + collegeInList.getText());
                result = false;
                break;
            } else {
                result = true;
            }
        }
        assertTrue("College is in the I'm thinking about list", result);
    }

    public static void hoverOverWhiteHeart() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsPage.class);
        new WebDriverWait(Hooks.driver, 20).until(ExpectedConditions.elementToBeClickable(FCHubsPage.linkNextFirstDialog));
        FCHubsPage.linkNextFirstDialog.click();
        if (FCHubsPage.buttonAddToCollegesImThinkingAbout.getAttribute("class").equals("fc-icon")) {
            Actions action  = new Actions(driver);
            action.moveToElement(FCHubsPage.buttonAddToCollegesImThinkingAbout).perform();
        }
    }

    public static void verifyHeartTooltip(String heartTooltipText) {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsPage.class);
        boolean result = false;
        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable
                (FCHubsPage.tooltipHeartIcon));
        if (FCHubsPage.tooltipHeartIcon.getText().equals(heartTooltipText)) {
            result = true;
        }
        assertTrue("The tooltip from the Heart Icon is not displayed", result);
    }

    public static void hoverOverPinkHeart() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsPage.class);
        new WebDriverWait(Hooks.driver, 20).until(ExpectedConditions.elementToBeClickable
                (FCHubsPage.linkNextFirstDialog));
        FCHubsPage.linkNextFirstDialog.click();
        FCHubsPage.buttonAddToCollegesImThinkingAboutPinkBar.click();
        new WebDriverWait(Hooks.driver, 20).until(ExpectedConditions.elementToBeClickable
                (FCHubsPage.buttonAddToCollegesImThinkingAboutFull));
        Actions action  = new Actions(driver);
        action.moveToElement(FCHubsPage.buttonAddToCollegesImThinkingAbout).perform();
    }

    public static void clickRegisterInCollegeVisit(String position) {
        driver = Hooks.driver;
        WebElement registerButton = driver.findElement(By.cssSelector("tbody tr:nth-of-type(" + position + ") td span"));
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", registerButton);
        jse.executeScript("scroll(0, 500);");
        new WebDriverWait(Hooks.driver, 20).until(ExpectedConditions.textToBePresentInElementLocated(By.cssSelector
                ("tbody tr:nth-of-type(" + position + ") td span"), "Register"));
        registerButton.sendKeys(Keys.RETURN);
    }

    public static void clickDetailsInCollegeVisit(String position) {
        driver = Hooks.driver;
        WebElement registerButton = driver.findElement(By.cssSelector("tbody tr:nth-of-type(" + position + ") td a"));
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", registerButton);
        jse.executeScript("scroll(0, 500);");
        registerButton.sendKeys(Keys.RETURN);
    }

    public static void clickCompareMeWithAllAcceptedApplicants() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsPage.class);
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",
                FCHubsPage.labelCompareMeSectionNotes);
        new WebDriverWait(Hooks.driver, 20).until(ExpectedConditions.elementToBeClickable
                (FCHubsPage.labelOtherStudentsFromHS));
        FCHubsPage.buttonCompareMeWithAllAcceptedApplicants.click();
    }

    public static void verifyComparisonAgainstAllStudents() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsPage.class);
        assertTrue("Compare me section was not switched to compare against all students",
                FCHubsPage.labelAllStudents.isDisplayed());
    }

    public static void verifyComparisonAgainstOtherStudentsFromHS() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsPage.class);
        assertTrue("Compare me section was not switched to compare against all students",
                FCHubsPage.labelOtherStudentsFromHS.isDisplayed());
    }

    public static void clickCompareMeWithStudentsFromMyHS() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsPage.class);
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",
                FCHubsPage.labelCompareMeSectionNotes);
        new WebDriverWait(Hooks.driver, 20).until(ExpectedConditions.elementToBeClickable
                (FCHubsPage.labelAllStudents));
        FCHubsPage.buttonCompareMeWithAllAcceptedApplicants.click();
    }

    public static void verifyCounselorComments() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsPage.class);
        new WebDriverWait(Hooks.driver, 20).until(ExpectedConditions.elementToBeClickable
                (FCHubsPage.labelCounselorCommentsTitle));
        assertTrue("The Counselor Comments are not displayed", FCHubsPage.labelCounselorCommentsTitle.isDisplayed());
    }

    public static void verifyCollegeVisitConfirmationMessage() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsPage.class);
        TestCase.assertTrue("The confirmation message is not displayed",
                FCHubsPage.visitRegistrationSuccessMsg.isDisplayed());
    }

    public static void clickRemoveFromList(String position) {
        driver = Hooks.driver;
        WebElement registerButton = driver.findElement(By.cssSelector("tbody tr:nth-of-type(" + position + ") td span"));
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", registerButton);
        jse.executeScript("scroll(0, 500);");
        new WebDriverWait(Hooks.driver, 20).until(ExpectedConditions.textToBePresentInElementLocated(By.cssSelector
                ("tbody tr:nth-of-type(" + position + ") td span"), "Cancel"));
        if(registerButton.getText().equals("Cancel")) {
            registerButton.sendKeys(Keys.RETURN);
        }
    }

    public static void verifyCollegeVisitCancellationMessage() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsPage.class);
        new WebDriverWait(Hooks.driver, 20).until(ExpectedConditions.elementToBeClickable
                (FCHubsPage.visitRegistrationCancelMsg));
        assertTrue("The cacncellation message is not displayed", FCHubsPage.visitRegistrationCancelMsg.isDisplayed());
    }

    public static void clickImThinkingAboutStickyBar() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsPage.class);
        new WebDriverWait(Hooks.driver, 20).until(ExpectedConditions.elementToBeClickable
                (FCHubsPage.buttonImThinkingAboutStickybar));
        FCHubsPage.buttonImThinkingAboutStickybar.click();
    }

    public static void verifyRegisterButtonNotPresent() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsPage.class);
        boolean result;
        try {
            FCHubsPage.firstCollegeVisitsRegisterButton.isDisplayed();
            result = false;
        } catch (NoSuchElementException e) {
            result = true;
        }
        assertTrue("The Register button is displayed", result);
    }

    public static void clickAddToCollegesThinkingAboutPinkButton() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsPage.class);
        FCHubsPage.buttonAddToCollegesImThinkingAboutPinkBar.click();
        new WebDriverWait(Hooks.driver, 20).until(ExpectedConditions.invisibilityOfElementLocated(
                By.cssSelector("a[ng-click=\"vm.addToList()\"]")));
    }
}
