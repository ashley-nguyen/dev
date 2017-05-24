package actions.Curriculum;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageObjects.Curriculum.OpenCurriculumDict;
import stepDefs.Hooks;

/**
 * Created by nipamsharma on 5/5/17.
 */
public  class OpenCurriculum {

    public static WebDriver driver = Hooks.driver;


    public static void is_the_home_page() {

        System.out.println(driver.getTitle());
        assert(driver.getTitle().contentEquals("Naviance"));
    }


    public static void navigate_to_curriculum() {

        //driver = Hooks.driver;
        PageFactory.initElements(driver,OpenCurriculumDict.class);
        OpenCurriculumDict.curriculumLink.click();
        //OpenCurriculumDict.curriculumLink.click();

    }

    public static void check_header_content() {

        PageFactory.initElements(driver,OpenCurriculumDict.class);
        assert(OpenCurriculumDict.curriculumHeader.getText().contentEquals("Naviance Curriculum"));

    }


}
