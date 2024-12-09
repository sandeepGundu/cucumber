#@smoke
Feature: Wikipedia main page
  As a Wikipedia user
  I want a main page to be displayed
  So that I can search for topics of interest

  Scenario: Display featured article
    Given I am on Wikipedia main page
    Then today's featured article displayed