package pageObjects.Curriculum;

import org.openqa.selenium.By;
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

    @FindBy(how = How.LINK_TEXT, using= "Activity")
    public static WebElement lnkActivity;

    @FindBy(how = How.LINK_TEXT, using= "Progress")
    public static WebElement lnkProgress;

    @FindBy(how = How.LINK_TEXT, using= "Explore Themes")
    public static WebElement ButtonExploreThemes;

    @FindBy(how = How.LINK_TEXT, using="Scope And Sequence")
    public static WebElement lnkScopeAndSequence;

    @FindBy(how = How.CSS, using="option[value='0']")
    public static WebElement SelectSixthGrade;

    @FindBy(how = How.LINK_TEXT, using = "Go to Level")
    public static WebElement GoToLevel;

    @FindBy(how = How.CSS, using="option[value='1']")
    public static WebElement SelectSeventhGrade;

    @FindBy(how = How.CSS, using="option[value='2']")
    public static WebElement SelectEigthGrade;

    @FindBy(how = How.CSS, using="option[value='3']")
    public static WebElement SelectNinthGrade;

    @FindBy(how = How.CSS, using="option[value='4']")
    public static WebElement SelectTenthGrade;

    @FindBy(how = How.CSS, using="option[value='5']")
    public static WebElement SelectEleventhGrade;

    @FindBy(how = How.CSS, using="option[value='6']")
    public static WebElement SelectTwelfthGrade;

    @FindBy(how = How.LINK_TEXT, using = "Self-Discovery")
    public static WebElement lnkSelfDiscovery;

    @FindBy(how = How.LINK_TEXT, using = "Success Skills")
    public static WebElement lnkSuccessSkills;

    @FindBy(how = How.LINK_TEXT, using = "Support Networks")
    public static WebElement lnkSupportNetworks;

    @FindBy(how = How.LINK_TEXT, using = "College Planning")
    public static WebElement lnkCollegePlanning;

    @FindBy(how = How.LINK_TEXT, using = "Career Planning")
    public static WebElement lnkCareerPlanning;

    @FindBy(how = How.LINK_TEXT, using = "Financial Planning")
    public static WebElement lnkFinancialPLanning;



}
