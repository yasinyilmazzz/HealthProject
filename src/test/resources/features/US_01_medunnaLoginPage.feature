@LoginPage
Feature: US_01 Medunna Login Page

  Background: Common Steps
    Given user goes to specified URL
    Then user clicks on Login button
    And user clicks on Sign in button on the website
@1
  Scenario: TC_01 There should be a valid username and password validating the success message

    Given user enters a valid username in the Username section of the page
    And user enters a valid password in the Password section of the page
    And user confirms that entered the sign in page
    Then close the page

  @2
  Scenario: TC_02 There should be a "Remember me" option where user can always use their existing credentials

    Given  user clicks "Remember me" button where they can always use their existing credentials
    And user confirms that clicked on "Remember me"
    Then close the page
  @3
  Scenario: TC_03 After the user clicks the "Remember me" box and logs in to the system and then signs out, the username and password should come automatically to login to the system again
    Given  if user forgets the password clicks on the option "Did you forget your password?"
    And user confirms that "Enter the email address you used to register" on the page
    Then close the page
  @4
  Scenario: TC_04 There should be an option to navigate to registration page if not registered yet

    Given user clicks "You don't have an account yet? Register a new account" option on the page
    And user confirms that directed to the "Registration" page on the opened page
    Then close the page
  @5
  Scenario: TC_05 There should be an option to cancel login

    Given user clicks on "Cancel" button on the sign in page
    And user confirms going to "Medunna" homepage
    Then close the page








