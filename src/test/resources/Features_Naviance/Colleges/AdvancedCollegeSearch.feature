Partia@smoketest
Feature: Colleges - Advanced search
  As a Succeed user
  I want to do an advanced search for a college based on specific criteria
  So that I will know more information about a particular college that has my interestes

  Background:
    Given when I log in with the following user details:
      | etcs | sallysupport | sallysupport01! |

  @td2 @safe
  Scenario: View Advanced College Search
    When I go to the advanced college search screen
    Then I will see "School type" search category
#    Then I will be able to search using the following criteria '<SearchCategory>' '<SearchValue>' '<SearchData>' '<SearchResult>'

#    Examples:
#      | SearchCategory | SearchValue            | SearchData | SearchResult       |
#      | School type    | Two year vs. Four Year | Two Year   | AA McAllister Inst |
