@smoketest @nondestructive @hubs @webtour
Feature:  As a student exploring a college I want to see paid webtour to understand how the school positions itself

  Background:
    Given I log in to Family Connection with the following user details:
      | rtsa       | amandahubs | hubs2016  |
    And I click on the Colleges tab
    And I go to the Page View for "Auburn"
    And I click the Beta Button

  Scenario: User is able to scroll content using arrows
    When I click the right navigation arrow "10" times
    Then I should see the last Web Tour element

  Scenario: Play button is present on thumbnail
    Then I should see a Play button in the YouTube video thumbnail

  Scenario: Kaltura image opens in modal after being clicked
    When I click the Web Tour element at position "2"
    Then I should see an image in a modal dialog

  Scenario: Kaltura image opens in modal and content displays below
    When I click the Web Tour element at position "3"
    Then I should see content below the image

  Scenario: Links in content below images should open in new tab
    When I click the Web Tour element at position "14"
    And I click a link with the text "College of Agriculture" in the content of the modal dialog
    Then I should see the URL for "http://agriculture.auburn.edu/" open in a new page

  Scenario: Web Tour modal closes after clicking the 'x'
    When I click the Web Tour element at position "3"
    And I click the 'x' in the modal dialog
    Then The modal dialog should be closed