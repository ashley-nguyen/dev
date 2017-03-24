Feature: Student Send details
  In order to verify Send Tab in eDocs
  As a counselor,
  I want to submit a NACAC fee waiver on behalf of a student
  to non-common-app colleges via eDocs

  Background:
    Given I am logged into Naviance "blue1hs" as "frank.counselor" with "frank01!"
    When I configure permissions for teacher
    Then I verify that Confirmation "The permissions for this role have been updated" message is displayed

  @edocs @safe @succeed
  Scenario Outline: Verify All LOR request for specific colleges will continue to display "requested"
    When I use "<studentID>" under application selecting "All Applications" and "Letter of Recommendation" with "<filename>"
    Then I will verify "<text>" for LORs

  Examples:
    | studentID  | text                     |filename        |
    | 37506999       | Letter of Recommendation |ReadMe.txt      |

  @edocs @safe @succeed @EDOCS234
  Scenario Outline: Verify under Send page, the NACAC Fee Waiver will be listed as an available document to send to Electronic, Mail Only or Coalition App colleges.
    When I expand all button action for the "<studentID>"
    Then I will verify "<type>" available document
  Examples:
    | studentID  | type                     |
    | 37506999       | School Report            |
#    | a103       | NACAC Fee Waiver         |

  @edocs @safe @succeed @EDOCS234
  Scenario Outline: Verify the information will be displayed under each column for the uploaded NACAC Fee Waiver
    When I expand all button action for the "<studentID>"
    Then I will verify "<information>" information and "<action>" action
  Examples:
    | studentID  | information    | action |
    | 37506999       | Stan Smith     |  View  |
#    | a103       | NACAC Fee Waiver | Replace   |

  @edocs @safe @succeed @EDOCS234
  Scenario Outline: Verify under Application, I want to upload a NACAC fee waiver on behalf of a student to non-common-app colleges via eDocs using Replace Action.
    When I expand all under application to replace the "<studentID>" in "All Applications" with "<type>" and "<filename>"
    Then I will verify "<information>" information and "<action>" action
  Examples:
    | studentID  | type                     |filename        | information    | action |
    | 37506999       | Other School Report      |ReadMe.txt      |Stan Smith      | Replace   |
#    | a103       | NACAC Fee Waiver         |ReadMe.txt      |Stan Smith      | Replace   |