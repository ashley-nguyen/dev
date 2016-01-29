@dashboard @td2
Feature: Course tests
  in order to navigate to Course >> Course Catalog
  as a Naviance user
  I want to verify that Course Catalog it's being displayed

  Scenario Outline: Verify Course Catalog
    Given I am logged into Naviance "<account>" as "<user>" with "<password>"
    When I go to the Courses
    Then I verify the Course Catalog page

  Examples:
    | account     | user       | password   |
    | qadistrict  | jtester    | jtester01! |

  Scenario Outline: Verify High School Courses
    Given I am logged into Naviance "<account>" as "<user>" with "<password>"
    When I click on Advanced Computer Science
    Then I verify the Advanced Computer Science contents

  Examples:
    | account     | user       | password   |
    | qadistrict  | jtester    | jtester01! |

  Scenario Outline: Verify High School Subjects
    Given I am logged into Naviance "<account>" as "<user>" with "<password>"
    When I click on Economics
    Then I verify the Economics contents

  Examples:
    | account     | user       | password      |
    | qadistrict  | jtester    | jtester01!    |
#    | etdh        | jcounselor | jcounselor01! |

  Scenario Outline: Verify Recomendations
    Given I am logged into Naviance "<account>" as "<user>" with "<password>"
    When I navigate to Recommendations
    Then I verify the Recommendation not show errors

  Examples:
    | account     | user       | password      |
    |  rtd1    | stan.smith    | stan01!       |

