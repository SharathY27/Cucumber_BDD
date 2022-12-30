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
Feature: Background Feature 

  Background: the student completed school education
    Given the student finished high school
    Given the student finished higher secondary school

  Scenario: To join medical college
    Given the student applies for medical course
    When student cleared entrance exam
    Then the student is eligible for joining any medical college

  Scenario: To join engineering college
    Given the student applies for engineering course
    When student has a sayable cutoff
    Then student is eligible for engineering course
