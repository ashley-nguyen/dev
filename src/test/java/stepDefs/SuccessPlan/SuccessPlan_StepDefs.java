package stepDefs.SuccessPlan;

import actions.Student.Search.SuccessPlanTab.SuccessPlan;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by franksejas on 06/15/2016.
 */
public class SuccessPlan_StepDefs {

    @When("^I click on Success Plan tab$")
    public void i_click_on_success_plan_tab() throws Throwable {

        SuccessPlan.ClickOnSuccessPlanTab();
    }

    @Then("^I click on add custom task link$")
      public void i_click_on_add_custom_task() throws Throwable {

        SuccessPlan.ClickOnAddCustomTask();
    }

    @Then("^I click on assign school tasks link$")
    public void i_click_on_assign_school_tasks() throws Throwable {

        SuccessPlan.ClickOnAssignSchoolTasks();
    }

    @Then("^I click on assign district tasks link$")
    public void i_click_on_assign_district_tasks() throws Throwable {

        SuccessPlan.ClickOnAssignDistrictTasks();
    }

    @Then("^I select \"(.*)\" from available assignation school task$")
    public void i_select_available_assignation_task(String task) throws Throwable {

        SuccessPlan.SelectAvailableTask(task);
    }

    @Then("^I select \"(.*)\" from available assignation district task$")
    public void i_select_available_assignation_district_task(String task) throws Throwable {

        SuccessPlan.SelectAvailableDistrictTask(task);
    }

    @Then("^I write in new task textbox the \"(.*)\" name$")
    public void i_write_in_new_task(String newTask) throws Throwable {

        SuccessPlan.WriteInNewTask(newTask);
    }

    @Then("^I write in due date the \"(.*)\" due date$")
      public void i_write_in_due_date(String dueDate) throws Throwable {

        SuccessPlan.WriteInDueDate(dueDate);
    }

    @Then("^I click on send reminder check box$")
    public void i_click_on_send_reminder() throws Throwable {

        SuccessPlan.ClickOnSendReminder();
    }

    @Then("^I click on Save button$")
    public void i_click_on_save_button() throws Throwable {

        SuccessPlan.ClickOnSaveButton();
    }

    @Then("^I verify that task \"(.*)\" was created$")
    public void i_verify_task_was_created(String taskName) throws Throwable {

        SuccessPlan.verifyTaskCreated(taskName);
    }
}