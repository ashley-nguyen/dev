@alumnitracker @td2
Feature: AlumniTracker tests
  in order to navigate to Setup >> AlumniTracker >> Prepare Alumni File
  as a Naviance user
  I want to verify that would not show "A Fatal Error!"


  Scenario Outline: Verify AlumniTracker page
    Given I am logged into Naviance "<account>" as "<user>" with "<password>"
    When  I click on selected "<school>" link
    When I go to the Alumni Tracker
    Then I verify fatal error in the page
    When I go to Prepare an alumni profile file
    Then the Alumni Tracker page is showed successfully
  Examples:
    | account     | user       | password  | school   |
    | rtd1        | stan.smith | stan01!   | School A |