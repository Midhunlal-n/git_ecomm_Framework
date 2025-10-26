package stepDefinitions_ecomm;

import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.When;
import pageObjects.inventory_and_CartPage;
import utils.testSetup;

public class StepDefs_inventory_and_cartPage_ecomm {
	public WebDriver driver; // Declare WebDriver at class level

	public StepDefs_inventory_and_cartPage_ecomm(testSetup setup) {
		this.driver = testSetup.driver; // Initialize WebDriver from testSetup
		inventorycartpage = new inventory_and_CartPage(driver); // send driver to page object
	}

	inventory_and_CartPage inventorycartpage;

	@When("User is redirected to the inventory page")
	public void user_is_redirected_to_the_inventory_page() {
		if (driver.getCurrentUrl().contains(inventorycartpage.inventorypageurl)) {
			System.out.println("Login Successful - User is on Inventory Page");

		} else {
			System.out.println("Login Failed --");
			assert false;
		}
	}

	@When("User selects the product {string}")
	public void User_selects_the_product(String productName) {
		inventorycartpage.selectProduct(productName);
		System.out.println("User Selects the Product with Productname - " + productName);

	}

	@When("User adds the product to the cart")
	public void user_adds_the_product_to_the_cart() {
		inventorycartpage.clickAddToCart();
		System.out.println("User adds the product to Cart");

	}

	@When("User clicks the cart icon")
	public void user_clicks_the_cart_icon() {
		inventorycartpage.clickCartIcon();
		System.out.println("Clicks the Cart Icon");

	}

	@When("User checks the product in the cart and proceeds to checkout {string}")
	public void user_checks_the_product_in_the_cart_and_proceeds_to_checkout(String itemName) {
		if (inventorycartpage.isCartItemDisplayed(itemName) == true) {
			System.out.println("Product is added to Cart Successfully");
			inventorycartpage.clickCheckout();
			System.out.println("Proceeds to CheckOut");

		} else
			assert false;

	}

}
