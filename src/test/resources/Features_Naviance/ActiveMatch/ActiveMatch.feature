@activematch @nondestructive @NAVCORE_177
Feature: Active Match (NAVCORE-177)
  As an Administrator I need_to be able to acknowledge that I have proper consent when I enable ActiveMatch by grade
  level so that I can control who has access to the feature

  Background:
    Given I am logged into Naviance "blueqa1" as "frank.district" with "password"

  Scenario Outline: Verify that user can view a pop-up window with a brief explanation(can see bubble for Active Match).
    When I enter to Family Connection
    Then I verify the Active Match information "<info>"

  Examples:
  | info                                                         |
  |  ActiveMatch allows students to receive messages from higher education institutions, respond to messages from higher education institutions, and engage in a dialogue with higher education institutions for the purpose of exploring secondary education options. |

  Scenario Outline: Verify that user can Upon enabling a grade level.
    When I enter to Family Connection
    Then I should not see errors in Family Connection in "<level>" grade level

  Examples:
    | level |
    |  9    |