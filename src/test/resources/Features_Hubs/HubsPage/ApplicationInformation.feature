@smoketest @nondestructive @hubs @applicationinformation
Feature:  As a student viewing new Hubs' Overview tab, I want to see contact information so that I can understand how
  to communicate with the school

  Background:
    Given I log in to Family Connection with the following user details:
      | rtsa       | amandahubs | hubs2016  |
    When I open the HUBS page for "Adelphi"
    And I open the Admissions tab

  Scenario Outline: The "Required" requirements for "Freshman" are displayed with correct data
    When I open "Deadlines" in Application Information
    Then The deadline with name "<name>" and date "<date>" should be displayed in Application Information
    Examples:
    | name                           | date   |
    | Early Action Deadline          | Dec 1  |
    | Rolling Deadline               | Mar 1  |