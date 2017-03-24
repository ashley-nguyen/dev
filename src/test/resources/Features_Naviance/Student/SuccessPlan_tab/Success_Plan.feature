@destructive  @successplan
Feature: Student Success Plan
  in order to track Tasks
  as a Naviance user
  I want to be able to add custom tasks, assign school tasks and assign district tasks

  Background:
    Given when I log in with the following user details:
      | blue1hs | stan.smith | stan01! |

  @addcustomtask
  Scenario Outline: Add custom task
    When I search for <student> using the global search field
    And I add custom task with <taskname> <duedate>
    Then I verify that task <taskname> was created

  Examples:
    | student       | taskname    | duedate   |
    | Student1, Transfer    | New Task 1  | 2017-06-30|

  @viewtaskdetails
  Scenario Outline: Assign school tasks
    When I search for <student> using the global search field
    And I assign school task with <item>
    Then I verify that task <item> was created

  Examples:
    | student       | item                           |
    | Student1, Transfer    | Add career clusters to my list |
    | Student1, Transfer    | Add careers to my list         |
    | Student1, Transfer    | Attach file                    |

  @viewtaskdetails
  Scenario Outline: Assign school tasks from district
    When I search for <student> using the global search field
    And I add custom task from district with <item>
    Then I verify that task <item> was created

  Examples:
    | student       | item                           |
    | Student1, Transfer    | Add career clusters to my list |
    | Student1, Transfer    | Add careers to my list         |
    | Student1, Transfer    | Attend college visits          |