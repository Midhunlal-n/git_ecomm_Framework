package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class inventory_and_CartPage {

	public WebDriver driver;

	public inventory_and_CartPage(WebDriver driver) {
		this.driver = driver;

	}

	public String inventorypageurl = "inventory.html";
	private String productname = "//a /div[contains(text(),'%s')]";
	private String cartitem = "//*[@class='inventory_item_name' and contains(text(),'%s')]";
	By addtoCartBtn = By.xpath("//button[contains(text(),'ADD TO CART')]");
	By cartIcon = By.xpath("//div[@id='shopping_cart_container']/a/*[@data-icon='shopping-cart']");
	By CheckoutBtn = By.linkText("CHECKOUT");

	public void selectProduct(String productName) {
		By product = By.xpath(String.format(productname, productName));
		driver.findElement(product).click();
	}

	public void clickAddToCart() {
		driver.findElement(addtoCartBtn).click();
	}

	public void clickCartIcon() {
		driver.findElement(cartIcon).click();
	}

	public boolean isCartItemDisplayed(String itemName) {
		By cartItem = By.xpath(String.format(cartitem, itemName));
		return driver.findElement(cartItem).isDisplayed();
	}

	public void clickCheckout() {
		driver.findElement(CheckoutBtn).click();
	}

}
