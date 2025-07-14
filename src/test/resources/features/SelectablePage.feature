Feature: Test Selectable List
    Scenario: Select first item
      Given Go selectable page
      When Click first item
      Then First item must be selected