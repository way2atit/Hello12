@DashboardTest
Feature: Test Dashboard Functionality 

Background: 
	Given user navigate to Login page 
	When user entered username 
	And user entered pass 
	Then user click on login button 
	
Scenario Outline:: 
	When user click on Admin button "<adminKey>"
	Examples:
	|adminKey|
	|abcd|
	
Scenario: 
	When user click on PIM button 
	
Scenario: 
	When user click on Leave button 
	
Scenario: 
	When user click on Time button 
	
Scenario: 
	When user click on My Info button