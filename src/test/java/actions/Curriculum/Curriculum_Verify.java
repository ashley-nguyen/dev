package actions.Curriculum;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.pagefactory.ByChained;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import stepDefs.Hooks;

import static org.junit.Assert.assertTrue;

/**
 * Created by ttremblay on 12/10/15.
 */
public class Curriculum_Verify {
    public static WebDriver driver;


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





