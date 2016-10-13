@connections
Feature: Connections Errors test
  in order to ensure no errors in the page
  as a Naviance user
  I want to be able to Check status and view history of emails sent

  Background:
    Given I am logged into Naviance "rtd1" as "stan.smith" with "stan01!"

  Scenario: Verify Connections E-Mail displayed correctly
    When I enter to Check status and view history of emails sent
    Then I should not see errors in Check Status Email


  Scenario Outline: Verify Connections E-Mail displayed correctly
    When I am on the following url "<url>"
    Then I should not see errors in Email

  Examples:
    | url                                                                            |
    |  https://succeed.naviance.com/connections/communications/email/view_bounce.php |

  Scenario Outline: Verify Family Connections displayed correctly
    When I enter to Family Connection
    Then I should not see errors in Family Connection in "<level>" grade level

  Examples:
  | level |
  | 9     |

  Scenario Outline: Verify Family Connections displayed correctly
    When I am on the following url "<url>"
    Then I should not see errors in Connections

  Examples:
    | url                                                         |
    |  https://succeed.naviance.com/connections/fc/fc.php?sec=xyz |

