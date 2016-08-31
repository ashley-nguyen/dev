@smoketest @nondestructive @hubs @studiestopbar
Feature: Purpose: As a student viewing new Hubs' Studies tab, I want to see key information in a top bar so that I
  can review it at a glance

  Background:
    Given I log in to Family Connection with the following user details:
      | rtsa  | amandahubs | hubs2016  |
    And I click on the Colleges tab
    And I go to the Page View for "Adrian"
    And I click the Beta Button
    And I click the Studies tab


  Scenario: The Student Faculty Ratio is displayed with correct data in Studies Top Bar
    Then The Student Faculty Ratio should be "13" data in Studies Top Bar


  Scenario: The Student Retention is displayed with correct data in Studies Top Bar
    Then The Student Retention should be "58" in Studies Top Bar

  Scenario: The Graduation Rate is displayed with correct data in Studies Top Bar
    Then The Graduation Rate should be "54" in Studies Top Bar

  Scenario: The Degrees offered is displayed with correct data in Studies Top Bar
    Then The Degrees offered are displayed with correct data in Studies Top bar:
    | Associates |
    | Masters    |
    | Bachelors  |