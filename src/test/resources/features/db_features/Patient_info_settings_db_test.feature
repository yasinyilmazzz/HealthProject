@DatabaseTest
Feature: patient_info_settings

  @db_validate_patient_info
  Scenario: Patient Info DB Validation
    Given patient connects to the database
    And patient sends query to get data of "id" column from "patient" table
    And patient reads all of the "id" column data
    And patient verifies the username by "id"
    Then close the database connection