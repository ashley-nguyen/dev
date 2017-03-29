@alumnitracker @td2
Feature: AlumniTracker tests
  in order to navigate to Setup >> AlumniTracker >> Prepare Alumni File
  as a Naviance user
  I want to verify that would not show "A Fatal Error!"

  Scenario Outline: Verify AlumniTracker page
    Given I am logged into Naviance "<account>" as "<user>" with "<password>"
    When I go to Prepare an alumni profile file for "<school>"
    Then the Alumni Tracker page is showed successfully
  Examples:
    | account     | user       | password  | school   |
    | blue1hs        | stan.smith | stan01!   | Int QA Elementary School 1 |