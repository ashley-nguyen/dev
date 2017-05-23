
Feature: Login to Curriculum page
  In order to verify Curriculum page
  As an administrator
  I want to specify the login conditions



  Scenario: Navigate to Curriculum page
    Given I am logged into Naviance "blue4hs" as "cur.admin" with "password"
    When I am on Naviance Home Page
    Then I should navigate to Curriculum page


