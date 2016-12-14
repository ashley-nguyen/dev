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


