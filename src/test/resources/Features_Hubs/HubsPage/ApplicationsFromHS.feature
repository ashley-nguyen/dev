@hubs @applicationsfromhs
Feature:  As a student viewing new Hubs' Overview tab, I want to see contact information so that I can understand how
  to communicate with the school

  Background:
    Given I log in to Family Connection with the following user details:
      | rtsa       | benhubs | hubs2016  |
    When I open the HUBS page for "Adelphi"
    And I open the Admissions tab
  @smoke
  Scenario: The applications in the current year are correct in Applications from High School
    Then The applications for the current year should be as follows in Applications from High School:
    #Use 'current' to indicate the current year, and 'past' to indicate the past year
    | current;Total Applicants;6  |
    | current;Students Accepted;5 |
    | current;Students Enrolled;1 |
    | past;Total Applicants;0     |
    | past;Students Accepted;12   |
    | past;Students Enrolled;0    |
