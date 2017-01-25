@tasks
Feature:Verify different actions with tasks
  In order to use tasks created effectively
  As a Naviance user
  I want to be able to create, edit, view and delete different types of tasks in the system

  Scenario Outline: Navigate to Tasks page
    Given I am logged into Naviance "<account>" as "<user>" with "<password>"
    When I go to the Planner Tasks
    Then I should see the Task Library
    Examples:
      | account     | user       | password  |
      | bernathigh        | Akshatha.SSmanager | Education@12   |
