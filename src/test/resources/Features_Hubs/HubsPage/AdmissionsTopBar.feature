@hubs @admissionstopbar
Feature:  As a student viewing new Hubs' Overview tab, I want to see contact information so that I can understand how
  to communicate with the school

  Background:
    Given I log in to Family Connection with the following user details:
      | rtsa  | benhubs | hubs2016  |
    When I open the HUBS page for "Auburn"
    And I open the Admissions tab

  Scenario: The Early Decision Deadline is displayed in Admissions Top Bar with correct data
    Then The Early Decision Deadline should be "December 13" in Admissions Top bar
  @smoke
  Scenario: The Acceptance Rate is displayed in Admissions Top Bar with correct data
    Then The Acceptance Rate should be "83" in Admissions Top Bar

  Scenario: The Important Policies is displayed in Admissions Top Bar with correct data
  Then The Important Policies in Admissions Top Bar should be:
    | Rolling Notification   |
    | Competitive Admissions |
    | Open Registration      |

  Scenario: The Application Fees is displayed in Admissions Top Bar with correct data
    Then Application Fees should be "50" in Admissions Top Bar

  Scenario: A tooltip is displayed after clicking the information icon in Acceptance Rate
    When I open the information tooltip clicking the information icon in Acceptance Rate
    Then A tooltip should be displayed in Acceptance Rate
    And I click the close icon in the tooltip
    Then The tooltip in Acceptance Rate should be closed

