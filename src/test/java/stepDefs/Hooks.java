package stepDefs;

        import java.net.MalformedURLException;
        import org.openqa.selenium.OutputType;
        import org.openqa.selenium.TakesScreenshot;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebDriverException;
        import org.openqa.selenium.chrome.ChromeDriver;
        import cucumber.api.Scenario;
        import cucumber.api.java.After;
        import cucumber.api.java.Before;
        import org.openqa.selenium.firefox.FirefoxDriver;
        import org.openqa.selenium.ie.InternetExplorerDriver;
        //import org.openqa.selenium.phantomjs.PhantomJSDriver;
        //import org.openqa.selenium.phantomjs.PhantomJSDriverService;
        import org.openqa.selenium.remote.DesiredCapabilities;
        import org.openqa.selenium.safari.SafariDriver;
public class Hooks{
    public static WebDriver driver;
    public static String strBaseURL;
    @Before
    /**
     * Delete all cookies at the start of each scenario to avoid
     * shared state between tests
     */
    public void openBrowser() throws MalformedURLException {

        String env = System.getenv("ENV");
        System.out.println("##### ENV: "+ env);
        if (env==null)
            env = "staging";
        switch (env)
        {
            case "staging":
                strBaseURL = "https://succeed-internal.naviance.com";
                break;
            case "prod":
                strBaseURL = "https://succeed.naviance.com";
                break;
            case "succeed04":
                strBaseURL = "https://succeed-04.dev.naviance.com";
                break;
            default:
                strBaseURL = "https://succeed-internal.naviance.com";
                break;
        }


        /*if (env==null)
        { strBaseURL = "https://succeed-internal.naviance.com";}
        else if (env.equals("staging"))
        {strBaseURL = "https://succeed-internal.naviance.com";}
        else if (env.equals("prod"))
        {strBaseURL = "https://succeed.naviance.com";}
        else if (env.equals("succeed04"))
        {strBaseURL = "https://succeed-04.dev.naviance.com";}*/



        String browser = System.getenv("BROWSER");

        if(browser==null)
        {
            browser = System.getenv("BROWSER");
            if(browser==null)
            {
                browser= "firefox";
            }
        }
        if (browser.equals("chrome")) {
            driver = new ChromeDriver();

        } else if (browser.equals("firefox")) {
            driver = new FirefoxDriver();

        } else if (browser.equals("ie")) {
            driver = new InternetExplorerDriver();

        } else if (browser.equals("safari")) {
            driver = new SafariDriver();

        } else {
            driver = new ChromeDriver();

        }
        System.out.println("Opening Browser...."+browser);
        driver.manage().deleteAllCookies();
       driver.get(strBaseURL);
    }
    @After
    /**
     * Embed a screenshot in test report if test is marked as failed
     */
    public void embedScreenshot(Scenario scenario) {
        if(scenario.isFailed()) {
            try {
                scenario.write("Current Page URL is " + driver.getCurrentUrl());
//            byte[] screenshot = getScreenshotAs(OutputType.BYTES);
                byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
                scenario.embed(screenshot, "image/png");
            } catch (WebDriverException somePlatformsDontSupportScreenshots) {
                System.err.println(somePlatformsDontSupportScreenshots.getMessage());
            }
        }
        driver.quit();
    }
}