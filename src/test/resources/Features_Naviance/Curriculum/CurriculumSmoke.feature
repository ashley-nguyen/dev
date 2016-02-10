Feature: SmokeTest Curriculum
  in order to use Curriculum
  as a Naviance user
  I want to login to Curriculum

  Background:
    Given I am logged into naviance ntpfinale as tyler.tremblay with password

  Scenario:
    Given I am a counselor
    Then I will be signed into naviance

    When I SSO into Curriculum as a counselor
    Then I will see the Scope and Sequence page

    Given I will see the Scope and Sequence page
    When I click the Students dropdown
    And In the Students dropdown I click Classes
    Then I will see the Classes page


