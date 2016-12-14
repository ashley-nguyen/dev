@smoketest @nondestructive @hubs @collegevisits
Feature: As a parent, I should be able to see the College Visits my counselor creates for me so that I can make a
  good college decision.

  Background:
    Given I log in to Family Connection as a parent with the following user details:
      | rtsa    | dawnrhubs | hubs2016  | Ben Hubs |
    When I open the HUBS page for "Adelphi"

  Scenario: The College Visit page in legacy is displayed after clicking 'Details' in a college visit as a parent
    When I open the college visit details in position "1"
    Then I should see the college visit information page

