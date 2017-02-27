package actions.ElementarySchool;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.ElementarySchool.ElementaryGroupDetailPage;
import stepDefs.Hooks;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertTrue;


/**
 * Created by sahara.navia on 2/24/17.
 */
public class ElementaryGroupDetail {

    public static WebDriver driver;

    /**
     * Verify the group information displayed in the Elementary group detail page (Group name, Instructor, Primary sequence)
     * @param groupName The group name
     * @param instructorName The instructor name
     * @param primarySequence The Lesson sequence, i.e Grade K Lessons
     */
    public static void verifyGroupInGroupDetailPage(String groupName, String instructorName, String primarySequence)
    {
        driver = Hooks.driver;
        PageFactory.initElements(driver, ElementaryGroupDetailPage.class);
        List<String> expectedInsructor = Arrays.asList(instructorName.split("\\s*,\\s*"));

        // Verify Group name
        new WebDriverWait(Hooks.driver, 20).until(ExpectedConditions.textToBePresentInElement(ElementaryGroupDetailPage.titleElementaryGroupDetailPage,
                groupName));

        // Verify Primary Sequence
        String sequence = ElementaryGroupDetailPage.lblPrimarySequence.getText();
        assertTrue("The '"+ sequence +"' is displayed correctly in the group detail page", primarySequence.contains(sequence));

        // Verify Instructor
        String instructors = ElementaryGroupDetailPage.lblInstructorName.getText();
        instructors = instructors.replace("Instructor(s): ", "");
        List<String> currentInsructor = Arrays.asList(instructors.split("\\s*,\\s*"));
        assertTrue("The '"+ instructors +"' is displayed correctly in the group table", currentInsructor.containsAll(expectedInsructor) &&
                currentInsructor.size() == expectedInsructor.size());
    }
}
