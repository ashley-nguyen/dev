@smoketest @nondestructive @hubs @tutorials
Feature: Validate as a student visiting a new hubs page for the first time,
  I see an instructional modal explaining features of new hubs page

  Background:
    Given I log in to Family Connection with the following user details:
      | rtsa       | ikeahubs | hubs2016  |
  @test
  Scenario Outline: Tutorial 1 dialog is displayed in Hubs
    When I click on the Colleges tab
    And I search for the college "<college>"
    And I click the college "<college>" in the college lookup list
    And I click the Beta Button
    Then I should see FirstTutorial dialog
    Examples:
      | college |
      | Adelphi  |

  Scenario: Tell us what you think dialog is displayed in Hubs after click Next on Tutorial 1
  When I click on the Colleges tab
  And I search for the college "<string>"
  And I click the college "<string>" in the college lookup list
  And I click the Beta Button
  And I click on Next on FirstTutorial dialog
  Then I should see ThirdTutorial dialog
  #  @test
  # Scenario Outline: Tutorial 3 dialog is displayed in Hubs after click Next on Tutorial 2
  #  When I click on the Colleges tab
  # And I search for the college "<college>"
  #  And I click the college "<college>" in the college lookup list
  # And I click the Beta Button
  # And I click on Next on FirstTutorial dialog
  #  And I click on Next on SecondTutorial dialog
   # Then I should see ThirdTutorial dialog
    #Examples:
     # | college |
      #| Adelphi |

  #@test
  #Scenario: Tutorial 1 dialog box is displayed in Hubs after user log back in with same session
   # When I click on the Colleges tab
    #And I search for the college "Adrian"
    #And I click the college "Adrian" in the college lookup list
    #And I click the Beta Button
    #Then I should see FirstTutorial dialog

  #@test
  #Scenario: Tutorial 1 dialog box is displayed in Hubs after user log back in with new session
   # When I click on the Colleges tab
    #And I search for the college "Adrian"
    #And I click the college "Adrian" in the college lookup list
    #And I click the Beta Button
    #Then I should see FirstTutorial dialog

  #@test
  #Scenario: Tutorial 1 dialog box is closed when click on X on Tutorial Dialog
   #When I click on the Colleges tab
   #And I search for the college "George"
   #And I click the college "George" in the college lookup list
    #And I click the Beta Button
    #And I click on X in FirstTutorial dialog
    #Then FirstTutorial dialog is closed

  #@test
  #Scenario: Tutorial 2 dialog box is closed when click on X on Tutorial Dialog
   # When I click on the Colleges tab
   # And I search for the college "George"
   # And I click the college "George" in the college lookup list
   # And I click the Beta Button
   # And I click on Next on FirstTutorial dialog
   # And I click on X in SecondTutorial dialog
   # Then SecondTutorial dialog is closed








