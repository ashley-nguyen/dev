@reports @td2 @district @regression
Feature: Course Reports tests for Reports Feature
  In order to navigate to Reports
  as a Naviance user
  I want to verify the existance of all the reports under Course Reports

  Background:
    Given when I log in with the following user details:
      | qaedis1 | sangeetha.sadmin | password |

  @Coursereport
  Scenario Outline: Verify Course Reports
    Then I verify course "<CourseReport>" report page

    Examples:
      | CourseReport                                                         |
      | College Power Score Distribution By Ethnicity                        |
      | College Power Score Distribution By Ethnicity Chart                  |
      | College Power Score Distribution By Gender                           |
      | College Power Score Distribution By Gender Chart                     |
      | College Power Score Distribution By Grade Level                      |
      | College Power Score Distribution By Grade Level Chart                |
      | Course Demand Forecast                                               |
      | Course Demand Forecast Chart                                         |
      | Course Plan Rigor Distribution By Ethnicity                          |
      | Course Plan Rigor Distribution By Ethnicity Chart                    |
      | Course Plan Rigor Distribution By Gender                             |
      | Course Plan Rigor Distribution By Gender Chart                       |
      | Course Plan Rigor Distribution By Grade Level                        |
      | Course Plan Rigor Distribution By Grade Level Chart                  |
      | Course Plan Status                                                   |
      | Course Plan Status Chart                                             |
      | Number of students interested in each course by gender and ethnicity |


