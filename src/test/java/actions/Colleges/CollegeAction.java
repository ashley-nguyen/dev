package actions.Colleges;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.Colleges.CollegePage;
import pageObjects.Header.DistrictPageHeader;
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


    }

    public static void clickCollegeProfileTab(String strTab) throws InterruptedException {

        PageFactory.initElements(driver, CollegePage.class);

        CollegePage.tabAdmissions.click();
        Thread.sleep(10000);

    }


}
