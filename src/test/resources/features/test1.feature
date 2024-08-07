Feature: About us page
  Scenario: As a user, I should be able to access Careers Page in About Us
    Given User lands on home page "https://www.enersys.com/en/"
    When User clicks "ABOUT US" button on the navigation bar
    And User clicks "CAREERS" button
    Then User should navigate to the Careers page and verify that page title is "Careers"
    And Verify that page header is "CAREERS"