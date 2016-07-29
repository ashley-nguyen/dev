@iam @td2
Feature: IAM tests
  in order to navigate to Login into Naviance
  as a Naviance Admin User
  I will NOT be logged into the district and NOT able to perform normal administrative functions.
  Note: Needs current sessions ID

  Scenario Outline: Verify Logged in
    Given I am on the following url "<url>"
    When I am logged into Naviance with "<user>" with "<password>"
    Then I will logged into the district and able to perform normal administrative functions
  Examples:
    | user       | password  | url                                                           |
    | crm | naviance   | https://succeed-int-blue.dev.naviance.com/auth/admin?did=7802700DUS |

  Scenario Outline: Verify not logged
    Given I am on the following url "<url>"
    When I am logged into Naviance with "<user>" with "<password>"
    Then I will not be logged into the district and not able to perform normal administrative functions
  Examples:
    | user       | password  | url                                                           |
    | crm | naviance1   | https://succeed-int-blue.dev.naviance.com/auth/admin?nid=837USPU    |

