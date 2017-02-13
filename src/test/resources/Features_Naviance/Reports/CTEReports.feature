@reports @td2 @district @regression
Feature: CTE Reports tests
  In order to navigate to Reports
  as a Naviance user
  I want to verify the existance of all the reports under CTE Reports

  Background:
    Given when I log in with the following user details:
      | bernathigh | sangeetha.sadmin | password |

  @Coursereport
  Scenario Outline: Verify CTE Reports
    Then I verify CTE "<CTEReports>" report page

    Examples:
      | CTEReports              |
      | Student CTE Codes          |

