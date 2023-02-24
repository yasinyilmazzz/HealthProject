@US01

  Feature: US01_HealthProject

      Scenario : TC01_enter 9digit ssn number
      Given "User" goes home page
      When click on user icon
      Then click on register option
       And "User" enters "9digit_ssn number" in SSN box


#      Scenario: TC02_enter 8_digit_ssn
#      Given "User" goes home page
#      When click on user icon
#      Then click on register option
#      And "User" enters "8digit_ssn_number" in SSN box

#      Scenario: TC03_enter 8_digit_ssn
#      Given "User" goes home page
#      When click on user icon
#      Then click on register option
#      And "User" enters "10digit_ssn_number" in SSN box


    Scenario: TC02_enterFirstName
        Given "User" goes home page
        When click on user icon
        Then click on register option
        And "User" enters "<First Name>" in First Name Box

    Scenario: TC03_enterFirstName
        Given "User" goes home page
        When click on user icon
        Then click on register option
        And "User" enters "<Last Name>" in Last Name Box

