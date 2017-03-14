@hubs @studentbody
Feature:  As a student viewing new Hubs' Student Life tab, I want to see a school population module to give
  me an idea what sort of community the school is

  Background:
    Given I log in to Family Connection with the following user details:
      | rtsa       | amandahubs | hubs2016  |
    When I open the HUBS page for "Auburn"
    And I open the Student Life tab
  @smoke
  Scenario: The Total Students number is displayed with correct data
    Then The Total Students number should be "25,912" in Ethnicity Data
  @smoke
  Scenario: The percentages for each ethnicity group are displayed with correct data
    Then The percentage for each Ethnic Group in Ethnicity Data is contained in the following table
      | White / Caucasian,81%       |
      | Black / African American,8% |
      | Asian,2%                    |
      | Hispanic / Latino,2%        |
      | Ethnicity Unknown,1%        |
      | Native American,1%          |

  Scenario: The Total Student number in Gender Data is displayed with correct data
    Then The Total Students number should be "25,912" in Gender Data

  Scenario: The percentages of Gender Data are displayed with correct data
    Then The percentage for each gender in Gender Data is as follows:
    | Female;49% |
    | Male;51%   |

  Scenario: The Total Students number in Age is displayed with correct data
    Then The Total Students number should be "25,912" in Age

  Scenario: The percentages of Age are displayed with correct data
    Then The percentage for each age group in Age is as follows:
    | Over 24;4%   |
    | Under 24;96% |


