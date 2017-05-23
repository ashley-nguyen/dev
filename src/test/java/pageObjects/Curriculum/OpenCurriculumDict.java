package pageObjects.Curriculum;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pageObjects.BaseClass;

/**
 * Created by nipamsharma on 5/5/17.
 */
public class OpenCurriculumDict extends BaseClass {



    @FindBy(linkText= "Naviance Curriculum")
    public static WebElement curriculumLink;


    @FindBy(css=".ng-scope>h1") 
    public static WebElement curriculumHeader;



    public OpenCurriculumDict(WebDriver driver){

        super(driver);
        PageFactory.initElements(driver, this);
    }
}
