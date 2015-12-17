package stepDefs;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver;
import com.heliumhq.API;
import java.net.MalformedURLException;

//import org.openqa.selenium.phantomjs.PhantomJSDriver;
//import org.openqa.selenium.phantomjs.PhantomJSDriverService;

//import org.openqa.selenium.phantomjs.PhantomJSDriver;
//import org.openqa.selenium.phantomjs.PhantomJSDriverService;

public class Hooks {
    public static WebDriver driver;
    public static String strBaseURL;

    DesiredCapabilities dc = new DesiredCapabilities();


    @Before
    /**
     * Delete all cookies at the start of each scenario to avoid
     * shared state between tests
     */
    public void openBrowser() throws MalformedURLException {

        dc.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.IGNORE);
        //dc.setJavascriptEnabled(true);
        String env = System.getProperty("ENV");

        if (env == null)
            env = "prod";
        switch (env) {
            case "staging":
                strBaseURL = "https://succeed-internal.naviance.com";
                break;
            case "prod":
                strBaseURL = "https://succeed.naviance.com";
                break;
            case "succeed04":
                strBaseURL = "https://succeed-04.dev.naviance.com";
                break;
            case "succeed-03":
                strBaseURL = "https://succeed-03.dev.naviance.com";
                break;
            case "groups":
                strBaseURL = "https://localhost:8727/groups";
            default:
                strBaseURL = "https://succeed-internal.naviance.com";
                break;
        }


        String browser = System.getProperty("BROWSER");

        if (browser == null) {
            browser = "firefox";
        }
        if (browser.equals("chrome")) {
            API.startChrome(strBaseURL);
            driver = API.getDriver();

        } else if (browser.equals("firefox")) {
            API.startFirefox(strBaseURL);
            driver = API.getDriver();

        } else if (browser.equals("ie")) {
            API.startIE(strBaseURL);
            driver = API.getDriver();


        } else if (browser.equals("safari")) {
            driver = new SafariDriver(dc);

        } else if (browser.equals("headless")) {
            driver = new HtmlUnitDriver();
        } else {
            driver = new HtmlUnitDriver();

        }
        System.out.println("Opening Browser...." + browser);
        driver.manage().deleteAllCookies();
        driver.get(strBaseURL);
        driver.manage().window().maximize();
    }

    @After
    /**
     * Embed a screenshot in test report if test is marked as failed
     */
    public void embedScreenshot(Scenario scenario) {
        if (scenario.isFailed()) {
            try {
                scenario.write("Current Page URL is " + driver.getCurrentUrl());
//            byte[] screenshot = getScreenshotAs(OutputType.BYTES);
                //byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
                //scenario.embed(screenshot, "image/png");
            } catch (WebDriverException somePlatformsDontSupportScreenshots) {
                System.err.println(somePlatformsDontSupportScreenshots.getMessage());
            }
        }
        driver.quit();
    }
}