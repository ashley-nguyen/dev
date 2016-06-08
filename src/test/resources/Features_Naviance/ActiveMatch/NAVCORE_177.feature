@activematch @nondestructive
Feature: Active Match (NAVCORE-177)
  As an Administrator I need_to be able to acknowledge that I have proper consent when I enable ActiveMatch by grade
  level so that I can control who has access to the feature

  Scenario Outline: Verify that user can view a pop-up window with a brief explanation(can see bubble for Active Match).
    Given I am logged into Naviance "<account>" as "<user>" with "<password>"
    When I enter to Family Connection
    Then I should not see errors in Family Connection
    Then I click on Select and Update Optional Features link
    When I verify the Active Match information "<info>"

  Examples:
  | user           | account | password | info                                                         |
  | stan.smith     | rtd1    | stan01!  |  ActiveMatch allows students to receive messages from higher education institutions, respond to messages from higher education institutions, and engage in a dialogue with higher education institutions for the purpose of exploring secondary education options. |

  Scenario Outline: Verify that user can Upon enabling a grade level.
    Given I am logged into Naviance "<account>" as "<user>" with "<password>"
    When I enter to Family Connection
    Then I should not see errors in Family Connection
    Then I click on Select and Update Optional Features link
    When I click on Grade Level "<level>"

  Examples:
    | user           | account | password | level |
    | stan.smith     | rtd1    | stan01!  |  9    |