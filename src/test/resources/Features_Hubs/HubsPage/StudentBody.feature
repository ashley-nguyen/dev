@smoketest @nondestructive @hubs @studentbody
Feature:  As a student viewing new Hubs' Student Life tab, I want to see a school population module to give
  me an idea what sort of community the school is

  Background:
    Given I log in to Family Connection with the following user details:
      | rtsa       | amandahubs | hubs2016  |
    And I click on the Colleges tab
    And I go to the Page View for "Auburn"
    And I click the Beta Button
    And I click the Student Life tab

  Scenario: The Total Students number is displayed with correct data
    Then The Total Students number should be "25912" in Ethnicity Data

  Scenario Outline: The percentages for each ethnicity group are displayed with correct data
    Then The percentage for "<ethnicGroup>" is "<value>" in Ethnicity Data
    Examples:
    | ethnicGroup              | value                |
    | Native American          | 1% (259 students)    |
    | Ethnicity Unknown        | 1% (259 students)    |
    | White / Caucasian        | 81% (20989 students) |
    | International Students   | 1% (259 students)    |
    | Hispanic / Latino        | 2% (518 students)    |
    | Black / African American | 7% (1814 students)   |
    | Non-resident Alien       | 5% (1296 students)   |
    | Asian                    | 2% (518 students)    |

  Scenario: The Total Student number in Gender Data is displayed with correct data
    Then The Total Students number should be "25912" in Gender Data

  Scenario Outline: The percentages of Gender Data are displayed with correct data
    Then The percentage for "<gender>" is "<value>" in Gender Data
    Examples:
    | gender | value                |
    | Male   | 51% (13215 students) |
    | Female | 49% (12697 students) |

  Scenario: The Total Students number in Age is displayed withb correct data
    Then The Total Students number should be "25912" in Age

  Scenario Outline: The percentages of Age are displayed with correct data
    Then The percentage for "<ageGroup>" is "<value>" in Age
    Examples:
    | ageGroup | value                |
    | Over 24  | 4% (1036 students)   |
    | Under 24 | 96% (24876 students) |


