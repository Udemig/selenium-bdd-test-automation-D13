Feature: SignInTest

  Scenario: TC0001 Login Test Case
    Given Browser da URL ac
    When Cookie Control
    And Search product: "samsung galaxy a23"
    And Search button click
    And First product description click
    Then Browser closed