@crossBrowser
Feature: Book Depository Home page for guest user
  As a customer
  I want to be able to open Book Depository website
  So that I can see a correct page title

Scenario: Open Book Depository
  Given I am an anonymous customer with clear cookies
  And I open the "https://www.bookdepository.com/"
  Then I am redirected to a "Home page"
  And I close the browser