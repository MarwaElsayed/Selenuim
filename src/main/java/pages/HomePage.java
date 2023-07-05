package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase {

	public HomePage(WebDriver driver) {
		super(driver);
	}

	@FindBy (id = "signin2")
	WebElement signUp ;
	
	@FindBy (id = "login2")
	WebElement login ;
	
	@FindBy (linkText = "Phones")
	public WebElement PhonesCategory;
	
	@FindBy (linkText = "Laptops")
	public WebElement LaptopsCategory;
	
	@FindBy (linkText = "Monitors")
	public WebElement MonitorsCategory;
	
	@FindBy (id = "nameofuser")
	public WebElement UserSignName;
	
	@FindBy (id = "cartur")
	public WebElement Cart;
	
	@FindBy (xpath= "//body/div[@id='contcont']/div[1]/div[2]/div[1]/div[1]/div[1]")
	public WebElement ProductCard;

	public void openSignUpForm() {
		clickButton(signUp);
	}
	
	public void openSignInForm() {
		clickButton(login);
	}
	
	public void openPhonesCategory() {
		clickButton(PhonesCategory);
	}
	
	public void openLaptopsCategory() {
		clickButton(LaptopsCategory);
	}
	
	public void OpenMonitorsCategory() {
		clickButton(MonitorsCategory);
	}
	
	public void openCart() {
		clickButton(Cart);
	}

}
