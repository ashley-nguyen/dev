@dashboard @td2
Feature: Dashboard tests
  in order to navigate to Naviance School >> Planner >> Dashboard ->
  as a Naviance user
  I want to verify that would not show double menu and "An error occurred!"

Scenario Outline: Verify Dashboard
  Given I am logged into Naviance "<account>" as "<user>" with "<password>"
  When I go to the Planner dashboard
  Then I wi ll see data in recent updates
Examples:
  | account     | user       | password  |
  | rtd1        | stan.smith | stan01!   |

