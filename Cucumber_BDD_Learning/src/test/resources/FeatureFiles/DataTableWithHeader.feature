Feature: This is the Login Feature

  Scenario: Login to the OrangeHRM page
    Given Now the user is on login page
    When now the user is entering below credentials
      | Username | Password |
      | Admin    | admin123 |
    And now the user click on login button
    Then now the user is navigated to home page
