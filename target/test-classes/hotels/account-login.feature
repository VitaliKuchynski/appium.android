@Hotels-Android

Feature: Hotels app account login feature

  Background:
    Given I am on hotel app home page

    @Account-creation
  Scenario: Verify successful creation of creating account
    When  I scroll down page
    And   I tap on Create Account button
    And   I fill out all required fields
    And   I submit the form
    Then  I verify successful creation of a home page

    @Login-invalid
  Scenario: Verify invalid login on android hotel app
    When I scroll down page
    And I tap on Sign in button
    And I enter grisha@tut.by invalid to username field
    And I enter 123hotels invalid to password field
    Then I verify invalid error message