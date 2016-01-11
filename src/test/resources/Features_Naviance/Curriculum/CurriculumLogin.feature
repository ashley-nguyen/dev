Feature: Sign into Naviance
  in order to use Naviance
  as a Naviance user
  I want to sign into Naviance

Background:
  Given I am logged into naviance ntpfinale as tyler.tremblay with password

  Scenario: SSO to Curriculum
    When I SSO into Curriculum as a counselor
    Then I will see the Scope and Sequence page

