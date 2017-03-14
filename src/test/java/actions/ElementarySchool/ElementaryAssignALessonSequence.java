package actions.ElementarySchool;

import java.util.Arrays;
import java.util.List;
import actions.TestPrep.TestPrep;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.ElementarySchool.AssignLessonSequencePage;
import pageObjects.ElementarySchool.ElementaryPage;
import pageObjects.TestPrep.AssignStudyProgramsPage;
import reusableComponents.TagEditorComponent;
import stepDefs.Hooks;

/**
 * Created by sahara.navia on 2/17/17.
 */
public class ElementaryAssignALessonSequence {
    public static WebDriver driver;
    public static String sequenceFilter = "Select from sequence list,Grade K Lessons,Grade 1 Lessons,Grade 2 Lessons,Grade 3 Lessons," +
            "Grade 4 Lessons,Grade 5 Lessons";


    /**
     * Verify Assign a Lesson Sequence Page
     */
    public static void verifyAssignALessonSequencePage()
    {
        driver = Hooks.driver;
        PageFactory.initElements(driver, AssignLessonSequencePage.class);

        // Verify and Select Sequence
        WebElement elementSequence = ElementaryPage.selLessonSequence;
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(AssignLessonSequencePage.locatorSequenceDropdown));
        ElementaryProductPage.verifyElementaryFilterValues(elementSequence, sequenceFilter);
        TestPrep.FilterTestPrep(elementSequence, "Grade K Lessons");

        // Verify Instructors and Group fields
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.elementToBeClickable(AssignLessonSequencePage.txtAssignInstructor));
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.elementToBeClickable(AssignLessonSequencePage.txtAssignGroupName));

        // Verify Cancel and Save buttons
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.elementToBeClickable(AssignLessonSequencePage.btnAssignCancel));
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(AssignLessonSequencePage.locatorAssignSaveBtn));

    }

    /**
     * Assign Lesson Sequence to a Student Group
     * <p>
     *     This method selects Lesson Sequence, instructor and Student Group
     * @param sequence The Lesson Sequence, i.e Grade K Lessons
     * @param instructorsName The Instructor(s) name, i.e "Sarita Moscoso, Nicolas Moscoso,..."
     * @param groupsName The Student group name, this is an existing Student Group, i.e "Group_1, Group_2,..."
     */
    public static void assignLessonSequence(String sequence, String instructorsName, String groupsName) throws InterruptedException
    {
        driver = Hooks.driver;
        List<String> instructors = Arrays.asList(instructorsName.split("\\s*,\\s*"));
        List<String> groups = Arrays.asList(groupsName.split("\\s*,\\s*"));
        String expectedElemProductPageTitle = "Naviance for Elementary School";

        PageFactory.initElements(driver, AssignLessonSequencePage.class);
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(AssignLessonSequencePage.locatorSequenceDropdown));

        // Enter Group(s)
        WebElement groupElement = AssignLessonSequencePage.txtAssignGroupName;
        TagEditorComponent.selectOptionTagEditor(groupElement, groups);

        // Select sequence
        TestPrep.FilterTestPrep(AssignLessonSequencePage.selLessonSequence, sequence);

        // Enter Instructor(s)
        WebElement instructorElement = AssignLessonSequencePage.txtAssignInstructor;
        TagEditorComponent.selectOptionTagEditor(instructorElement, instructors);
        
        // Click on Save
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.elementToBeClickable(AssignLessonSequencePage.btnAssignSave)).click();
        new WebDriverWait(Hooks.driver, 20).until(ExpectedConditions.textToBePresentInElement(ElementaryPage.titleElementaryProductPage,
                expectedElemProductPageTitle));

        // TODO: Verify the success message once it is developed
    }

    /**
     * Verify that the group is displayed in the search field of Assign a Lesson Sequence page
     * @param groupName Groups Name, i.e "Group1, Group2, Group3"
     */
    public static void verifyGroupIsDisplayedInTheSearchField(String groupName)
    {   driver = Hooks.driver;
        PageFactory.initElements(driver, AssignLessonSequencePage.class);
        List<String> group = Arrays.asList(groupName.split("\\s*,\\s*"));
        // Enter Group(s)
        WebElement groupElement = AssignLessonSequencePage.txtAssignGroupName;
        TagEditorComponent.selectOptionTagEditor(groupElement, group);

    }

}
