Feature: This is Login Feature

  Scenario: Login to OrangeHRM page
    Given the user is on login page
    When the user is entering below credentials
      | Admin | admin123 |
    And the user click on login button
    Then the user is navigated to home page
