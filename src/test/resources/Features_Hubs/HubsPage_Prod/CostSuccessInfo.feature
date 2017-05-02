@hubs @costsuccessinfo
Feature: As a student exploring a college, I want to see a top bar with high-level cost and success information
  so that I can form a quick opinion about the school

  Background:
    Given I log in to Family Connection with the following user details:
      | naviance | benhubs | Hobsons!23 |
    When I open the HUBS page for "Arcadia University"
  @smoke
  Scenario: Average Total Cost is displayed with correct data for each income selected in the Information Top bar
    Then Average Total Cost should correspond to the income as follows:
    | $0 - $30K;21,046   |
    | $30 - $48K;21,223  |
    | $48 - $75K;23,573  |
    | $75 - $110K;26,540 |
    | > $110K;27,357     |
  @smoke
  Scenario: Graduation Rate is displayed with correct data in the Information Top bar
    Then Graduation Rate should be "60" with correct data in the Information Top bar

  Scenario: Acceptance Rate  is displayed with correct data
    Then Acceptance Rate should be "59" with correct data in the Information Top bar

  Scenario: Priority  is displayed with correct data in the Information Top bar
    Then The Priority date should be "July" "28" in the Information Top bar
  @smoke
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

  Scenario: The URL contains "Admissions"
    When I open the link "Check out Scattergrams to see how this relates to you" in the Overview Info Top Bar
    Then The URL should contain "Admissions"

  Scenario: The user is redirected to Application Information section after clicking "See all deadlines"
  (Bug: HUBS-774-fixed)
    When I open the link "See all deadlines" in the Overview Info Top Bar
    Then I should be redirected to the section "Application Information" in Admissions

  Scenario: Average Total Cost, Graduation Rate and Acceptance Rate should display the date of the data
    Then The text "from 2016" should be displayed under the sections in Overview Info Top bar
  @smoke
  Scenario: The number of colleges with overlaps in the legacy list should be the same than the number in Overlaps (HUBS-905)
    Then The number in overlaps should be the same as the number of colleges in the following json:
    """
    [
      {"collegeId":"ccd5d7bc-bc1f-4cd5-b9c0-23c1454efeaf","name":"Docufide Institute of Technology (not a real school)"},
      {"collegeId": "4f4e8187-483b-4d25-a315-1637b6a7f010","name": "Harvard University"},
      {"collegeId": "b9e4a709-1e43-4922-80d2-23677e8eedb9","name": "The University of Alabama"},
      {"collegeId": "2ef1b47e-cf3f-400e-88b1-60bf479b072a","name": "Adelphi University"},
      {"collegeId": "294c0e8b-6d59-44ad-b5b1-ad6d27dcf5f2","name": "Amherst College"},
      {"collegeId": "1c3c6fa6-fb86-4294-b76c-387e74fe4db6","name": "The University of Arizona"},
      {"collegeId": "bb4ccc04-88da-4de2-ac44-20c82ba4d66f","name": "Brooklyn College - CUNY"},
      {"collegeId": "89bbd23d-a671-4d3b-9a39-4636fd1847d1","name": "Curry College"},
      {"collegeId": "752877ef-0932-4563-a4ee-5fc69204bca5","name": "University of Wisconsin-Madison"},
      {"collegeId": "7531bcd9-b9d5-4806-81a2-45acee1f6f12","name": "University of New Haven"},
      {"collegeId": "3409a84f-2875-4aa7-b175-c7baac9e20ba","name": "Alaska Pacific University"},
      {"collegeId": "cc26b75a-a1b8-4725-a819-69151b9f260f","name": "Georgetown University"},
      {"collegeId": "a0e9d39f-9349-44f6-94ea-118e05a98236","name": "Colorado State University"},
      {"collegeId": "176a6b94-ebc9-409a-9ca0-d9e9771973b4","name": "St. Edward's University"}
    ]
    """

  Scenario: The colleges in the list in legacy should be contained in the json list obtained from the overlaps endpoint (HUBS-905)
    When I open the overlaps list in Legacy Family Connection
    Then The colleges in the legacy list should be contained in the following json:
    """
    [
      {"collegeId":"ccd5d7bc-bc1f-4cd5-b9c0-23c1454efeaf","name":"Docufide Institute of Technology (not a real school)"},
      {"collegeId": "4f4e8187-483b-4d25-a315-1637b6a7f010","name": "Harvard University"},
      {"collegeId": "b9e4a709-1e43-4922-80d2-23677e8eedb9","name": "The University of Alabama"},
      {"collegeId": "2ef1b47e-cf3f-400e-88b1-60bf479b072a","name": "Adelphi University"},
      {"collegeId": "294c0e8b-6d59-44ad-b5b1-ad6d27dcf5f2","name": "Amherst College"},
      {"collegeId": "1c3c6fa6-fb86-4294-b76c-387e74fe4db6","name": "The University of Arizona"},
      {"collegeId": "bb4ccc04-88da-4de2-ac44-20c82ba4d66f","name": "Brooklyn College - CUNY"},
      {"collegeId": "89bbd23d-a671-4d3b-9a39-4636fd1847d1","name": "Curry College"},
      {"collegeId": "752877ef-0932-4563-a4ee-5fc69204bca5","name": "University of Wisconsin-Madison"},
      {"collegeId": "7531bcd9-b9d5-4806-81a2-45acee1f6f12","name": "University of New Haven"},
      {"collegeId": "3409a84f-2875-4aa7-b175-c7baac9e20ba","name": "Alaska Pacific University"},
      {"collegeId": "cc26b75a-a1b8-4725-a819-69151b9f260f","name": "Georgetown University"},
      {"collegeId": "a0e9d39f-9349-44f6-94ea-118e05a98236","name": "Colorado State University"},
      {"collegeId": "176a6b94-ebc9-409a-9ca0-d9e9771973b4","name": "St. Edward's University"}
    ]
    """

  Scenario Outline: A tooltip is displayed after clicking the information icon
    When I open the information tooltip clicking the information icon in "<section>"
    Then A tooltip should be displayed in "<section>"
    And I open the information tooltip clicking the information icon in "<section>"
    Then The tooltip in "<section>" should be closed
  Examples:
    | section           |
    | Average Net Price |
    | Graduation Rate   |
    | Acceptance Rate   |
