Feature: Test for restful service

  Scenario Outline: CallRestAPI
    When I call this Rest API
    Then I call LOR Request API with "<token>" token and "<url>" with "<params>"

  Examples:
  | token                                 | url                                                                     | params                                                     |
  | 55cb72e9-aef0-49eb-aba0-f36b2dd9ff8d  | https://qa-apis.naviance.com/student-core/students/lor-requests/events  | {'created':{'$gte':{'$date':'2016-08-11T17:51:34.987Z'}}}  |