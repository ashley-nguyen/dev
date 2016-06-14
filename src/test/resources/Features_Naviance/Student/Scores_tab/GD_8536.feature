@activematch @nondestructive
Feature: Active Match (GD-8536)
  As an Administrator I need_to be able to add/edit test scores with no problem.
  Verify issue with record ID range being out of scope is no longer preventing score updates

  Scenario Outline: Verify that user can be able to add/edit test scores with no problem.
    Given I am logged into Naviance "<account>" as "<user>" with "<password>"
    When I search for <student> using the global search field
    And I click on Scores tab
    And I click on add edit scores link
    And I click on update button
    Then I verify that system back to the score tab

  Examples:
  | user           | account    | password | student     |
  | stan.smith     | rtsa       | stan01!  |  a101, a101 |

  Scenario Outline: Verify that user can be able to edit test PSAT scores with no problem.
    Given I am logged into Naviance "<account>" as "<user>" with "<password>"
    When I search for <student> using the global search field
    And I enter PSAT legacy scores <criticalreading> <math> <writing> <totalscore> <month> <year> <grade>
    And I click on update button
    Then I verify that system back to the score tab

  Examples:
    | user           | account    | password | student        | criticalreading | math | writing | totalscore | month | year | grade | warning |
    | stan.smith     | rtsa       | stan01!  | a101, a101     | 80              | 80   | 80      | 160        | Jan   | 2014 | 11    | none    |

  Scenario Outline: Verify that user can't be able to edit test PSAT scores and return warning message.
    Given I am logged into Naviance "<account>" as "<user>" with "<password>"
    When I search for <student> using the global search field
    And I enter PSAT legacy scores <criticalreading> <math> <writing> <totalscore> <month> <year> <grade>
    Then I should see PSAT <warning>
    Then I verify that system does not back to the score tab

  Examples:
    | user           | account    | password | student        | criticalreading | math | writing | totalscore | month | year | grade | warning |
    | stan.smith     | rtsa       | stan01!  | a101, a101     | 80              | 80   | 80      | 160        | Jan   | 2014 | 11    | none    |
    | stan.smith     | rtsa       | stan01!  | a101, a101     | 81              |      |         |            |       |      |       | Please make sure you enter a score between 20 and 80 |
    | stan.smith     | rtsa       | stan01!  | a101, a101     |                 | 19   |         |            |       |      |       | Please make sure you enter a score between 20 and 80 |
    | stan.smith     | rtsa       | stan01!  | a101, a101     |                 |      | 99      |            |       |      |       | Please make sure you enter a score between 20 and 80 |
