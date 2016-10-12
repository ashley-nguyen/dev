@succeed @student @studentRoster @parentDistrict @destructive @database:district-with-parents
Feature: School employee can link a student to existing parents from the same district.
  As a Counselor
  I want to be able to link a parent from my school to another student from my school
  So that I don't have to keep multiple records for the same parent


#  @database:unlink-jan
  Scenario: Parent has student at same school (can link)
    Given when I log in with the following user details:
      | etdh | jcounselor | jcounselor01! |
    When I link to "jbrady001" with "id" to "Mike Brady"
    Then I will verify that "Mike Brady" with "United States" were linked

#  @database:unlink-cindy
#  Scenario: 2. Parent has student at another school in the district (can link)
#    Given when I log in with the following user details:
#      | rtsa | stan.smith | stan01! |
#    And I search for students with the last name, first name of "Brady, Cynthia"
#    And I link the parent "Carol Brady" to the current student
#    Then I should see "Carol Brady" on the Student Summary Form for "Cynthia Brady"