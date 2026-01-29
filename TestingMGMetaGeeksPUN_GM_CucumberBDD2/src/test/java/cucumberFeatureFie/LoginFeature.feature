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
@tag
Feature: User Login Update Status
 

  @tag7
  Scenario Outline: Login form validation
    Given The user is in Login form 
    When The user enters "<Username>" in username field
    And The user enters "<Password>" in password field
      * The user click on Login button 
    Then The user get the status message as "<Status>" in alert

    Examples: 
      | Username  | Password | Status  |
      | admin | admin123 | pass |
      | mphasis | mphasis123 | Fail |
      | office | office462 | pass |
