package pageObjects.Student;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import pageObjects.BaseClass;


/**
 * Created by sahara.navia on 3/23/17.
 */
public class DeleteStudentPage extends BaseClass {

    @FindBy(how = How.LINK_TEXT, using = "delete student")
    public static WebElement lnkDeleteStudent;

    @FindBy(how = How.ID, using = "deleteStudent2")
    public static WebElement btnDeleteStudent;

    public DeleteStudentPage(WebDriver driver) {
        super(driver);
    }
}

