Feature: SmokeTest Curriculum
  in order to use Curriculum
  as a Naviance user
  I want to login to Curriculum

  Background:
    Given I am logged into Naviance "ntpfinale" as "tyler.tremblay" with "password"

  Scenario:
    Given I am a counselor
    Then I will be signed into naviance

    When I SSO into Curriculum as a counselor
    Then I will see the Scope and Sequence page

    Given I will see the Scope and Sequence page
    When I click the Students dropdown
    And In the Students dropdown I click Classes
    Then I will see the Classes page

    Given I click the Students dropdown
    When In the Students dropdown I click Activity
    Then I will see the Activity page

    Given I click the Students dropdown
    When In the students dropdown I click Progress
    Then I will see the Progress page

    Given I Navigate to the Scope and Sequence page
    When I click the Explore Themes button
    Then I will see the Our Themes page

    Given I Navigate to the Scope and Sequence page
    When I select 6th grade lesson sequence
    And Click go to level
    Then I will see the 6th grade lesson sequence

    Given I Navigate to the Scope and Sequence page
    When I select 7th grade lesson sequence
    And Click go to level
    Then I will see the 7th grade lesson sequence

    Given I Navigate to the Scope and Sequence page
    When I select 8th grade lesson sequence
    And Click go to level
    Then I will see the 8th grade lesson sequence

    Given I Navigate to the Scope and Sequence page
    When I select 9th grade lesson sequence
    And Click go to level
    Then I will see the 9th grade lesson sequence

    Given I Navigate to the Scope and Sequence page
    When I select 10th grade lesson sequence
    And Click go to level
    Then I will see the 10th grade lesson sequence

    Given I Navigate to the Scope and Sequence page
    When I select 11th grade lesson sequence
    And Click go to level
    Then I will see the 11th grade lesson sequence

    Given I Navigate to the Scope and Sequence page
    When I select 12th grade lesson sequence
    And Click go to level
    Then I will see the 12th grade lesson sequence

    Given I Navigate to the Scope and Sequence page
    When I select Self Discovery theme
    Then I will see the Self Discovery lessons

    Given I Navigate to the Scope and Sequence page
    When I select Success Skills theme
    Then I will see the Success Skills lessons

    Given I Navigate to the Scope and Sequence page
    When I select Support Networks theme
    Then I will see the Support Networks lessons

    Given I Navigate to the Scope and Sequence page
    When I select College Planning theme
    Then I will see the College Planning lessons

    Given I Navigate to the Scope and Sequence page
    When I select Career Planning theme
    Then I will see the Career Planning lessons

    Given I Navigate to the Scope and Sequence page
    When I select Financial Planning theme
    Then I will see the Financial Planning lessons









