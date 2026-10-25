package Com.WebShop_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddNewAddress_Page {
	public AddNewAddress_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "Address_FirstName")
	private WebElement firstNameTextField;

	@FindBy(id = "Address_LastName")
	private WebElement lastNameTextFiekd;

	@FindBy(id = "Address_Email")
	private WebElement emailTextfield;

	@FindBy(id ="Address_CountryId")
	private WebElement countryDropoDown;

	@FindBy(id = "Address_City")
	private WebElement cityTextFiled;

	@FindBy(id = "Address_Address1")
	private WebElement address1TextField;

	@FindBy(id = "Address_ZipPostalCode")
	private WebElement zipcodeTextField;

	@FindBy(id = "Address_PhoneNumber")
	private WebElement PhoneNoTextField;

	@FindBy(id = "Address_FaxNumber")
	private WebElement FaxNoTextField;

	public WebElement getFirstNameTextField() {
		return firstNameTextField;
	}

	public WebElement getLastNameTextFiekd() {
		return lastNameTextFiekd;
	}

	public WebElement getEmailTextfield() {
		return emailTextfield;
	}

	public WebElement getCountryDropoDown() {
		return countryDropoDown;
	}

	public WebElement getCityTextFiled() {
		return cityTextFiled;
	}

	public WebElement getAddress1TextField() {
		return address1TextField;
	}

	public WebElement getZipcodeTextField() {
		return zipcodeTextField;
	}

	public WebElement getPhoneNoTextField() {
		return PhoneNoTextField;
	}

	public WebElement getFaxNoTextField() {
		return FaxNoTextField;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}

	@FindBy(xpath = "//input[@value='Save']")
	private WebElement saveButton;

}
