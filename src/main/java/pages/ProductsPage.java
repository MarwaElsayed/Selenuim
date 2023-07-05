package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsPage extends PageBase {

	public ProductsPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(css ="div.container:nth-child(6) div.row div.col-lg-9 div.row:nth-child(1) > div.col-lg-4.col-md-6.mb-4:nth-child(1)")
	WebElement FirstProduct ;
	
	public void SelectProduct() {
		clickButton(FirstProduct);
	}

}
