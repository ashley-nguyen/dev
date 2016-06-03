@smoketest @nondestructive @login
Feature: Login to Family Connection

  Scenario Outline: Login to Family Connection
    Given I am a student
    When I log into family connection "<account>" as "<user>" and "<password>"
    Then I will be signed into Family Connection
    Examples:
      | account    | user       | password  |
      | rtsa       | amandahubs | hubs2016  |

  Scenario: Login to Family Connection with incorrect credentials
    Given I am a student
    When I log into family connection "rtsa" as "incorrectUser" and "incorrectPassword"
    Then I see a credentials error message