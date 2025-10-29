package stepDefinitions_ecomm;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import utils.testSetup;

public class hooks {
	public WebDriver driver; // Declare WebDriver at class level

	public hooks(testSetup setup) {
		this.driver = setup.driver; // Initialize WebDriver from testSetup
	}
	
	@AfterStep
	public void ErrorScreenshot(Scenario scenario) throws IOException{
		if(scenario.isFailed())
		{
			File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			byte[] content = FileUtils.readFileToByteArray(screenshot);
			scenario.attach(content, "image/png", "Error Screenshot");
			System.out.println("Scenario failed - Capturing screenshot");
		}
	}
	
	@After
	public void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}

}