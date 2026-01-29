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

Feature: To test the basic calculator
  Rule: This calculator has to be used for school students.
  
   Background:
    Given a global administrator named Greg
    

  @tag1
  Scenario: To check I can perform addition
    Given I am holding the calculator
    When I enter the first number
    And I click on + symbol
    And I enter the third number
    Then I must be able to view the sum of the numbers
    
  @tag2
  Scenario: I want to mention my firstname as input 
    Given I am in registration form
    When I enter the first name 
    
    
  @tag6
  Scenario Outline: Title of your scenario outline
    Given I want to write a step with "<name>"
    When I want to enter <id> is as idnum
    And I want to enter <sal> as salary
  
    Examples: 
      | name  | id | sal |
      | Anush | 1234 | 43000.43 |
      | Bruno | 3245 | 32440.32 |   
    
    
    
    