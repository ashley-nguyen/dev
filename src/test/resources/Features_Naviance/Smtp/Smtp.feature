@smtp @td2
Feature: SMTP tests
  in order to navigate to add new User
  as a Naviance user Administrator
  I want to verify that email is sent

Scenario Outline: Verify Dashboard
  Given I am logged into Naviance "<account>" as "<user>" with "<password>"
  Given I am in Naviance district setup
  When I go to the Add New User
  And I fill the First Name as "Test"
  And I fill the Last Name as "Last Test"
  And I fill the User Name as "User Name"
  And I fill the Email as "fsejasm@gmail.com"
  And I fill the Confirm Email as "fsejasm@gmail.com"
  And I select the Role as "District Analyst"
  And I click on Add User button
  Then I verify new user "Test" was added without errors
  Then I verify new user "Last Test" was added without errors
  Then I verify new user "User Name" was added without errors

Examples:
  | account     | user       | password  |
  | rtd1        | stan.smith | stan01!   |

