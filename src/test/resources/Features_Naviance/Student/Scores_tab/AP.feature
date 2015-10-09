Feature: Student AP Scores
  in order to track student AP test scores
  as a Naviance user
  I want to be able to manage student AP scores

  @test @destructive
  Scenario Outline: Update Student AP scores
  Given I am logged into naviance as an admin user
  When I search for <student> using the global search field
  And I enter AP test scores <testtype> <score> <year> <grade>
  Then their AP test scores will be displayed <testtype> <score> <year> <grade>

  Examples:
  | student | testtype | score | year  | grade  |
  | Banks, Dante  | Art History | 4 | 2015  | 12  |
