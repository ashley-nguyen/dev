@destructive  @successplan
Feature: Teacher Recommendation
  in order to get Teacher Recommendation
  as a Naviance user
  I want to be able to request, setting up and summary

  Background:
    Given when I log in with the following user details:
      | rtd1 | stan.smith | stan01! |

  @request
  Scenario Outline: Requests Teacher Recommendations
    When I go to request Teacher recommendation with "<request>" "<item>" "<school>"
    Then I can view request for Teacher Recommendation
  Examples:
    | school   | request                  | item                        |
    | School A | class of 2016            | All recommendation requests |

  @settings
  Scenario Outline: Settings Teacher Recommendations
    When I go to set Teacher Recommendation with "<school>"
    Then I can set Teacher Recommendation

  Examples:
    | school   |
    | School A |

#  @summary
#  Scenario Outline: Summary Teacher Recommendations
#    When I go to summary of Teacher Recommendation with "<school>" "<GradeFrom>" "<GradeTo>"
#    Then I can go to Summary Teacher Recommendation
#
#  Examples:
#    | school   | GradeFrom                  | GradeTo                  |
#    | School A | class of 2016              | class of 2016            |