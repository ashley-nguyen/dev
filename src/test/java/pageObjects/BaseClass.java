package pageObjects;

import org.openqa.selenium.WebDriver;

/**
 * Created by csackrider on 11/6/2015.
 */
public class BaseClass {

    public static WebDriver driver;
    public static boolean bResult;

    public BaseClass(WebDriver driver) {
        BaseClass.driver = driver;
        BaseClass.bResult = true;
    }
}
