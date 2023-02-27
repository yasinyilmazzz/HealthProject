@US01

  Feature: US01_HealthProject_Register


      Scenario: TC01_enter 9_digit_ssn
      Given "User" goes home page
      When click on user icon
      Then click on register option
      And "User" enters "valid_ssn_number" in SSN box


   Scenario: TC01_negative01_6_digit_ssn
       Given "User" goes home page
       When click on user icon
       Then click on register option
       And "User" enters "invalid_ssn_number" in SSN box


    Scenario: TC02_enterFirstName
        Given "User" goes home page
        When click on user icon
        Then click on register option
        And "User" enters "Negar" in First Name Box


    Scenario: TC03_enterFirstName
        Given "User" goes home page
        When click on user icon
        Then click on register option
        And "User" enters "France" in Last Name Box

