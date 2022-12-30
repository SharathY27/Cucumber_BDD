# For Datatable with Examples note that we should not use Scenarion instead we should use Scenario Outline
# While using Examples we should use < , > angular brackets in feature file
Feature: This is the Login Feature with Example

  Scenario Outline: Login to the OrangeHRM page with Example
    Given Now the user is on login page in OrangeHRM website
    When now the user is enters username "<Username>" and password "<Password>" in  OrangeHRM website
    And now the user click on login button OrangeHRM website
    Then now the user is navigated to home page OrangeHRM website

    Examples: 
      | Username | Password |
      | Admin    | admin123 |
