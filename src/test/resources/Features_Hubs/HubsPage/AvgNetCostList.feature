@hubs @averagenetcostlist
Feature: As a student viewing new Hubs' Costs tab, I want to see average net price so I can understand more about how
  much this college is likely to cost me

  Background:
    Given I log in to Family Connection with the following user details:
      | rtsa  | benhubs | hubs2016  |
    When I open the HUBS page for "Auburn"
    And I open the Costs tab
  @smoke
  Scenario: Average Net Cost List is displayed with correct data for each income
    Then The following Average Net Cost values should be correct for each income level:
    #use ; to separate the income levels from the values
    | $0 - $30,000;$13,191       |
    | $30,001 - $48,000;$16,272  |
    | $48,001 - $75,000;$18,240  |
    | $75,001 - $110,000;$19,276 |
    | $110,001+;$20,142          |