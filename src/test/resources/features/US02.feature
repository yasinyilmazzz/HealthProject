@Registration
Feature: User Registration
  Background:
    When "User" goes home page
    Given User is on the registration page

   @TC01
  Scenario: Successful registration with valid credentials
    When User enter valid registration information
    And User click the submit button
    Then User should see a success message

@TC02
Scenario: existing username can not register again
When User enter a valid username
And User submit the registration
Then User should see a success message
When User attempt to register with the same username
Then User should see an error message

@TC03
Scenario: Email ID cannot be created without "@" sign and "." extension
When User enter an invalid email ID
And User submit the registration form
Then User should see an error message

@TC04
Scenario: Email cannot be left blank
When User leave the email field blank
And User submit the registration form
Then User should see an error message
