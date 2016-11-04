Feature: Student Send details
  In order to verify Send Tab in eDocs
  As a counselor,
  I want to submit a NACAC fee waiver on behalf of a student
  to non-common-app colleges via eDocs

  Background:
    Given I am logged into Naviance "rtsa" as "stan.smith" with "stan01!"
    When I configure permissions for teacher
    Then I verify that Confirmation "The permissions for this role have been updated" message is displayed

  @edocs @safe @succeed @EDOCS234
  Scenario Outline: Verify under Send page, the NACAC Fee Waiver will be listed as an available document to send to Electronic, Mail Only or Coalition App colleges.
    When I expand all button action for the "<studentID>"
    Then I will verify "<type>" available document
  Examples:
    | studentID  | type                     |
    | a103       | School Report            |
#    | a103       | NACAC Fee Waiver         |

  @edocs @safe @succeed @EDOCS234
  Scenario Outline: Verify the information will be displayed under each column for the uploaded NACAC Fee Waiver
    When I expand all button action for the "<studentID>"
    Then I will verify "<information>" information and "<action>" action
  Examples:
    | studentID  | information    | action |
    | a103       | Stan Smith     |  View  |
#    | a103       | NACAC Fee Waiver | Replace   |

  @edocs @safe @succeed @EDOCS234
  Scenario Outline: Verify under Application, I want to upload a NACAC fee waiver on behalf of a student to non-common-app colleges via eDocs using Replace Action.
    When I expand all under application for the "<studentID>" in "All Applications" with "<type>" and "<filename>"
    Then I will verify "<information>" information and "<action>" action
  Examples:
    | studentID  | type                     |filename        | information    | action |
    | a103       | Other School Report      |ReadMe.txt      |Stan Smith      | Replace   |
#    | a103       | NACAC Fee Waiver         |ReadMe.txt      |Stan Smith      | Replace   |