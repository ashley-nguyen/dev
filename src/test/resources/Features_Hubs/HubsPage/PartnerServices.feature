@smoketest @nondestructive @hubs @partnerservices
Feature:  As a student exploring a college I want to see the school's paid buttons so that I can make use of
  the additional actions and information

  Background:
    Given I log in to Family Connection with the following user details:
      | rtsa       | amandahubs | hubs2016  |
    When I open the HUBS page for "Adelphi"

  Scenario: User is taken to correct website after clicking 'Request Info'
    When I click 'Communicate' link "Request Information"
    Then I should see the URL for "http://admissions.adelphi.edu/contact-us/request-info/" open in a new page

  Scenario: User is taken to correct website after clicking 'Apply Online'
    When I click the Apply Online button
    Then I should see the URL for "http://admissions.adelphi.edu/contact-us/apply-now/" open in a new page

  Scenario: User is taken to correct website after clicking a link from the list in 'Learn More'
    When I click the 'Learn More' link "Events"
    Then I should see the URL for "http://admissions.adelphi.edu/events/" open in a new page




