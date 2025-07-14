Feature: Test Select Date
  Scenario: Select and verify date
    Given Open date picker page
    When Select date
    Then Verify selected date

    Scenario: Select and verify date and time
      Given Open date picker page
      When Select date and time
      Then Verify selected date and time