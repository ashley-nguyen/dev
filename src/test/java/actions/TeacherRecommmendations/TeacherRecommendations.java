package actions.TeacherRecommmendations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.TeacherRecommendation.TeacherRecommendationsPage;
import stepDefs.Hooks;

import java.util.concurrent.TimeUnit;

/**
 * Created by franksejas on 06/21/2016.
 */
public class TeacherRecommendations {
    public static WebDriver driver;

    public static void ClickOnTeacherRecommendationsLink() throws InterruptedException {
        driver = Hooks.driver;
        PageFactory.initElements(driver, TeacherRecommendationsPage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.elementToBeClickable(TeacherRecommendationsPage.lnkTeacherRecommendations)).click();
    }

    public static void ClickOnRequestsTab() throws InterruptedException {
        driver = Hooks.driver;
        PageFactory.initElements(driver, TeacherRecommendationsPage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.elementToBeClickable(TeacherRecommendationsPage.tabRequests)).click();
    }

    public static void SelectGradeClass(String grade) {
        driver = Hooks.driver;
        PageFactory.initElements(driver, TeacherRecommendationsPage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.name("class")));
        Select select = new Select(TeacherRecommendationsPage.selClass);
        select.selectByVisibleText(grade);
        TeacherRecommendationsPage.formNameTable.isDisplayed();
    }

    public static void ClickShowMeGoButton() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, TeacherRecommendationsPage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.elementToBeClickable(TeacherRecommendationsPage.btnGo)).click();
    }

    public static void SelectShowMeOptions(String item) throws InterruptedException {
        driver = Hooks.driver;
        PageFactory.initElements(driver, TeacherRecommendationsPage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.name("quicklist")));
        Select select = new Select(TeacherRecommendationsPage.selList);
        select.selectByVisibleText(item);
        TeacherRecommendationsPage.formNameTable.isDisplayed();
        Thread.sleep(90000);
    }
}
