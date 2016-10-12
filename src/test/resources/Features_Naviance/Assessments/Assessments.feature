@assessments @td2 @regression
Feature: Assessments
  in order to ensure show Assessments
  as a Naviance user
  I want to be able to view data in Assessments

  Scenario Outline: Verify Assessments is displayed correctly
    Given I am logged into Naviance "<account>" as "<user>" with "<password>"
    When I search for <student> using the global search field
    Then I should not see errors in Assessments

  Examples:
    | user           | account | password | student      |
    | stan.smith     | rtsa    | stan01!  | A103, A103   |