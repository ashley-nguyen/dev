Feature: SmokeTest Naviance Elementary School 
         in order to use Naviance Elementary School 
         as a Naviance user   I want to login to Naviance Elementary School

  Background:
    #Given I am logged into Naviance "qaedis1" as "sangeetha.sadmin" with "password"
    Given I am logged into Naviance "blue1hs" as "automation.admin" with "password"

  Scenario: Navigation through Elementary School Links
    When I navigate to Naviance Elementary School
    Then I am able to navigate through the Elementary options links

  Scenario Outline: Assign Lesson Sequence to a Student Group
    When I created a new student <StudentLastName>, <StudentFirstName>, <StudentClassYear>, <StudentGender>, <StudentFCUserName>, <StudentFCPassword> and Elementary group <StudentGroup>, <LessonSequence> and <InstructorName>
    Then The new ELEM group <StudentGroup> instructor <InstructorName> and lesson sequence <LessonSequence> is listed on product page
    Examples:
      |StudentLastName|StudentFirstName|StudentClassYear|StudentGender|StudentFCUserName|StudentFCPassword|StudentGroup  |InstructorName       |LessonSequence |
      |autTest        |autElemStudent  |2017            |F            |autElemStudent   |password         |AUT_ELEM_GRP  |Automation Admin|Grade K Lessons|