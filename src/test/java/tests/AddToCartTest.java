package tests;

import pages.ProductsPage;
import pages.UserSignInPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.ProductDetailsPage;

public class AddToCartTest extends TestBase{
	
	ProductsPage product;
	ProductDetailsPage productDetails ;
	HomePage homeObject ;
	UserSignInPage signInObject ;
	
	@Test
	public void userAddToCartsuccessfully() {
		homeObject = new HomePage(driver);
		homeObject.openSignInForm();
		signInObject = new UserSignInPage(driver);
		signInObject.UserSignIn("ppp5", "111");
		product = new ProductsPage (driver);
		product.SelectProduct();
		productDetails = new ProductDetailsPage(driver);
		productDetails.ClickOnAddToCartBtn();
		String SuccessMessage= driver.switchTo().alert().getText();
		System.out.println(SuccessMessage);
		Assert.assertEquals(SuccessMessage, "Product added.");
		driver.switchTo().alert().accept();

	}


}
