@LoginTest 
Feature: Test Login Functionality 

Background: 
	Given user navigate to Login page 
	
Scenario: 
	When user entered username 
	And user entered pass 
	Then user click on login button 
	
Scenario: 
	When user entered invalid username 
	And user entered invalid pass 
	Then user click on login button 
	
Scenario: 
	When user entered invalid username 
	And user entered valid pass 
	Then user click on login button 
	
Scenario: 
	When user entered valid username 
	And user entered invalid pass 
	Then user click on login button 
		