@Login
Feature: Login Feature

  Scenario: Login to OrangeHRM website
    Given user is on login page
    When user is entering login credentials
    And user click on login button
    Then user is navigated to home page
