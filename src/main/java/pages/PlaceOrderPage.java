package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PlaceOrderPage extends PageBase {

	public PlaceOrderPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id = "name")
	WebElement Name ;
	
	@FindBy(id = "country")
	WebElement Country ;
	
	@FindBy(id = "city")
	WebElement City ;
	
	@FindBy(id = "card")
	WebElement Card ;
	
	@FindBy(id = "month")
	WebElement Month ;
	
	@FindBy(id = "year")
	WebElement Year ;
	
	@FindBy (css = "button[onclick*='purchaseOrder()']")
	WebElement PurchaseOrderBtn;
	
	@FindBy (xpath = "//h2[contains(text(),'Thank you for your purchase!')]")
	public WebElement SuccessMessageContainer;
	
	public void UserPlaceOrder(String name, String country , String city, String card , String month, String year) {
		setTextElementText(Name, name );
		setTextElementText(Country, country);
		setTextElementText(City, city);
		setTextElementText(Card, card);
		setTextElementText(Month, month);
		setTextElementText(Year, year);
		clickButton(PurchaseOrderBtn);
	}


}
