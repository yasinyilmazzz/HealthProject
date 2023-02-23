@PatientLoginUpdateInfo
Feature: Patient Login and Update Info

  @patient_login_test
  Scenario: Sign In Medunna as Patient
    Given patient is on "https://medunna.com/" page
    When click on user icon
    And click on Sign In option
    And enter "herow" in Username input
    And enter "4004Hakan_" in Password input
    And click on Remember Me checkbox
    And click on Sign In submit button
    Then verify that login is successfull.


  @patient_info
  Scenario: Patient Info
    When patient clicks on user icon
    And clicks on "Settings" option
    Then verify that "User settings for [" message is displayed
