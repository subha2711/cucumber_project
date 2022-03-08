Feature: To test the select box functionality

  Scenario: Sky Blue Background
    Given "Set SkyBlue Background" button exists
    When I click on the button;
    Then the background color will change to sky blue

  Scenario: White Background Change
    Given "Set SkyWhite Background" button exists
    When I click on the button
    Then the background color will change to white
