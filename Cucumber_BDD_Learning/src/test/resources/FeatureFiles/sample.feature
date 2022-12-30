@Sample
Feature: Login to facebook

  Scenario: User is logging to facebook page
    Given user is entering username and password in login page
    When user is clicking enter after giving credentials
    And user should be able to login
    Then user should get feeds on facebook page
