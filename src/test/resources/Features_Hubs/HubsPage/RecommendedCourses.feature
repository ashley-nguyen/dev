@hubs @recommendedcourses
Feature: As a user, I would like to see the recommended / required courses for a college so that I can be sure to take
  them in high school so that I can improve my chance of acceptance.

  Background:
    Given I log in to Family Connection with the following user details:
      | rtsa  | benhubs | Hobsons!23  |
    When I open the HUBS page for "Alcorn"
    Then I open the Admissions tab
  @smoke
  Scenario: Recommended Courses displayed data is correct
    Then I should see the Recommended Courses with the following data:
    #use 'empty' for the missing data
    | English;4;empty          |
    | Math;3;empty             |
    | Science;3;empty          |
    | Foreign Language;1;empty |
    | History;3;empty          |

  Scenario: The course names are sorted alphabetically after clicking Course Names header
    When I sort data using the "Course Names" header
    Then The course names are sorted alphabetically

  Scenario: The years required are sorted from greatest to least after clicking Years Required header
    When I sort data using the "Years Required" header
    Then The "years required" are sorted from greatest to least

  Scenario: The years recommended are sorted from greatest to least after clicking Years Required header
  (HUBS-852 - Working as designed)
    When I sort data using the "Years Recommended" header
    Then The "years recommended" are sorted from greatest to least