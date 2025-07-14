Feature: ProgressBar Page
  Scenario: Start progressbar and stop when progressbar full
    Given User is on progressbar Page
    When Click progressbar button
    Then Stop progressbar when full