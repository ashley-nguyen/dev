@smoketest @td2
Feature: Student
  in order to ensure student success
  as a Naviance user
  I want to be able to search and manage student data

  Scenario Outline: Global search for students
    Given I am logged into naviance "<account>" as "<user>" with "<password>"
    When I search for <student> using the global search field
    Then their student <data> will be displayed

    Examples:
      | user           | account | password | student      | data                  |
      | cathycounselor | etcs    | testtest | Banks, Dante | 952-1532 Sodales Road |


# THIS TEST VERIFES TD-16 FOR CONFIG PRAMETER MIGRATION (TD-2)
# IF THE STUDENT RECORD DISPLAYS THEN THE PARAM IS WORKING
  Scenario Outline: Parent has student at same school (can link)
    Given when I log in with the following user details:
      | etdh | jcounselor | jcounselor01! |
    When I search for "jbrady001" using "id" the student roster search
    Then their student <data> will be displayed

    Examples:
      | data      |
      | jbrady001 |
