package actions.Colleges;

import gherkin.deps.com.google.gson.stream.JsonReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.Colleges.CollegePage;
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


}
