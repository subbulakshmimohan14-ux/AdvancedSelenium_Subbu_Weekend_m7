package Com.WebShop_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {
	public Home_Page(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	@FindBy(partialLinkText = "Log out")
	private WebElement logoutButton;

	@FindBy(id = "small-searchterms")
	private WebElement searchTextField;

	@FindBy(xpath = "//input[@value='Search']")
	private WebElement Seachbutton;

	@FindBy(partialLinkText = "Addresses")
	private WebElement addressButton;

	@FindBy(xpath = "//span[text()='Shopping cart']")
	private WebElement shopingCartlink;

	public WebElement getLogoutButton() {
		return logoutButton;
	}

	public WebElement getSearchTextField() {
		return searchTextField;
	}

	public WebElement getShopingCartlink() {
		return shopingCartlink;
	}

	public void setSearchTextField(WebElement searchTextField) {
		this.searchTextField = searchTextField;
	}

	public WebElement getSeachbutton() {
		return Seachbutton;
	}

	public WebElement getAddressButton() {
		return addressButton;
	}

}
