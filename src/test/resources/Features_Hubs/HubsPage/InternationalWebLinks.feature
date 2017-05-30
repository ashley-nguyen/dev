@hubs
Feature:  As a student exploring International school, Student should get all the information on the links under Learn
  More and Communicate!

  Background:
    Given I log in to Family Connection with the following user details:
      | hubsintl      | samstudent | Hobsons!23  |
    When I open the HUBS page for "Robert"

  Scenario: User is taken to the correct website after clicking 'Request Info'
     When I open International school 'Communicate' link Request Information
     Then I should see the international URL for "http://qa.collegeview.com/school/placementTracker.jsp?placementId=119835&siteId=4" open in new page

  Scenario: User need the ability to have an International links replacing my existing links for U.S. students
    When I open International 'Learn More' link Admission Requirements
    Then I should see the international URL for "http://qa.collegeview.com/schools/robert-morris-university-moon-township/iwl/admission_requirements?siteId=4" open in new page
