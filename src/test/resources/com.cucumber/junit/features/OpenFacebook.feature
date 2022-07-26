@crossBrowser
Feature: Facebook login page
  As a customer
  I want to be able to open Facebook website
  So that I can see a login page

  Scenario: Open Facebook
    Given I am an anonymous customer with clear cookies
    And I open the "https://www.facebook.com/"
    Then I am redirected to a "Login page"
    And I close the browser