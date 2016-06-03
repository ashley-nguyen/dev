package actions.FamilyConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import pageObjects.FamilyConnection.FCCollegesPage;
import stepDefs.Hooks;

/**
 * Created by jorgemaguina on 5/25/2016.
 */
public class FCCollegesTab {
    public static WebDriver driver;

    public static void ClickCollegeMatchLink() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCCollegesPage.class);
        FCCollegesPage.lnkCollegeMatch.click();
    }

    public static void EnterCollegeToSearch(String searchParameter) {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCCollegesPage.class);
        FCCollegesPage.textAreaSearchCollege.sendKeys(searchParameter);
    }

    public static void ClickGoButton() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCCollegesPage.class);
        FCCollegesPage.buttonGo.click();
    }

    public static void ClickCollegeInCollegeLookup(String college) {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCCollegesPage.class);
        WebElement collegeLink = driver.findElement(By.xpath("//table[@class='standard striped']/tbody/tr/td/a" +
                "[contains(text(), '" + college + "')]"));
        collegeLink.click();
    }
}