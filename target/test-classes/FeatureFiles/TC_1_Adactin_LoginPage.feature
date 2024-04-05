@Loginpage
Feature: Verifying Adactin Hotel Login

Background:
#Given User should be in the adactin login page
Given User starting testcase

  Scenario: Validating Adactin Login with valid credential
    #Given User should be in the adactin login page
    When User should enter valid username and password
    And User should click the login button
    Then User should verify successfully logged in

  Scenario: Validating Adactin Login with invalid credential1
    #Given User should be in the adactin login page1
    When User should enter invalid username and password1
    And User should click the login button1
    Then User should verify error message

