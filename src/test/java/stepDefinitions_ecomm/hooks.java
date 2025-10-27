package stepDefinitions_ecomm;

import org.openqa.selenium.WebDriver;
import io.cucumber.java.After;
import utils.testSetup;

public class hooks {
	public WebDriver driver; // Declare WebDriver at class level

	public hooks(testSetup setup) {
		this.driver = setup.driver; // Initialize WebDriver from testSetup
	}
	
	@After
	public void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}

}