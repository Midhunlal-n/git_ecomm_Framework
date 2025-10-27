package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testSetup {
	public WebDriver driver;

	public testSetup() {

		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("user-data-dir=C:\\Users\\midhunn\\ChromeProfiles");
		options.addArguments("profile-directory=Profile 2");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();

		// Set timeouts
		driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(java.time.Duration.ofSeconds(30));
		driver.manage().timeouts().scriptTimeout(java.time.Duration.ofSeconds(30));

	}

}