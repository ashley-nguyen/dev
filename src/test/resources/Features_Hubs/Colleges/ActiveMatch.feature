@smoketest @nondestructive
Feature: Active Match (MSB-81)
  As a student with the FERPA block enabled, I want
  to verify that the Active match elements are not displayed

  Scenario: Verify that the match list is not displayed with
  the FERPA block enabled
    Given I log in to Family Connection with the following user details:
      | rtsa       | amandahubs | hubs2016  |
    When I click on the Colleges tab
    And I click in the college match link
    Then The college match list should not be displayed