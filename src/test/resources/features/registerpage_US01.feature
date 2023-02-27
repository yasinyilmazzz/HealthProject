@US01

  Feature: US01_HealthProject_Regiter

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

      Scenario: TC02_negativeTest_FirstName_Is_Required
        Given "User" goes home page
        When click on user icon
        Then click on register option
        And "User" leaves the first name box blank
        And "User" enters Last Name in last name box
        Then verify FirstName is required


    Scenario: TC03_enterLastName
        Given "User" goes home page
        When click on user icon
        Then click on register option
        And "User" enters "France" in Last Name Box

    Scenario: TC03_negativeTest_LastName_is_Required
      Given "User" goes home page
      When click on user icon
      Then click on register option
      And "User" leaves the last name box blank
      And "User" enters letters in username box
      Then verify that LastName is required
      And User closes the application