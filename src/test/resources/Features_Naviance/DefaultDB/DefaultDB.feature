@defaultdb @td2
Feature: Default DB tests
  in order to navigate to Login
  as a Naviance user
  I want to verify that after login display the home page correctly and without errors.

Scenario Outline: Verify DefaultDB
  Given I am logged into Naviance "<account>" as "<user>" with "<password>"
  Then I verify that home page is displayed without errors

Examples:
  | account     | user       | password  |
  | rtd1        | stan.smith | stan01!   |


  Scenario Outline: Verify Write DB
    Given I am logged into Naviance "<account>" as "<user>" with "<password>"
    When I go to the Courses
    Then I verify the Course Catalog page

  Examples:
    | account     | user       | password  |
    | rtd1        | stan.smith | stan01!   |
