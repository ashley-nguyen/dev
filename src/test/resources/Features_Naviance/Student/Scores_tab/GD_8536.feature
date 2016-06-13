@activematch @nondestructive
Feature: Active Match (GD-8536)
  As an Administrator I need_to be able to edit/delete test scores with no problem.
  Verify issue with record ID range being out of scope is no longer preventing score updates

  Scenario Outline: Verify that user can view a pop-up window with a brief explanation(can see bubble for Active Match).
    Given I am logged into Naviance "<account>" as "<user>" with "<password>"
    When I search for <student> using the global search field
    And I click on Scores tab
    And I click on add edit scores link
    And I click on update button
    Then I verify that system back to the score tab

  Examples:
  | user           | account    | password | student     |
  | stan.smith     | rtsa       | stan01!  |  a101, a101 |
