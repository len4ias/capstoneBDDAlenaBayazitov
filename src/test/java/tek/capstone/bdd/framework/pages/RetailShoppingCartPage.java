package tek.capstone.bdd.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.capstone.bdd.framework.base.BaseSetup;

public class RetailShoppingCartPage extends BaseSetup {

	public RetailShoppingCartPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	@FindBy(id = "proceedBtn") public WebElement proceedToCheckoutButton;
	
	@FindBy(xpath = "//span[@class = 'cart__item-delete']") public WebElement deleteItemFromCart;
	
	
	
}
