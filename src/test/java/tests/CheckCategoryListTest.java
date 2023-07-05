package tests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

public class CheckCategoryListTest extends TestBase{
	
	HomePage homeObject;
	
	@Test	
	public void checkItemsOfEachCategory() {
		
		homeObject= new HomePage(driver);
		homeObject.openPhonesCategory();
		Boolean isPresent =homeObject.ProductCard.isDisplayed();
		Assert.assertTrue(isPresent);
		homeObject.openLaptopsCategory();
		Boolean isPresent2 =homeObject.ProductCard.isDisplayed();
		Assert.assertTrue(isPresent2);
		homeObject.OpenMonitorsCategory();
		Boolean isPresent3 =homeObject.ProductCard.isDisplayed();
		Assert.assertTrue(isPresent3);
		
	}

}
