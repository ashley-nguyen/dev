@reports @td2 @district @regression
Feature: Scholarship Reports tests
  In order to navigate to Reports
  as a Naviance user
  I want to verify the existance of all the reports under Scholarship Report

  Background:
    Given when I log in with the following user details:
      | bernathigh | sangeetha.munuswamy | password |

  @Coursereport
  Scenario Outline: Verify Course Reports Custom page
    Then I verify scholarship "<ScholarshipReports>" report page

    Examples:
      | ScholarshipReports                |
      | Scholarship Detail by Scholarship |
      | Scholarship Detail by Student     |
      | Scholarship Summary by Scholarship|
      | Scholarship Summary by Student    |


