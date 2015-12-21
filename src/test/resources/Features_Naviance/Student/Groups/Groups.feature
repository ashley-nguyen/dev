Feature: Adding a new student group

  Background:
    Given I am logged into naviance etcs as sallysupport with sallysupport01!

  Scenario Outline: User should be able to access Groups and add a group
    When I access Students Groups Add new group
    Then User should see "<text>"

  Examples:
    | text |
    | Add Student Group |
