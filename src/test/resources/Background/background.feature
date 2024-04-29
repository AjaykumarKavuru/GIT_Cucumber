Feature: User is able to login in Orange_Hrm page

Background: Common methods
Given User is on Login Page

 Scenario Outline: Check the login is successful with valid Creds
 When User Enters "<username>" and "<Password>"
And Click on Login Button
Then User navigates to HomePage
And Close the browser

Examples:
|username|Password|
|Admin|admin123|
