@regression 
Feature: Login feature 

@regression-1 
Scenario: Verify Invalid Login 
	Given I open the default browser 
	And I am on home page 
	When I enter mohammad@technosoftacademy.io into username text fields on home screen 
	And I enter test1234 into password text fields on home screen 
	And I click on login button on home screen 
	Then I verify that i am an invalid login page 
	And I close the default browser 
	
@regression-2 
Scenario: Verify Invalid Login two 
	Given I open the default browser 
	Given I am on home page 
	When I enter mohammad@technosoftacademy.io into username text fields on home screen 
	And I enter test1234 into password text fields on home screen 
	And I click on login button on home screen 
	Then I verify that i am an invalid login page 
	And I close the default browser 
@regression-3 
Scenario: Verify if user is able to create the account 
	Given I open the default browser 
	And  I  am on  home page 
	When I enters fatema into First Name text fields on home screen 
	And I enters islam into Last Name text fields on home screen 
	And I enters islamfatema@yahoo.com into email text fields on home screen 
	And enters ab234 intoPassword textx fields on home screen 
	And select  Gender, 
	And I select birthday from drop down
	Then I click on create account 
	 