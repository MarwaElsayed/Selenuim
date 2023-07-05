package tests;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.UserRegisterationPage;

public class UserRegisterationTest extends TestBase{

	HomePage homeObject ;
	UserRegisterationPage registerObject ;


	@Test
	public void userSignUpsuccessfully() {

		homeObject = new HomePage(driver);
		homeObject.openSignUpForm();
		registerObject = new UserRegisterationPage(driver);
		registerObject.UserSignUp("Marw939", "12345");
		String SuccessMessage= driver.switchTo().alert().getText();
		System.out.println(SuccessMessage);
		Assert.assertEquals(SuccessMessage, "Sign up successful.");

	}

}
