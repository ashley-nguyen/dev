Feature: View student details
  In order to verify Prepare Tab in eDocs
  As a Recommender
  I want to see any LOR requests for a specific student on the eDocs tab of the student folder so that I am aware if
  there are LOR requests from a student before I upload any documents.

  Background:
    Given I am logged into Naviance "rtsa" as "stan.smith" with "stan01!"
    When I go to Manage Roles and Rights
    When I click on manage link
    When I click on Modify Permissions link
    When I check View all Teacher rec. forms
    When I check Prepare my teacher rec. forms
    When I click on Submit button
    Then I verify that Confirmation "The permissions for this role have been updated" message is displayed

    @edocs @safe @succeed @navcore653
  Scenario Outline: Verify if it possible a list of uploaded LORs for each college and if the student requested a LOR for the College and Teacher.
    When I am accessing the "<studentID>" edocs tab
    When I click on Prepare link
    Then I will verify "<text>" for LORs

  Examples:
    | studentID  | text                         |
    | a101       | Letter of Recommendation     |
    | a101       | Common App Teacher Evaluation|
    | a101       | Written Evaluation           |
    | a101       | Initial Transcript (active)  |

  @edocs @safe @succeed
  Scenario Outline: Verify if it possible a list of uploaded LORs for each college and if the student requested a LOR for the College and Teacher.
    When I am accessing the "<studentID>" edocs tab
    When I click on Prepare link
    Then I will verify "<text>" for LORs

  Examples:
    | studentID  | text                         |
    | a101       | Letter of Recommendation     |
    | a101       | Common App Teacher Evaluation|
    | a101       | Written Evaluation           |
    | a101       | Initial Transcript (active)  |

  @edocs @safe @succeed
  Scenario Outline: Verify if it possible to see the author of the LOR and the College's due date.
    When I am accessing the "<studentID>" edocs tab
    When I click on Prepare link
    Then I will verify "<text>" for LORs

  Examples:
    | studentID  | text         |
    | a101       | Stan Smith   |
    | a101       | Date         |

  @edocs @safe @succeed
  Scenario Outline: Verify I cannot take any actions (replace or delete) on another staff member's letter.
    And I enter to School Site
    When I search for "<studentID>" using the global search field
    When I am accessing the "<studentID>" edocs tab
    When I click on Prepare link
    Then I will verify "<text>" for LORs

  Examples:
    | studentID  | text         |
    | a101       | Replace      |
    | a101       | Delete       |

  @edocs @safe @succeed
  Scenario Outline: Verify Under Application, the college for which the student has requested a LOR will be populated.
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
    | studentID  | text                     |filename        |
    | a101       | Letter of Recommendation |ReadMe.txt      |

  @edocs @safe @succeed
  Scenario Outline: Verify I get an error message that says my file size it too big.
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
    | studentID  | text                             | filename            |
    | a101       | Selected file is more than 500KB | FillTooBigPDF.pdf|

  @edocs @safe @succeed
  Scenario Outline: Verify I get an error message that lists file types that are not supported.
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
    | studentID  | text                                                                                                   | filename   |
    | a101       | File type is not supported. Allowed file types: .pdf, .doc, .docx, .png, .jpg, .jpeg, .bmp, .txt, .rtf | index.html |


  @edocs @safe @succeed
  Scenario Outline: Verify I have the option to View, Edit or Delete my LOR.
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
    | studentID  | text         | filename        |
    | a101       | Delete       | ReadMe.txt      |
    | a101       | Replace      | ReadMe.txt      |
    | a101       | View         | ReadMe.txt      |


  @edocs @safe @succeed
  Scenario Outline: Verify All LOR request for specific colleges will continue to display "requested"
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
    | studentID  | text                     |filename        |
    | a101       | Letter of Recommendation |ReadMe.txt      |

  @edocs @safe @succeed @EDOCS234
  Scenario Outline: Verify Under Application, I want to upload a NACAC fee waiver on behalf of a student to non-common-app colleges via eDocs
    When I am accessing the "<studentID>" edocs tab
    When I click on Prepare link
    When I click on Add Counselor button
    When I click on Upload a File button
    When I select "All Applications" from Application
    When I select "<type>" from Type
    When I click on Browse button
    When I write the "<filename>" file path
    Then I will verify "<type>", "<author>", "<size>", "<action>"
  Examples:
    | studentID  | type                     |filename        | author    | size  | action |
    | a101       | Other School Report      |ReadMe.txt      |Stan Smith | 14.87 | Replace   |
##    | a101       | NACAC Fee waiver         |ReadMe.txt      |Stan Smith | 14.87 | Replace   |

  @edocs @safe @succeed @EDOCS234
  Scenario Outline: Verify under Application, I want to upload a NACAC fee waiver on behalf of a student to non-common-app colleges via eDocs using Replace.
    When I am accessing the "<studentID>" edocs tab
    When I click on Prepare link
    When I click on Replace button
    When I click on Upload a File button
    When I select "All Applications" from Application
    When I select "<type>" from Type
    When I click on Browse button
    When I write the "<filename>" file path
    Then I will verify "<type>", "<author>", "<size>", "<action>"
  Examples:
    | studentID  | type                     |filename        | author    | size  | action |
    | a101       | Other School Report      |ReadMe.txt      |Stan Smith | 14.87 | Replace   |
##    | a101       | NACAC Fee waiver         |ReadMe.txt      |Stan Smith | 14.87 | Replace   |