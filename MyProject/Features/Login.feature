Feature: Login

Scenario: Successful login with valid credentials
	Given user launch Chrome browser
	When User opens url "https://admin-demo.nopcommerce.com/login"
	And User enters email as "admin@yourstore.com" and password as "admin"
	And Click on Login
	Then Page title should be "Dashboard / nopCommerce administration" 
	When  User clicks on Log out link
	And close browser
	
Scenario Outline: Login Data Driven
	Given user launch Chrome browser
	When User opens url "https://admin-demo.nopcommerce.com/login"
	And User enters email as "<email>" and password as "<password>"
	And Click on Login
	Then Page title should be "Dashboard / nopCommerce administration" 
	When User clicks on Log out link
	And close browser
	
		
	Examples: 
		| email 			   | password |
		| admin1@yourstore.com | admin123 |
		| admin@yourstore.com  | admin456 |