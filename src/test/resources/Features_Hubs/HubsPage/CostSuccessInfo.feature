@smoketest @nondestructive @hubs @costsuccessinfo
Feature: As a student exploring a college, I want to see a top bar with high-level cost and success information
  so that I can form a quick opinion about the school

  Background:
    Given I log in to Family Connection with the following user details:
      | rtsa  | benhubs | hubs2016  |
    And I click on the Colleges tab
    And I go to the Page View for "Auburn"
    And I click the Beta Button

  Scenario Outline: Average Total Cost is displayed with correct data for each income selected in the Information Top bar
    Then Average Total Cost should be "<avgTotalCost>" when the income is "<income>"
    Examples:
    | income      | avgTotalCost |
    | $0 - $30K   | 13191        |
    | $30 - $48K  | 16272        |
    | $48 - $75K  | 18240        |
    | $75 - $110K | 19276        |
    | > $110K     | 20142        |

  Scenario: Graduation Rate is displayed with correct data in the Information Top bar
    Then Graduation Rate should be "66" with correct data in the Information Top bar

  Scenario: Acceptance Rate  is displayed with correct data
    Then Acceptance Rate should be "83" with correct data in the Information Top bar

  Scenario: Priority  is displayed with correct data in the Information Top bar
    Then The Priority date should be "January" "15" in the Information Top bar