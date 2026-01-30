#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
Feature: To perform SignUp
 
  Background:
    Given the user must be in chrome browser
 
  @tag1
  Scenario: Validate signup using Excel data
    Given The user in the signup page
    When The user enters signup details from excel
    And The user click on i am not a robot
    And The user click on continue
    Then the user will enter in the website