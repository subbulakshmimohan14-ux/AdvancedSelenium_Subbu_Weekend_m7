package Com.DemoWebshop_TestScript;

import java.io.IOException;

import org.testng.annotations.Test;

import Com.DemoWebShop_GenericUtility.BaseTest;
import Com.WebShop_POM.Addresses_Page_Add_Delete;

public class Tc_002_Verify_User_Is_Able_to_Delete_address_or_not_Test extends BaseTest
{
@Test
public void deleteAddress() throws InterruptedException, IOException
{
	System.out.println("Delete Address Test Script");
	webdriverutility.javaScriptScrollTillElement(driver, homepage.getAddressButton());
	homepage.getAddressButton().click();
	
	Addresses_Page_Add_Delete addressAddDeletePage = new Addresses_Page_Add_Delete(driver);
	addressAddDeletePage.getDeleteAddressesbtn().get(0).click();
	
	webdriverutility.javaScriptPopupAccept(driver);
	Thread.sleep(2000);
	driver.navigate().refresh();
	
	Thread.sleep(2000);
	webdriverutility.webpageScreenshot(driver);
}
}
