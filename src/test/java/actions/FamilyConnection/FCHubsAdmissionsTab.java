package actions.FamilyConnection;

import com.gargoylesoftware.htmlunit.ElementNotFoundException;
import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.FamilyConnection.FCHubsAdmissionsTabPage;
import pageObjects.FamilyConnection.FCHubsPage;
import pageObjects.FamilyConnection.FCHubsStudiesTabPage;
import stepDefs.Hooks;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;

/**
 * Created by jorgemaguina on 7/27/2016.
 */
public class FCHubsAdmissionsTab {
    public static WebDriver driver;

    public static void VerifyRegularDeadlineDecision(String decisionDeadline) {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsAdmissionsTabPage.class);
        boolean result = false;
        String month = decisionDeadline.split(" ")[0];
        String day = decisionDeadline.split(" ")[1];

        if(FCHubsAdmissionsTabPage.labelMonthRegDecisionDeadline.getText().equals(month)
                && FCHubsAdmissionsTabPage.labelDayRegDecisionDeadline.getText().equals(day)) {
            result = true;
        }

        assertTrue("The Regular Decision Deadline is incorrect", result);
    }

    public static void VerifyAcceptanceRate(String acceptanceRate) {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsAdmissionsTabPage.class);
        assertTrue("Acceptance Rate is not correct",
                FCHubsAdmissionsTabPage.labelAcceptanceRate.getText().equals(acceptanceRate));
    }

    public static void VerifyApplicationFees(String applicationFees) {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsAdmissionsTabPage.class);
        assertTrue("Application Fees is not correct",
                FCHubsAdmissionsTabPage.labelApplicationFees.getText().equals(applicationFees));
    }

    public static void VerifyImportantPolicies(List<String> importantPolicies) {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsAdmissionsTabPage.class);
        boolean result = true;
        List<WebElement> policyElements = FCHubsAdmissionsTabPage.sectionImportantPolicies.findElements
                (By.tagName("div"));
        for (WebElement policyElement : policyElements) {
            result = importantPolicies.contains(policyElement.getText());
        }
        assertTrue("The displayed Important Policies are not correct", result);
    }

    public static void ClickSectionInAppRequirements(String section) {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsAdmissionsTabPage.class);
        WebElement sectionElement = null;
        new WebDriverWait(Hooks.driver, 20).until(ExpectedConditions.elementToBeClickable(By.cssSelector
                (".fc-button-group.fc-button-group--section-switch")));
        switch (section) {
            case "Freshman": sectionElement = FCHubsAdmissionsTabPage.buttonAppReqFreshman;
                break;
            case "Transfer": sectionElement = FCHubsAdmissionsTabPage.buttonAppReqTransfer;
                break;
            case "International": sectionElement = FCHubsAdmissionsTabPage.buttonAppReqInternational;
                break;
        }
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", sectionElement);
        jse.executeScript("scroll(0, -250);");
        sectionElement.sendKeys(Keys.RETURN);
    }

    public static void VerifyApplicationRequirements(String reqType, List<String> applicationRequirements) {
        driver = Hooks.driver;
        boolean result = false;
        for(int i = 0; i < applicationRequirements.size(); i++) {
            if(driver.findElement(By.cssSelector("div[ng-show=\"vm.activeRequirementList.data." + reqType.toUpperCase()
                    + "\"] li:nth-of-type(" + (i + 1) + ")")).getText().equals(applicationRequirements.get(i))) {
                result = true;
            } else {
                result = false;
                break;
            }
        }
        assertTrue("The " + reqType + " requirements are not correct", result);
    }

    public static void ClickApplicationInformationTab(String tab) {
        driver = Hooks.driver;
        WebElement appInfoTab = null;
        PageFactory.initElements(driver, FCHubsAdmissionsTabPage.class);
        switch (tab) {
            case "Deadlines": appInfoTab = FCHubsAdmissionsTabPage.buttonAppReqDeadlines;
                break;
            case "Important Policies": appInfoTab = FCHubsAdmissionsTabPage.buttonAppReqImportantPolicies;
                break;
            case "Fees": appInfoTab = FCHubsAdmissionsTabPage.buttonAppReqFees;
                break;
        }
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", appInfoTab);
        appInfoTab.sendKeys(Keys.RETURN);
    }

    public static void VerifyDeadline(String deadlineName, String date) {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsAdmissionsTabPage.class);
        List<WebElement> deadlinesList = driver.findElements(By.cssSelector(FCHubsAdmissionsTabPage.listDeadlinesLocator));
        boolean result = false;

        for (int i = 0; i < deadlinesList.size(); i++) {
            WebElement elementText = deadlinesList.get(i).findElement(By.cssSelector("span"));
            if (elementText.getText().equals(deadlineName)) {
                WebElement monthElement = deadlinesList.get(i).findElement(By.cssSelector
                        ("div.hub-deadline__month"));
                WebElement dayElement = deadlinesList.get(i).findElement(By.cssSelector("div " +
                        "div:nth-of-type(2)"));
                if(monthElement.getText().equals(date.split(" ")[0])
                    && dayElement.getText().equals(date.split(" ")[1])) {
                    result = true;
                }
            }
        }

        assertTrue("The deadline is not correct", result);
    }

    public static void verifyRecommendedCourses(List<String> recommendedCoursesList) {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsAdmissionsTabPage.class);
        boolean resultNames = false;
        boolean resultYearsReq = false;
        boolean resultYearsRec = false;
        List<WebElement> courseNamesListUI = driver.findElements(By.cssSelector
                (FCHubsAdmissionsTabPage.courseNamesLocator));
        List<WebElement> yearsRequiredListUI = driver.findElements(By.cssSelector
                (FCHubsAdmissionsTabPage.yearsRequiredLocator));
        List<WebElement> yearsRecommendedListUI = driver.findElements(By.cssSelector
                (FCHubsAdmissionsTabPage.yearsRecommendedLocator));

        List<String> courseNamesListData = new ArrayList<>();
        List<String> yearsRequiredListData = new ArrayList<>();
        List<String> yearsRecommendedListData = new ArrayList<>();

        for (String recommendedCourseElement : recommendedCoursesList) {
            courseNamesListData.add(recommendedCourseElement.split(";")[0]);
            if (recommendedCourseElement.split(";")[1].equals("empty")) {
                yearsRequiredListData.add("");
            } else {
                yearsRequiredListData.add(recommendedCourseElement.split(";")[1]);
            }
            if (recommendedCourseElement.split(";")[2].equals("empty")) {
                yearsRecommendedListData.add("");
            } else {
                yearsRecommendedListData.add(recommendedCourseElement.split(";")[2]);
            }
        }


        for (WebElement courseNameElement : courseNamesListUI) {
            if (courseNamesListData.contains(courseNameElement.getText())) {
                resultNames = true;
            } else {
                resultNames = false;
                break;
            }
        }

        for (WebElement yearsRequiredElement : yearsRequiredListUI) {
            if (yearsRequiredListData.contains(yearsRequiredElement.getText())) {
                resultYearsReq = true;
            } else {
                resultYearsReq = false;
                break;
            }
        }

        for (WebElement yearsRecommendedElement : yearsRecommendedListUI) {
            if (yearsRecommendedListData.contains(yearsRecommendedElement.getText())) {
                resultYearsRec = true;
            } else {
                resultYearsRec = false;
                break;
            }
        }
        assertTrue("The data in Recommended Events is not correct", resultNames && resultYearsReq && resultYearsRec);
    }

    public static void clickRecommendedCoursesHeader(String header) {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsAdmissionsTabPage.class);
        WebElement headerElement = null;
        new WebDriverWait(Hooks.driver, 20).until(ExpectedConditions.elementToBeClickable
                (FCHubsAdmissionsTabPage.linkYearsRecommendedHeader));
        switch (header) {
            case "Course Names" : headerElement = FCHubsAdmissionsTabPage.linkCourseNameHeader;
                break;
            case "Years Required" : headerElement = FCHubsAdmissionsTabPage.linkYearsRequiredHeader;
                break;
            case "Years Recommended" : headerElement = FCHubsAdmissionsTabPage.linkYearsRecommendedHeader;
                break;
        }
        headerElement.sendKeys(Keys.RETURN);
        if (header.equals("Years Recommended")) headerElement.sendKeys(Keys.RETURN);
    }

    public static void verifyDataIsAlphabeticallySorted() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsAdmissionsTabPage.class);
        boolean result = false;
        List<Character> firstLettersList = new ArrayList<>();
        List<WebElement> elementsList = driver.findElements(By.cssSelector(FCHubsAdmissionsTabPage.courseNamesLocator));

        for (WebElement element : elementsList) {
            System.out.println("Control: " + element.getText());
            firstLettersList.add(element.getText().charAt(0));
        }

        for (int i = 0; i < (firstLettersList.size() - 1); i++) {
            if (firstLettersList.get(i + 1) < firstLettersList.get(i)) {
                result = false;
                break;
            } else {
                result = true;
            }
        }

        assertTrue("The course names are not correctly sorted", result);
    }

    public static void verifyYearsDataIsSorted(String dataType) {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsAdmissionsTabPage.class);
        List<Integer> correctedElementList = new ArrayList<>();
        boolean result = false;
        String locator = "";

        switch (dataType) {
            case "years required" : locator = FCHubsAdmissionsTabPage.yearsRequiredLocator;
                break;
            case "years recommended" : locator = FCHubsAdmissionsTabPage.yearsRecommendedLocator;
                break;
        }

        List<WebElement> elementsList = driver.findElements(By.cssSelector(locator));

        for (WebElement element : elementsList) {
            if (element.getText().equals("")) {
                correctedElementList.add(0);
            } else {
                correctedElementList.add(Integer.parseInt(element.getText()));
            }
        }

        for (int i = 0; i < (correctedElementList.size() - 1); i++) {
            System.out.println("Num: " + correctedElementList.get(i));
            if (correctedElementList.get(i + 1) < correctedElementList.get(i)) {
                result = false;
                break;
            } else {
                result = true;
            }
        }

        assertTrue("The data is not correctly sorted", result);
    }

    public static void verifyDropDownOptions(String dropDownIdentifier, List<String> dropDownOptions) {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsAdmissionsTabPage.class);
        boolean result = false;
        String dropDownLocator = "";
        switch (dropDownIdentifier) {
            case "Comparing" : dropDownLocator = FCHubsAdmissionsTabPage.comparingDropDownLocator;
                break;
            case "vs." : dropDownLocator = FCHubsAdmissionsTabPage.vsDropDownLocator;
                break;
        }
        new WebDriverWait(Hooks.driver, 20).until(ExpectedConditions.elementToBeClickable(driver.findElement
                (By.cssSelector(dropDownLocator))));
        Select dropDown = new Select(driver.findElement(By.cssSelector(dropDownLocator)));
        List<WebElement> optionsList = dropDown.getOptions();
        for (WebElement optionUI : optionsList) {
            System.out.println("UI: " + optionUI.getText());
            if (dropDownOptions.contains(optionUI.getText())) {
                result = true;
            } else {
                result = false;
                break;
            }
        }
        assertTrue("The options in the DropDown are not correct", result);
    }

    public static void verifyScattergramsSection(String section) {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsAdmissionsTabPage.class);
        WebElement sectionElement = null;
        switch (section) {
            case "KEY section" : sectionElement =  FCHubsAdmissionsTabPage.keySectionScattergrams;
                break;
            case "description" : sectionElement =  FCHubsAdmissionsTabPage.textBoxDescriptionScattergrams;
                break;
        }
        new WebDriverWait(Hooks.driver, 20).until(ExpectedConditions.elementToBeClickable
                (FCHubsAdmissionsTabPage.keySectionScattergrams));
        assertTrue("The KEY section in Scattergrams is not displayed", sectionElement.isDisplayed());
    }

    public static void clickShowMoreScattergrams() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsAdmissionsTabPage.class);
        new WebDriverWait(Hooks.driver, 20).until(ExpectedConditions.elementToBeClickable
                (FCHubsAdmissionsTabPage.linkShowMoreScattergrams));
        new WebDriverWait(Hooks.driver, 20).until(ExpectedConditions.elementToBeClickable
                (FCHubsAdmissionsTabPage.imageScattergrams));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",
                FCHubsAdmissionsTabPage.keySectionScattergrams);
        FCHubsAdmissionsTabPage.linkShowMoreScattergrams.click();
    }

    public static void verifyExpandedDescriptionScattergrams() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsAdmissionsTabPage.class);
        new WebDriverWait(Hooks.driver, 20).until(ExpectedConditions.elementToBeClickable
                (FCHubsAdmissionsTabPage.textBoxDescriptionScattergramsExpanded));
        assertTrue("The Scattergrams description is not expanded after clicking 'Show more'",
                FCHubsAdmissionsTabPage.textBoxDescriptionScattergramsExpanded.isDisplayed());
    }

    public static void clickShowLessScattergrams() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsAdmissionsTabPage.class);
        new WebDriverWait(Hooks.driver, 20).until(ExpectedConditions.elementToBeClickable
                (FCHubsAdmissionsTabPage.linkShowMoreScattergrams));
        new WebDriverWait(Hooks.driver, 20).until(ExpectedConditions.elementToBeClickable
                (FCHubsAdmissionsTabPage.imageScattergrams));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",
                FCHubsAdmissionsTabPage.keySectionScattergrams);
        FCHubsAdmissionsTabPage.linkShowLessScattergrams.click();
    }

    public static void clickInfoIconScattergrams() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsAdmissionsTabPage.class);
        new WebDriverWait(Hooks.driver, 20).until(ExpectedConditions.elementToBeClickable
                (FCHubsAdmissionsTabPage.linkShowMoreScattergrams));
        FCHubsAdmissionsTabPage.infoIconScattergrams.sendKeys(Keys.RETURN);
    }

    public static void verifyTooltipScattergrams() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsAdmissionsTabPage.class);
        assertTrue("The information tooltip is not displayed",
                FCHubsAdmissionsTabPage.buttonXTooltipScattergrams.isDisplayed());
    }

    public static void clickXTooltipScattergrams() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsAdmissionsTabPage.class);
        new WebDriverWait(Hooks.driver, 20).until(ExpectedConditions.elementToBeClickable
                (FCHubsAdmissionsTabPage.imageScattergrams));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",
                FCHubsAdmissionsTabPage.labelMonthRegDecisionDeadline);
        FCHubsAdmissionsTabPage.buttonXTooltipScattergrams.click();
    }

    public static void verifyScattergramsTooltipClosed() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsAdmissionsTabPage.class);
        boolean result = false;
        try {
            FCHubsAdmissionsTabPage.buttonXTooltipScattergrams.isDisplayed();
        } catch (NoSuchElementException e) {
            result = true;
        }
        assertTrue("The information tooltip is displayed", result);
    }

    public static void verifyImportantPolicies(List<String> policies) {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsAdmissionsTabPage.class);
        boolean result = false;
        List<String> policiesValues = new ArrayList<>();
        List<WebElement> uiList = driver.findElements(By.cssSelector
                (FCHubsAdmissionsTabPage.importantPoliciesListLocator));
        for (String dataElement : policies) {
            policiesValues.add(dataElement.split(";")[1]);
        }

        for (WebElement uiElement : uiList) {
            if (policiesValues.contains(uiElement.getText())) {
                result = true;
            } else {
                result = false;
                break;
            }
        }

        assertTrue("The data in Important Policies is not correct", result);
    }

    public static void verifyFeesAppInfo(String feesType, List<String> feesList) {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsAdmissionsTabPage.class);
        boolean result = false;
        List<String> feesValues = new ArrayList<>();
        String locator = "";
        switch (feesType) {
            case "Freshman" : locator = FCHubsAdmissionsTabPage.freshmanFeesListLocator;
                break;
            case "Transfer" : locator = FCHubsAdmissionsTabPage.transferFeesListLocator;
                break;
            case "International" : locator = FCHubsAdmissionsTabPage.internationalFeesListLocator;
                break;
        }
        for (String feeElement : feesList) {
            feesValues.add(feeElement.split(";")[1]);
        }
        List<WebElement> uiList = driver.findElements(By.cssSelector(locator));
        for (WebElement uiElement : uiList) {
            if (feesValues.contains(uiElement.getText())) {
                result = true;
            } else {
                result = false;
                break;
            }
        }
        assertTrue("The fees for " + feesType + " are not correct", result);
    }

    public static void clickLinkInFees(String linkText) {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsAdmissionsTabPage.class);
        new WebDriverWait(Hooks.driver, 20).until(ExpectedConditions.elementToBeClickable
                (FCHubsAdmissionsTabPage.linkLearnMoreFees));
        if (FCHubsAdmissionsTabPage.linkLearnMoreFees.getText().equals(linkText))
            FCHubsAdmissionsTabPage.linkLearnMoreFees.sendKeys(Keys.RETURN);
        ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs.get(tabs.size() - 1));
    }

    public static void verifyApplicationsFromHS(List<String> applicationsList) {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsAdmissionsTabPage.class);
        boolean resultCurrentYear = false;
        boolean resultPastYear = false;
        WebElement currentUIElement = null;
        WebElement pastUIElement = null;
        List<String> currentYearApplications = new ArrayList<>();
        List<String> currentYearApplicationsValues = new ArrayList<>();
        List<String> pastYearApplications = new ArrayList<>();
        List<String> pastYearApplicationsValues = new ArrayList<>();

        for (String applicationElement : applicationsList) {
            if (applicationElement.split(";")[0].equals("current")) {
                currentYearApplications.add(applicationElement);
                currentYearApplicationsValues.add(applicationElement.split(";")[2]);
            } else if (applicationElement.split(";")[0].equals("past")) {
                pastYearApplications.add(applicationElement);
                pastYearApplicationsValues.add(applicationElement.split(";")[2]);
            }
        }

        for (String currentYearApplicationElement : currentYearApplications) {
            switch (currentYearApplicationElement.split(";")[1]) {
                case "Total Applicants" : currentUIElement = FCHubsAdmissionsTabPage.totalApplicantsCurrentYear;
                    break;
                case "Students Accepted" : currentUIElement = FCHubsAdmissionsTabPage.studentsAcceptedCurrentYear;
                    break;
                case "Students Enrolled" : currentUIElement = FCHubsAdmissionsTabPage.studentsEnrolledCurrentYear;
                    break;
            }
            System.out.println("UI Current: "+ currentUIElement.getText());
            if (currentYearApplicationsValues.contains(currentUIElement.getText().split(" ")[0])) {
                resultCurrentYear = true;
            } else {
                resultCurrentYear = false;
                break;
            }
        }

        for (String pastYearApplicationElement : pastYearApplications) {
            switch (pastYearApplicationElement.split(";")[1]) {
                case "Total Applicants" : pastUIElement = FCHubsAdmissionsTabPage.totalApplicantsPastYear;
                    break;
                case "Students Accepted" : pastUIElement = FCHubsAdmissionsTabPage.studentsAcceptedPastYear;
                    break;
                case "Students Enrolled" : pastUIElement = FCHubsAdmissionsTabPage.studentsEnrolledPastYear;
                    break;
            }
            System.out.println("UI Past: "+ pastUIElement.getText());
            if (pastYearApplicationsValues.contains(pastUIElement.getText().split(" ")[0])) {
                resultPastYear = true;
            } else {
                resultPastYear = false;
                break;
            }
        }
        assertTrue("The applications from the High School are not correct", resultCurrentYear && resultPastYear);
    }

    public static void clickInfoIconAcceptanceRate() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsAdmissionsTabPage.class);
        new WebDriverWait(Hooks.driver, 20).until(ExpectedConditions.elementToBeClickable(FCHubsAdmissionsTabPage
                .infoIconAcceptanceRate));
        FCHubsAdmissionsTabPage.infoIconAcceptanceRate.click();
    }

    public static void verifyInfoToolTipAcceptanceRate() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsAdmissionsTabPage.class);
        assertTrue("The tooltip is not displayed", FCHubsAdmissionsTabPage.buttonXTooltipScattergrams.isDisplayed());
    }

    public static void verifyInfoTooltipAcceptanceRateClosed() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsAdmissionsTabPage.class);
        boolean result = false;
        try {
            FCHubsAdmissionsTabPage.buttonXTooltipScattergrams.isDisplayed();
        } catch (NoSuchElementException e) {
            result = true;
        }
        assertTrue("The tooltip was not closed", result);
    }
}