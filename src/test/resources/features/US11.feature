@us_11
Feature: Doctor_Appointments_Visible

  Background: Sign In Medunna
    Given user is on "https://medunna.com/" page
    When click on user icon
    And click on Sign In option
    And enter "team02doctor" in Username input
    And enter "Qwerty02" in Password input
    And click on Remember Me checkbox
    Then click on Sign In submit button

  @my_appointments
  Scenario: My Appointments
    And click on My Pages
    And click on My Appointments
    Then assert that appointment list is visible
    And assert that time slot is visible
    And close the application

  @appointment_details
  Scenario: Doctor-Can See-Appointment-Details
    And click on My Pages
    And click on My Appointments
    Then assert that doctor can see patient id
    And assert that doctor can see start date
    And assert that doctor can see end date
    And assert that doctor can see status
    And close the application
