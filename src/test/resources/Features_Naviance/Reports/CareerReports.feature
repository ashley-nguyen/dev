@reports @td2 @district @regression
  Feature: Career Reports tests
  In order to navigate to Reports
  as a Naviance user
  I want to verify the existance of all the reports under Career Reports

  Background:
    Given when I log in with the following user details:
      | qaedis1 | sangeetha.sadmin | password |

  @Coursereport
  Scenario Outline: Verify career Reports
    Then I verify career "<CareerReports>" report page

    Examples:
      | CareerReports              |
      | Assessment Status          |
      | Career Cluster By Student  |
      | Careers By Student         |
      | Students By Career         |
      | Students By Career Cluster |
