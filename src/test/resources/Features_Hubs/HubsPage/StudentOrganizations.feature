@hubs @studentorganizations
Feature:  As a student viewing new Hubs' Student Life tab, I want to see a school population module to give
  me an idea what sort of community the school is

  Background:
    Given I log in to Family Connection with the following user details:
      | rtsa       | amandahubs | Hobsons!23  |

  Scenario: The Available Organizations are displayed with correct data
    When I open the HUBS page for "The Culinary Institute of America"
    And I open the Student Life tab
    When I open the "Organizations" tab in Student Organizations and Services
    Then The following Available Organizations are displayed:
    | Honors/Academic |
    | International   |
    | Minority Cultural |
    | Minority Student  |
    | Newspaper         |
    | Religious         |
    | Sports/Intramurals |
    | Student Government |
@test
  Scenario: The Available Sports for men are displayed with correct data
  When I open the HUBS page for "The Culinary Institute of America"
  And I open the Student Life tab
    When I open the "Athletics" tab in Student Organizations and Services
    And I open the "Men" section in Athletics
    Then The following "Men" sports should be displayed:
    #Use 'empty' when that field is empty
    | Soccer,empty,empty,empty |
    | Basketball,empty,empty,empty |
    | Volleyball,empty,empty,empty |
    | Cross Country,empty,empty,empty |
    | Tennis,empty,empty,empty        |

  Scenario: The Available Sports for women are displayed with correct data
    When I open the HUBS page for "The Culinary Institute of America"
    And I open the Student Life tab
    When I open the "Athletics" tab in Student Organizations and Services
    And I open the "Women" section in Athletics
    Then The following "Women" sports should be displayed:
    #Use 'empty' when that field is empty
    | Soccer,empty,empty,empty |
    | Basketball,empty,empty,empty |
    | Volleyball,empty,empty,empty |
    | Cross Country,empty,empty,empty |
    | Tennis,empty,empty,empty        |

  Scenario: The Available Sports for Co-Ed are displayed with correct data
    When I open the HUBS page for "Duke University"
    And I open the Student Life tab
    When I open the "Athletics" tab in Student Organizations and Services
    And I open the "Co-Ed" section in Athletics
    Then The following "Co-Ed" sports should be displayed:
    | Basketball,empty,empty,empty |
    | Sailing,empty,empty,empty |
    | Equestrian,empty,empty,empty   |

  @smoke
  Scenario: The correct number of fraternities and sororities is displayed in Greek Life
    When I open the HUBS page for "Duke University"
    And I open the Student Life tab
    When I open the "Greek Life" tab in Student Organizations and Services
    Then The quantity of fraternities and sororities in Greek Life tab is as follows:
    | Fraternities;22 |
    | Sororities;13   |

  Scenario: All the available services are displayed in Services
    When I open the HUBS page for "Duke University"
    And I open the Student Life tab
    When I open the "Services" tab in Student Organizations and Services
    Then The available services in Services tab are as follows:
    #Use 'basic' or 'ROTC' to indicate the service type
    | basic;Assistance for Hearing Impaired  |
    | basic;Assistance for Mobility Impaired |
    | basic;Assistance for Visually Impaired |
    | basic;Health Services Available        |
    | basic;Library Facilities               |
    | ROTC;Airforce                          |
    | ROTC;Navy                              |
    | ROTC;Army                              |

  Scenario: The location and type of all the computing resources are displayed in Computing Resources
    When I open the HUBS page for "Duke University"
    And I open the Student Life tab
    When I open the "Computing Resources" tab in Student Organizations and Services
    Then The location and type of all the computing resources should be displayed in Computing Resources as follows:
    | Student Centers;-;- |
    | Residence;-;-       |
    | Computer Centers;11;9 |
    | Other;-;-             |
    | Department Labs;-;-  |
    | Library;-;-           |







