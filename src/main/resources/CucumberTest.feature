Feature: SignInTest

  Scenario: TC0001 Login Test Case
    Given Browser da URL ac

    And Search product: "samsung galaxy a23"
    And Search button click
    And First product description click
    And Product text control
    Then Browser closed