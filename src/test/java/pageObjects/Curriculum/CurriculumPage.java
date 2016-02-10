package pageObjects.Curriculum;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import pageObjects.BaseClass;

/**
 * Created by ttremblay on 1/6/16.
 */
public class CurriculumPage {


    @FindBy(how = How.NAME, using = "Studentsdropdown")
    public static WebElement Students;

    @FindBy(how = How.LINK_TEXT, using = "Classes")
    public static WebElement lnkClasses;

    @FindBy(how = How.LINK_TEXT, using = "Students")
    public static WebElement lnkStudents;
}
