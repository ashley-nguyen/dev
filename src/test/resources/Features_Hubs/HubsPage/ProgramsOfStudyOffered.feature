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

    | French Studies                                                            | Latin American Studies                                                      |
    | Developmental/Remedial English                                            | Biochemistry                                                                |
    | Biology/Biological Sciences, General                                      | Exercise Physiology                                                         |
    | Neuroscience                                                              | Accounting                                                                  |
    | Business Administration and Management, General                           | Business, Management, Marketing, and Related Support Services, Other        |
    | Finance, General                                                          | Human Resources Management and Services, Other                              |
    | Human Resources Management/Personnel Administration, General              | Logistics, Materials, and Supply Chain Management                           |
    | Management Science                                                        | Marketing, Other                                                            |
    | Marketing/Marketing Management, General                                   | Communication and Media Studies, Other                                      |
    | Communication, Journalism, and Related Programs, Other                    | Computer and Information Sciences, General                                  |
    | Computer Science                                                          | Information Science/Studies                                                 |
    | Adult Literacy Tutor/Instructor                                           | Art Teacher Education                                                       |
    | Bilingual and Multilingual Education                                      | Biology Teacher Education                                                   |
    | Chemistry Teacher Education                                               | Curriculum and Instruction                                                  |
    | Early Childhood Education and Teaching                                    | Education, General                                                          |
    | Education, Other                                                          | Education/Teaching of Indiv. in Early Childhood Special Education Programs  |
    | Education/Teaching of Individuals in Secondary Special Education Programs | Education/Teaching of Individuals w/ Hearing Impairments Including Deafness |
    | Educational Leadership and Administration, General                        | Educational, Instructional, and Curriculum Supervision                      |
    | Elementary Education and Teaching                                         | English/Language Arts Teacher Education                                     |
    | Health Teacher Education                                                  | Junior High/Intermediate/Middle School Education and Teaching               |
    | Kindergarten/Preschool Education and Teaching                             | Mathematics Teacher Education                                               |
    | Music Teacher Education                                                   | Physical Education Teaching and Coaching                                    |
    | Physics Teacher Education                                                 | Reading Teacher Education                                                   |
    | Science Teacher Education/General Science Teacher Education               | Secondary Education and Teaching                                            |
    | Social Science Teacher Education                                          | Social Studies Teacher Education                                            |
    | Spanish Language Teacher Education                                        | Special Education and Teaching, General                                     |
    | Teacher Education, Multiple Levels                                        | Teaching English as a Second or Foreign Language/ESL Language Instructor    |
    | Creative Writing                                                          | English Language and Literature, General                                    |
    | Foreign Languages and Literatures, General                                | French Language and Literature                                              |
    | Spanish Language and Literature                                           | Adult Health Nurse/Nursing                                                  |
    | Audiology/Audiologist and Speech-Language Pathology/Pathologist           | Clinical Nutrition/Nutritionist                                             |
    | Communication Disorders Sciences and Services, Other                      | Communication Sciences and Disorders, General                               |
    | Community Health and Preventive Medicine                                  | Health and Medical Administrative Services, Other                           |
    | Health Services Administration                                            | Medical Informatics                                                         |
    | Mental Health Counseling/Counselor                                        | Nursing Administration                                                      |
    | Nursing Education                                                         | Nursing Science                                                             |
    | Pre-Dentistry Studies                                                     | Pre-Medicine/Pre-Medical Studies                                            |
    | Public Health, General                                                    | Registered Nursing/Registered Nurse                                         |
    | Registered/Clinical Nursing and Nursing Administration/Research, Other    | Speech-Language Pathology/Pathologist                                       |
    | History, General                                                          | Criminal Justice/Law Enforcement Administration                             |
    | Criminal Justice/Safety Studies                                           | Crisis/Emergency/Disaster Management                                        |
    | Legal Studies, General                                                    | Music                                                                       |
    | Theatre/Theater                                                           | Humanities/Humanistic Studies                                               |
    | Liberal Arts and Sciences/Liberal Studies                                 | Mathematics, General                                                        |
    | Biological and Physical Sciences                                          | International/Global Studies                                                |
    | Multi-/Interdisciplinary Studies, Other                                   | Environmental Studies                                                       |
    | Health and Physical Education/Fitness, General                            | Health and Physical Education/Fitness, Other                                |
    | Sport and Fitness Administration/Management                               | Philosophy                                                                  |
    | Chemistry, General                                                        | Physics, General                                                            |
    | Clinical Psychology                                                       | Psychology, General                                                         |
    | School Psychology                                                         | Social Work                                                                 |
    | Anthropology                                                              | Economics, General                                                          |
    | Political Science and Government, General                                 | Social Sciences, General                                                    |
    | Sociology                                                                 | Art History, Criticism and Conservation                                     |
    | Dance, General                                                            | Design and Applied Arts, Other                                              |
    | Drama and Dramatics/Theatre Arts, General                                 | Dramatic/Theatre Arts and Stagecraft, Other                                 |
    | Fine Arts and Art Studies, Other                                          | Graphic Design                                                              |
    | Music, General                                                            | Visual and Performing Arts, General                                         |
    | Visual and Performing Arts, Other                                         |                                                                             |

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
    When I open "Accounting" in the Majors Offered list
    Then I should see the message "Colleges Offering Accounting" in the College Lookup page