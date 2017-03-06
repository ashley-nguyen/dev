@hubs @partnerservices
Feature:  As a student exploring a college I want to see the school's paid buttons so that I can make use of
  the additional actions and information (We need to set up a college with all the Partner Services, right now no
  college has all these products)

  Background:
    Given I log in to Family Connection with the following user details:
      | rtsa       | amandahubs | hubs2016  |
    When I open the HUBS page for "Adelphi"
  @smoke
  Scenario: User is taken to correct website after clicking 'Request Info'
    When I open 'Communicate' link "Request Information"
    Then I should see the URL for "http://admissions.adelphi.edu/contact-us/request-info/" open in a new page

  Scenario: User is taken to correct website after clicking 'Apply Online'
    When I open the Apply Online button
    Then I should see the URL for "http://admissions.adelphi.edu/contact-us/apply-now/" open in a new page

  Scenario: User is taken to correct website after clicking a link from the list in 'Learn More'
    When I open the 'Learn More' link "Events"
    Then I should see the URL for "http://admissions.adelphi.edu/events/" open in a new page




