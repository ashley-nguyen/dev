@hubs @studentorganizations
Feature:  As a student viewing new Hubs' Student Life tab, I want to see a school population module to give
  me an idea what sort of community the school is

  Background:
    Given I log in to Family Connection with the following user details:
      | rtsa       | amandahubs | Hobsons!23  |
    When I open the HUBS page for "American University"
    And I open the Student Life tab

  Scenario: The Available Organizations are displayed with correct data
    When I open the "Organizations" tab in Student Organizations and Services
    Then The following Available Organizations are displayed:
    | Academic Clubs             |
    | Academic Frat./Sor.        |
    | Business                   |
    | Choir                      |
    | Concert Band               |
    | Environmental              |
    | Gay and Lesbian            |
    | Honors/Academic            |
    | International              |
    | Jazz Band                  |
    | Literary Magazine          |
    | Minority Cultural          |
    | Minority Student           |
    | Newspaper                  |
    | Orchestra                  |
    | Phi Beta Kappa             |
    | Political Activism         |
    | Pre-Dental                 |
    | Pre-Law                    |
    | Pre-Medical                |
    | Pre-Veterinary             |
    | Radio Station              |
    | Religious                  |
    | Sports/Intramurals         |
    | Student Government         |
    | Substance Abuse Support    |
    | Television Station         |
    | Theatre/Drama              |
    | Yearbook                   |

  Scenario: The Available Sports for men are displayed with correct data
    When I open the "Athletics" tab in Student Organizations and Services
    And I open the "Men" section in Athletics
    Then The following "Men" sports should be displayed:
    #Use 'empty' when that field is empty
    | Soccer,I,empty,NCAA          |
    | Ice Hockey,empty,empty,empty |
    | Tennis,empty,empty,empty     |
    | Basketball,I,empty,NCAA      |
    | Lacrosse,empty,empty,empty   |
    | Gymnastics,empty,empty,empty |
    | Diving,I,empty,NCAA          |
    | Indoor Soccer,empty,empty,empty |
    | Flag Football,empty,empty,empty |
    | Wrestling,I,empty,NCAA          |
    | Swimming,I,empty,NCAA           |
    | Track And Field,I,empty,NCAA    |
    | Cross Country,I,empty,NCAA      |
    | Sailing,empty,empty,empty       |
    | Indoor Track,I,empty,NCAA       |
    | Equestrian,empty,empty,empty    |
    | Rugby,empty,empty,empty         |
    | Cycling,empty,empty,empty       |
    | Rowing,empty,empty,empty        |
    | Ultimate Frisbee,empty,empty,empty |
    | Baseball,empty,empty,empty         |
    | Outdoor Track,I,empty,NCAA         |
    | Sand Volleyball,empty,empty,empty  |
    | Martial Arts,empty,empty,empty     |

  Scenario: The Available Sports for women are displayed with correct data
    When I open the "Athletics" tab in Student Organizations and Services
    And I open the "Women" section in Athletics
    Then The following "Women" sports should be displayed:
    #Use 'empty' when that field is empty
    | Soccer,I,empty,NCAA |
    | Ice Hockey,empty,empty,empty |
    | Field Hockey,I,empty,NCAA    |
    | Volleyball,I,empty,NCAA      |
    | Tennis,empty,empty,empty     |
    | Basketball,I,empty,NCAA      |
    | Lacrosse,I,empty,NCAA        |
    | Gymnastics,empty,empty,empty |
    | Diving,I,empty,NCAA          |
    | Indoor Soccer,empty,empty,empty |
    | Flag Football,empty,empty,empty |
    | Swimming,I,empty,NCAA           |
    | Track And Field,I,empty,NCAA    |
    | Cross Country,I,empty,NCAA      |
    | Sailing,empty,empty,empty       |
    | Indoor Track,I,empty,NCAA       |
    | Cheerleading,empty,empty,empty  |
    | Equestrian,empty,empty,empty    |
    | Rugby,empty,empty,empty         |
    | Cycling,empty,empty,empty       |
    | Rowing,empty,empty,empty        |
    | Ultimate Frisbee,empty,empty,empty |
    | Slow Pitch Softball,empty,empty,empty |
    | Softball,empty,empty,empty            |
    | Outdoor Track,I,empty,NCAA            |
    | Sand Volleyball,empty,empty,empty     |
    | Martial Arts,empty,empty,empty        |

  Scenario: The Available Sports for Co-Ed are displayed with correct data
    When I open the "Athletics" tab in Student Organizations and Services
    And I open the "Co-Ed" section in Athletics
    Then The following "Co-Ed" sports should be displayed:
    #Use 'empty' when that field is empty
    | Sailing,empty,empty,empty |
  @smoke
  Scenario: The correct number of fraternities and sororities is displayed in Greek Life
    When I open the "Greek Life" tab in Student Organizations and Services
    Then The quantity of fraternities and sororities in Greek Life tab is as follows:
    | Fraternities;12 |
    | Sororities;7    |

  Scenario: All the available services are displayed in Services
    When I open the "Services" tab in Student Organizations and Services
    Then The available services in Services tab are as follows:
    #Use 'basic' or 'ROTC' to indicate the service type
    | basic;Assistance for Hearing Impaired  |
    | basic;Assistance for Mobility Impaired |
    | basic;Assistance for Visually Impaired |
    | basic;Day Care Services                |
    | basic;Health Services Available        |
    | basic;Library Facilities               |
    | basic;Remedial Services                |
    | basic;Veteran                          |
    | ROTC;Airforce                          |
    | ROTC;Army                              |
    | ROTC;Serviceperson Opportunity College |

  Scenario: The location and type of all the computing resources are displayed in Computing Resources
    When I open the "Computing Resources" tab in Student Organizations and Services
    Then The location and type of all the computing resources should be displayed in Computing Resources as follows:
    | Department Labs;-;- |
    | Other;-;-           |
    | Student Centers;-;- |
    | Computer Centers;-;- |
    | Residence;-;-        |
    | Library;-;-          |







