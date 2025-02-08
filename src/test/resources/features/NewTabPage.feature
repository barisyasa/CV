Feature: New Tab Page
  Scenario: User open new tab
    Given User is on New Tab page
    When User click new tab button
    Then User should see new tab text

    Scenario: User open new window
      Given User is on New Tab page
      When User click new window button
      Then User should see new window text

      Scenario: User open new window message
        Given User is on New Tab page
        When User click new window message button
        Then User should see message