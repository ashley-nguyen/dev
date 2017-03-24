Feature: SmokeTest Naviance Elementary School 
         in order to use Naviance Elementary School 
         as a Naviance user   I want to login to Naviance Elementary School=

  Background:
    Given I am logged into Naviance "blue1hs" as "automation.admin" with "password"

  @ElementarySmokeTest
  Scenario: Navigation through Elementary School Links
    When I navigate to Naviance Elementary School
    Then I am able to navigate through the Elementary options links

  @ElementarySmokeTest
  Scenario Outline: Assign Lesson Sequence to a Student Group
    When I created a new student <StudentLastName>, <StudentFirstName>, <StudentClassYear>, <StudentGender>, <StudentId>, <StudentFCUserName>, <StudentFCPassword> and Elementary group <StudentGroup>, <LessonSequence> and <InstructorName>
    Then The new ELEM group <StudentGroup> instructor <InstructorName> and lesson sequence <LessonSequence> is listed on product page
    And The student <StudentLastName>, <StudentFirstName>, <StudentClassYear>, <StudentId> is displayed on Students tab
    Examples:
      |StudentLastName|StudentFirstName|StudentClassYear|StudentGender|StudentId     |StudentFCUserName|StudentFCPassword|StudentGroup  |InstructorName  |LessonSequence |
      |autTest        |autElemStudent  |2029            |F            |autTestID-123 |autElemStudent   |password         |AUT_ELEM_GROUP|Automation Admin|Grade K Lessons|


  # This scenario depends on 'Assign Lesson Sequence to a Student Group'
  # This scenario deletes the group created in previous scenario
  @ElementarySmokeTest
  Scenario Outline: Delete groups from Elementary product page
    When I navigate to Naviance Elementary School and delete <Group> group, <LessonSequence> and <InstructorName> from product page
    Then The group should not be displayed anymore in the product page <Group> and reappear in the Assign page
    Examples:
    |Group         |InstructorName  |LessonSequence |
    |AUT_ELEM_GROUP|Automation Admin|Grade K Lessons|
