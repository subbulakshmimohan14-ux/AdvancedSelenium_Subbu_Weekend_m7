package Com.DemoWebshop_TestScript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import Com.DemoWebShop_GenericUtility.BaseTest;
import Com.WebShop_POM.AddNewAddress_Page;
import Com.WebShop_POM.Addresses_Page_Add_Delete;

public class Tc_001_verify_user_is_able_to_add_address_or_not_Test extends BaseTest {

	@Test
	public void addAddress() throws EncryptedDocumentException, IOException {

		System.out.println("add address Test Script");
		webdriverutility.javaScriptScrollTillElement(driver, homepage.getAddressButton());
		homepage.getAddressButton().click();
		Addresses_Page_Add_Delete addressesPage = new Addresses_Page_Add_Delete(driver);
		addressesPage.getAddNewAddressesBtn().click();

		AddNewAddress_Page newaddressPage = new AddNewAddress_Page(driver);
		newaddressPage.getFirstNameTextField().sendKeys(fileutility.readDataFromExcelFile("Sheet1", 1, 0));
		newaddressPage.getLastNameTextFiekd().sendKeys(fileutility.readDataFromExcelFile("Sheet1", 1, 1));
		newaddressPage.getEmailTextfield().sendKeys(fileutility.readDataFromExcelFile("Sheet1", 1, 2));

		webdriverutility.selectByVisibleText(newaddressPage.getCountryDropoDown(),
				fileutility.readDataFromExcelFile("Sheet1", 1, 3));

		newaddressPage.getCityTextFiled().sendKeys(fileutility.readDataFromExcelFile("Sheet1", 1, 4));
		newaddressPage.getAddress1TextField().sendKeys(fileutility.readDataFromExcelFile("Sheet1", 1, 5));
		newaddressPage.getZipcodeTextField().sendKeys(fileutility.readDataFromExcelFile("Sheet1", 1, 6));
		newaddressPage.getPhoneNoTextField().sendKeys(fileutility.readDataFromExcelFile("Sheet1", 1, 7));
		newaddressPage.getSaveButton().click();

	}

}
