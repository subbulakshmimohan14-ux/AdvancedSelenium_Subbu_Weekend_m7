package Com.WebShop_POM;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addresses_Page_Add_Delete {
	public Addresses_Page_Add_Delete(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@value='Add new']")
	private WebElement addNewAddressesBtn;

	@FindBy(xpath = "//input[@value='Delete']")
	private List<WebElement> deleteAddressesbtn;

	public WebElement getAddNewAddressesBtn() {
		return addNewAddressesBtn;
	}

	public List<WebElement> getDeleteAddressesbtn() {
		return deleteAddressesbtn;
	}

}
