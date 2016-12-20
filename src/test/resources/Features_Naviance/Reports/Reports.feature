@reports @td2 @district @regression
Feature: Reports tests
  in order to navigate to Reports
  as a Naviance user
  I want to verify that would not show "A Fatal Error!"

  Background:
    Given when I log in with the following user details:
      | rtsa | stan.smith | stan01! |

  @Studentreport
  Scenario Outline: Verify College Reports Custom page
    Then I verify "<report>" report page

  Examples:
    | report                 |
    | Class Profiles         |
    | Learning Style Status |
    | MI Advantage Status    |
    | Parent Usage           |
    | Student Data           |
    | Student Outcome List |
    | Student Outcome Statistics Detail |
    | Student Outcome Statistics Summary |
    | Student Usage                      |
