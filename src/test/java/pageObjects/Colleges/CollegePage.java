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

    @FindBy(how = How.LINK_TEXT, using = "Admissions")
    public static WebElement tabAdmissions;

    @FindBy(how = How.LINK_TEXT, using = "Academics")
    public static WebElement tabAcademics;

    @FindBy(how = How.LINK_TEXT, using = "Cost & aid")
    public static WebElement tabCostAndAid;

    @FindBy(how = How.LINK_TEXT, using = "Extracurriculars")
    public static WebElement tabExtracurriculars;

    @FindBy(how = How.CSS, using = "#primary > li:nth-child(6) > a")
    public static WebElement tabColleges;

    @FindBy(how = How.LINK_TEXT, using = "prospective colleges")
    public static WebElement lnkProspectiveColleges;

    @FindBy(how = How.CSS, using = "#contents > table > tbody > tr:nth-of-type(1) > td > table > tbody > tr > td:nth-of-type(1) > a")
    public static WebElement lnkAddProspectiveColleges;

    @FindBy(how = How.LINK_TEXT, using = "Enter school site")
    public static WebElement lnkEnterSchoolSite;

    @FindBy(how = How.LINK_TEXT, using = "active applications")
    public static WebElement lnkActiveApplications;

    @FindBy(how = How.LINK_TEXT, using = "view past visits")
    public static WebElement lnkviewPastVisits;

    @FindBy(how = How.CLASS_NAME, using = "dark_textheader")
    public static WebElement txtMesaggeVerification;

    @FindBy(how = How.NAME, using = "class")
    public static WebElement selClassYear;

    @FindBy(how = How.CSS, using = "#add-request-teacher-id")
    public static WebElement selIdRequest;

    @FindBy(how = How.CSS, using = "#add-request-application-id")
    public static WebElement selIdApplication;

    @FindBy(how = How.CSS, using = "#add-request-button")
    public static WebElement btnAddRequestButton;


    public CollegePage(WebDriver driver) {
        super(driver);
    }
}
