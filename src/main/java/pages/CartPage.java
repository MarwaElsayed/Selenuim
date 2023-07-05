package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends PageBase {

	public CartPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy (linkText = "Delete")
	public WebElement DeleteFromCartBtn;
	
	@FindBy (xpath= "//button[contains(text(),'Place Order')]")
	public WebElement PlaceOrderBtn;
	
	public void ClickOnDeleteFromCartBtn() {
		clickButton(DeleteFromCartBtn);
	}
   
	public void ClickOnPlaceOrderBtn() {
		clickButton(PlaceOrderBtn);
	}
}
