Feature: Creating a group

    Scenario creating a new group
      Given I am an authorized user
      When I add group with the following required details:
      | mygroupname | 1 |
      Then the group will be created

    Scenario creating a new group
      Given I am an authorized user
      When I add group with group name and no tenant id:
      | mygroupname |  |
      Then the group will not be created

    Scenario: creating a new group
      Given I am an authorized user
      When I add a group with tenant id and no group name:
      ||1|
      Then the group will not be created

    Scenario: creating a new group
      Given I am an authorized user
      When I add a group with no group name and no tenant id:
      |||
      Then the group will not be created

    Scenario: creating a new group
      Given I am an authorized user
      When I add a group with group name exceeding the max length and tenant id:
        |shfsahfhsdhuds| 2 |
      Then the group will not be created