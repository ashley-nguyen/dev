@smoketest @nondestructive @hubs @contactinformation
Feature:  As a student viewing new Hubs' Overview tab, I want to see contact information so that I can understand how
  to communicate with the school

  Background:
    Given I log in to Family Connection with the following user details:
      | rtsa       | amandahubs | hubs2016  |
    When I open the HUBS page for "Auburn"

  
  Scenario: School name is present in Application Mailing Address with correct data
    Then The School Name should be "Auburn University" in Application Mailing Address

  Scenario: 'Attn: Applications'  is present in Application Mailing Address
    Then 'Attn: Applications' should be displayed in Application Mailing Address

  Scenario: Address is present in Application Mailing Address with correct data
    Then Address should be "108 Mary Martin Hall" in Application Mailing Address

  Scenario: City is present in Application Mailing Address with correct data
    Then City should be "Auburn AL" in Application Mailing Address

  Scenario: Zip address is present in Application Mailing Address with correct data
    Then Zip address should be "36849-0002" in Application Mailing Address

  Scenario: Phone is present in Admissions with correct data
    Then Phone should be "(334)844-6425" in Admissions

  Scenario: Fax is present in Admissions with correct data
    Then Fax should be "(334)844-6425" in Admissions

  Scenario: Financial Aid number is present in Admissions with correct data
    Then Financial Aid number should be "(334)844-4367" in Admissions

  Scenario: Email address is present in Admissions with correct data
    Then Email address should be "admissions@auburn.edu" in Admissions
