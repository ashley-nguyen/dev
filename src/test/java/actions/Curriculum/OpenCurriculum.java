package actions.Curriculum;

import org.openqa.selenium.WebDriver;
import pageObjects.Curriculum.OpenCurriculumDict;

/**
 * Created by nipamsharma on 5/5/17.
 */
public abstract class OpenCurriculum {

    private WebDriver driver;


    OpenCurriculumDict curriculumDict = new OpenCurriculumDict(driver);

    public void is_the_home_page() {

        assert(driver.getTitle().contentEquals("Naviance"));
    }


    public void navigate_to_curriculum() {
        curriculumDict.curriculumLink.click();
    }

    public void check_header_content() {
    }
}
