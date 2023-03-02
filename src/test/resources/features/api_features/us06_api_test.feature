@Api_Tests
Feature: API_Tests

  @US06_api_test
  Scenario: TC12_Api_Request
    Given patient sends GET request to see appointments
    Then HTTP status code should be 200
    And assert that user can see appointment list
