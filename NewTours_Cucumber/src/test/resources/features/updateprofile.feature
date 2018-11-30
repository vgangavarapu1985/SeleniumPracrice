@important
Feature: Verify Update Profile Functionality in New Tours application

		  
#Scenario:  update the profile 
#	Given user open the browser and load the new tours application url	
#	Then verify home page displayed
#	When click on Sign-On link
#	When enter user name "gvkishore.kish@gmail.com"
#	When enter password "test1234"
#	Then verify dashboard page displayed
#	When user click on Profile link
#	Then profile page should be displayed
#	When enter First name "Kishore"
#	When enter Last name "Gangavarapu"
#	When enter Phone "8324999009"
#	When enter Email "gvkishore.kish@gmail.com"
#	When enter Address "springdale road"
#	When enter City "waukesha"
#	When enter State "wi"
#	When enter Postal Code "53186"
#	When enter Country "UNITED STATES"
#	When click on Submit Button 
 
Scenario Outline:  update the profile 
	Given user open the browser and load the new tours application url	
	Then verify home page displayed
	When click on Sign-On link
	When enter user name <userName>
	When enter password <password>
	Then verify dashboard page displayed
	When user click on Profile link
	Then profile page should be displayed
	When enter First name <firstName>
	When enter Last name <lastName>
	When enter Phone <phone>
	When enter Email <email>
	When enter Address <address>
	When enter City <city>
	When enter State <state>
	When enter Postal Code <postcode>
	When enter Country <country>
	When click on Submit Button 


Examples:
	|userName|password|firstName|lastName|phone|email|address|city|state|postcode|country|
	|gvkishore.kish@gmail.com|test1234|kishore|ganga|8324999009|gvkishore.kish@gmail.com|springdaleRoad|waukesha|wi|53186|UNITED STATES|
	|gvkishore.kish@gmail.com|test1234|kishore|ganga|8324999009|gvkishore.kish@gmail.com|springdaleRoad|waukesha|wi|53186|UNITED STATES|
	|gvkishore.kish@gmail.com|test1234|kishore|ganga|8324999009|gvkishore.kish@gmail.com|springdaleRoad|waukesha|wi|53186|UNITED STATES|
	|gvkishore.kish@gmail.com|test1234|kishore|ganga|8324999009|gvkishore.kish@gmail.com|springdaleRoad|waukesha|wi|53186|UNITED STATES|
	
	