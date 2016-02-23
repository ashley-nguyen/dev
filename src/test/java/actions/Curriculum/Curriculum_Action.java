package actions.Curriculum;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.Curriculum.CurriculumPage;
import pageObjects.Header.SchoolPageHeader;
import stepDefs.Hooks;

/**
 * Created by ttremblay on 12/10/15.
 */
public class Curriculum_Action {
    public static WebDriver driver;

    public static void SSOtocurriculum() throws InterruptedException {
        driver = Hooks.driver;
        PageFactory.initElements(driver, SchoolPageHeader.class);
        SchoolPageHeader.lnkNavianceCurriculum.click();
    }

    public static void navtoclasses() throws InterruptedException {
        driver = Hooks.driver;
        PageFactory.initElements(driver, CurriculumPage.class);
        CurriculumPage.lnkClasses.click();

    }


    public static void studentsdropdown() throws InterruptedException {
        driver = Hooks.driver;
        PageFactory.initElements(driver, CurriculumPage.class);
        CurriculumPage.lnkStudents.click();
    }

    public static void navtoactivity() throws InterruptedException {
        driver = Hooks.driver;
        PageFactory.initElements(driver, CurriculumPage.class);
        CurriculumPage.lnkActivity.click();
    }

    public static void navtoprogress() throws InterruptedException {
        driver = Hooks.driver;
        PageFactory.initElements(driver, CurriculumPage.class);
        CurriculumPage.lnkProgress.click();

    }

    public static void NavToThemes() throws InterruptedException {
        driver = Hooks.driver;
        PageFactory.initElements(driver, CurriculumPage.class);
        CurriculumPage.ButtonExploreThemes.click();
    }

    public static void NavToScopeAndSequence() throws InterruptedException {
        driver = Hooks.driver;
        PageFactory.initElements(driver, CurriculumPage.class);
        CurriculumPage.lnkScopeAndSequence.click();
    }

    public static void SixthGrade() throws InterruptedException {
        driver = Hooks.driver;
        PageFactory.initElements(driver, CurriculumPage.class);
        CurriculumPage.SelectSixthGrade.click();
    }

    public static void ClickGoToLevel() throws InterruptedException {
        driver = Hooks.driver;
        PageFactory.initElements(driver, CurriculumPage.class);
        CurriculumPage.GoToLevel.click();
    }

    public static void SeventhGrade() throws InterruptedException {
        driver = Hooks.driver;
        PageFactory.initElements(driver, CurriculumPage.class);
        CurriculumPage.SelectSeventhGrade.click();

    }

    public static void EigthGrade() throws InterruptedException {
        driver = Hooks.driver;
        PageFactory.initElements(driver, CurriculumPage.class);
        CurriculumPage.SelectEigthGrade.click();
    }
    public static void NinthGrade() throws InterruptedException {
        driver = Hooks.driver;
        PageFactory.initElements(driver, CurriculumPage.class);
        CurriculumPage.SelectNinthGrade.click();
    }

    public static void TenthGrade() throws InterruptedException {
        driver = Hooks.driver;
        PageFactory.initElements(driver, CurriculumPage.class);
        CurriculumPage.SelectTenthGrade.click();
    }
    public static void EleventhGrade() throws InterruptedException {
        driver = Hooks.driver;
        PageFactory.initElements(driver, CurriculumPage.class);
        CurriculumPage.SelectEleventhGrade.click();

    }
    public static void TwelfthGrade() throws InterruptedException {
        driver = Hooks.driver;
        PageFactory.initElements(driver, CurriculumPage.class);
        CurriculumPage.SelectTwelfthGrade.click();
    }

    public static void ClickSelfDiscovery() throws InterruptedException {
        driver = Hooks.driver;
        PageFactory.initElements(driver, CurriculumPage.class);
        CurriculumPage.lnkSelfDiscovery.click();
    }
    public static void ClickSuccessSkills() throws InterruptedException {
        driver = Hooks.driver;
        PageFactory.initElements(driver, CurriculumPage.class);
        CurriculumPage.lnkSuccessSkills.click();
    }
    public static void ClickSupportNetworks() throws InterruptedException {
        driver = Hooks.driver;
        PageFactory.initElements(driver, CurriculumPage.class);
        CurriculumPage.lnkSupportNetworks.click();
    }
    public static void ClickCollegePlanning() throws InterruptedException {
        driver = Hooks.driver;
        PageFactory.initElements(driver, CurriculumPage.class);
        CurriculumPage.lnkCollegePlanning.click();
    }
    public static void ClickCareerPlanning() throws InterruptedException {
        driver = Hooks.driver;
        PageFactory.initElements(driver, CurriculumPage.class);
        CurriculumPage.lnkCareerPlanning.click();
    }
    public static void ClickFinancialPlanning() throws InterruptedException {
        driver = Hooks.driver;
        PageFactory.initElements(driver, CurriculumPage.class);
        CurriculumPage.lnkFinancialPLanning.click();
    }
}
