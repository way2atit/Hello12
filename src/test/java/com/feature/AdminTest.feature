@AdminTest 
Feature: Test Admin Functionality 

Scenario Outline: 
	Given user navigate to Login page 
	When user entered username "<username>"
	And user entered pass "<password>"
	Then user click on login button 
	Examples: 
		|username| password|
		|A| A1|
		|B| B1|
		|Admin|admin123|
		
		
	
		
		
		
	