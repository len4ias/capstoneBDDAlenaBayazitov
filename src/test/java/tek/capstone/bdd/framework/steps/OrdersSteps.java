package tek.capstone.bdd.framework.steps;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import tek.capstone.bdd.framework.pages.POMFactory;
import tek.capstone.bdd.framework.utilities.CommonUtility;

public class OrdersSteps extends CommonUtility {

	private POMFactory factory = new POMFactory();
	
	@And("User click on first order in list")
	public void userClickOnFirstOrderInList() {
		for(WebElement order: factory.ordersPage().orders) {
		if(factory.ordersPage().showHideOrderDetails.getText().equals("Show Details")) {
			click(factory.ordersPage().showHideOrderDetails);
		}
		if (isElementDisplayed(factory.ordersPage().arriving)) {
			break;
		}
		}
		logger.info("first order in list is been chosen");
	}
	
	@And("User click on Cancel The Order button")
	public void userClickOnCancelTheOrderButton() {
		click(factory.ordersPage().cancelOrderBtn);
		logger.info("user clicked on cancel the oreder button");
	}
	
	@And("User select the cancelation Reason {string}")
	public void userSelectTheCacelationReason(String reason) {
		selectByVisibleText(factory.ordersPage().cancelReasonChoice, reason);
	}
	
	@And("User click on Cancel Order button")
	public void userClickOnCancelOrderButton() {
		click(factory.ordersPage().cancelOrderButton);
		logger.info("user clicked on cancel order button");
	}
	
	@Then("A cancelation message should be displayed {string}")
	public void ACancelationMessageShouldBeDisplayed(String message) {
		Assert.assertEquals(getElementText(factory.ordersPage().cancelationMessage), message);
		logger.info("A cancelation message is displayed" + message);
	}
	
	@And("User click on Return Items button")
	public void userClickOnReturnItemsButton() {
		click(factory.ordersPage().returnBtn);
		logger.info("user clicked on return items button");
	}
	
	@And("User select the Return Reason {string}")
	public void userSelectTheeturnReason(String reason) {
		selectByVisibleText(factory.ordersPage().cancelReasonChoice, reason);
		logger.info("user selected the return reason" + reason);
	}
	
	@And("User select the drop off service {string}")
	public void userSelectTheDropOffService(String dropOffService) {
		selectByVisibleText(factory.ordersPage().dropOffInput, dropOffService);
		logger.info("user selected the drop off service" + dropOffService);
	}
	
	@And("User click on Return Order button")
	public void userClickOnReturnOrderButton() {
		click(factory.ordersPage().cancelOrderButton);
		logger.info("user clicked on return order button");
	}
	
	@Then("A return message should be displayed {string}")
	public void returnMessageShouldBeDisplayed(String returnMessage) {
		Assert.assertEquals(getElementText(factory.ordersPage().returnConfirm), returnMessage);
		logger.info("A return message " + returnMessage + " is displayed");
	}
	
	@And("User click on Review button")
	public void userClickOnReviewButton() {
		click(factory.ordersPage().reviewBtn);
		logger.info("user clicked on review button");
	}
	
	@And("User write Review headline {string} and {string}")
	public void userWriteReviewHeadlineAndText(String headline, String reviewText) {
		sendText(factory.ordersPage().headlineInput, headline);
		sendText(factory.ordersPage().descriptionInput, reviewText);
		logger.info("user wrote review headline" + headline + " and review text " + reviewText);
	}
	
	@And("User click Add your Review button")
	public void userClickAddYourReviewButton() {
		click(factory.ordersPage().reviewSubmitBtn);
		logger.info("user clicked add your review button");
	}
	
	@Then("A review message should be displayed {string}")
	public void reviewMessageShouldBeDisplayed(String reviewMessage) {
		Assert.assertTrue(waitTillPresence(factory.accountPage().popUpmessage).getText().equals(reviewMessage));
		logger.info(reviewMessage + "is displayed");
	}
}
