Feature: Checkout

  Scenario Outline: Checkout a Bannana

    Given the price of a "banana" is 40c
    When I check out <count> "banana"
    Then the total price should be <total>c

  Examples:
    | count   | total   |
    | 1       | 40      |
    | 4       | 160     |
