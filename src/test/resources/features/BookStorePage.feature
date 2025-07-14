Feature: Book Store Page
  Scenario: User fill register form and submit
    Given User is on Book Store Page
    When User fill form and click on the Register button
    Then Verify error message