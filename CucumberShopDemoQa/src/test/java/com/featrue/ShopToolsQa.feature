Feature: User needs to shop a product in Shoptools QA 
Scenario: user needs to click a product 
	Given launch shoptools qa url 
	When user click on product 
	
Scenario: user has to add the product to cart 
	Given user click on drop down to select color 
	When user to select the color of the product 
	And user to click on drop down to select size 
	And user to select the size of the product 
	And user to click the quantity of the product 
	And user to click on add to cart 
	And user to click on cart box 
	
Scenario: user to checkout the product 
	When user to click on proceed to checkout 
	
	
Scenario: user to checkout the product 
	When user to give values on first name 
	And user to give values on last name 
	And user to give values on company name 
	And user to click on country drop down box 
	And user to select values on country drop down box 
	And user to give values on street address1 
	And user to give values on street address2 
	And user to give values on town 
	And user to click on state drop down box 
	And user to select values on state drop down box 
	And user to give values on pincode 
	And user to give values on phone 
	And user to give values on email address 
	And user to click on terms and conditions check box 
	And user to click on proceed checkout 
	
	
	
	
	
