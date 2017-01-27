@transcriptmanager
Feature: Application Manager tests
  in order to navigate to Application Manager
  as a Naviance user
  I want to verify that not page errors is displayed

Scenario Outline: Verify Application Manager actions
  Given I am logged into Naviance "<account>" as "<user>" with "<password>"
  When I go to Journal Dashboard
  Then I will see data in Journal Dashboard
Examples:
  | account     | user       | password  |
  | blueqa1        | frank.district | stan01!   |

