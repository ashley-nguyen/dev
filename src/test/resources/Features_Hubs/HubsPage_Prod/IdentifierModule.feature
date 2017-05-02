@hubs @identifiermodule
Feature:  As a student viewing new hubs page, I want to always see the college's name,
  logo, URL and location so that I know what school I'm exploring (HUBS-76, HUBS-218)

  Background:
    Given I log in to Family Connection with the following user details:
      | naviance | benhubs | Hobsons!23 |
    When I open the HUBS page for "Docufide Institute of Technology (not a real college)"

  Scenario: Identifier module is present in Hubs
    Then I should see the Identifier module

  Scenario: Logo is present in Identifier module (Docufide does not have a logo currently)
    Then I should see the logo in the Identifier module

  Scenario: I see the college's url open in a new page
    When I open the URL at the side of the logo
    Then I should see the URL for "https://www.hobsons.com/" open in a new page
  @smoke
  Scenario: The college is added to the 'I'm thinking about' list after clicking the heart when it is white
    When I add the college to the 'I'm thinking about' list using the heart icon
    Then The heart should change its status to indicate that it is clicked
    Then The college "Docufide Inst of Tech (not a real college)" should be added to the 'I'm thinking about list'
    And I remove the college "Docufide Inst of Tech (not a real college)" from the 'I'm thinking about' list in legacy
    Then The college "Docufide Inst of Tech (not a real college)" should not be present in the 'I'm thinking about' list
  @smoke
  Scenario: The college is taken out of the 'I'm thinking about' list after clicking the heart when it is pink (HUBS-969)
    Given The college "Docufide Inst of Tech (not a real college)" is added to the 'I'm thinking about' list
    When I take the college out of the 'I'm thinking about' list using the heart icon
    Then The college "Docufide Inst of Tech (not a real college)" should not be present in the 'I'm thinking about' list

  Scenario:  A tool tip with the text "Add to Colleges I'm Thinking About" is displayed when the user hover over
  the heart icon
    When I go over the heart icon when it is white
    Then I should see a tooltip with the text "Add to Colleges I'm Thinking About"

  Scenario: A tool tip with the text "Remove from Colleges I'm Thinking About" is displayed when the user hover over
  the heart icon (HUBS-969)
    When I go over the heart icon when it is pink
    Then I should see a tooltip with the text "Remove from Colleges I'm Thinking About"
    And I take the college out of the 'I'm thinking about' list using the heart icon


