package actions.Curriculum;

import org.openqa.selenium.WebDriver;
import pageObjects.Curriculum.OpenCurriculumDict;
import stepDefs.Hooks;

/**
 * Created by nipamsharma on 5/5/17.
 */
public abstract class OpenCurriculum extends Hooks{

    public static WebDriver driver;

    OpenCurriculumDict curriculumDict = new OpenCurriculumDict(driver);


    public void is_the_home_page() {


        System.out.println(driver.getTitle());

        assert(driver.getTitle().contentEquals("Naviance"));
    }


    public void navigate_to_curriculum() {
        curriculumDict.curriculumLink.click();
    }

    public void check_header_content() {

        assert(curriculumDict.curriculumHeader.getText().contentEquals("Naviance Curriculum"));

    }
}
