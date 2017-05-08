package pageObjects.Curriculum;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by nipamsharma on 5/5/17.
 */
public class OpenCurriculumDict {


    WebDriver driver;

    @FindBy(linkText= "Naviance Curriculum")
    public static WebElement curriculumLink;






    public OpenCurriculumDict(WebDriver driver){

        this.driver = driver;

        PageFactory.initElements(driver, this);
    }
}
