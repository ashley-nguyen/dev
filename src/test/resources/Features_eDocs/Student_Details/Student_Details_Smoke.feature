Feature: View student details
  In order to figure out a plan of action
  As a registered counselor
  I want to view details for the student

  Background:
    Given I am logged into naviance mtuprodjb as jabarnard with naviance

  @edocssmoketest @safe
  Scenario Outline: Authenticated counselor having the ability to view student details
    When I am accessing the "<studentID>" edocs tab
    Then I will see "<text>"
#
    Examples:
      | studentID    | text                   |
      | samstudentID | No active applications |
      | NavStudent1  | Adelphi Univ           |

#  @javascript
#  Scenario Outline: Authenticated counselor viewing student details
#    Given I am accessing Student Details page for "<studentReversed>"
#    Then I see the student details page for "<student>"
#    And I see class year "2015" for the student

#    Examples:
#      | studentReversed | student     |
#      | Student, Sam    | Sam Student |
#
#  @javascript
#  Scenario Outline: Counselor viewing easy navigation tab on student details
#    Given I am accessing Student Details page for "<studentReversed>"
#    And I see all secondary subnav on this page
#
#    Examples:
#      | studentReversed | student     |
#      | Student, Sam    | Sam Student |