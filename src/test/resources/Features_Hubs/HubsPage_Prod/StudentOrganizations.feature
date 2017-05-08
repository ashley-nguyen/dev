@hubs @studentorganizations
Feature:  As a student viewing new Hubs' Student Life tab, I want to see a school population module to give
  me an idea what sort of community the school is

  Background:
    Given I log in to Family Connection with the following user details:
      | naviance | amandahubs | Hobsons!23  |
    When I open the HUBS page for "Pace University, New York City"
    And I open the Student Life tab

  Scenario: The Available Organizations are displayed with correct data
    When I open the "Organizations" tab in Student Organizations and Services
    Then The following Available Organizations are displayed:
    | Academic Clubs          |
    | Academic Frat./Sor.     |
    | Business                |
    | Choir                   |
    | Environmental           |
    | Gay and Lesbian         |
    | Honors/Academic         |
    | International           |
    | Literary Magazine       |
    | Minority Cultural       |
    | Minority Student        |
    | Newspaper               |
    | Political Activism      |
    | Pre-Medical             |
    | Radio Station           |
    | Religious               |
    | Sports/Intramurals      |
    | Student Government      |
    | Substance Abuse Support |
    | Theatre/Drama           |
    | Yearbook                |

  Scenario: The Available Sports for men are displayed with correct data
    When I open the "Athletics" tab in Student Organizations and Services
    And I open the "Men" section in Athletics
    Then The following "Men" sports should be displayed:
    #Use 'empty' when that field is empty
    | Lacrosse,II,NE-10,NCAA          |
    | Basketball,II,NE-10,NCAA        |
    | Baseball,II,NE-10,NCAA          |
    | Cross Country,II,NE-10,NCAA     |
    | Football,II,NE-10,NCAA          |
    | Swimming,II,NE-10,NCAA          |
    | Diving,II,NE-10,NCAA            |
    | Indoor Soccer,empty,empty,empty |
    | Flag Football,empty,empty,empty |

  Scenario: The Available Sports for women are displayed with correct data
    When I open the "Athletics" tab in Student Organizations and Services
    And I open the "Women" section in Athletics
    Then The following "Women" sports should be displayed:
    #Use 'empty' when that field is empty
    | Basketball,II,NE-10,NCAA       |
    | Volleyball,II,NE-10,NCAA       |
    | Softball,II,NE-10,NCAA         |
    | Soccer,II,NE-10,NCAA           |
    | Cross Country,II,NE-10,NCAA    |
    | Swimming,II,NE-10,NCAA         |
    | Diving,II,NE-10,NCAA           |
    | Cheerleading,empty,empty,empty |
    | Dancing,empty,empty,empty      |


  Scenario: The Available Sports for Co-Ed are displayed with correct data
    When I open the "Athletics" tab in Student Organizations and Services
    And I open the "Co-Ed" section in Athletics
    Then The following "Co-Ed" sports should be displayed:
    #Use 'empty' when that field is empty
    | Volleyball,empty,empty,empty |
    | Dancing,empty,empty,empty    |
    | Badminton,empty,empty,empty  |
    | Fencing,empty,empty,empty    |
  @smoke
  Scenario: The correct number of fraternities and sororities is displayed in Greek Life
    When I open the "Greek Life" tab in Student Organizations and Services
    Then The quantity of fraternities and sororities in Greek Life tab is as follows:
    | Fraternities;14 |
    | Sororities;12   |

  Scenario: All the available services are displayed in Services
    When I open the "Services" tab in Student Organizations and Services
    Then The available services in Services tab are as follows:
    #Use 'basic' or 'ROTC' to indicate the service type
    | basic;Assistance for Hearing Impaired  |
    | basic;Assistance for Mobility Impaired |
    | basic;Assistance for Visually Impaired |
    | basic;ESL (English as Second Language) |
    | basic;Health Services Available        |
    | basic;Library Facilities               |

  Scenario: The location and type of all the computing resources are displayed in Computing Resources
    When I open the "Computing Resources" tab in Student Organizations and Services
    Then The location and type of all the computing resources should be displayed in Computing Resources as follows:
    | Department Labs;-;-   |
    | Other;-;-             |
    | Residence;-;-         |
    | Computer Centers;78;6 |
    | Student Centers;-;-   |
    | Library;67;22         |







