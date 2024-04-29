Feature:Login Page Automation of OrangeHrm
Scenario Outline: Check the login is successful with valid Creds
Given User is on Login Page
When User Enters "<username>" and "<Password>"
And Click on Login Button
Then User navigates to HomePage
And Close the browser

Examples:
#|username|Password|
#|Admin|admin123|
#|admin|ajay123|
|read('/Input.xlsx')|