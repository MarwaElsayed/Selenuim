package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.PlaceOrderPage;
import pages.CartPage;

public class PlaceOrderTest extends TestBase{
	
	AddToCartTest addCartObject;
	HomePage homeObject ;
	PlaceOrderPage placeOrderObject;
	CartPage cartPageObject;
	
	@Test
	public void userPlaceOrderSuccessfully() {
		addCartObject = new AddToCartTest();
		addCartObject.userAddToCartsuccessfully();
		homeObject = new HomePage(driver);
		homeObject.openCart();
		cartPageObject = new CartPage(driver);
		cartPageObject.ClickOnPlaceOrderBtn();
		placeOrderObject = new PlaceOrderPage(driver);
		placeOrderObject.UserPlaceOrder("Marwa","Egypt", "Alexandria", "1111", "July", "5");
		String SuccessMessage= placeOrderObject.SuccessMessageContainer.getText();
		Assert.assertEquals(SuccessMessage, "Thank you for your purchase!");	
	}
	

}
