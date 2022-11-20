package tek.capstone.bdd.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.capstone.bdd.framework.base.BaseSetup;

public class RetailSignUpPage extends BaseSetup {

	public RetailSignUpPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	@FindBy(id = "nameInput") public WebElement nameInput;
	
	@FindBy(id = "emailInput") public WebElement emailInput;
	
	@FindBy(id = "passwordInput") public WebElement passwordInput;
	
	@FindBy(id = "confirmPasswordInput") public WebElement confirmPasswordInput;
	
	@FindBy(id = "signupBtn") public WebElement signupBtn;
}
