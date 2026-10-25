package Com.DemoWebshop_TestScript;

import java.io.IOException;

import org.testng.annotations.Test;

import Com.DemoWebShop_GenericUtility.BaseTest;
import Com.WebShop_POM.Books_Page;
import Com.WebShop_POM.CheckOut_Page;
import Com.WebShop_POM.ShoppingCart_Page;


public class Tc_003_verify_user_Able_To_Place_Order_or_not_Test extends BaseTest
{
@Test
public void placeOrder() throws IOException, InterruptedException 
{
	System.out.println("Place Order");
	
	homepage.getSearchTextField().sendKeys(fileutility.readDataFromPropertyFile("productname"));
	homepage.getSeachbutton().click();
	
	Books_Page bookpage =new Books_Page(driver);
	webdriverutility.javaScriptClickElement(driver,bookpage.getAddTocart());
	
	Thread.sleep(3000);
	homepage.getShopingCartlink().click();
	
	ShoppingCart_Page cartPage = new ShoppingCart_Page(driver);
	cartPage.getTermsOfServiceBtn().click();
	cartPage.getCheckoutBtn().click();
	
	CheckOut_Page checkOutPage = new CheckOut_Page(driver);
	checkOutPage.getContinueBtn().get(0).click();
	checkOutPage.getContinueBtn().get(1).click();
	checkOutPage.getContinueBtn().get(2).click();
	checkOutPage.getContinueBtn().get(3).click();
	checkOutPage.getContinueBtn().get(4).click();
	
	checkOutPage.getConfirmBtn().click();
	Thread.sleep(3000);
	
	webdriverutility.webpageScreenshot(driver);
	
	

	
	
}
}
