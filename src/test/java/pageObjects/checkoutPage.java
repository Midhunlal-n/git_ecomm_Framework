package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class checkoutPage {

	public WebDriver driver;

	public checkoutPage(WebDriver driver) {
		this.driver = driver;

	}

	By firstname = By.xpath("//input[@id='first-name']");
	By lastname = By.xpath("//input[@id='last-name']");
	By postalcode = By.xpath("//input[@id='postal-code']");
	By submitBtn = By.xpath("//input[@type='submit']");
	By finishBtn = By.linkText("FINISH");
	By orderConfirmationMsg = By
			.xpath("//div[@id='checkout_complete_container']/h2[contains(text(),'THANK YOU FOR YOUR ORDER')]");

	public void enterFirstName(List<String> dataTable) {
		driver.findElement(firstname).sendKeys(dataTable.get(0));
	}

	public void enterLastName(List<String> dataTable) {
		driver.findElement(lastname).sendKeys(dataTable.get(1));
	}

	public void enterPostalCode(List<String> dataTable) {
		driver.findElement(postalcode).sendKeys(dataTable.get(2));
	}

	public void clickSubmit() {
		driver.findElement(submitBtn).click();
	}

	public void clickFinish() {
		driver.findElement(finishBtn).click();
	}

	public boolean isOrderConfirmationMessageDisplayed() {
		return driver.findElement(orderConfirmationMsg).isDisplayed();
	}

}
