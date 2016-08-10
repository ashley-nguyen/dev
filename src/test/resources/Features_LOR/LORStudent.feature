@LOR @Smoke
Feature: Family Connection - LOR
  As student with add LOR permission I should be able to request new letters of recommendation and track the most recent
  status of my requests here

  Background:
    Given I log into family connection "rtsa" as "star" and "naviance"
    When I click on the Colleges tab
    And I click on letters of recommendation

  Scenario: Verify default message when there are no LOR's
    Then I see the default message



