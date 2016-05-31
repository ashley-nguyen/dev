package actions.Curriculum;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.Curriculum.CurriculumPage;
import pageObjects.Header.SchoolPageHeader;
import stepDefs.Hooks;

import java.util.List;

import static org.junit.Assert.assertTrue;

/**
 * Created by ttremblay on 12/10/15.
 */
public class Curriculum {
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

    public static void verifycurriculumhomepage(String strText) throws InterruptedException {
        driver = Hooks.driver;
        System.out.println(driver.getPageSource());


        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }


        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.linkText("Scope And Sequence")));
        assertTrue("text not found: " + strText, driver.getPageSource().contains(strText));
    }

    public static void verifyclassespage(String strText) throws InterruptedException {
        driver = Hooks.driver;
        System.out.println(driver.getPageSource());
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.linkText("+ Add Class")));
        assertTrue("text not found: " + strText, driver.getPageSource().contains(strText));
    }

    public static void verifyactivitypage(String strText) throws InterruptedException {
        driver = Hooks.driver;
        System.out.println(driver.getPageSource());
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.linkText("View Plans")));
        assertTrue("text not found: " + strText, driver.getPageSource().contains(strText));
    }

    public static void verifyprogresspage(String strText) throws InterruptedException {
        driver = Hooks.driver;
        System.out.println(driver.getPageSource());
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.className("spacious")));
        assertTrue("text not found: " + strText, driver.getPageSource().contains(strText));

    }

    public static void VerifyOurThemesPage(String strText) throws InterruptedException {
        driver = Hooks.driver;
        System.out.println(driver.getPageSource());
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.linkText("Explore Self Discovery")));
        assertTrue("text not found: " + strText, driver.getPageSource().contains(strText));
    }

    public static void VerifyGrade6(String strText) throws InterruptedException {
        driver = Hooks.driver;
        System.out.println(driver.getPageSource());

        boolean h4Exists = false;

        Thread.sleep(2000);

        List<WebElement> h4Elements = driver.findElements(By.tagName("h4"));

        for(WebElement h4Element : h4Elements) {
            String h4Content = h4Element.getText();

            if (h4Content.contains(strText)) {
                h4Exists = true;
                break;
            }
        }

        assertTrue("header text exists", h4Exists);
    }

    public static void VerifyGrade7(String strText) throws InterruptedException {
        driver = Hooks.driver;
        System.out.println(driver.getPageSource());

        boolean h4Exists = false;

        Thread.sleep(4000);

        List<WebElement> h4Elements = driver.findElements(By.tagName("h4"));



        for(WebElement h4Element : h4Elements) {
            String h4Content = h4Element.getText();

            if (h4Content.contains(strText)) {
                h4Exists = true;
                break;
            }
        }

        assertTrue("header text exists", h4Exists);
    }

    public static void VerifyGrade8(String strText) throws InterruptedException {
        driver = Hooks.driver;
        System.out.println(driver.getPageSource());

        boolean h4Exists = false;

        Thread.sleep(2000);

        List<WebElement> h4Elements = driver.findElements(By.tagName("h4"));



        for(WebElement h4Element : h4Elements) {
            String h4Content = h4Element.getText();

            if (h4Content.contains(strText)) {
                h4Exists = true;
                break;
            }
        }

        assertTrue("header text exists", h4Exists);
    }

    public static void VerifyGrade9(String strText) throws InterruptedException {
        driver = Hooks.driver;
        System.out.println(driver.getPageSource());

        boolean h4Exists = false;

        Thread.sleep(2000);

        List<WebElement> h4Elements = driver.findElements(By.tagName("h4"));


        for (WebElement h4Element : h4Elements) {
            String h4Content = h4Element.getText();

            if (h4Content.contains(strText)) {
                h4Exists = true;
                break;
            }
        }
        Thread.sleep(5000);
        assertTrue("header text exists", h4Exists);


    }

    public static void VerifyGrade10(String strText) throws InterruptedException {
        driver = Hooks.driver;
        System.out.println(driver.getPageSource());

        boolean h4Exists = false;

        Thread.sleep(2000);

        List<WebElement> h4Elements = driver.findElements(By.tagName("h4"));


        for (WebElement h4Element : h4Elements) {
            String h4Content = h4Element.getText();

            if (h4Content.contains(strText)) {
                h4Exists = true;
                break;
            }
        }

        assertTrue("header text exists", h4Exists);


    }

    public static void VerifyGrade11(String strText) throws InterruptedException {
        driver = Hooks.driver;
        System.out.println(driver.getPageSource());

        boolean h4Exists = false;

        Thread.sleep(2000);

        List<WebElement> h4Elements = driver.findElements(By.tagName("h4"));


        for (WebElement h4Element : h4Elements) {
            String h4Content = h4Element.getText();

            if (h4Content.contains(strText)) {
                h4Exists = true;
                break;
            }
        }

        assertTrue("header text exists", h4Exists);


    }

    public static void VerifyGrade12(String strText) throws InterruptedException {
        driver = Hooks.driver;
        System.out.println(driver.getPageSource());

        boolean h4Exists = false;

        Thread.sleep(2000);

        List<WebElement> h4Elements = driver.findElements(By.tagName("h4"));


        for (WebElement h4Element : h4Elements) {
            String h4Content = h4Element.getText();

            if (h4Content.contains(strText)) {
                h4Exists = true;
                break;
            }
        }

        assertTrue("header text exists", h4Exists);


    }

    public static void VerifySelfDiscovery(String strText) throws InterruptedException {
        driver = Hooks.driver;
        System.out.println(driver.getPageSource());

        boolean h4Exists = false;

        Thread.sleep(2000);

        List<WebElement> h4Elements = driver.findElements(By.tagName("h4"));


        for (WebElement h4Element : h4Elements) {
            String h4Content = h4Element.getText();

            if (h4Content.contains(strText)) {
                h4Exists = true;
                break;
            }
        }

        assertTrue("header text exists", h4Exists);
    }

    public static void VerifySuccessSkills(String strText) throws InterruptedException {
        driver = Hooks.driver;
        System.out.println(driver.getPageSource());

        boolean h4Exists = false;

        Thread.sleep(2000);

        List<WebElement> h4Elements = driver.findElements(By.tagName("h4"));


        for (WebElement h4Element : h4Elements) {
            String h4Content = h4Element.getText();

            if (h4Content.contains(strText)) {
                h4Exists = true;
                break;
            }
        }

        assertTrue("header text exists", h4Exists);
    }

    public static void VerifySupportNetworks(String strText) throws InterruptedException {
        driver = Hooks.driver;
        System.out.println(driver.getPageSource());

        boolean h4Exists = false;

        Thread.sleep(2000);

        List<WebElement> h4Elements = driver.findElements(By.tagName("h4"));


        for (WebElement h4Element : h4Elements) {
            String h4Content = h4Element.getText();

            if (h4Content.contains(strText)) {
                h4Exists = true;
                break;
            }
        }

        assertTrue("header text exists", h4Exists);

    }


    public static void VerifyCollegePlanning(String strText) throws InterruptedException {
        driver = Hooks.driver;
        System.out.println(driver.getPageSource());

        boolean h4Exists = false;

        Thread.sleep(2000);

        List<WebElement> h4Elements = driver.findElements(By.tagName("h4"));


        for (WebElement h4Element : h4Elements) {
            String h4Content = h4Element.getText();

            if (h4Content.contains(strText)) {
                h4Exists = true;
                break;
            }
        }

        assertTrue("header text exists", h4Exists);

    }


    public static void VerifyCareerPlanning(String strText) throws InterruptedException {
        driver = Hooks.driver;
        System.out.println(driver.getPageSource());

        boolean h4Exists = false;

        Thread.sleep(2000);

        List<WebElement> h4Elements = driver.findElements(By.tagName("h4"));


        for (WebElement h4Element : h4Elements) {
            String h4Content = h4Element.getText();

            if (h4Content.contains(strText)) {
                h4Exists = true;
                break;
            }
        }

        assertTrue("header text exists", h4Exists);

    }

    public static void VerifyFinancialPlanning(String strText) throws InterruptedException {
        driver = Hooks.driver;
        System.out.println(driver.getPageSource());

        boolean h4Exists = false;

        Thread.sleep(2000);

        List<WebElement> h4Elements = driver.findElements(By.tagName("h4"));


        for (WebElement h4Element : h4Elements) {
            String h4Content = h4Element.getText();

            if (h4Content.contains(strText)) {
                h4Exists = true;
                break;
            }
        }

        assertTrue("header text exists", h4Exists);

    }
}
