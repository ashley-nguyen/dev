package actions.FamilyConnection;

import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.FamilyConnection.FCHubsStudentLifeTabPage;
import stepDefs.Hooks;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;

/**
 * Created by jorgemaguina on 8/01/2016.
 */
public class FCHubsStudentLifeTab {
    public static WebDriver driver;

    public static void VerifySchoolSize(String schoolSize) {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsStudentLifeTabPage.class);
        assertTrue("The School Size is not correct",
                FCHubsStudentLifeTabPage.labelSchoolSizeOverview.getText().equals(schoolSize));
    }

    public static void VerifySchoolSizeDetail(String sectionName, String number) {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsStudentLifeTabPage.class);
        String sectionNumber = "";
        switch(sectionName) {
            case "Undergraduate Students": sectionNumber = "3";
                break;
            case "Graduate Students": sectionNumber = "4";
                break;
            case "Total Students": sectionNumber = "5";
                break;
        }
        WebElement section = driver.findElement(By.cssSelector("div[ng-if=\"vm.getSchoolSize()\"] div:nth-child(" +
                sectionNumber + ")"));
        assertTrue("The " + sectionName + " number is incorrect", section.getText().contains(number));
    }

    public static void VerifyStudentLifeTopBarValues(String sectionName, String value) {
        driver = Hooks.driver;
        WebElement sectionElement = null;
        PageFactory.initElements(driver, FCHubsStudentLifeTabPage.class);
        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.id("js-fc-user-nav__student-name")));
        switch (sectionName) {
            case "SCHOOL SIZE" : sectionElement = FCHubsStudentLifeTabPage.labelSchoolSizeOverview;
                break;
            case "NEAREST CITY" : sectionElement = FCHubsStudentLifeTabPage.labelNearestCity;
                break;
            case "DISTANCE FROM YOUR HIGH SCHOOL" :
                sectionElement = FCHubsStudentLifeTabPage.labelDistanceFromYourHighSchool;
                break;
            case "PERCENT OF STUDENTS LIVING ON CAMPUS" :
                sectionElement = FCHubsStudentLifeTabPage.labelPercentOfStudentsLivingOnCampus;
                break;
        }
        assertTrue("The " + sectionName + " value is incorrect", sectionElement.getText().equals(value));
    }

    public static void VerifyTotalStudentsEthnicityData(String totalStudents) {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsStudentLifeTabPage.class);
        assertTrue("The Total Students number in Ethnicity Data is incorrect",
                FCHubsStudentLifeTabPage.labelTotalStudentsEthnicityData.getText().equals(totalStudents));
    }

    public static void VerifyEthnicGroupPercentage(List<String> ethnicGroupsPercent) {
        driver = Hooks.driver;
        boolean result = false;

        for(int i = 0; i < ethnicGroupsPercent.size(); i++) {
            String[] percentElement = ethnicGroupsPercent.get(i).split(",");
            WebElement uiElement = driver.findElement(By.cssSelector(".fc-grid__col--xs-12.fc-grid__col--lg-6." +
                    "student-body-legend div:nth-of-type(" + (i + 1) + ") div.student-body-legend__key-stats.ng-binding"));
            if(uiElement.getText().trim().equals(percentElement[1].trim())) {
                result = true;
            } else {
                result = false;
                break;
            }
        }

        assertTrue("The percent for Ethnic Groups is not correct", result);
    }

    public static void VerifyTotalStudentsGenderData(String totalStudentsGender) {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsStudentLifeTabPage.class);
        assertTrue("The Total Students number in Gender Data is incorrect",
                FCHubsStudentLifeTabPage.labelTotalStudentsGenderData.getText().equals(totalStudentsGender));
    }

    public static void VerifyGenderPercentage(List<String> genderPercentageList) {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsStudentLifeTabPage.class);
        boolean result = false;
        WebElement genderPercent = null;
        for (String genderPercentageElement : genderPercentageList){
            switch (genderPercentageElement.split(";")[0]) {
                case "Female" : genderPercent = FCHubsStudentLifeTabPage.labelGenderDataPercentFemale;
                    break;
                case "Male" : genderPercent = FCHubsStudentLifeTabPage.labelGenderDataPercentMale;
                    break;
            }
            result = genderPercentageElement.split(";")[1].equals(genderPercent.getText());
        }

        assertTrue("The percent for the genders is not correct", result);
    }

    public static void VerifyTotalStudentsAge(String totalStudentsAge) {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsStudentLifeTabPage.class);
        assertTrue("The Total Students number in Age is incorrect",
                FCHubsStudentLifeTabPage.labelTotalStudentsAgeData.getText().equals(totalStudentsAge));
    }

    public static void VerifyAgePercentage(List<String> agePercentageList) {
        driver = Hooks.driver;
        WebElement agePercent = null;
        boolean result = false;
        PageFactory.initElements(driver, FCHubsStudentLifeTabPage.class);
        for (String agePercentElement : agePercentageList) {
            switch (agePercentElement.split(";")[0]) {
                case "Under 24" : agePercent = FCHubsStudentLifeTabPage.labelAgeDataUnder24;
                    break;
                case "Over 24" : agePercent = FCHubsStudentLifeTabPage.labelAgeDataOver24;
                    break;
            }
            result = agePercentElement.split(";")[1].equals(agePercent.getText());
        }

        assertTrue("The percent for the age groups is not correct", result);
    }
    public static void ClickSectionInStudentOrgServ(String sectionName) {
        driver = Hooks.driver;
        WebElement sectionElement = null;
        PageFactory.initElements(driver, FCHubsStudentLifeTabPage.class);
        switch (sectionName) {
            case "Organizations" : sectionElement = FCHubsStudentLifeTabPage.buttonOrgAndServOrganizations;
                break;
            case "Athletics" : sectionElement = FCHubsStudentLifeTabPage.buttonOrgAndServAthletics;
                break;
            case "Greek Life" : sectionElement = FCHubsStudentLifeTabPage.buttonOrgAndServGreekLife;
                break;
            case "Services" : sectionElement = FCHubsStudentLifeTabPage.buttonOrgAndServServices;
                break;
            case "Computing Resources" : sectionElement = FCHubsStudentLifeTabPage.buttonOrgAndServCompResources;
                break;
        }
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement
                (By.cssSelector(".student-life-housing-information__data.fc-grid__col.fc-grid__col--xs-12" +
                        ".fc-grid__col--sm-7.fc-grid__col--md-6")));
        sectionElement.click();
    }

    public static void VerifyStudentOrganizations(List<String> studentOrgs) {
        driver = Hooks.driver;
        boolean result = false;
        WebElement uiStudentOrgs = driver.findElement(By.cssSelector(".fc-grid__row.fc-grid__row--xs-start" +
                ".student-life__organizations"));
        List<WebElement> elementList = uiStudentOrgs.findElements(By.cssSelector("div:not(.ng-hide)"));
        for(int i = 0; i < studentOrgs.size(); i++) {
            if(elementList.get(i).getText().equals(studentOrgs.get(i))) {
                result = true;
            } else {
                result = false;
                break;
            }
        }
        assertTrue("The Student Organizations are incorrect", result);
    }

    public static void ClickSectionInAthletics(String sectionName) {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsStudentLifeTabPage.class);
        WebElement sectionElement = null;
        switch (sectionName) {
            case "Men" : sectionElement = FCHubsStudentLifeTabPage.buttonAthleticsMen;
                break;
            case "Women" : sectionElement = FCHubsStudentLifeTabPage.buttonAthleticsWomen;
                break;
            case "Co-Ed" : sectionElement = FCHubsStudentLifeTabPage.buttonAthleticsCoEd;
                break;
        }
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement
                (By.cssSelector(".student-life-housing-information__data.fc-grid__col.fc-grid__col--xs-12" +
                        ".fc-grid__col--sm-7.fc-grid__col--md-6")));
        sectionElement.click();
    }

    public static void VerifySportsInAthletics(String gender, List<String> sports) {
        driver = Hooks.driver;
        boolean result = false;
        for(int i = 0; i < sports.size(); i++) {
            String[] sportElement = sports.get(i).split(",");
            for(int j = 0; j < sportElement.length; j++) {
                if(sportElement[j].equals("empty")) {
                    WebElement emptyElement;
                    try{
                        emptyElement = driver.findElement(By.xpath("//tbody[@class = 'ng-scope']/tr/td" +
                                "[contains(text(), '" + sportElement[0] + "')]/../td/span[not(@ng-class)]" +
                                "[not(normalize-space())]"));
                    } catch (NoSuchElementException e) {
                        emptyElement = driver.findElement(By.xpath("//tbody[@class = 'ng-scope']/tr/td" +
                                "[contains(text(), '" + sportElement[0] + "')]/../td/span[not(@ng-class)]"));
                    }
                    if(emptyElement.isDisplayed()) {
                        result = true;
                    }


                } else if(j == 0) {
                    result = driver.findElement(By.xpath("//tbody[@class = 'ng-scope']/tr/td" +
                            "[contains(text(), '" + sportElement[j] + "')]")).isDisplayed();
                } else if(driver.findElement(By.xpath("//tbody[@class = 'ng-scope']/tr/td" +
                        "[contains(text(), '" + sportElement[0] + "')]/../td/span" +
                        "[contains(text(), '" + sportElement[j] + "')]")).isDisplayed()){
                    result = true;
                }
            }
        }
        assertTrue("The sport element is not correct", result);
    }

    public static void VerifyHousingInformation(String hiLabel, String hiValue) {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsStudentLifeTabPage.class);
        WebElement housingInfoElement = null;
        switch (hiLabel) {
            case "Capacity" : housingInfoElement = FCHubsStudentLifeTabPage.labelHousingInfoCapacityValue;
                break;
            case "Percent" : housingInfoElement = FCHubsStudentLifeTabPage.labelHousingInfoPercentOnCampusValue;
                break;
            case "Freshmen" : housingInfoElement = FCHubsStudentLifeTabPage.labelHousingInfoFreshmenOnCampusValue;
                break;
            case "Sophomores" : housingInfoElement = FCHubsStudentLifeTabPage.labelHousingInfoSophomoresOnCampusValue;
                break;
            case "Juniors" : housingInfoElement = FCHubsStudentLifeTabPage.labelHousingInfoJuniorsOnCampusValue;
                break;
            case "Seniors" : housingInfoElement = FCHubsStudentLifeTabPage.labelHousingInfoSeniorsOnCampusValue;
                break;
        }
        assertTrue("The Housing Information Value for" + hiLabel + "is not correct", housingInfoElement.getText().equals(hiValue));
    }

    public static void VerifyHousingInformationLabel() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsStudentLifeTabPage.class);
        assertTrue("The Housing Information section is displayed",
                FCHubsStudentLifeTabPage.labelHousingInformation.isDisplayed());
    }
}
