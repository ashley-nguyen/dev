@LOR @Smoke
Feature: Family Connection - LOR
  As student with add LOR permission I should be able to request and cancel letters of recommendation and track the most recent
  status of my requests here

  Background:
    Given I log into family connection "rtsa" as "moon" and "naviance"
    When I request new letters of recommendation

  Scenario: Verify adding All Applications request
    When I add a new request for All Applications for teacher "Teacher, Jane"
    Then I see the new request in List Page with success message "Way to go! Jane Teacher will be notified of this recommendation request for"

  Scenario: Verify adding Specific College request
    When I add a new request for Specific College for teacher "Teacher, Jane"
    Then I see the new request in List Page with success message "Way to go! Jane Teacher will be notified of this recommendation request"

  Scenario: Verify error message for selecting same teacher
    When I add a new request for All Applications for the same teacher "Teacher, Jane"
    Then I see error message for selecting the same teacher for All Applications "You've already asked Jane Teacher to write a recommendation for all applications."
    And I see error message for selecting the same teacher for Specific College "You've already asked Jane Teacher to write a recommendation for this college."

  Scenario: Verify All Applications option tooltip in Request Page
    When I am in Request Page
    Then I verify All Applications option info tooltip "Selecting this option indicates you want this teacher's recommendation to be submitted to every college where you apply.""For colleges that limit the number of letters of recommendation allowed, recommenders who submit first will fulfill that limit, and any subsequent letters will not be accepted by the college."

  Scenario: Verify cancelling LOR request
    When I cancel LOR request
    Then The request is cancelled and I verify confirmation message "Success! Your request for Jane Teacher to write a letter of recommendation for All Applications has been cancelled."
