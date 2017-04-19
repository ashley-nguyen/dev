@hubs @internationaltestscores
Feature: As an International HS student, I need the ability to see International test score data so I can make
  informed decisions about colleges.

  Background:
    Given I log in to Family Connection with the following user details:
      | hubsintl | samstudent | Hobsons!23  |
    When I open the HUBS page for "Montevallo"

  Scenario: Each Test is displayed with a correct score in International Test Score Ranges
    Then I should see each international test score with a corresponding value:
    | TOEFL (Computer);193;--;-- |
    | TOEFL (Internet);71;--;--  |
    | TOEFL (Paper);525;--;--    |
    | IELTS (Computer);6;--;--   |

