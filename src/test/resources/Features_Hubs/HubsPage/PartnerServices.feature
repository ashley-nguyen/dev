@hubs @partnerservices
Feature:  As a student exploring a college I want to see the school's paid buttons so that I can make use of
  the additional actions and information (We need to set up a college with all the Partner Services, right now no
  college has all these products)

  Background:
    Given I log in to Family Connection with the following user details:
      | rtsa       | amandahubs | Hobsons!23  |
    When I open the HUBS page for "The Culinary Institute of America"
  @smoke
  Scenario: User is taken to correct website after clicking 'Request Info'
    When I open 'Communicate' link "Request Information"
    Then I should see the URL for "http://qa.collegeview.com/school/placementTracker.jsp?placementId=107889&siteId=4" open in a new page

  Scenario: User is taken to correct website after clicking 'Apply Online'
    When I open the Apply Online button
    Then I should see the URL for "http://qa.collegeview.com/schools/the-culinary-institute-of-america/onl/na?siteId=4" open in a new page

  Scenario: User is taken to correct website after clicking a link from the list in 'Learn More'
    When I open the 'Learn More' link "Scholarships"
    Then I should see the URL for "http://qa.collegeview.com/schools/the-culinary-institute-of-america/wl/scholarships?siteId=4" open in a new page




