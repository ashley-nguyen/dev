Feature: SmokeTest Naviance Elementary School 
         in order to use Naviance Elementary School 
         as a Naviance user   I want to login to Naviance Elementary School

  Background:
    Given I am logged into Naviance "qaedis1" as "sangeetha.sadmin" with "password"
    
  Scenario: Navigation through Elementary School Links
    When I navigate to Naviance Elementary School
    Then I am able to navigate through the Elementary options links