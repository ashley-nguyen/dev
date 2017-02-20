@myaccount
Feature: Application Manager tests
  in order to navigate to Application Manager
  as a Naviance user
  I want to verify that not page errors is displayed

Scenario Outline: Verify My Account page
  Given I am logged into Naviance "<account>" as "<user>" with "<password>"
  When I go to My Account
  Then I will see data in My Account
Examples:
  | account     | user       | password  |
  | blueqa1        | frank.district | password   |

