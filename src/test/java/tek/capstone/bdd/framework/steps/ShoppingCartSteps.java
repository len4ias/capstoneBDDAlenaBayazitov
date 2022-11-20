package tek.capstone.bdd.framework.steps;

import io.cucumber.java.en.And;
import tek.capstone.bdd.framework.pages.POMFactory;
import tek.capstone.bdd.framework.utilities.CommonUtility;

public class ShoppingCartSteps extends CommonUtility {

	private POMFactory factory = new POMFactory();
	
	@And("User click on Proceed to Checkout button")
	public void userClickOnProceedToCheckoutButton() {
		click(factory.cartPage().proceedToCheckoutButton);
		logger.info("user clicked on proceed to checkout button");
	}
	
	
	
	
	
}
