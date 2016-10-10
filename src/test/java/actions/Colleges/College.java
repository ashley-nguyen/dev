package actions.Colleges;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.Colleges.CollegePage;
import pageObjects.Colleges.CollegeSearchPage;
import pageObjects.Header.SchoolPageHeader;
import stepDefs.Hooks;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

/**
 * Created by csackrider on 11/25/2015.
 */
public class College {

    public static WebDriver driver;


    public static void goToCollegeProfile(String strCollege) throws InterruptedException {
        driver = Hooks.driver;
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        PageFactory.initElements(driver, SchoolPageHeader.class);

        //click Colleges link
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.linkText("Colleges")));
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

    public static void goToAdvancedCollegeSearch() throws InterruptedException {
        driver = Hooks.driver;
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        PageFactory.initElements(driver, SchoolPageHeader.class);

        //click Colleges link


        Actions action = new Actions(driver);
        action.moveToElement(SchoolPageHeader.lnkColleges).build().perform();
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.linkText("College Search")));
        SchoolPageHeader.lnkCollegeSearch.click();

        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.linkText("A")));

        //click advanced search link
        PageFactory.initElements(driver, CollegeSearchPage.class);
        CollegeSearchPage.btnAdvancedSearchGo.click();

        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.linkText("School type")));
    }

    public static void goToFindColleges(String strCollegeName) throws InterruptedException {
        driver = Hooks.driver;
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        PageFactory.initElements(driver, SchoolPageHeader.class);

        //click Colleges link
        Actions action = new Actions(driver);
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.linkText("Colleges")));
        action.moveToElement(SchoolPageHeader.lnkColleges).build().perform();
        Thread.sleep(3000);
        SchoolPageHeader.lnkFindColleges.click();

        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.linkText("A")));

        SchoolPageHeader.lnkA.click();
//        WebElement lnkCollegeName = Hooks.driver.findElement(By.linkText(strCollegeName));
//        lnkCollegeName.click();

    }

    public static void DoAdvancedCollegeSearch(String strCategory, String strValue, String strData, String strResult) throws InterruptedException {
        driver = Hooks.driver;
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //select which criteria to search on
        //strValue will be the link text for the link of search category
        WebElement lnkCategory = Hooks.driver.findElement(By.linkText(strCategory));
        lnkCategory.click();


    }

    public static void ClickOnCollegesTab() throws InterruptedException {
        driver = Hooks.driver;
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(8000);
        PageFactory.initElements(driver, CollegePage.class);
        CollegePage.tabColleges.click();
    }



    public static void SelectTeacher(String item) {
        driver = Hooks.driver;
        PageFactory.initElements(driver, CollegePage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(driver, 3);
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.id("add-request-teacher-id")));
        WebElement selectElement = wait.until(ExpectedConditions.visibilityOf(CollegePage.selIdRequest));
        Select select = new Select(selectElement);
        select.selectByVisibleText(item);
    }

    public static void SelectApplication(String item) {
        driver = Hooks.driver;
        PageFactory.initElements(driver, CollegePage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(driver, 3);
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.id("add-request-application-id")));
        WebElement selectElement = wait.until(ExpectedConditions.visibilityOf(CollegePage.selIdApplication));
        Select select = new Select(selectElement);
        select.selectByVisibleText(item);
    }

    public static void ClickOnAddRequestButton() throws InterruptedException {
        driver = Hooks.driver;
        PageFactory.initElements(driver, CollegePage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Actions builder = new Actions(driver);
        builder.click(CollegePage.btnAddRequestButton).build().perform();
    }


    public static void ClickOnSchoolSiteLink() throws InterruptedException {
        driver = Hooks.driver;
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(8000);
        PageFactory.initElements(driver, CollegePage.class);
        CollegePage.lnkEnterSchoolSite.click();
    }

    public static void ClickOnActiveApplicationsLink() {
        driver = Hooks.driver;
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        PageFactory.initElements(driver, CollegePage.class);
        CollegePage.lnkActiveApplications.click();
    }

    public static void ClickOnAddProspectiveColleges() throws InterruptedException {
        driver = Hooks.driver;
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(8000);
        PageFactory.initElements(driver, CollegePage.class);
        CollegePage.lnkProspectiveColleges.click();
        Thread.sleep(8000);
        CollegePage.lnkAddProspectiveColleges.click();
    }

    public static void ClickOnViewPastVisitsLink() {
        driver = Hooks.driver;
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //PageFactory.initElements(driver, CollegePage.class);
        //CollegePage.lnkEnterSchoolSite.click();

        PageFactory.initElements(driver, SchoolPageHeader.class);

        Actions action = new Actions(driver);
        action.moveToElement(SchoolPageHeader.lnkColleges).build().perform();
        SchoolPageHeader.lnkCollegeVisits.click();
        //add in a little wait here.
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.linkText("view past visits")));

        PageFactory.initElements(driver, CollegePage.class);
        CollegePage.lnkviewPastVisits.click();

        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.name("class")));


    }

    public static void SelectClassYear(String strClassYear) throws InterruptedException {
        driver = Hooks.driver;
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        PageFactory.initElements(driver, CollegePage.class);

        CollegePage.selClassYear.click();

        List<WebElement> options = CollegePage.selClassYear.findElements(By.tagName("option"));
        for (WebElement option : options) {
            if (option.getText().contains(strClassYear))
                option.click();
            break;
        }

       // Thread.sleep(8000);
    }

    public static void verifyCollegeSearchResult(String strText) throws InterruptedException {
        driver = Hooks.driver;
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //System.out.println(driver.getPageSource());
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.id("contents")));
        assertTrue("text not found: " + strText, driver.getPageSource().contains(strText));
    }


    public static void verifyAdvancedSearchCategory(String strText) throws InterruptedException {
        //verify the category passed in is displayed for the advanced search
        driver = Hooks.driver;
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        assertTrue("text not found: " + strText, driver.getPageSource().contains(strText));
    }

    public static void verifyFindCollege(String strText) throws InterruptedException {
        driver = Hooks.driver;
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        assertTrue("text not found: " + strText, driver.getPageSource().contains(strText));
    }

    public static void verifyNoErrorsInProspectiveCollege() throws InterruptedException {
        String dataVerification = Hooks.driver.findElement(By.className("dark_textheader")).getText();
        assertTrue("Error Verification!", dataVerification.contains("ADD PROSPECTIVE COLLEGES"));
    }

    public static void verifyNoErrorsInCollegePick() throws InterruptedException {
        assertTrue("Error Verification!", Hooks.driver.getPageSource().contains(""));
    }

    public static void verifyLORsMessage(String strText) throws InterruptedException {
        driver = Hooks.driver;
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        assertTrue("text not found: " + strText, driver.getPageSource().contains(strText));
    }

}
