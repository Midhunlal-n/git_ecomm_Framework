Feature: E Commerce Demo


	@Regression
    Scenario: Login with valid credentials
        Given User is on Login page
        When User enters username "standard_user" and password "secret_sauce"
        When User is redirected to the inventory page
        When User selects the product "Sauce Labs Backpack"
        When User adds the product to the cart
        When User clicks the cart icon
        When User checks the product in the cart and proceeds to checkout "Sauce Labs Backpack"
        When  User enters checkout information
        |John|
        |Doe|
        |12345|
        Then User completes the purchase and sees the order confirmation message
  
  	@Regression      
     Scenario: Login with Invalid credentials
        Given User is on Login page
        When User enters username "standard_user" and password "password_1234"
        Then Error message will be displayed