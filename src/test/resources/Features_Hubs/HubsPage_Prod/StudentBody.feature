@hubs @studentbody
Feature:  As a student viewing new Hubs' Student Life tab, I want to see a school population module to give
  me an idea what sort of community the school is

  Background:
    Given I log in to Family Connection with the following user details:
      | naviance | amandahubs | Hobsons!23 |
    When I open the HUBS page for "Pratt Institute"
    And I open the Student Life tab
  @smoke
  Scenario: The Total Students number is displayed with correct data
    Then The Total Students number should be "4,690" in Ethnicity Data
  @smoke
  Scenario: The percentages for each ethnicity group are displayed with correct data
    Then The percentage for each Ethnic Group in Ethnicity Data is contained in the following table
      | White / Caucasian,42%       |
      | Asian,12%                   |
      | Hispanic / Latino,9%        |
      | Ethnicity Unknown,7%        |
      | Black / African American,5% |

  Scenario: The Total Student number in Gender Data is displayed with correct data
    Then The Total Students number should be "3,279" in Gender Data

  Scenario: The percentages of Gender Data are displayed with correct data
    Then The percentage for each gender in Gender Data is as follows:
    | Female;68% |
    | Male;32%   |

  Scenario: The Total Students number in Age is displayed with correct data
    Then The Total Students number should be "4,690" in Age

  Scenario: The percentages of Age are displayed with correct data
    Then The percentage for each age group in Age is as follows:
    | Over 24;6%   |
    | Under 24;94% |


