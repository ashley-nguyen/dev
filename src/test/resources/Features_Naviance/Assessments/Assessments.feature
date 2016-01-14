@assessments @td2
Feature: Assessments
  in order to ensure show Assessments
  as a Naviance user
  I want to be able to view data in Assessments

  Scenario Outline: Verify Assessments is displayed correctly
    Given I am logged into naviance "<account>" as "<user>" with "<password>"
    When I search for <student> using the global search field
    And I click on Assessments tab
    Then I should not see errors in Assessments

  Examples:
    | user           | account | password | student      |
    | cathycounselor | etcs    | testtest | Banks, Dante |