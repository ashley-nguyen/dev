@hubs @webtour
Feature:  As a student exploring a college I want to see paid webtour to understand how the school positions itself (No
  college has webtour currently)

  Background:
    Given I log in to Family Connection with the following user details:
      | hubsintl | samstudent | Hobsons!23  |
    When I open the HUBS page for "Robert Morris University (PA)"

  Scenario: User is able to scroll content using arrows
    When I go to the right "3" times
    Then I should see the Web Tour element at position "5"

  Scenario: Play button is present on thumbnail
    Then I should see a Play button in the YouTube video thumbnail at position "4"

  Scenario: Kaltura image opens in modal after being clicked
    When I open the Web Tour element at position "1"
    Then I should see an image in a modal dialog

    #The following two scenarios need specific data in one of the test colleges. Currently, we don't have that data,
    #but it will be added in the near future.

    #Scenario: Kaltura image opens in modal and content displays below
    # When I click the Web Tour element at position "3"
    #Then I should see content below the image
    # Need to add this image for Adelphi
    #Scenario: Links in content below images should open in new tab
    #When I click the Web Tour element at position "14"
    #And I click a link with the text "College of Agriculture" in the content of the modal dialog
    #Then I should see the URL for "http://agriculture.auburn.edu/" open in a new page
  @smoke
  Scenario: Web Tour modal closes after clicking the 'x'
    When I open the Web Tour element at position "3"
    And I close the modal dialog with the 'x' button
    Then The modal dialog should be closed