package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.CartPage;

public class DeleteFromCartTest extends TestBase{
    HomePage homeObject ;
	AddToCartTest addToCart;
	CartPage cartobject;
	@Test
	public void userDeleteFromCartsuccessfully() {
        addToCart= new AddToCartTest();
		addToCart.userAddToCartsuccessfully();
		cartobject = new CartPage(driver);
		homeObject = new HomePage(driver);
		homeObject.openCart();
		String Delete= cartobject.DeleteFromCartBtn.getText();
		cartobject.ClickOnDeleteFromCartBtn();
		Assert.assertFalse(false,Delete );
	}

}
