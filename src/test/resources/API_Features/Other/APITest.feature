Feature: Test for restful service

  Scenario Outline: CallRestAPI
    When I call this Rest API
    When I call LOR Request API with "<token>" token and "<url>" with "<params>"

  Examples:
  | token                                 | url                                                                     | params                                                     |
  | d3f6c924-1123-44b4-a24e-a41ce7f96bce  | https://qa-apis.naviance.com/student-core/students/lor-requests/events  | {'created':{'$gte':{'$date':'2016-08-11T17:51:34.987Z'}}}  |