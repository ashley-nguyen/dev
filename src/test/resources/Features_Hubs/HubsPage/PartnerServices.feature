@smoketest @nondestructive @hubs @partnerservices
Feature:  As a student exploring a college I want to see the school's paid buttons so that I can make use of
  the additional actions and information

  Background:
    Given I log in to Family Connection with the following user details:
      | rtsa       | amandahubs | hubs2016  |
    And I click on the Colleges tab
    And I go to the Page View for "Auburn"
    And I click the Beta Button

  Scenario: User is taken to correct website after clicking 'Request Info'
    When I click the Request Info button
    Then I should see the URL for "http://www.auburn.edu/admissions/info-request.html" open in a new page

  Scenario: User is taken to correct website after clicking 'Apply Online'
    When I click the Apply Online button
    Then I should see the URL for "http://www.auburn.edu/admissions/" open in a new page

  Scenario: User is taken to correct website after clicking a link from the list in 'Learn More'
    When I click the 'Learn More' link "Schedule a Visit"
    Then I should see the URL for "http://www.auburn.edu/admissions/visit/" open in a new page




