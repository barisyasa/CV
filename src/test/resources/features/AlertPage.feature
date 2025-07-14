Feature: Alert Page
  Scenario: User open and close alert
    Given User is on the Alert page
    When User clicks on the alert button
    Then User close alert

    Scenario: User open and close 5 second alert
      Given User is on the Alert page
      When User clicks on the 5 second alert button
      Then User close timer alert