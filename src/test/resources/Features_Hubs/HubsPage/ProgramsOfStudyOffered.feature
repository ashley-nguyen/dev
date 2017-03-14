@hubs @programsofstudyoffered
Feature: As a student, I want to see information about the school's programs of study in order to determine if the
  school interests me.

  Background:
    Given I log in to Family Connection with the following user details:
      | rtsa  | benhubs | hubs2016  |
    When I open the HUBS page for "Montevallo"
    Then  I open the Studies tab
  @smoke
  Scenario: The programs are filtered when the user searches for a program in the search box
    When I search for a program "Accounting"
    Then The displayed programs should be:
    | Accounting |

  Scenario: The programs for all degrees are displayed when All is selected
    When I open "All" in Majors Offered
    Then The displayed programs should be:

    | Biology/Biological Sciences, General                                          | Accounting                                                                  |
    | Business Administration and Management, General                               | Finance, General                                                            |
    | Management Information Systems, General                                       | Marketing/Marketing Management, General                                     |
    | Communication, Journalism, and Related Programs, Other                        | Mass Communication/Media Studies                                            |
    | Radio and Television                                                          | Counselor Education/School Counseling and Guidance Services                 |
    | Driver and Safety Teacher Education                                           | Early Childhood Education and Teaching                                      |
    | Education, General                                                            | Education/Teaching of Individuals w/ Hearing Impairments Including Deafness |
    | Educational Leadership and Administration, General                            | Elementary Education and Teaching                                           |
    | Music Teacher Education                                                       | Physical Education Teaching and Coaching                                    |
    | Secondary Education and Teaching                                              | English Language and Literature, General                                    |
    | Rhetoric and Composition                                                      | Family and Consumer Economics and Related Services, Other                   |
    | Family and Consumer Sciences/Human Sciences, General                          | Family Resource Management Studies, General                                 |
    | Foreign Languages and Literatures, General                                    | French Language and Literature                                              |
    | Spanish Language and Literature                                               | Audiology/Audiologist                                                       |
    | Speech-Language Pathology/Pathologist                                         | History, General                                                            |
    | Legal Studies, General                                                        | Mathematics, General                                                        |
    | International/Global Studies | Health and Physical Education/Fitness, General |
    | Chemistry, General                                                            | Psychology, General                                                         |
    | Social Work                                                                   | Political Science and Government, General                                   |
    | Social Sciences, General                                                      | Sociology                                                                   |
    | Acting                                                                        | Art/Art Studies, General                                                    |
    | Drama and Dramatics/Theatre Arts, General                                     | Music Performance, General                                                  |
    | Music, General                                                                | Visual and Performing Arts, General                                         |

  Scenario: The programs with a Masters degree offering are displayed
    When I open "Masters" in Majors Offered
    Then The displayed programs should be:
    | Business Administration and Management, General | Counselor Education/School Counseling and Guidance Services |
    | Driver and Safety Teacher Education             | Early Childhood Education and Teaching                      |
    | Educational Leadership and Administration, General | Elementary Education and Teaching                        |
    | Music Teacher Education                            | Physical Education Teaching and Coaching                 |
    | Secondary Education and Teaching                   | English Language and Literature, General                 |
    | Family Resource Management Studies, General        | Speech-Language Pathology/Pathologist                    |
    | History, General                                   | Music Performance, General                               |

  Scenario: The programs with a Associates degree offering are displayed
    When I open "Graduate Certificate" in Majors Offered
    Then The displayed programs should be:
    | Education, General                                 |
    | Educational Leadership and Administration, General |

  Scenario: The colleges offering the program are displayed in college lookup
    When I open "Accounting" in the Majors Offered list
    Then I should see the message "Colleges Offering Accounting" in the College Lookup page