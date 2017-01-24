@reports @td2 @district @regression
Feature: Reports tests
  in order to navigate to Reports
  as a Naviance user
  I want to verify that would not show "A Fatal Error!"

  Background:
    Given when I log in with the following user details:
      | qaedis1 | sangeetha.sadmin | password |

  @Coursereport
  Scenario Outline: Verify Course Reports Custom page
    Then I verify scholarship "<ScholarshipReports>" report page

    Examples:
      | ScholarshipReports                |
      | Scholarship Detail by Scholarship |
      | Scholarship Detail by Student     |
      | Scholarship Summary by Scholarship|
      | Scholarship Summary by Student    |


