package step.definition;

import core.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.HomePageObject;
import utilities.Utils;

public class HomePageStepDefinition extends Base{
	
	HomePageObject homePage = new HomePageObject();
	
	
	
	@When("User click on Currency")
	public void user_click_on_currency() {
	 homePage.ClickOnCurrencyButton();
	 logger.info("user clicked on the currency button successfully");
	 Utils.hardWait(4000);
	   
	}

	@When("User Chose Euro from dropdown")
	public void user_chose_euro_from_dropdown() {
		homePage.ChooseEuroCurrency();
		logger.info("user choosed euro currency successfully");
		Utils.hardWait(4000);
	   
	}

	//@Then("currency value should change to Euro")
	//public void currency_value_should_change_to_euro() {
	    
	//}

	@When("User click on shopping cart")
	public void user_click_on_shopping_cart() {
		homePage.ClickOnCartOption();
		logger.info("user clicked on cart Option");
		Utils.hardWait(4000);

	}

	//@Then("?Your shopping cart is empty!? message should display")
	//public void your_shopping_cart_is_empty_message_should_display() {
	  
	//}



}
