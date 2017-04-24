@reports @td2 @district @regression
Feature: Student Reports tests
  In order to navigate to Reports
  as a Naviance user
  I want to verify the existance of all the reports under Student Report

  Background:
    Given when I log in with the following user details:
      | blue1hs | stan.smith | stan01! |

  @Studentreports
  Scenario Outline: Verify Students Reports Custom page
    Then I verify student "<StudentReports>" report page

    Examples:
      | StudentReports                 |
      | Class Profiles         |
      | Learning Style Status |
      | MI Advantage Status    |
      | Parent Usage           |
      | Student Data           |
      | Student Outcome List |
      | Student Outcome Statistics Detail |
      | Student Outcome Statistics Summary |
      | Student Usage                      |
