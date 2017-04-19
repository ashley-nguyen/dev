@hubs @internationalqualifications
Feature: As an International HS student, I need the ability to see International application data so I can make
  informed decisions about colleges.

  Background:
    Given I log in to Family Connection with the following user details:
      | hubsintl | samstudent | Hobsons!23  |
    When I open the HUBS page for "Adelphi"

  Scenario: Each International Qualification is displayed with a correct requirement status
    Then I should see each International Qualification with a correct value:
    | Essay;REQUIRED              |
    | Recommendations;REQUIRED    |
    | Ability To Finance;REQUIRED |
    | Campus Visit;RECOMMENDED    |
    | Interview;RECOMMENDED       |

