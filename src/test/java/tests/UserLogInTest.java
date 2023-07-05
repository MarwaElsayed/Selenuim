package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.UserSignInPage;

public class UserLogInTest extends TestBase {
	
	HomePage homeObject ;
	UserSignInPage signInObject ;


	@Test
	public void userSignUpsuccessfully() {

		homeObject = new HomePage(driver);
		homeObject.openSignInForm();
		signInObject = new UserSignInPage(driver);
		signInObject.UserSignIn("ppp5", "111");
		String userName=homeObject.UserSignName.getText();
		System.out.println(userName);
		Assert.assertEquals(userName, "Welcome ppp5");

	}

}
