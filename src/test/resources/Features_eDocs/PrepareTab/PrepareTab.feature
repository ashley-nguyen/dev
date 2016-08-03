Feature: View student details
  In order to verify Prepare Tab in eDocs
  As a Recommender
  I want to see any LOR requests for a specific student on the eDocs tab of the student folder so that I am aware if
  there are LOR requests from a student before I upload any documents.

    @edocs @safe @succeed @navcore653
  Scenario Outline: Verify if it possible a list of uploaded LORs for each college and if the student requested a LOR for the College and Teacher.
    Given I am logged into Naviance "<account>" as "<user>" with "<password>"
    When I am accessing the "<studentID>" edocs tab
    When I click on Prepare link
    Then I will verify "<text>" for LORs

  Examples:
    |user           | account | password    | studentID  | text                         |
    |stan.smith     | rtsa    | stan01!     | a101       | Letter of Recommendation     |
    |stan.smith     | rtsa    | stan01!     | a101       | Common App Teacher Evaluation|
    |stan.smith     | rtsa    | stan01!     | a101       | Written Evaluation           |
    |stan.smith     | rtsa    | stan01!     | a101       | Initial Transcript (active)  |

  @edocs @safe @succeed
  Scenario Outline: Verify if it possible a list of uploaded LORs for each college and if the student requested a LOR for the College and Teacher.
    Given I am logged into Naviance "<account>" as "<user>" with "<password>"
    When I am accessing the "<studentID>" edocs tab
    When I click on Prepare link
    Then I will verify "<text>" for LORs

  Examples:
    |user           | account | password    | studentID  | text                         |
    |stan.smith     | rtsa    | stan01!     | a101       | Letter of Recommendation     |
    |stan.smith     | rtsa    | stan01!     | a101       | Common App Teacher Evaluation|
    |stan.smith     | rtsa    | stan01!     | a101       | Written Evaluation           |
    |stan.smith     | rtsa    | stan01!     | a101       | Initial Transcript (active)  |

  @edocs @safe @succeed
  Scenario Outline: Verify if it possible to see the author of the LOR and the College's due date.
    Given I am logged into Naviance "<account>" as "<user>" with "<password>"
    When I am accessing the "<studentID>" edocs tab
    When I click on Prepare link
    Then I will verify "<text>" for LORs

  Examples:
    |user           | account | password    | studentID  | text         |
    |stan.smith     | rtsa    | stan01!     | a101       | Stan Smith   |
    |stan.smith     | rtsa    | stan01!     | a101       | Date         |

  @edocs @safe @succeed
  Scenario Outline: Verify I cannot take any actions (replace or delete) on another staff member's letter.
    Given I am logged into Naviance "<account>" as "<user>" with "<password>"
    And I enter to School Site
    When I search for "<studentID>" using the global search field
    When I am accessing the "<studentID>" edocs tab
    When I click on Prepare link
    Then I will verify "<text>" for LORs

  Examples:
    |user           | account | password    | studentID  | text         |
    |stan.smith     | rtd1    | stan01!     | a101       | Replace      |
    |stan.smith     | rtd1    | stan01!     | a101       | Delete       |

  @edocs @safe @succeed
  Scenario Outline: Verify Under Application, the college for which the student has requested a LOR will be populated.
    Given I am logged into Naviance "<account>" as "<user>" with "<password>"
    When I am accessing the "<studentID>" edocs tab
    When I click on Prepare link
    When I click on Add button
    When I click on Upload a File button
    When I select "All Applications" from Application
    When I select "Letter of Recommendation" from Type
    When I click on Browse button
    When I write the "<filename>" file path
    Then I will verify "<text>" for LORs

  Examples:
    |user           | account | password    | studentID  | text                     |filename        |
    |stan.smith     | rtsa    | stan01!     | a101       | Letter of Recommendation |ReadMe.txt      |

  @edocs @safe @succeed
  Scenario Outline: Verify I get an error message that says my file size it too big.
    Given I am logged into Naviance "<account>" as "<user>" with "<password>"
    When I am accessing the "<studentID>" edocs tab
    When I click on Prepare link
    When I click on Add button
    When I click on Upload a File button
    When I select "All Applications" from Application
    When I select "Letter of Recommendation" from Type
    When I click on Browse button
    When I write the "<filename>" file path
    Then I will verify "<text>" file big message

  Examples:
    |user           | account | password    | studentID  | text                             | filename            |
    |stan.smith     | rtsa    | stan01!     | a101       | Selected file is more than 500KB | FillTooBigPDF.pdf|

  @edocs @safe @succeed
  Scenario Outline: Verify I get an error message that lists file types that are not supported.
    Given I am logged into Naviance "<account>" as "<user>" with "<password>"
    When I am accessing the "<studentID>" edocs tab
    When I click on Prepare link
    When I click on Add button
    When I click on Upload a File button
    When I select "All Applications" from Application
    When I select "Letter of Recommendation" from Type
    When I click on Browse button
    When I write the "<filename>" file path
    Then I will verify "<text>" incorrect format message

  Examples:
    |user           | account | password    | studentID  | text                                                                                                   | filename   |
    |stan.smith     | rtsa    | stan01!     | a101       | File type is not supported. Allowed file types: .pdf, .doc, .docx, .png, .jpg, .jpeg, .bmp, .txt, .rtf | index.html |


  @edocs @safe @succeed
  Scenario Outline: Verify I have the option to View, Edit or Delete my LOR.
    Given I am logged into Naviance "<account>" as "<user>" with "<password>"
    When I am accessing the "<studentID>" edocs tab
    When I click on Prepare link
    When I click on Add button
    When I click on Upload a File button
    When I select "All Applications" from Application
    When I select "Letter of Recommendation" from Type
    When I click on Browse button
    When I write the "<filename>" file path
    Then I will verify "<text>" in buttons for LORs

  Examples:
    |user           | account | password    | studentID  | text         | filename        |
    |stan.smith     | rtsa    | stan01!     | a101       | Delete       | ReadMe.txt      |
    |stan.smith     | rtsa    | stan01!     | a101       | Replace      | ReadMe.txt      |
    |stan.smith     | rtsa    | stan01!     | a101       | View         | ReadMe.txt      |


  @edocs @safe @succeed
  Scenario Outline: Verify All LOR request for specific colleges will continue to display "requested"
    Given I am logged into Naviance "<account>" as "<user>" with "<password>"
    When I am accessing the "<studentID>" edocs tab
    When I click on Prepare link
    When I click on Add button
    When I click on Upload a File button
    When I select "All Applications" from Application
    When I select "Letter of Recommendation" from Type
    When I click on Browse button
    When I write the "<filename>" file path
    Then I will verify "<text>" for LORs

  Examples:
    |user           | account | password    | studentID  | text                     |filename        |
    |stan.smith     | rtsa    | stan01!     | a101       | Letter of Recommendation |ReadMe.txt      |