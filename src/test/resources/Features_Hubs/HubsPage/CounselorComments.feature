@smoketest @nondestructive @hubs @counselorcomments
Feature:  As a student I want to be able to see the Counselor Comments for Students that my Counselor has published so that I can be better informed

  Background:
    Given I log in to Family Connection with the following user details:
      | rtsa  | benhubs | hubs2016  |
    When I open the HUBS page for "Adelphi"

  Scenario: The counselor comments are displayed in the Overview tab
    Then I should see the Counselor Comments