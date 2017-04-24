@hubs @quickfacts
Feature:  As a student viewing new Hubs' Overview tab, I want to see contact information so that I can understand how
  to communicate with the school

  Background:
    Given I log in to Family Connection with the following user details:
      | rtsa       | amandahubs | Hobsons!23  |
    When I open the HUBS page for "Alcorn"
  @smoke
  Scenario: The data in Quick Facts is correct
    Then Data in Quick Facts should be as follows:
    | Website;alcorn.edu               |
    | School Type;Public / 4 Year      |
    | CEEB Code;1008                   |
    | ACT Code;2176                    |
    | Undergraduate Enrollment;3,006   |
    | Student-to-Faculty Ratio;16 to 1 |
    | Campus Surroundings;Rural        |

  Scenario: Degrees Offered are displayed with correct values in Quick Facts
    Then Degrees Offered contains the following values:
    | Graduate Certification  |
    | Associates              |
    | Masters                 |
    | Doctorate               |
    | Bachelors               |

