Feature: View student details
  In order to verify Prepare Tab in eDocs
  As a Recommender
  I want to see any LOR requests for a specific student on the eDocs tab of the student folder so that I am aware if
  there are LOR requests from a student before I upload any documents.

  Background:
    Given I am logged into Naviance "rtsa" as "stan.smith" with "stan01!"
    When I configure permissions for teacher
    Then I verify that Confirmation "The permissions for this role have been updated" message is displayed

    @edocs @safe @succeed @navcore653
  Scenario Outline: Verify if it possible a list of uploaded LORs for each college and if the student requested a LOR for the College and Teacher.
    When I go to Prepare Link with "<studentID>"
    Then I will verify "<text>" for LORs

  Examples:
    | studentID  | text                         |
    | a103       | Letter of Recommendation     |
    | a103       | Common App Teacher Evaluation|
    | a103       | Written Evaluation           |


  @edocs @safe @succeed
  Scenario Outline: Verify if it possible a list of uploaded LORs for each college and if the student requested a LOR for the College and Teacher.
    When I go to Prepare Link with "<studentID>"
    Then I will verify "<text>" for LORs

  Examples:
    | studentID  | text                         |
    | a103       | Letter of Recommendation     |
    | a103       | Common App Teacher Evaluation|
    | a103       | Written Evaluation           |

  @edocs @safe @succeed
  Scenario Outline: Verify if it possible to see the author of the LOR and the College's due date.
    When I go to Prepare Link with "<studentID>"
    Then I will verify "<text>" for LORs

  Examples:
    | studentID  | text         |
    | a103       | Stan Smith   |
    | a103       | Date         |

  @edocs @safe @succeed
  Scenario Outline: Verify I cannot take any actions (replace or delete) on another staff member's letter.
    When I access with "<studentID>" to another member staff
    Then I will verify "<text>" for LORs

  Examples:
    | studentID  | text         |
    | a103       | Replace      |
    | a103       | Delete       |


  @edocs @safe @succeed
  Scenario Outline: Verify Under Application, the college for which the student has requested a LOR will be populated.
    When I use "<studentID>" under application selecting "All Applications" and "Letter of Recommendation" with "<filename>"
    Then I will verify "<text>" for LORs

  Examples:
    | studentID  | text                     |filename        |
    | a103       | Letter of Recommendation |ReadMe.txt      |

  @edocs @safe @succeed
  Scenario Outline: Verify I get an error message that says my file size it too big.
    When I use "<studentID>" under application selecting "All Applications" and "Letter of Recommendation" with "<filename>"
    Then I will verify "<text>" file big message

  Examples:
    | studentID  | text                             | filename            |
    | a101       | Selected file is more than 500KB | FillTooBigPDF.pdf|

  @edocs @safe @succeed
  Scenario Outline: Verify I get an error message that lists file types that are not supported.
    When I use "<studentID>" under application selecting "All Applications" and "Letter of Recommendation" with "<filename>"
    Then I will verify "<text>" incorrect format message

  Examples:
    | studentID  | text                                                                                                   | filename   |
    | a103       | File type is not supported. Allowed file types: .pdf, .doc, .docx, .png, .jpg, .jpeg, .bmp, .txt, .rtf | index.html |


  @edocs @safe @succeed
  Scenario Outline: Verify I have the option to View, Edit or Delete my LOR.
    When I use "<studentID>" under application selecting "All Applications" and "Letter of Recommendation" with "<filename>"
    Then I will verify "<text>" in buttons for LORs

  Examples:
    | studentID  | text         | filename        |
    | a103       | Delete       | ReadMe.txt      |
    | a103       | Replace      | ReadMe.txt      |
    | a103       | View         | ReadMe.txt      |


  @edocs @safe @succeed
  Scenario Outline: Verify All LOR request for specific colleges will continue to display "requested"
    When I use "<studentID>" under application selecting "All Applications" and "Letter of Recommendation" with "<filename>"
    Then I will verify "<text>" for LORs

  Examples:
    | studentID  | text                     |filename        |
    | a103       | Letter of Recommendation |ReadMe.txt      |

  @edocs @safe @succeed @EDOCS234
  Scenario Outline: Verify Under Application, I want to upload a NACAC fee waiver on behalf of a student to non-common-app colleges via eDocs
    When I use "<studentID>" under application selecting "All Applications" and "Letter of Recommendation" with "<filename>"
    Then I will verify "<type>", "<author>", "<size>", "<action>"
  Examples:
    | studentID  | type                     |filename        | author    | size  | action |
    | a103       | Other School Report      |ReadMe.txt      |Stan Smith | 14.87 | Replace   |
    | a103       | NACAC Fee Waiver         |ReadMe.txt      |Stan Smith | 14.87 | Replace   |

  @edocs @safe @succeed @EDOCS234
  Scenario Outline: Verify under Application, I want to upload a NACAC fee waiver on behalf of a student to non-common-app colleges via eDocs using Delete action.
    When I use "<studentID>" and delete document in eDocs
    Then I will verify "<type>", "<author>", "<size>", "<action>"
  Examples:
    | studentID  | type                     | author    | size  | action |
    | a103       | NACAC Fee Waiver      |Stan Smith | 14.87 | Delete   |

  @edocs @safe @succeed @EDOCS234
  Scenario Outline: Verify under Application, I want to upload a NACAC fee waiver on behalf of a student to non-common-app colleges via eDocs using Replace Action.
    When I use "<studentID>" under application selecting "All Applications" and "Letter of Recommendation" with "<filename>"
    Then I will verify "<type>", "<author>", "<size>", "<action>"
  Examples:
    | studentID  | type                     |filename        | author    | size  | action |
    | a103       | Other School Report      |ReadMe.txt      |Stan Smith | 14.87 | Replace   |
    | a103       | NACAC Fee Waiver         |ReadMe.txt      |Stan Smith | 14.87 | Replace   |




  @edocs @safe @EDOCS12
  Scenario Outline: Verify prevent uploading/sending multiple student transcripts for a single student due to FERPA violation
    When I use "<studentID>" under transcript selecting "Initial Transcript" with "<filename>"
    Then I will verify "<text>" with "<message>" messages for LORs

  Examples:
    | studentID  |filename        | text |message                                                                               |
    | a103       |Doc21.pdf       | Initial Transcript     |Upload Failed: Initial Transcript - Sorry, transcripts must be no longer than 20 pages|

  @edocs @safe @succeed
  Scenario Outline: Verify I get an error message that says my file size it too big.
    When I use "<studentID>" under application selecting "All Applications" and "Letter of Recommendation" with "<filename>"
    Then I will verify "<text>" file big message

  Examples:
    | studentID  | text                             | filename            |
    | a101       | Selected file is more than 500KB | FillTooBigPDF.pdf|