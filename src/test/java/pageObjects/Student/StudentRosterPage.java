package pageObjects.Student;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import pageObjects.BaseClass;

/**
 * Created by csackrider on 12/7/2015.
 */
public class StudentRosterPage extends BaseClass {


    @FindBy(how = How.NAME, using = "student_id")
    public static WebElement txtStudentID;


    @FindBy(how = How.NAME, using = "idSearch")
    public static WebElement btnStudentIDSearch;

    public StudentRosterPage(WebDriver driver) {
        super(driver);
    }
}
