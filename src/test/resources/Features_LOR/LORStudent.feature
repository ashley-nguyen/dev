@LOR @Smoke
Feature: Family Connection - LOR
  As student with add LOR permission I should be able to request new letters of recommendation and track the most recent
  status of my requests here

  Background:
    Given I log into family connection "rtsa" as "stan.smith" and "stan01!"
    When I request new letters of recommendation

  Scenario: Verify default message when there are no LOR's
    Then I see the default message

  Scenario: Verify Add Request functionality
    When I adding request functionality selecting "Sejas, Frank"
    Then I see my request in the list page with success message "Way to go! Frank Sejas will be notified of this recommendation request for"

  Scenario Outline: Verify cancelling LOR request
    When I cancel LOR request
    Then The request is cancelled and I verify confirmation message "<info1>" and cancel tooltip "<info2>" text

    Examples:
      |info1 | info2 |
      |Success! Your request for Frank Sejas to write a letter of recommendation for Adelphi University has been cancelled. | Once a letter is no longer "Requested", the request can no longer be cancelled here. Please talk to your teacher or counselor, as they may be able to help.|