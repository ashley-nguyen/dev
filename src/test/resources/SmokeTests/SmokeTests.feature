@smoketest @nondestructive
Feature: SmokeTest Naviance
  in order to use Naviance
  as a Naviance user
  I want to sign into Naviance

  Scenario: Naviance District
    Given I am a counselor
    When I complete the fields on the login page for a district user
    Then I will be signed into naviance
    When I edit my profile
      |  | Joe | tester | smoketest | Administrator |  |  | jtester | chad.sackrider@hobsons.com | chad.sackrider@hobsons.com |
