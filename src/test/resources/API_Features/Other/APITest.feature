Feature: Test for restful service

  Scenario Outline: CallRestAPI
    When I call this Rest API
    When I call LOR Request API with "<token>" token and "<url>" with "<params>"

  Examples:
  | token                                 | url                                                                     | params                                                     |
  | b79876a8-96c5-497c-8a37-ceb347b99a19  | https://qa-apis.naviance.com/student-core/students/lor-requests/events  | {'created':{'$gte':{'$date':'2016-08-11T17:51:34.987Z'}}}  |