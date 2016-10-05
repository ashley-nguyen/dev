package stepDefs.SuccessPlan;

import actions.Student.Search.SuccessPlanTab.SuccessPlan;
import cucumber.api.java.en.And;
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

    @And("^I add custom task with (.*) (.*)$")
    public void I_add_custom_task_with(String newTask, String dueDate, String taskName) throws Throwable {
        SuccessPlan.ClickOnSuccessPlanTab();
        SuccessPlan.ClickOnAddCustomTask();
        SuccessPlan.WriteInNewTask(newTask);
        SuccessPlan.WriteInDueDate(dueDate);
        SuccessPlan.ClickOnSendReminder();
        SuccessPlan.ClickOnSaveButton();
    }

    @And("^I assign school task with (.*)$")
    public void I_assign_school_task(String item) throws Throwable {
        SuccessPlan.ClickOnSuccessPlanTab();
        SuccessPlan.ClickOnAssignSchoolTasks();
        SuccessPlan.SelectAvailableTask(item);
    }

    @And("^I add custom task from district with (.*)$")
    public void I_add_custom_task_from_district(String item) throws Throwable {
        SuccessPlan.ClickOnSuccessPlanTab();
        SuccessPlan.ClickOnAssignDistrictTasks();
        SuccessPlan.SelectAvailableDistrictTask(item);
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