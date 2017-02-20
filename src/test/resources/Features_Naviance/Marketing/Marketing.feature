@marketing @td2
Feature: Marketing tests
  in order to navigate to https://succeed-n1.dev.naviance.com/
  as a Naviance user
  I want to verify that login screen is configured correctly and the banner is displayed.

  Scenario:  Verify Login Screen
    Given I navigate to Naviance
    Then I see the image that is displayed in the login screen

  Scenario Outline:  Verify Logout Screen
    Given I am logged into Naviance "<account>" as "<user>" with "<password>"
    When I logout
    Then I see the image that is displayed in the login screen

  Examples:
  | account     | user       | password  |
  | blueqa1     | frank.district | password  |

  Scenario Outline:  Verify Banner is displayed
    Given I am logged into Naviance "<account>" as "<user>" with "<password>"
    When I go to school site
    Then I see the banner for marketplace

  Examples:
    | account     | user       | password  |
    | blueqa1     | frank.district | password  |