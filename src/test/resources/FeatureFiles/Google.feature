Feature: Test for google application

  Scenario: Verify Titleof google page
    Given Browser should get open and application should be launched
    When User captures Title of google page
    Then Expected and Actual Title should match
