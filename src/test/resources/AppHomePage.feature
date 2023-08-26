Feature: Palringo Application Functionality Verification

  Scenario Outline: Validating v1.0 application functionality
    Given The app is launched "<version>"
    Then  User should see the label as "0"
    When  User click on the button
    Then  User should see the label as "1"
    When  User click on the button
    Then  User should see the label as "2"
    When  User click on the button
    Then  User should see the label as "MAX"
    And   User close the application
    Examples:
      | version  |
      | v0.9     |
      | v1.0     |

  Scenario Outline: Validating v0.9 application functionality
    Given The app is launched "<version>"
    Then  User should see the label as "0"
    When  User click on the button
    Then  User should see the label as "1"
    When  User click on the button
    Then  User should see the label as "MAX"
    And   User close the application
    Examples:
      | version  |
      | v0.9     |
      | v1.0     |


