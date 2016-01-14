@reports @td2
Feature: Reports tests
  in order to navigate to Reports
  as a Naviance user
  I want to verify that would not show "A Fatal Error!"

  Background:
    Given when I log in with the following user details:
      | rtd1 | stan.smith | stan01! |

  Scenario: Verify Reports page
    When I go to the Reports
    And I click on Customize link
    And I click on View Report button
    Then I verify report page
