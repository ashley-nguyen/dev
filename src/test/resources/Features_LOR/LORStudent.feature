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

  Scenario: Verify Add Request functionality 
    When I click on Add Request 
    And I select a teacher  "Jane Teacher"
    And I select a college 
    And I click save 
    Then I see my request in the list page with success message "Way to go! Jane Teacher will be notified of this recommendation request for 1 colleges."

