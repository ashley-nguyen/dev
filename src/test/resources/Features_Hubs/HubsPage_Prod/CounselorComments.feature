@hubs @counselorcomments
Feature:  As a student I want to be able to see the Counselor Comments for Students that my Counselor has published so that I can be better informed

  Background:
    Given I log in to Family Connection with the following user details:
      | naviance | benhubs | Hobsons!23 |
    When I open the HUBS page for "Docufide Institute of Technology (not a real college)"
  @smoke
  Scenario: The counselor comments are displayed in the Overview tab
    Then I should see the Counselor Comments