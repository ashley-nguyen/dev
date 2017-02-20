@smtp @td2
Feature: SMTP tests
  in order to navigate to add new User
  as a Naviance user Administrator
  I want to verify that email is sent

Scenario Outline: Verify SMTP was sent
  Given I am logged into Naviance "<account>" as "<user>" with "<password>"
  When I add new user with First Name as "<firstname>" Last Name as "<lastname>" User Name as "<username>" Email as "<email>" Confirm Email as "<email>" Role as "<role>"
  Then I verify new user with First Name as "<firstname>" Last Name as "<lastname>" and User Name as "<username>" was added without errors

Examples:
  | account     | user       | password  | firstname | lastname      | username       | email             |  role             |
  | blueqa1        | frank.district | password   | TestName  | Last Name Test| User Name test | fsejasm@gmail.com |  District Analyst |

