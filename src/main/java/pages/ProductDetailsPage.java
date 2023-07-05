package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDetailsPage extends PageBase {

	public ProductDetailsPage(WebDriver driver) {
		super(driver);
	}

	@FindBy (css = "a[onclick*='addToCart(1)']")
	WebElement AddToCartBtn;

	public void ClickOnAddToCartBtn() {
		clickButton(AddToCartBtn);
	}
}
