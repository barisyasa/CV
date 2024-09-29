Feature: Buttons Page

  Scenario: Double click on the button
    Given User is on the Buttons page
    When User double clicks on the Double Click Me button
    Then A double click message is displayed

  Scenario: Right click on the button
    Given User is on the Buttons page
    When User right clicks on the Right Click Me button
    Then A right click message is displayed