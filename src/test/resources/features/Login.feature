Feature: Open cart demo#

  Background:
    When go to open cart demo website

  @Smoke
  Scenario: Perform Login function
    Given click on MyAccount button from menubar
    Then Select Login Button
    When Click on New Customer
    Then Enter all Customer Personnel Details