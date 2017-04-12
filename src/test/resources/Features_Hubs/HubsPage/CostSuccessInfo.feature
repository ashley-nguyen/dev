@hubs @costsuccessinfo
Feature: As a student exploring a college, I want to see a top bar with high-level cost and success information
  so that I can form a quick opinion about the school

  Background:
    Given I log in to Family Connection with the following user details:
      | rtsa  | benhubs | Hobsons!23  |
    When I open the HUBS page for "Auburn"
  @smoke
  Scenario: Average Total Cost is displayed with correct data for each income selected in the Information Top bar
    Then Average Total Cost should correspond to the income as follows:
    | $0 - $30K;13,191   |
    | $30 - $48K;16,272  |
    | $48 - $75K;18,240  |
    | $75 - $110K;19,276 |
    | > $110K;20,142     |
  @smoke
  Scenario: Graduation Rate is displayed with correct data in the Information Top bar
    Then Graduation Rate should be "71" with correct data in the Information Top bar

  Scenario: Acceptance Rate  is displayed with correct data
    Then Acceptance Rate should be "83" with correct data in the Information Top bar

  Scenario: Priority  is displayed with correct data in the Information Top bar
    Then The Priority date should be "December" "13" in the Information Top bar
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
      {"collegeId":"c1413763-f9cb-401b-9b46-1004e0dee2aa","name":"Virginia Highlands Community College"},
      {"collegeId":"d5b6754a-f8aa-49e5-8e8c-d3f7ad0df2e4","name":"University of Montevallo"},
      {"collegeId":"28ac2561-8516-4896-91b1-68c7052f7d97","name":"Alabama A&M University"},
      {"collegeId":"d5b6754a-f8aa-49e5-8e8c-d3f7ad0df2e3","name":"Adrian College"},
      {"collegeId":"d5b6754a-f8aa-49e5-8e8c-d3f7ad0df212","name":"George Mason University"},
      {"collegeId":"a004ba0c-feb0-4af6-b300-dc68209c9bc1","name":"University of Washington Seattle"},
      {"collegeId":"d5b6754a-f8aa-49e5-8e8c-d3f7ad0df2e8","name":"Alma College"},
      {"collegeId":"86a39936-2ec2-4b8a-9c50-81bf266b86c4","name":"Burlington College"},
      {"collegeId":"d5b6754a-f8aa-49e5-8e8c-d3f7ad0df2e6","name":"Albion College"},
      {"collegeId":"d5b6754a-f8aa-49e5-8e8c-d3f7ad0df2e7","name":"Alcorn State University"},
      {"collegeId":"d5b6754a-f8aa-49e5-8e8c-d3f7ad0df210","name":"Adelphi University"},
      {"collegeId":"beedc948-9eb5-482c-b009-6f1c1e4c5937","name":"Alabama State University"},
      {"collegeId":"d5b6754a-f8aa-49e5-8e8c-d3f7ad0df2e9","name":"Alpena Community College"},
      {"collegeId":"f519eb2c-2660-43ac-89cd-59d3279a7797","name":"University of California-Berkeley"},
      {"collegeId":"d5b6754a-f8aa-49e5-8e8c-d3f7ad0df211","name":"The University of Arizona"},
      {"collegeId":"ff3e8062-9743-4e1d-bdd6-84f539a0dc68","name":"The Ohio State University Agricultural Technical Inst"},
      {"collegeId":"f305d160-7f87-430c-b7ea-c8b5445b0413","name":"Art Academy of Cincinnati"}
    ]
    """

  Scenario: The colleges in the list in legacy should be contained in the json list obtained from the overlaps endpoint (HUBS-905)
    When I open the overlaps list in Legacy Family Connection
    Then The colleges in the legacy list should be contained in the following json:
    """
    [
      {"collegeId":"c1413763-f9cb-401b-9b46-1004e0dee2aa","name":"Virginia Highlands Community College"},
      {"collegeId":"d5b6754a-f8aa-49e5-8e8c-d3f7ad0df2e4","name":"University of Montevallo"},
      {"collegeId":"28ac2561-8516-4896-91b1-68c7052f7d97","name":"Alabama A&M University"},
      {"collegeId":"d5b6754a-f8aa-49e5-8e8c-d3f7ad0df2e3","name":"Adrian College"},
      {"collegeId":"d5b6754a-f8aa-49e5-8e8c-d3f7ad0df212","name":"George Mason University"},
      {"collegeId":"a004ba0c-feb0-4af6-b300-dc68209c9bc1","name":"University of Washington Seattle"},
      {"collegeId":"d5b6754a-f8aa-49e5-8e8c-d3f7ad0df2e8","name":"Alma College"},
      {"collegeId":"86a39936-2ec2-4b8a-9c50-81bf266b86c4","name":"Burlington College"},
      {"collegeId":"d5b6754a-f8aa-49e5-8e8c-d3f7ad0df2e6","name":"Albion College"},
      {"collegeId":"d5b6754a-f8aa-49e5-8e8c-d3f7ad0df2e7","name":"Alcorn State University"},
      {"collegeId":"d5b6754a-f8aa-49e5-8e8c-d3f7ad0df210","name":"Adelphi University"},
      {"collegeId":"beedc948-9eb5-482c-b009-6f1c1e4c5937","name":"Alabama State University"},
      {"collegeId":"d5b6754a-f8aa-49e5-8e8c-d3f7ad0df2e9","name":"Alpena Community College"},
      {"collegeId":"f519eb2c-2660-43ac-89cd-59d3279a7797","name":"University of California-Berkeley"},
      {"collegeId":"d5b6754a-f8aa-49e5-8e8c-d3f7ad0df211","name":"The University of Arizona"},
      {"collegeId":"ff3e8062-9743-4e1d-bdd6-84f539a0dc68","name":"The Ohio State University Agricultural Technical Inst"},
      {"collegeId":"f305d160-7f87-430c-b7ea-c8b5445b0413","name":"Art Academy of Cincinnati"}
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
