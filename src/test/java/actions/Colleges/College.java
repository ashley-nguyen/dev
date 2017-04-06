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
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.linkText("Colleges")));
        SchoolPageHeader.lnkColleges.click();
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.linkText("build from lists")));
        PageFactory.initElements(driver, CollegePage.class);
        CollegePage.txtCollegename.sendKeys(strCollege);
        CollegePage.btnSearch.click();
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.linkText(strCollege)));
        WebElement lnkCollege = driver.findElement(By.linkText(strCollege));
        lnkCollege.click();
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
        Actions action = new Actions(driver);
        action.moveToElement(SchoolPageHeader.lnkColleges).build().perform();
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.linkText("College Search")));
        SchoolPageHeader.lnkCollegeSearch.click();
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.linkText("A")));
        PageFactory.initElements(driver, CollegeSearchPage.class);
        CollegeSearchPage.btnAdvancedSearchGo.click();
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.linkText("School type")));
    }

    public static void goToFindColleges(String strCollegeName) throws InterruptedException {
        driver = Hooks.driver;
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        PageFactory.initElements(driver, SchoolPageHeader.class);
        Actions action = new Actions(driver);
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.linkText("Colleges")));
        Thread.sleep(3000);
        action.moveToElement(SchoolPageHeader.lnkColleges).build().perform();
        Thread.sleep(3000);
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.linkText("Find Colleges")));
        SchoolPageHeader.lnkFindColleges.click();
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.linkText("A")));
        SchoolPageHeader.lnkA.click();
    }

    public static void DoAdvancedCollegeSearch(String strCategory, String strValue, String strData, String strResult) throws InterruptedException {
        driver = Hooks.driver;
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement lnkCategory = Hooks.driver.findElement(By.linkText(strCategory));
        lnkCategory.click();
    }

    public static void ClickOnCollegesTab() throws InterruptedException {
        driver = Hooks.driver;
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        PageFactory.initElements(driver, CollegePage.class);
//        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//a[contains(text(),'Colleges')])[2]")));
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#primary > li:nth-child(6) > a")));
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
        PageFactory.initElements(driver, CollegePage.class);
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.linkText("Enter school site")));
        CollegePage.lnkEnterSchoolSite.click();
    }

    public static void ClickOnActiveApplicationsLink() {
        driver = Hooks.driver;
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        PageFactory.initElements(driver, CollegePage.class);
        CollegePage.lnkActiveApplications.click();
    }

    public static void ClickOnAddProspectiveColleges() throws InterruptedException {
        driver = Hooks.driver;
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        PageFactory.initElements(driver, CollegePage.class);
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.linkText("prospective colleges")));
        CollegePage.lnkProspectiveColleges.click();
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#contents > table > tbody > tr:nth-of-type(1) > td > table > tbody > tr > td:nth-of-type(1) > a")));
        CollegePage.lnkAddProspectiveColleges.click();
    }

    public static void ClickOnViewPastVisitsLink() {
        driver = Hooks.driver;
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        PageFactory.initElements(driver, SchoolPageHeader.class);
        Actions action = new Actions(driver);
        action.moveToElement(SchoolPageHeader.lnkColleges).build().perform();
        SchoolPageHeader.lnkCollegeVisits.click();
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
    }

    public static void verifyCollegeSearchResult(String strText) throws InterruptedException {
        driver = Hooks.driver;
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.id("contents")));
        assertTrue("text not found: " + strText, driver.getPageSource().contains(strText));
    }


    public static void verifyAdvancedSearchCategory(String strText) throws InterruptedException {
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
        String dataVerification = CollegePage.txtMesaggeVerification.getText();
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
