@reports @td2 @district @regression
Feature: Reports tests
  in order to navigate to Reports
  as a Naviance user
  I want to verify that would not show "A Fatal Error!"

  Background:
    Given when I log in with the following user details:
      | rtd1 | stan.smith | stan01! |

  @student
  Scenario: Verify Reports Student page
    When I go to the Reports
    Then I verify report page

  @usagereport
  Scenario: Verify Usage Reports Custom page
    Then I verify usage report page

  @planningreport
  Scenario: Verify Planning Reports Custom page
    Then I verify planning report page

  @outcomereport
  Scenario: Verify Outcome Reports Custom page
    Then I verify outcome report page

  @sholarshipreport
  Scenario: Verify Scholarship Reports Custom page
    Then I verify scholarship report page

  @collegereport
  Scenario: Verify College Reports Custom page
    Then I verify college report page