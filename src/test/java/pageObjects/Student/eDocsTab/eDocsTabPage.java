package pageObjects.Student.eDocsTab;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import pageObjects.BaseClass;

/**
 * Created by jbarnard on 12/9/2015.
 */
public class eDocsTabPage extends BaseClass  {


        @FindBy(how = How.XPATH, using = "//*[@id='primary']/li[6]/a")
        public static WebElement tabeDocs;


        public eDocsTabPage(WebDriver driver) {
        super(driver);
    }}
