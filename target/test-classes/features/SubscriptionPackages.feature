Feature: Subscription Packages


  @Test
  Scenario Outline: Validate Subscription Packages for all Countries
    Given the user is on the subscription page
    When the user selects the country "<country>"
    Then the subscription packages are displayed
    And the packages contain valid Type & Price and "<country>" currency

    Examples:
      | country|
      | UAE     |
      | Egypt   |
      | Iraq    |

