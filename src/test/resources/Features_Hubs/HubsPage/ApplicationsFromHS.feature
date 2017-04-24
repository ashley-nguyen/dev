@hubs @applicationsfromhs
Feature:  As a student viewing new Hubs' Overview tab, I want to see contact information so that I can understand how
  to communicate with the school

  Background:
    Given I log in to Family Connection with the following user details:
      | rtsa       | benhubs | Hobsons!23  |
    When I open the HUBS page for "Alcorn"
    And I open the Admissions tab
  @smoke
  Scenario: The applications in the current year are correct in Applications from High School
    Then The applications for the current year should be as follows in Applications from High School:
    #Use 'current' to indicate the current year, 'past' to indicate the past year and 'beforePast' for the year before
    #the past year
    | current;Total Applicants;0      |
    | current;Students Accepted;0     |
    | current;Students Enrolled;0     |
    | past;Total Applicants;18        |
    | past;Students Accepted;18       |
    | past;Students Enrolled;0        |
    | beforePast;Total Applicants;16  |
    | beforePast;Students Accepted;16 |
    | beforePast;Students Enrolled;0  |
