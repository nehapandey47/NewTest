Feature: login Feature

 	Scenario Outline:Successful login with valid credentials
	 Given user has opened the application
	 When user click onto the signin link
	 And use enters "<username>" and "<password>"
	 Then message display login successful
 
 Examples:
  |username|password|
  |lalitha|password123|
  |admin|password456|