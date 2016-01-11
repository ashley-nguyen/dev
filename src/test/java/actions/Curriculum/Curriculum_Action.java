package actions.Curriculum;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageObjects.Header.SchoolPageHeader;
import stepDefs.Hooks;

/**
 * Created by ttremblay on 12/10/15.
 */
public class Curriculum_Action { public static WebDriver driver;

    public static void SSOtocurriculum() throws InterruptedException {
        driver = Hooks.driver;
        PageFactory.initElements(driver, SchoolPageHeader.class);
        SchoolPageHeader.lnkNavianceCurriculum.click();

    }}
