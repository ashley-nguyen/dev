@iam @td2
Feature: IAM tests
  in order to navigate to Login into Naviance
  as a Naviance Admin User
  I will NOT be logged into the district and NOT able to perform normal administrative functions.
  Note: Needs current sessions ID

#  Scenario Outline: Verify Logged in
#    Given I am on the following url "<url>"
#    When I am logged into Naviance "<account>" as "<user>" with "<password>"
#    Then I will logged into the district and able to perform normal administrative functions
#  Examples:
#    | account     | user       | password  | url                                                           |
#    | rtd1        | stan.smith | stan01!   | https://succeed-n1.dev.naviance.com/auth/admin?did=7802700DUS |
#    | rtd1        | stan.smith | stan01!   | https://succeed-n1.dev.naviance.com/auth/admin?nid=180837USPU |
#    | rtd1        | stan.smith | stan01!   | https://succeed-n1.dev.naviance.com/auth/admin?nid=837USPU    |
#
#Scenario Outline: Verify not logged
#    Given I am on the following url "<url>"
#    When I am logged into Naviance "<account>" as "<user>" with "<password>"
#    Then I will not be logged into the district and not able to perform normal administrative functions
#  Examples:
#   | account     | user       | password  | url                                                           |
#   | rtd1        | stan.smith | stan01!!  | https://succeed-n1.dev.naviance.com/auth/admin?did=7802700DUS |
#   | rtd1        | stan.smith | stan01!   | https://succeed-n1.dev.naviance.com/auth/admin?nid=180837USPU |
#   | rtd1        | stan.smith | stan01!   | https://succeed-n1.dev.naviance.com/auth/admin?nid=837USPU    |
