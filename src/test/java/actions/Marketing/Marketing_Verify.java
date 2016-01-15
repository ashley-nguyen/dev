package actions.Marketing;

import org.openqa.selenium.By;
import stepDefs.Hooks;

import static org.junit.Assert.assertTrue;

/**
 * Created by franksejas on 1/15/2016.
 */
public class Marketing_Verify {

    public static void verifyImageInLogin() throws InterruptedException {
        Hooks.driver.switchTo().frame(Hooks.driver.findElement(By.className("marketing-content")));
        Boolean imageVerification = Hooks.driver.findElement(By.xpath("//img[contains(@src,'img/squest.jpg')]")).isDisplayed();
        assertTrue("Verify image exists!", imageVerification);
    }

    public static void verifyBanner() throws InterruptedException {
        Boolean bannerVerification = Hooks.driver.findElement(By.xpath("//img[contains(@src,'/images/navmarketplace_badge.png')]")).isDisplayed();
        assertTrue("Verify banner exists!", bannerVerification);
    }
}
