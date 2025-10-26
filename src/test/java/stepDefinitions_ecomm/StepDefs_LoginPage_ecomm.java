package stepDefinitions_ecomm;

import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.loginPage;
import utils.testSetup;

public class StepDefs_LoginPage_ecomm {
	public WebDriver driver;// Declare WebDriver at class level

	public StepDefs_LoginPage_ecomm(testSetup setup) {
		this.driver = testSetup.driver; // Initialize WebDriver from testSetup
		loginpage = new loginPage(driver); // send driver to page object

	}

	loginPage loginpage;

	@Given("User is on Login page")
	public void user_is_on_login_page() {
		driver.get(loginpage.baseurl);
		System.out.println("User - Is on Login Page");
	}

	@When("User enters username {string} and password {string}")
	public void user_enters_username_and_password(String username, String password) {

		loginpage.enterUsername(username);
		loginpage.enterPassword(password);
		loginpage.clickLogin();
		System.out.println("User - Enters username" + username + " and password" + password);

	}

	@Then("Error message will be displayed")
	public void Error_message_will_be_displayed() {
		if (loginpage.isInvalidLoginButtonDisplayed()==true) {
			System.out.println("Login Failed - Username and Password does not match");
		} else
			assert false;
	}

}
