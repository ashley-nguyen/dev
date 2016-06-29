@destructive  @successplan
Feature: Teacher Recommendation
  in order to get Teacher Recommendation
  as a Naviance user
  I want to be able to request, setting up and summary

  @request
  Scenario Outline: Requests Teacher Recommendations
    Given I am logged into Naviance "<account>" as "<user>" with "<password>"
    When  I click on selected "<school>" link
    When I click on Teacher Recommendations link
    Then I click on Requests tab
    Then I select "<request>" request from Grade Class
    Then I select "<item>" show me options
    Then I click on show me Go button

  Examples:
    | account     | user       | password  | school   | request                  | item                        |
    | rtd1        | stan.smith | stan01!   | School A | class of 2016 (grade 12) | All recommendation requests |

  @settings
  Scenario Outline: Settings Teacher Recommendations
    Given I am logged into Naviance "<account>" as "<user>" with "<password>"
    When  I click on selected "<school>" link
    When I click on Teacher Recommendations link
    Then I click on Settings tab
    Then I click on Recommendation requests do not require approval
    Then I click on Save setting button

  Examples:
    | account     | user       | password  | school   |
    | rtd1        | stan.smith | stan01!   | School A |

  @summary
  Scenario Outline: Summary Teacher Recommendations
    Given I am logged into Naviance "<account>" as "<user>" with "<password>"
    When  I click on selected "<school>" link
    When I click on Teacher Recommendations link
    Then I click on Summary tab
    Then I select "<GradeFrom>" request from Grade Class range
    Then I select "<GradeTo>" request to Grade Class range
    Then I click on Go summary button

  Examples:
    | account     | user       | password  | school   | GradeFrom                  | GradeTo                  |
    | rtd1        | stan.smith | stan01!   | School A | class of 2016 (grade 12)   | class of 2016 (grade 12) |