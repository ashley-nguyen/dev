@destructive  @successplan
Feature: Teacher Recommendation
  in order to get Teacher Recommendation
  as a Naviance user
  I want to be able to request, setting up and summary

  Background:
    Given when I log in with the following user details:
      | blueqa1 | frank.district | password  |

  @request
  Scenario Outline: Requests Teacher Recommendations
    When I go to request Teacher recommendation with "<request>" "<item>" "<school>"
    Then I can view request for Teacher Recommendation
  Examples:
    | school   | request                  | item                        |
    | City high school | class of 2016            | All recommendation requests |

  @settings
  Scenario Outline: Settings Teacher Recommendations
    When I go to set Teacher Recommendation with "<school>"
    Then I can set Teacher Recommendation

  Examples:
    | school   |
    | City high school |

#  @summary
#  Scenario Outline: Summary Teacher Recommendations
#    When I go to summary of Teacher Recommendation with "<school>" "<GradeFrom>" "<GradeTo>"
#    Then I can go to Summary Teacher Recommendation
#
#  Examples:
#    | school   | GradeFrom                  | GradeTo                  |
#    | School A | class of 2016              | class of 2016            |