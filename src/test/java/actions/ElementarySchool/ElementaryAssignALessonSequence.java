package actions.ElementarySchool;

import actions.TestPrep.TestPrep;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.ElementarySchool.ElementaryPage;
import stepDefs.Hooks;

/**
 * Created by sahara.navia on 2/17/17.
 */
public class ElementaryAssignALessonSequence {
    public static WebDriver driver;
    public static String sequenceFilter = "Select...,Grade K Lessons,Grade 1 Lessons,Grade 2 Lessons,Grade 3 Lessons," +
            "Grade 4 Lessons,Grade 5 Lessons";

    /**
     * Verify Assign a Lesson Sequence Page
     */
    public static void verifyAssignALessonSequencePage()
    {
        driver = Hooks.driver;
        PageFactory.initElements(driver, ElementaryPage.class);
        String sequenceDropdown = "select.ns-select";
        By locatorSave = By.cssSelector("button.ns-button:nth-child(2)");

        // Verify and Select Sequence
        WebElement elementSequence = ElementaryPage.selLessonSequence;
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(sequenceDropdown)));
        ElementaryProductPage.verifyElementaryFilterValues(elementSequence, sequenceFilter);
        TestPrep.FilterTestPrep(elementSequence, "Grade K Lessons");

        // Verify Instructors and Group fields
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.elementToBeClickable(ElementaryPage.txtAssignInstructor));
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.elementToBeClickable(ElementaryPage.txtAssignGroupName));

        // Verify Cancel and Save buttons
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.elementToBeClickable(ElementaryPage.btnAssignCancel));
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(locatorSave));

    }
}
