@smoketest @nondestructive @hubs @collegevisits
Feature: As a parent, I should be able to see the College Visits my counselor creates for me so that I can make a
  good college decision.

  Background:
    Given I log in to Family Connection as a parent with the following user details:
      | rtsa    | dawnrhubs | hubs2016  | Ben Hubs |
    When I open the HUBS page for "Adelphi"

  Scenario: The Register button is not displayed for parents
    Then No Register button should be displayed

