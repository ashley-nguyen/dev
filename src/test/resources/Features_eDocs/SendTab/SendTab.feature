Feature: Student Send details
  In order to verify Send Tab in eDocs
  As a counselor,
  I want to submit a NACAC fee waiver on behalf of a student
  to non-common-app colleges via eDocs

  Background:
    Given I am logged into Naviance "rtsa" as "stan.smith" with "stan01!"
    When I go to Manage Roles and Rights
    When I click on manage link
    When I click on Modify Permissions link
    When I check View all Teacher rec. forms
    When I check Prepare my teacher rec. forms
    When I click on Submit button
    Then I verify that Confirmation "The permissions for this role have been updated" message is displayed

  @edocs @safe @succeed @EDOCS234
  Scenario Outline: Verify under Send page, the NACAC Fee Waiver will be listed as an available document to send to Electronic, Mail Only or Coalition App colleges.
    When I am accessing the "<studentID>" edocs tab
    When I click on Send link
    When I click on Expand All button
    Then I will verify "<type>" available document
  Examples:
    | studentID  | type                     | author    | size  | action |
    | a101       | School Report      |Stan Smith | 14.87 | Replace   |
##    | a101       | NACAC Fee waiver         |ReadMe.txt      |Stan Smith | 14.87 | Replace   |

  @edocs @safe @succeed @EDOCS234
  Scenario Outline: Verify the information will be displayed under each column for the uploaded NACAC Fee Waiver
    When I am accessing the "<studentID>" edocs tab
    When I click on Send link
    When I click on Expand All button
    Then I will verify "<information>" information and "<action>" action
  Examples:
    | studentID  | information    | action |
    | a101       | Stan Smith     |  View  |
##    | a101       | NACAC Fee waiver         |ReadMe.txt      |Stan Smith | 14.87 | Replace   |