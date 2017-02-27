@Tasks
Feature: Dashboard tests
  in order to navigate to Naviance School >> Planner >> Tasks ->
  as a Naviance user
  I want to verify that Tasks page is opened"

  Scenario Outline: Verify Assign And Manage
    Given I am logged into Naviance "<account>" as "<user>" with "<password>"
    When I go to the Planner Tasks
    Then I will verify Tasks Page
    Examples:
      | account     | user       | password  |
      | qaedis1     |  sangeetha.sadmin | password   |