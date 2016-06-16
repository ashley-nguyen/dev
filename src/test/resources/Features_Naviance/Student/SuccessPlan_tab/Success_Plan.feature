@destructive  @successplan
Feature: Student Success Plan
  in order to track Tasks
  as a Naviance user
  I want to be able to add custom tasks, assign school tasks and assign district tasks

  Background:
    Given when I log in with the following user details:
      | rtsa | stan.smith | stan01! |

  @addcustomtask
  Scenario Outline: Add custom task
    When I search for <student> using the global search field
    And I click on Success Plan tab
    Then I click on add custom task link
    And I write in new task textbox the "<taskname>" name
    And I write in due date the "<duedate>" due date
    And I click on send reminder check box
    And I click on Save button
    Then I verify that task "<taskname>" was created

  Examples:
    | student       | taskname    | duedate   | writing | mathematics_score | math_test | totalscore | month | year | grade | warning                                                                                                             |
    | a101, a101    | New Task 1  | 2016-06-30| 35      | 160               | 35        | 160        | Jan   | 2014 | 11    | none                                                                                                                |