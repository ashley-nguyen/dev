@smoketest @nondestructive @hubs @costsuccessinfo
Feature: As a student exploring a college, I want to see a top bar with high-level cost and success information
  so that I can form a quick opinion about the school

  Background:
    Given I log in to Family Connection with the following user details:
      | rtsa  | benhubs | hubs2016  |
    When I open the HUBS page for "Auburn"

  Scenario Outline: Average Total Cost is displayed with correct data for each income selected in the Information Top bar
    Then Average Total Cost should be "<avgTotalCost>" when the income is "<income>"
    Examples:
    | income      | avgTotalCost |
    | $0 - $30K   | 13,191        |
    | $30 - $48K  | 16,272        |
    | $48 - $75K  | 18,240        |
    | $75 - $110K | 19,276        |
    | > $110K     | 20,142        |

  Scenario: Graduation Rate is displayed with correct data in the Information Top bar
    Then Graduation Rate should be "66" with correct data in the Information Top bar

  Scenario: Acceptance Rate  is displayed with correct data
    Then Acceptance Rate should be "83" with correct data in the Information Top bar

  Scenario: Priority  is displayed with correct data in the Information Top bar
    Then The Priority date should be "January" "15" in the Information Top bar

  Scenario: The user is redirected to Costs Module after clicking "More about Cost & Aid"
    When I open the link "More about Cost & Aid" in the Overview Info Top Bar
    Then I should be redirected to the section "So what's it going to cost?" in Costs

  Scenario: The URL contains "Costs#cost-module"
    When I open the link "More about Cost & Aid" in the Overview Info Top Bar
    Then The URL should contain "Costs#cost-module"

  Scenario: The user is redirected to Studies tab after clicking "More about Learning Environment"
    When I open the link "More about Learning Environment" in the Overview Info Top Bar
    Then I should be redirected to the tab "Studies"

  Scenario: The URL contains "Studies"
    When I open the link "More about Learning Environment" in the Overview Info Top Bar
    Then The URL should contain "Studies"

  Scenario: The user is redirected to Admissions tab after clicking "How does this relate to me?"
    When I open the link "How does this relate to me?" in the Overview Info Top Bar
    Then I should be redirected to the tab "Admissions"

  Scenario: The URL contains "Admissions"
    When I open the link "How does this relate to me?" in the Overview Info Top Bar
    Then The URL should contain "Admissions"

  Scenario: The user is redirected to Application Information section after clicking "See all deadlines"
    When I open the link "See all deadlines" in the Overview Info Top Bar
    Then I should be redirected to the section "Application Information" in Admissions

  Scenario: Average Total Cost, Graduation Rate and Acceptance Rate should display the date of the data
    Then The text "from 2016" should be displayed under the sections in Overview Info Top bar