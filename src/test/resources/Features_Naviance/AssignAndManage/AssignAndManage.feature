@AssignAndManage
Feature: Dashboard tests
  in order to navigate to Naviance School >> Planner >> Assign And Manage ->
  as a Naviance user
  I want to verify that Assign and Manage page is opened"

Scenario Outline: Verify Assign And Manage
  Given I am logged into Naviance "<account>" as "<user>" with "<password>"
  When I go to the Planner Assign And Manage
  Then I will verify Assign and Manage Page
Examples:
  | account     | user       | password  |
  | bernathigh | sangeetha.munuswamy | password |


