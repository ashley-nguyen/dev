@smoketest @nondestructive @hubs @applicationinformation
Feature:  As a student viewing new Hubs' Overview tab, I want to see contact information so that I can understand how
  to communicate with the school

  Background:
    Given I log in to Family Connection with the following user details:
      | rtsa       | amandahubs | hubs2016  |
    And I click on the Colleges tab
    And I go to the Page View for "Adelphi"
    And I click the Beta Button
    And I click the Admissions tab

  Scenario Outline: The "Required" requirements for "Freshman" are displayed with correct data
    When I click "Deadlines" in Application Information
    Then The deadline with name "<name>" and date "<date>" should be displayed in Application Information
    Examples:
    | name                           | date   |
    | Early Action Deadline          | Dec 1  |
    | Rolling Deadline               | Mar 1  |
    | Regular Decision Deadline      | Jan 15 |