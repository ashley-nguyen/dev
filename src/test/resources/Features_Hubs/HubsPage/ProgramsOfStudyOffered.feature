@smoketest @nondestructive @hubs @programsofstudyoffered
Feature: As a student, I want to see information about the school's programs of study in order to determine if the
  school interests me.

  Background:
    Given I log in to Family Connection with the following user details:
      | rtsa  | amandahubs | hubs2016  |
    When I open the HUBS page for "Adelphi"
    Then  I open the Studies tab


  Scenario: The programs are filtered when the user searches for a program in the search box
    When I search for a program "Accounting"
    Then The displayed programs should be:
    | Accounting |

  Scenario: The programs for all degrees are displayed when All is selected
    When I open "All" in Majors Offered
    Then The displayed programs should be:
    # : Will update these values after the IPEDS 2015-2016 run . We will have to manually verify it for general launch

    | French Studies                                  | Biology/Biological Sciences, General                      |
    | Exercise Physiology                             | Accounting                                                |
    | Business Administration and Management, General | Business Administration, Management and Operations, Other |
    | Business, Management, Marketing, and Related Support Services, Other | Business/Commerce, General           |
    | Fashion Merchandising                           | International Business/Trade/Commerce                     |
    | Marketing/Marketing Management, General         | Communication and Media Studies, Other                    |
    | Communication, Journalism, and Related Programs, Other | Journalism                                         |
    | Mass Communication/Media Studies                | Public Relations/Image Management                         |
    | Speech Communication and Rhetoric               | Computer and Information Sciences, General                |
    | Art Teacher Education                           | Biology Teacher Education                                 |
    | Drama and Dance Teacher Education               | Earth Science Teacher Education                           |
    | Education, General                              | Elementary Education and Teaching                         |
    | English/Language Arts Teacher Education         | French Language Teacher Education                         |
    | German Language Teacher Education               | Health Teacher Education                                  |
    | History Teacher Education                       | Mathematics Teacher Education                             |
    | Music Teacher Education                         | Physical Education Teaching and Coaching                  |
    | Science Teacher Education/General Science Teacher Education | Secondary Education and Teaching              |
    | Social Science Teacher Education                | Social Studies Teacher Education                          |
    | Spanish Language Teacher Education              | Creative Writing                                          |
    | English Language and Literature, General        | English Language and Literature/Letters, Other            |
    | Rhetoric and Composition                        | Writing, General                                          |
    | Foreign Languages, Literatures, and Linguistics, Other | French Language and Literature                     |
    | German Language and Literature                  | Japanese Language and Literature                          |
    | Spanish Language and Literature                 | Athletic Training/Trainer                                 |
    | Pre-Medicine/Pre-Medical Studies                | Pre-Pharmacy Studies                                      |
    | Pre-Veterinary Studies                          | History, General                                          |
    | Corrections Administration                      | Corrections and Criminal Justice, Other                   |
    | Criminal Justice/Law Enforcement Administration | Criminal Justice/Police Science                           |
    | Legal Studies, General                          | Theatre/Theater                                           |
    | Mathematics, General                            | International/Global Studies                              |
    | Multi-/Interdisciplinary Studies, General       | Multi-/Interdisciplinary Studies, Other                   |
    | Environmental Science                           | Environmental Studies                                     |
    | Health and Physical Education/Fitness, General  | Health and Physical Education/Fitness, Other              |
    | Kinesiology and Exercise Science                | Sport and Fitness Administration/Management               |
    | Philosophy                                      | Philosophy and Religious Studies, Other                   |
    | Religion/Religious Studies                      | Chemistry, General                                        |
    | Geology/Earth Science, General                  | Physics, General                                          |
    | Psychology, General                             | Social Work                                               |
    | Criminology                                     | Economics, General                                        |
    | Political Science and Government, General       | Sociology                                                 |
    | Pre-Theology/Pre-Ministerial Studies            | Theology/Theological Studies                              |
    | Art/Art Studies, General                        | Arts, Entertainment,and Media Management, General         |
    | Drama and Dramatics/Theatre Arts, General       | Fine and Studio Arts Management                           |
    | Fine/Studio Arts, General                       | Interior Design                                           |
    | Music Performance, General                      | Music Theory and Composition                              |
    | Music, General                                  | Music, Other                                              |
    | Musical Theatre                                 | Theatre/Theatre Arts Management                           |
    | Visual and Performing Arts, General             | Visual and Performing Arts, Other                         |

  Scenario: The programs with a Masters degree offering are displayed
    When I open "Masters" in Majors Offered
    Then The displayed programs should be:
    | Health Teacher Education |

  Scenario: The programs with a Associates degree offering are displayed
    When I open "Associates" in Majors Offered
    Then The displayed programs should be:
    | Crisis/Emergency/Disaster Management      |
    | Liberal Arts and Sciences/Liberal Studies |

  Scenario: The colleges offering the program are displayed in college lookup
    When I open "French Studies" in the Majors Offered list
    Then I should see the message "Colleges Offering French Studies" in the College Lookup page