package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class PageBase {

	protected WebDriver driver;

	public PageBase(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}
	
	protected static void clickButton(WebElement button) {
		button.click();
		try {
		    Thread.sleep(2500);
		} catch (InterruptedException e) {
		    e.printStackTrace();
		}
		
	}
	
	protected static void setTextElementText(WebElement textElement, String value) {
		textElement.sendKeys(value);
	}

}
