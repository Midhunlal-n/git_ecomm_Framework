package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {
	public WebDriver driver;

	public loginPage(WebDriver driver) {
		this.driver = driver;

	}

	public String baseurl = "https://www.saucedemo.com/v1/";
	By username = By.xpath("//input[@id='user-name']");
	By password = By.xpath("//input[@id='password']");
	By loginBtn = By.xpath("//input[@id='login-button']");
	By InvalidLoginbtn = By.xpath("//button[@class='error-button']");

	public void enterUsername(String user) {
		driver.findElement(username).sendKeys(user);
	}

	public void enterPassword(String pass) {
		driver.findElement(password).sendKeys(pass);
	}

	public void clickLogin() {
		driver.findElement(loginBtn).click();
	}

	public boolean isInvalidLoginButtonDisplayed() {
		return driver.findElement(InvalidLoginbtn).isDisplayed();
	}
}
