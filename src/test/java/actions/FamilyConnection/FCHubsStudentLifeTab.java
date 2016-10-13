package actions.FamilyConnection;

import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
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
        WebElement section = driver.findElement(By.xpath("//span[contains(text(), '" + sectionName + "')]" +
                "/../../div[contains(text(), '" + value + "')]"));
        assertTrue("The " + sectionName + " value is incorrect", section.getText().equals(value));
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
            System.out.println("UI " + percentElement[1]);
            System.out.println("Lista " + uiElement.getText());
            if(uiElement.getText().trim().equals(percentElement[1].trim())) {
                result = true;
            } else {
                result = false;
                System.out.println("UI " + percentElement[1]);
                System.out.println("Lista " + uiElement.getText());
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

    public static void VerifyGenderPercentage(String gender, String value) {
        driver = Hooks.driver;
        WebElement genderPercent = driver.findElement(By.xpath("//div[contains(text(), 'Gender Data')]" +
                "/../../div/div/div/div[contains(text(), '" + gender + "')]/following-sibling::div"));
        assertTrue("The percent for " + gender + " is not correct", genderPercent.getText().equals(value));
    }

    public static void VerifyTotalStudentsAge(String totalStudentsAge) {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsStudentLifeTabPage.class);
        assertTrue("The Total Students number in Age is incorrect",
                FCHubsStudentLifeTabPage.labelTotalStudentsAgeData.getText().equals(totalStudentsAge));
    }

    public static void VerifyAgePercentage(String ageGroup, String value) {
        driver = Hooks.driver;
        WebElement agePercent = driver.findElement(By.xpath("//div[contains(text(), 'Age')]" +
                "/../../div/div/div/div[contains(text(), '" + ageGroup + "')]/following-sibling::div"));
        assertTrue("The percent for " + ageGroup + " is not correct", agePercent.getText().equals(value));
    }
    public static void ClickSectionInStudentOrgServ(String sectionName) {
        driver = Hooks.driver;
        WebElement orgTab = driver.findElement(By.xpath("//h2[contains(text(), 'Student Organizations and Services')]" +
                "/../div/div/span[text() = '" + sectionName + "']"));
        orgTab.click();
        for(int i = 0; i < 4; i++) {
            orgTab.sendKeys(Keys.ARROW_UP);
        }
    }

    public static void VerifyStudentOrganizations(List<String> studentOrgs) {
        driver = Hooks.driver;
        boolean result = false;
        for(int i = 0; i < studentOrgs.size(); i++) {
            if(driver.findElement(By.xpath("//h2[contains(text(), 'Student Organizations and Services')]" +
                    "/../div/div/div/div[text() = '" + studentOrgs.get(i) + "']")).isDisplayed()) {
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
        WebElement athleticsTab = driver.findElement(By.xpath("//div[@class = 'student-life__athletics__nav-buttons']" +
                "/span[text() = '" + sectionName + "']"));
        athleticsTab.click();
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
        WebElement housingValue = driver.findElement(By.xpath("//*[@id='housing-information']/div/div/dl/dt[contains" +
                "(text(),'" + hiLabel + "')]/../dd"));
        assertTrue("The Housing Information Value for" + hiLabel + "is not correct", housingValue.getText().equals(hiValue));
    }

    public static void VerifyHousingInformationLabel() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsStudentLifeTabPage.class);
        assertTrue("The Housing Information section is displayed",
                FCHubsStudentLifeTabPage.labelHousingInformation.isDisplayed());
    }
}
