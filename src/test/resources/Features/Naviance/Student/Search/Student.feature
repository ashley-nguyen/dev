Feature: Student
  in order to ensure student success
  as a Naviance user
  I want to be able to search and manage student data

  Scenario Outline: Global search for students
    Given I am logged into naviance <account> as <user> with <password>
    When I search for <student> using the global search field
    Then their student <data> will be displayed

    Examples:
      | user |  account | password  | student | data  |
      | cathycounselor  | etcs  | testtest  | Banks, Dante  | 952-1532 Sodales Road |