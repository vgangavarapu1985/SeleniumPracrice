@regression
Feature: Validate Login Functionality of New Tours Application 

Background: 
	Given : user open the browser and load the url 
	  

Scenario: Verify Login functionality with valid credentials
	Then  : home page is displayed 
	When  : user clicks on Log In Link 
	When  : enter User name "gvkishore.kish@gmail.com"
	When  : enter Password "test1234"
	When  : click on Login Link 
	Then  : validate DashBoard Page displayed.    