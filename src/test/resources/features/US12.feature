@US12
Feature: Health_Project US12

  Background: Doctor_goes_homepage_and_signin
    When "Doctor" goes home page
    And "Doctor" clicks account menu dropdown
    And "Doctor" clicks sign in button
    And "Doctor" enters "doctor_username" in username field
    And "Doctor" enters "doctor_password" in password field
    And "Doctor" clicks sign in submit button
    And Doctor clicks My Pages dropdown
    And Doctor clicks My Appointment

  Scenario: TC01_create_or_edit_an_appointment
    When Doctor clicks edit button
    Then Doctor verifies that "Create or Edit an Appointment" header is visible

  Scenario: TC02_doctor_should_see_patient_info
    When Doctor clicks edit button
    Then Doctor verifies that "ID" is visible
    Then Doctor verifies that "Start DateTime" is visible
    Then Doctor verifies that "End DateTime" is visible
    Then Doctor verifies that "Start DateTime" is visible
    Then Doctor verifies that "Status" is visible
    Then Doctor verifies that "Physician" is visible

  Scenario: TC03_positive_required_fields
    When Doctor clicks edit button
    And Doktor enters "Diabet" in Anamnesis field
    And Doctor enters "General treatment" in Treatment field
    And Doctor enters "Angina" in Diagnosis field
    And Doctor enters "Prescription" in Prescription field
    And Doctor enters "Description" in Description field
    And Doctor clicks save button
    Then doctor verifies that to be on the Appointment page

  Scenario: TC03_negative01_required_fields
    When Doctor clicks edit button
    And Doktor enters "Diabet" in Anamnesis field
    And Doctor enters "General treatment" in Treatment field
    And Doctor clicks save button
    Then Doctor verifies that "This field is required" message visibility on Diagnosis field

  Scenario: TC03_negative02_required_fields
    When Doctor clicks edit button
    And Doktor enters "Diabet" in Anamnesis field
    And Doctor enters "Angina" in Diagnosis field
    And Doctor clicks save button
    Then Doctor verifies that "This field is required" message visibility on Treatment field

  Scenario: TC03_negative03_required_fields
    When Doctor clicks edit button
    And Doctor enters "General treatment" in Treatment field
    And Doctor enters "Angina" in Diagnosis field
    And Doctor clicks save button
    Then Doctor verifies that "This field is required" message visibility on Anamnesis field

  Scenario: TC04_prescription_and_description_can_be_optional
    When Doctor clicks edit button
    And Doktor enters "Diabet" in Anamnesis field
    And Doctor enters "General treatment" in Treatment field
    And Doctor enters "Angina" in Diagnosis field
    And Doctor leaves the Prescription field empty
    And Doctor leaves the Description field empty
    And Doctor clicks save button
    Then Doctor verifies that to be on the Appointment page