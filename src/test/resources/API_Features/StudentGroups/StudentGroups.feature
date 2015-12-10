

    Scenario add a valid student group
      Given I am an authorized user
      When I add student group with the following details:
      | mygroupname | 1 |
      Then the group will be created

    Scenario add an invalid student group
    Given I am an authorized user
    When I add student group with the following details:
    | mygroupname |  |
    Then the group will not be created