package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserRegisterationPage extends PageBase {



	public UserRegisterationPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id = "sign-username")
	WebElement SignUpUsername ;
	
	@FindBy(id = "sign-password")
	WebElement SignUpPassword;
	
	@FindBy (css = "button[onclick*='register()']")
	WebElement SignUpBtn;

	public void UserSignUp(String username, String password) {
		setTextElementText(SignUpUsername, username);
		setTextElementText(SignUpPassword, password);
		clickButton(SignUpBtn);
	}



}
