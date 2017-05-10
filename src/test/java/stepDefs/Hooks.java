package stepDefs;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.*;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
//import com.heliumhq.API;
import java.net.MalformedURLException;
import java.io.File;
import java.net.URL;

//import org.openqa.selenium.phantomjs.PhantomJSDriver;
//import org.openqa.selenium.phantomjs.PhantomJSDriverService;

//import org.openqa.selenium.phantomjs.PhantomJSDriver;
//import org.openqa.selenium.phantomjs.PhantomJSDriverService;

public class Hooks {
    public static RemoteWebDriver driver;
    public static String strBaseURL;

    private static String CHROME_MAC_DRIVER = "/drivers/chrome/chromedriver";
    private static String CHROME_WINDOWS_DRIVER = "/drivers/chrome/chromedriver.exe";
    private static String CHROME_LINUX_DRIVER = "/drivers/chrome/chromedriverlinux";

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
        String gridUrl = "https://turbo-seleniumgrid.hesos.net/wd/hub";

        if (env == null)
            env = "local";
        switch (env) {
            case "local":
                strBaseURL = "https://localhost";
                break;
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
                break;
            case "int":
                strBaseURL = "https://succeed-int-blue.dev.naviance.com";
                break;
            case "prodConnection":
                strBaseURL = "https://connection.naviance.com";
                break;
            case "QAGreen":
                strBaseURL = "https://succeed-green-int.dev.naviance.com";
                break;
            case "QABlue":
                strBaseURL = "https://succeed-blue-int.dev.naviance.com";
                break;
            case "intHUBS":
                strBaseURL = "https://connection-int.dev.naviance.com";
                break;
            default:
                strBaseURL = "https://succeed-internal.naviance.com";
                break;
        }


        String browser = System.getProperty("BROWSER");

        if (browser == null) {
            browser = "chrome";
        }
        if (browser.equals("chrome")) {

            if (System.getProperty("os.name").contains("Mac")) {
                File cDriver = new File(Hooks.class.getResource(CHROME_MAC_DRIVER).getFile());

                // Is it executable
                if (!cDriver.canExecute()) {
                    cDriver.setExecutable(true);
                }
                System.setProperty("webdriver.chrome.driver", Hooks.class.getResource(CHROME_MAC_DRIVER).getFile());

            } else if (System.getProperty("os.name").contains("Linux")) {
                System.setProperty("webdriver.chrome.driver", Hooks.class.getResource(CHROME_LINUX_DRIVER).getFile());
            }
            else {
                System.setProperty("webdriver.chrome.driver", Hooks.class.getResource(CHROME_WINDOWS_DRIVER).getFile());

            }

            ChromeOptions options = new ChromeOptions();
            options.addArguments("--start-maximized");
            options.addArguments("--ignore-certificate-errors");
            driver = new ChromeDriver(options);

           // driver = new ChromeDriver(dc);

        } else if (browser.equals("firefox")) {
            driver = new FirefoxDriver(dc);


        } else if (browser.equals("ie")) {
            driver = new InternetExplorerDriver(dc);

        } else if (browser.equals("gridChrome")) {
            dc.setBrowserName("chrome");
            dc.setPlatform(Platform.LINUX);
            driver = new RemoteWebDriver(new URL(gridUrl), dc);

        } else if (browser.equals("safari")) {
            driver = new SafariDriver(dc);

         }
        System.out.println("Opening Browser...." + browser);
        driver.manage().deleteAllCookies();
        if(!env.equals("intHUBS") && !env.equals("prodConnection")) {
            driver.get(strBaseURL);
        }
        driver.manage().window().setSize(new Dimension(1920, 760));
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
                //byte[] screenshot = getScreenshotAs(OutputType.BYTES);
                byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
                scenario.embed(screenshot, "image/png");
            } catch (WebDriverException somePlatformsDontSupportScreenshots) {
                System.err.println(somePlatformsDontSupportScreenshots.getMessage());
            }
        }
        driver.quit();
    }
}