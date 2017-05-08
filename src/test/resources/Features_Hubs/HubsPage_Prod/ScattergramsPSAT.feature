@hubs @scattegrams
Feature: As a student i'd like to see an updated scattergram UI that reflects concordanced work

  Background:
    Given I log in to Family Connection with the following user details:
      | naviance | allenhubs | hubs2016 |
    When I open the HUBS page for "Auburn"
    Then I open the Admissions tab
  @smoke
  Scenario: A tooltip should be displayed after clicking the PSAT/SAT information icon
    When I select "PSAT/SAT (1600 Scale)" in the "second" dropdown in Scattergrams
    And I open the tooltip with the information icon in PSAT/SAT
    Then I should see the PSAT/SAT tooltip displayed