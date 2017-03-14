@hubs @quickfacts
Feature:  As a student viewing new Hubs' Overview tab, I want to see contact information so that I can understand how
  to communicate with the school

  Background:
    Given I log in to Family Connection with the following user details:
      | rtsa       | amandahubs | hubs2016  |
    When I open the HUBS page for "Alma"
  @smoke
  Scenario: The data in Quick Facts is correct
    Then Data in Quick Facts should be as follows:
    | Website;alma.edu                                |
    | School Type;Private / 4 Year                    |
    | CEEB Code;1010                                  |
    | ACT Code;1958                                   |
    | Undergraduate Enrollment;1,396                  |
    | Student-to-Faculty Ratio;12 to 1                |
    | Religious Affiliation;Presbyterian Church (USA) |
    | Campus Surroundings;Small Town                  |

  Scenario: Degrees Offered are displayed with correct values in Quick Facts
    Then Degrees Offered contains the following values:
    | Bachelors  |

