package actions.Colleges;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.Colleges.CollegePage;
import pageObjects.Colleges.CollegeSearchPage;
import pageObjects.Header.SchoolPageHeader;
import stepDefs.Hooks;

/**
 * Created by csackrider on 11/25/2015.
 */
public class CollegeAction {

    public static WebDriver driver;


    public static void goToCollegeProfile(String strCollege) throws InterruptedException {
        driver = Hooks.driver;
        PageFactory.initElements(driver, SchoolPageHeader.class);

        //click Colleges link
        SchoolPageHeader.lnkColleges.click();

        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.linkText("build from lists")));


        PageFactory.initElements(driver, CollegePage.class);
        //enter college name in lookup by name box
        CollegePage.txtCollegename.sendKeys(strCollege);
        //click go
        CollegePage.btnSearch.click();
        //select college from results list
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.linkText(strCollege)));
        WebElement lnkCollege = driver.findElement(By.linkText(strCollege));
        lnkCollege.click();
        Thread.sleep(5000);


    }

    public static void clickCollegeProfileTab(String strTab) throws InterruptedException {

        PageFactory.initElements(driver, CollegePage.class);


        switch (strTab.toLowerCase()) {
            case "admissions":
                CollegePage.tabAdmissions.click();
                break;
            case "academics":
                CollegePage.tabAcademics.click();
                break;
            case "cost & aid":
                CollegePage.tabCostAndAid.click();
                break;
            case "extracurriculars":
                CollegePage.tabExtracurriculars.click();
                break;

        }
    }

    public static void goToAdvancedCollegeSearch() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, SchoolPageHeader.class);

        //click Colleges link

        Actions action = new Actions(driver);
        action.moveToElement(SchoolPageHeader.lnkColleges).build().perform();
        SchoolPageHeader.lnkCollegeSearch.click();

        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.linkText("A")));

        //click advanced search link
        PageFactory.initElements(driver, CollegeSearchPage.class);
        CollegeSearchPage.btnAdvancedSearchGo.click();

        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.linkText("School type")));
    }

    public static void goToFindColleges(String strCollegeName) {
        driver = Hooks.driver;
        PageFactory.initElements(driver, SchoolPageHeader.class);

        //click Colleges link

        Actions action = new Actions(driver);
        action.moveToElement(SchoolPageHeader.lnkColleges).build().perform();
        SchoolPageHeader.lnkFindColleges.click();

        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.linkText("A")));

        SchoolPageHeader.lnkA.click();
        WebElement lnkCollegeName = Hooks.driver.findElement(By.linkText(strCollegeName));
        lnkCollegeName.click();

    }

    public static void DoAdvancedCollegeSearch(String strCategory, String strValue, String strData, String strResult) throws InterruptedException {
        driver = Hooks.driver;

        //select which criteria to search on
        //strValue will be the link text for the link of search category
        WebElement lnkCategory = Hooks.driver.findElement(By.linkText(strCategory));
        lnkCategory.click();


    }

    public static void ClickOnCollegesTab() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, CollegePage.class);
        CollegePage.tabColleges.click();
    }

    public static void ClickOnSchoolSiteLink() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, CollegePage.class);
        CollegePage.lnkEnterSchoolSite.click();
    }

    public static void ClickOnActiveApplicationsLink() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, CollegePage.class);
        CollegePage.lnkActiveApplications.click();
    }

    public static void ClickOnAddProspectiveColleges() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, CollegePage.class);
        CollegePage.lnkProspectiveColleges.click();
        CollegePage.lnkAddProspectiveColleges.click();
    }

    public static void ClickOnViewPastVisitsLink() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, CollegePage.class);
        CollegePage.lnkEnterSchoolSite.click();
    }

}
