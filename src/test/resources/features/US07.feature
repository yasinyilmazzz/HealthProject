@PatientLoginUpdateInfo
Feature: Patient Login and Update Info

  Background: TC_01 Sign In Medunna as Patient
    Given patient is on "https://medunna.com/" page
    When click on user icon
    And click on Sign In option
    And enter "herow" in Username input
    And enter "4004Hakan_" in Password input
    And click on Remember Me checkbox
    And click on Sign In submit button
    Then verify that login is successfull.


  @patient_info_test
  Scenario: TC_02 Patient Info
    When patient clicks on user icon
    And clicks on "Settings" option
    Then verify that "User settings for [" message is displayed

  @patient_info_test
  Scenario: TC_03 Patient Info Update
    When patient updates "firstname" into First Name input field
    And patient updates "lastname" into Last Name input field
    And clicks on Save button
    Then verif that new updated firstname and lastname is displayed

