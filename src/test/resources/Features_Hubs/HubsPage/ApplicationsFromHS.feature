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
    #Use 'current' to indicate the current year, 'past' to indicate the past year and 'beforePast' for the year before
    #the past year
    | current;Total Applicants;16     |
    | current;Students Accepted;4     |
    | current;Students Enrolled;2     |
    | past;Total Applicants;15        |
    | past;Students Accepted;20       |
    | past;Students Enrolled;4        |
    | beforePast;Total Applicants;14  |
    | beforePast;Students Accepted;8  |
    | beforePast;Students Enrolled;3  |
