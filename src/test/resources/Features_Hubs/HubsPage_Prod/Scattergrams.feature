@hubs @scattegrams
Feature: As a student i'd like to see an updated scattergram UI that reflects concordanced work

  Background:
    Given I log in to Family Connection with the following user details:
      | naviance | benhubs | Hobsons!23 |
    When I open the HUBS page for "Alabama A&M University"
    Then I open the Admissions tab

  Scenario: The 'Comparing' drop down has the options Unweighted and Weighted GPA
    Then The "Comparing" drop down should have the options:
    | Unweighted GPA |
    | Weighted GPA   |
  @smoke
  Scenario: The 'vs.' drop down has the options: SAT (1600 Scale), SAT (2400 scale) and ACT (HUBS-854)
    Then The "vs." drop down should have the options:
    | SAT (1600 Scale)              |
    | SAT (2400 Scale with Writing) |
    | ACT                           |

  Scenario: The 'KEY' section is displayed under the Scattergrams
    Then The "KEY section" should be displayed in Scattergrams

  Scenario: The description is displayed below the scattergrams KEY section
    Then The "description" should be displayed in Scattergrams

  Scenario: The description is expanded after clicking 'Show more'
    When I expand the description using 'Show more' in the Scattergrams description
    Then The Scattergrams description should be expanded

  Scenario: The description is collapsed after clicking 'Show less'
    When I expand the description using 'Show more' in the Scattergrams description
    And I collapse the desciption using 'Show less' in the Scattergrams description

  Scenario: A tooltip with the scattergrams information is displayed after clicking the information icon.The tooltip
  should be closed after clicking the x
    When I open the information tooltip using the information icon in Scattergrams
    Then An information tooltip should be displayed
    When Close the information tooltip using the x
    Then The tooltip should be closed
