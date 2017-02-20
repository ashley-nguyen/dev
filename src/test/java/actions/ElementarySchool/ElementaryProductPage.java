package actions.ElementarySchool;

import static org.junit.Assert.assertTrue;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.ElementarySchool.ElementaryPage;
import pageObjects.Header.SchoolPageHeader;
import stepDefs.Hooks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by sahara.navia on 2/16/17.
 */
public class ElementaryProductPage {

    public static WebDriver driver;
    public static String expectedElemProductPageTitle = "Naviance for Elementary School";
    public static String expectedViewAllLessonTitle = "Lesson Plans";
    public static String expectedAssignLessonTitle = "Assign a Lesson Sequence";
    public static String expectedSchoolActivityTitle = "School Activity";
    public static String sequenceFilter = "Any Primary Sequence,Grade K Lessons Sequence,Grade 1 Lessons Sequence," +
            "Grade 2 Lessons Sequence,Grade 3 Lessons Sequence,Grade 4 Lessons Sequence,Grade 5 Lessons Sequence";

    /**
     * Click on Naviance Elementary School Link from Quick Links
     */
    public static void clickElementarySchoolLink() throws InterruptedException{
        driver = Hooks.driver;
        PageFactory.initElements(driver, SchoolPageHeader.class);
        PageFactory.initElements(driver, ElementaryPage.class);
        SchoolPageHeader.lnkNavianceElementarySchool.click();
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("h1")));
        String elementaryProductPageTitle = ElementaryPage.titleElementaryProductPage.getText();
        assertTrue("Naviance for Elementary School page is opened",
                   elementaryProductPageTitle.contains(expectedElemProductPageTitle));
    }

    /**
     * Click on View All Lesson Plans link from Product Page
     */
    public static void clickViewAllLessonPlansLink() throws InterruptedException{
        driver = Hooks.driver;
        PageFactory.initElements(driver, ElementaryPage.class);
        ElementaryPage.lnkViewAllLessonPlans.click();
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("h1")));
        String elementaryViewAllLessonTitle = ElementaryPage.titleElementaryProductPage.getText();
        assertTrue("View All Lesson Plans page is opened",
                elementaryViewAllLessonTitle.contains(expectedViewAllLessonTitle));
    }

    /**
     * Click on Assign a Lesson Sequence link from Product Page
     */
    public static void clickAssignALessonSequenceLink() throws InterruptedException{
        driver = Hooks.driver;
        String sequenceDropdown = "select.ns-select";
        PageFactory.initElements(driver, ElementaryPage.class);
        ElementaryPage.lnkAssignALessonSequence.click();
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(sequenceDropdown)));
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.textToBePresentInElement(ElementaryPage.titleElementaryProductPage,
                expectedAssignLessonTitle));
    }

    /**
     * Click on School Activity link from Product Page
     */
    public static void clickSchoolActivityLink() throws InterruptedException{
        driver = Hooks.driver;
        PageFactory.initElements(driver, ElementaryPage.class);
        ElementaryPage.lnkSchoolActivity.click();
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.textToBePresentInElement(ElementaryPage.titleElementaryProductPage,
                expectedSchoolActivityTitle));
    }


    /**
     * Verify Elementary Product Page
     */
    public static void verifyElementaryProductPage()
    {
        driver = Hooks.driver;
        PageFactory.initElements(driver, ElementaryPage.class);
        String instructorDropdown = "instructor-filter";
        String sequenceDropdown = "sequence-filter";
        By locatorElementaryGroupTable = By.cssSelector("table.ns-table");
        WebElement element = ElementaryPage.selElementarySequence;

        // Verify Instructor and Sequence dropdowns
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.id(instructorDropdown)));
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.id(sequenceDropdown)));
        verifyElementaryFilterValues(element, sequenceFilter);

        // Verify Elementary Group table
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(locatorElementaryGroupTable));
    }

    /**
     * Verify Elementary filter options
     * @param element The WebElement of the dropdown
     * @param expectedValues The list of the expected values in the dropdown (string separated by commas ',')
     *                       i.e String A = "a1,a2,a3,a4"
     */
    public static void verifyElementaryFilterValues(WebElement element, String expectedValues)
    {
        List<String> currentFilter = new ArrayList<String>();

        List<String> expectedFilter = Arrays.asList(expectedValues.split("\\s*,\\s*"));

        Select eleDropdown = new Select(element);
        List<WebElement> elementCount = eleDropdown.getOptions();

        for (WebElement option:elementCount)
        {
            currentFilter.add(option.getText());
        }
        assertTrue("Elementary sequence filter displays all values", currentFilter.containsAll(expectedFilter) &&
                currentFilter.size() == expectedFilter.size());
    }
}