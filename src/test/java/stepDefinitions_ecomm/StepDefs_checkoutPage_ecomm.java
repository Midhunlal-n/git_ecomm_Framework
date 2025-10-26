package stepDefinitions_ecomm;

import java.util.List;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.checkoutPage;
import utils.testSetup;

public class StepDefs_checkoutPage_ecomm {

	public WebDriver driver; // Declare WebDriver at class level

	public StepDefs_checkoutPage_ecomm(testSetup setup) {
		this.driver = testSetup.driver; // Initialize WebDriver from testSetup
		checkoutpage = new checkoutPage(driver); // send driver to page object
	}

	checkoutPage checkoutpage;

	@When("User enters checkout information")
	public void user_enters_checkout_information(List<String> datatable) {
		checkoutpage.enterFirstName(datatable);
		checkoutpage.enterLastName(datatable);
		checkoutpage.enterPostalCode(datatable);
		checkoutpage.clickSubmit();
		System.out.println("Enters the details - Firstname: " + datatable.get(0) + " Lastname: " + datatable.get(1)
				+ " PostalCode: " + datatable.get(2));

	}

	@Then("User completes the purchase and sees the order confirmation message")
	public void user_completes_the_purchase_and_sees_the_order_confirmation_message() {
		checkoutpage.clickFinish();
		if (checkoutpage.isOrderConfirmationMessageDisplayed() == true) {
			System.out.println("Order placed successfully - Test Passed");
		} else {
			System.out.println("Order not placed - Test Failed");
			assert false;
		}

	}

}