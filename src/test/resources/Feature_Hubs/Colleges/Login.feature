@smoketest @nondestructive @login
Feature: Login to Family Connection

  Scenario Outline: Login to Family Connection
    Given I am a student
    When I log into family connection "<account>" as "<user>" and "<password>"
    Then I will be signed into Family Connection
    Examples:
      | account    | user       | password  |
      | rtsa       | amandahubs | hubs2016  |