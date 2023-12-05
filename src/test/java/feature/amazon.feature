Feature: Amazon.com
  Scenario: amazon.com adding product
    Given user is on homepage
    When Click accept cookies
    When click the search button
    When write product name
    When click the search button
    When filter for shipped by amazon
    When filter for apple
    When click the first product
    When add to cart
    When check at cart page

