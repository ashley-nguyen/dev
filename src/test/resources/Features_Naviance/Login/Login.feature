@smoketest @nondestructive
Feature: Sign into Naviance
  in order to use Naviance
  as a Naviance user
  I want to sign into Naviance

  Scenario: Log into Naviance District
    Given I am a counselor
    When I complete the fields on the login page for a district user
    Then I will be signed into naviance

  Scenario: Log into Naviance School
    Given I am a counselor
    When I complete the fields on the login page for a school user
    Then I will be signed into naviance

  Scenario: Invalid Log into Naviance School
    Given I am a counselor
    When I complete the fields on the login page for an invalid school user
    Then I will not be signed into naviance