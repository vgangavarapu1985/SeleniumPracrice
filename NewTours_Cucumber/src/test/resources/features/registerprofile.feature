@regression
Feature: Profile functionality of New Tours Applicaiton

Scenario Outline: Verify the profile functionality of New Tours Application

Given : user open the browser and load the url 
Then : Home Page is displayed
When : user clicks on Register Button
Then : Register page displayed
When : enter First Name <firstName>
And : enter Last Name <lastName>
And : enter Phone <phone>
And : enter email <email>
And : enter address <address>
And : enter city <city>
And : enter state <state>
And : enter postal code <postcode>
And : enter country <country>
And : enter username <userName>
And : enter password <password>
And : enter confirm password <confirmPassword>
When : click on submit button
Then : Registration completed successfully.

Examples: 
|firstName|lastName|phone|email|address|city|state|postcode|country|userName|password|confirmPassword|
|Kishore|Gangavarapu|8324999009|gvkishore.kish@gmail.com|springdalerd|waukesha|wisconsin|53186|UNITED STATES|gvenkat2642@gmail.com|test1234|test1234|
|Kishore|Gangavarapu|8324999009|gvkishore.kish@gmail.com|springdalerd|waukesha|wisconsin|53186|UNITED STATES|gvenkat2642@gmail.com|test1234|test1234|
|Kishore|Gangavarapu|8324999009|gvkishore.kish@gmail.com|springdalerd|waukesha|wisconsin|53186|UNITED STATES|gvenkat2642@gmail.com|test1234|test1234|