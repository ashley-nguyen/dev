package stepDefs.DataImport;

import actions.Setup.DataImport;
import cucumber.api.java.en.When;

import static actions.Setup.SSO.GoToSetup;

/**
 * Created by franksejas on 07/20/2016.
 */
public class DataImport_StepDefs {

    @When("^I go to Data Import$")
    public void i_go_to_data_import() throws Throwable {
        GoToSetup();
        DataImport.NavigateToDataImport();
        DataImport.ClickOnNewStudentRecords();
        DataImport.ClickOnChooseFileButton();
    }

    @When("^I click on Add new student records$")
    public void i_click_on_add_new_student_record() throws Throwable {
        DataImport.ClickOnNewStudentRecords();
    }

    @When("^I click on Choose File button$")
    public void i_click_on_choose_file_button() throws Throwable {
        DataImport.ClickOnChooseFileButton();
    }

    @When("^I write the file name \"(.*)\" to import students$")
    public void i_write_the_file_name_to_import_students(String filename) throws Throwable {
        DataImport.WriteFileNameToImportStudent(filename);
    }



   }