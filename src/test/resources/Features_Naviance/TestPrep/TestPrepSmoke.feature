Feature: SmokeTest TestPrep
  in order to use TestPrep
  as a Naviance user
  I want to login to TestPrep

  Background:
    Given I am logged into Naviance "qaedis1" as "sangeetha.sadmin" with "password"

    Scenario: Verify TestPrep page
      Given I am a Schoolsiteadmin
      When I have proper credentials
      Then I will be signed into naviance


      Given l am landed on Home page of naviance
      When I access the Naviance TestPrep as a Schoolsiteadmin
      Then I will skip the walkkthrough page if loaded

    @SmokeTestPrep
    Scenario Outline: Assign Study Programs to a Student Group
      When I created a new student <StudentLastName>, <StudentFirstName>, <StudentClassYear>, <StudentGender>, <StudentFCUserName>, <StudentFCPassword> and NTP group <StudentGroup> with <InstructorName> and <StudyPrograms>
      Then The new NTP group <StudentGroup> instructor <InstructorName> and study programs <StudyPrograms> is listed on product page
      Examples:
        |StudentLastName|StudentFirstName|StudentClassYear|StudentGender|StudentFCUserName|StudentFCPassword|StudentGroup|InstructorName|StudyPrograms|
        |autTest        |autWithGroup    |2017            |F            |autTestWithGroup |password         |AUT_NTP_GROUP|Sangeetha Schooladmin|SAT Prep,ACT Prep|
        |autTest        |autNoGroup      |2018            |M            |autTestNoGroup   |password         |             |                    |                   |
