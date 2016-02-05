@connections
Feature: Connections Errors test
  in order to ensure no errors in the page
  as a Naviance user
  I want to be able to Check status and view history of emails sent

  Scenario Outline: Verify Connections E-Mail displayed correctly
    Given I am logged into Naviance "<account>" as "<user>" with "<password>"
    When I enter to Check status and view history of emails sent
    Then I should not see errors in Check Status Email
    When I am on the following url "<url>"
    Then I should not see errors in Email

  Examples:
    | user           | account | password | url                                                                                    |
    | stan.smith     | rtd1    | stan01!  |  https://succeed.naviance.com/connections/communications/email/view_bounce.php |

  Scenario Outline: Verify Family Connections displayed correctly
    Given I am logged into Naviance "<account>" as "<user>" with "<password>"
    When I enter to Family Connection
    Then I should not see errors in Family Connection

  Examples:
    | user           | account | password |
    | stan.smith     | rtd1    | stan01!  |

