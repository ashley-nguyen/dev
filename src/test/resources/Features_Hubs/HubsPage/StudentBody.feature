@hubs @studentbody
Feature:  As a student viewing new Hubs' Student Life tab, I want to see a school population module to give
  me an idea what sort of community the school is

  Background:
    Given I log in to Family Connection with the following user details:
      | rtsa       | amandahubs | Hobsons!23  |
    When I open the HUBS page for "Alcorn"
    And I open the Student Life tab
  @smoke
  Scenario: The Total Students number is displayed with correct data
    Then The Total Students number should be "3,639" in Ethnicity Data
  @smoke
  Scenario: The percentages for each ethnicity group are displayed with correct data
    Then The percentage for each Ethnic Group in Ethnicity Data is contained in the following table
      | Black / African American,92% |
      | White / Caucasian,4%         |
      | Two or more races,1%         |

  Scenario: The Total Student number in Gender Data is displayed with correct data
    Then The Total Students number should be "3,006" in Gender Data

  Scenario: The percentages of Gender Data are displayed with correct data
    Then The percentage for each gender in Gender Data is as follows:
    | Female;64% |
    | Male;36%   |

  Scenario: The Total Students number in Age is displayed with correct data
    Then The Total Students number should be "3,639" in Age

  Scenario: The percentages of Age are displayed with correct data
    Then The percentage for each age group in Age is as follows:
    | Over 24;23%   |
    | Under 24;77% |


