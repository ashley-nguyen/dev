@alumnitracker @td2
Feature: AlumniTracker tests
  in order to navigate to Setup >> AlumniTracker >> Prepare Alumni File
  as a Naviance user
  I want to verify that would not show "A Fatal Error!"


  Scenario Outline: Verify AlumniTracker page
    Given I am logged into naviance "<account>" as "<user>" with "<password>"
    Given I am in Naviance district setup
    And I go to the Alumni Tracker
    And I go to Prepare an alumni profile file
    And I click on Send File
    Then I see a fatal error in the page
  Examples:
    | account     | user       | password  |
    | rtd1        | stan.smith | stan01!   |