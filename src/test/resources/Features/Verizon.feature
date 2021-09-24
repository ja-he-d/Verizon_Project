@VerizonProjectWithValidCredentials
Feature: Test Verizon functionalities

  Background:
    Given User is in verizon home page and click on shop

  Scenario: Check shop to browse FreePhones with valid  credentials
    When User click on deals for free phones
    And User click on FreePhones button to select the items
    Then  user is navigate to FreePhones page

  Scenario: Check shop to browse SmartPhones with valid  credentials
    When User click on deals for SmartPhones
    And User click on SmartPhones button to select the items
    Then  user is navigate to a SmartPhones page


  Scenario: Check shop to browse PrepaidPhones with valid  credentials
    When User click on devices for PrepaidPhones
    And User click on PrepaidPhones button to select the items
    Then  user is navigate to a PrepaidPhones page


  Scenario: Check shop to browse watches with valid  credentials
    When User click on devices for Watches
    And User click on watches button to select the items
    Then  user is navigate to a Watches page


  Scenario: Check shop to browse charging with valid  credentials
    When User click on accessories for charging items
    And User click on charging button to select the items
    Then  user is navigate to  charging page



  Scenario: Check plans to browse studentPlans with valid  credentials
    When User click on plans for health studentPlans
    And User click on studentPlans button to select the items
    Then user is navigate to studentPlans page


  Scenario: Check shop to browse unlimited with valid  credentials
    When User click on plans
    And User click on unlimited button to select the items
    Then  user is navigate to  unlimited page


  Scenario: Check shop to browse fiosTv with valid  credentials
    When User click on home
    And User click on fiosTv button to select the items
    Then  user is navigate to  FiosTv page


  Scenario: Check shop to browse gaming with valid  credentials
    When User click on entertainment
    And User click on gaming button to select the items
    Then  user is navigate to gaming page


  Scenario: Check shop to browse safety with valid  credentials
    When User click on apps
    And User click on safety button to select the items
    Then  user is navigate to a scroll page























