@regtest 
Feature: Test Reg page 

Scenario: 
	Given User on registration page 
	When user fill reg form 
	|fname|lname|mb|city|email|pincode|lang|
	|Admin|admin123| 9090909|Pune|admin@gmail.com|41101|java|
	
	
	
Scenario Outline: 
	Given User on registration page 
	When user fill reg form fname "<fname>" "< lname>" "<mb>" 
	And  user fill mb  "<city>"  "< email>" 
	Examples: 
		|fname | lname|mb|city|email|
		| Admin| admin123|998989898|pune|abc@gmail.com|