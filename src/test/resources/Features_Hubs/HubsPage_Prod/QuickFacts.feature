@hubs @quickfacts
Feature:  As a student viewing new Hubs' Overview tab, I want to see contact information so that I can understand how
  to communicate with the school

  Background:
    Given I log in to Family Connection with the following user details:
      | naviance | amandahubs | Hobsons!23  |
    When I open the HUBS page for "Alabama A&M University"
  @smoke
  Scenario: The data in Quick Facts is correct
    Then Data in Quick Facts should be as follows:
    | Website;aamu.edu                 |
    | School Type;Public / 4 Year      |
    | CEEB Code;1003                   |
    | ACT Code;0002                    |
    | Undergraduate Enrollment;4,210   |
    | Student-to-Faculty Ratio;20 to 1 |
    | Campus Surroundings;Small City   |

  Scenario: Degrees Offered are displayed with correct values in Quick Facts
    Then Degrees Offered contains the following values:
    | Doctorate              |
    | Bachelors              |
    | Graduate Certification |
    | Masters                |

