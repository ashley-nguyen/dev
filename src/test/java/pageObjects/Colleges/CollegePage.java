package pageObjects.Colleges;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import pageObjects.BaseClass;

/**
 * Created by csackrider on 11/25/2015.
 */
public class CollegePage extends BaseClass {

    @FindBy(how = How.NAME, using = "collegename")
    public static WebElement txtCollegename;

    @FindBy(how = How.NAME, using = "nameSearch")
    public static WebElement btnSearch;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Admissions')]")
    public static WebElement tabAdmissions;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Academics')]")
    public static WebElement tabAcademics;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Cost & aid')]")
    public static WebElement tabCostAndAid;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Extracurriculars')]")
    public static WebElement tabExtracurriculars;

    @FindBy(how = How.XPATH, using = "(//a[contains(text(),'Colleges')])[2]")
    public static WebElement tabColleges;

    @FindBy(how = How.LINK_TEXT, using = "prospective colleges")
    public static WebElement lnkProspectiveColleges;

    @FindBy(how = How.XPATH, using = "//*[@id=\"contents\"]/table/tbody/tr[1]/td/table/tbody/tr/td[1]/a")
    public static WebElement lnkAddProspectiveColleges;

    @FindBy(how = How.LINK_TEXT, using = "Enter school site")
    public static WebElement lnkEnterSchoolSite;

    @FindBy(how = How.LINK_TEXT, using = "active applications")
    public static WebElement lnkActiveApplications;

    public CollegePage(WebDriver driver) {
        super(driver);
    }
}
