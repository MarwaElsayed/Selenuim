package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserSignInPage extends PageBase {

	public UserSignInPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id = "loginusername")
	WebElement LogInUsername ;
	
	@FindBy(id = "loginpassword")
	WebElement LogInPassword;
	
	@FindBy (css = "button[onclick*='logIn()']")
	WebElement SignInBtn;
	
	public void UserSignIn(String username, String password) {
		setTextElementText(LogInUsername, username);
		setTextElementText(LogInPassword, password);
		clickButton(SignInBtn);
	}

	

}
