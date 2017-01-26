@applicationmanager
Feature: Application Manager tests
  in order to navigate to Application Manager
  as a Naviance user
  I want to verify that not page errors is displayed

Scenario Outline: Verify Application Manager actions
  Given I am logged into Naviance "<account>" as "<user>" with "<password>"
  When I go to Application Manager
  Then I will see data in Application Manager selecting "<item>"
Examples:
  | account     | user       | password  | item                       |
  | blueqa1        | frank.district | password   | class of 2017 (grade 12)   |

