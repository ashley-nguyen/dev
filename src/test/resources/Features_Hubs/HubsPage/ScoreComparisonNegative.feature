@smoketest @nondestructive @hubs @scorecomparison
Feature: As a student viewing new Hubs Overview Tab, I want the default score comparison to show other results from
  my high school so that I know how I compare to my immediate peers

  Background:
    Given I log in to Family Connection with the following user details:
      | rtsa  | benhubs | hubs2016  |
    And I click on the Colleges tab
    And I go to the Page View for "Auburn"
    And I click the Beta Button

  Scenario: A question mark is displayed in the dials that don't have Student's data
    Then A question mark for "ACT" is displayed in the dials that don't have Student's data