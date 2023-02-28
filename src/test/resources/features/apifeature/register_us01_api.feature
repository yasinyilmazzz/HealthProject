@US01_Api
  Feature: Registration

    Scenario: US01_HealthProject_Registeration
       Given user sends get request for registrant
       Then  user gets  registrant data and validate them