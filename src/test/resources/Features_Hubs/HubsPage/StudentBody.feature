@smoketest @nondestructive @hubs @studentbody
Feature:  As a student viewing new Hubs' Student Life tab, I want to see a school population module to give
  me an idea what sort of community the school is

  Background:
    Given I log in to Family Connection with the following user details:
      | rtsa       | amandahubs | hubs2016  |
    When I open the HUBS page for "Auburn"
    And I open the Student Life tab

  Scenario: The Total Students number is displayed with correct data
    Then The Total Students number should be "25,912" in Ethnicity Data

  Scenario: The percentages for each ethnicity group are displayed with correct data
    Then The percentage for each Ethnic Group in Ethnicity Data is contained in the following table
      | White / Caucasian,81%       |
      | Black / African American,7% |
      | Asian,2%                    |
      | Hispanic / Latino,2%        |
      | Ethnicity Unknown,1%        |
      | Native American,1%          |

  Scenario: The Total Student number in Gender Data is displayed with correct data
    Then The Total Students number should be "25,912" in Gender Data

  Scenario Outline: The percentages of Gender Data are displayed with correct data
    Then The percentage for "<gender>" is "<value>" in Gender Data
    Examples:
    | gender | value                |
    | Male   | 51%                  |
    | Female | 49%                  |

  Scenario: The Total Students number in Age is displayed withb correct data
    Then The Total Students number should be "25,912" in Age

  Scenario Outline: The percentages of Age are displayed with correct data
    Then The percentage for "<ageGroup>" is "<value>" in Age
    Examples:
    | ageGroup | value                |
    | Over 24  | 4%                   |
    | Under 24 | 96%                  |


