package step.definition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.DesktopPageObject;
import utilities.Utils;

public class DesktopPageStepDefinition extends Base {
	DesktopPageObject desktopPage = new DesktopPageObject();

	// I dont need to get the Retail Method, We already Specify the Retail Url in
	// the Config.Properties.

	// @Given("User is on Retail website")
	// public void User_is_on_Retail_Website() {
	// String expectedText = "Retail Website";
	// String actualText = desktopPage.getRetailWebsiteText();
	// Assert.assertEquals(expectedText, actualText);
	// logger.info("user is on Retail Website");
	// Utils.takeScreenshotForStep();
	// }

	@When("User click on Desktops tab")
	public void user_click_on_Desktops_tab() {
		desktopPage.clickondesktoptab();
		logger.info("user clicked on desktop tab");
		Utils.hardWait(2000);
		

	}

	@And("User click on Show all desktops")
	public void user_Click_on_ShowAllDesktops() {
		desktopPage.clickShowAllDesktops();
		logger.info("user clicked on show all desktops");
		Utils.hardWait(2000);
	}

	@Then("User should see all items are present in Desktop page")
	public void user_should_see_all_items_are_present_in_Desktop_page() {
		List<WebElement> desktopsElements = desktopPage.desktopItems();
		for (WebElement element : desktopsElements) {
			Assert.assertTrue(element.isDisplayed());
			logger.info(element.getAttribute("title") + " is present");
			Utils.hardWait(2000);
		}

	}

	@When("User click ADD TO CART option on HP LP3065 item")
	public void user_click_add_to_cart_option_on_hp_lp3065_item() {
		desktopPage.ClickOnHPLP3065Item();
		logger.info("user clicked on hpLp3065 item");
		Utils.hardWait(2000);

	}

	@When("User select quantity {string}")
	public void user_select_quantity(String string) {
		desktopPage.selectQuantity(string);
		logger.info("user selected quantity" + string);
		Utils.hardWait(2000);
	}

	@When("User click add to Cart button")
	public void user_click_add_to_cart_button() {
		desktopPage.clickOnAddToCartButton();
		logger.info("user clicked on cart button");
		Utils.hardWait(2000);

	}

	//@Then("User should see a message {string}")
	//public void user_should_see_a_message(String string) {
		//String expectedText = "ReviewMassage";
		//String actualText = desktopPage.getReviewMassageTextFromUI();
		//Assert.assertEquals(expectedText, actualText);
		//logger.info(" Review message verified");
		
	//}

	@When("User click ADD TO CART option on Canon EOS 5D item")
	public void user_click_add_to_cart_option_on_canon_eos_5d_item() {
	    desktopPage.ClickOnCannonEos();
	    logger.info("user clicked on the cannon camera");
	    Utils.hardWait(2000);
	}
	
	@When("User select color from dropdown Red")
	public void user_select_color_from_dropdown_red() {
	  desktopPage.SelectDropDownMenue();
	  logger.info(" user choosed red color");
	Utils.hardWait(2000);
	
	}

	
	@When("User click on Canon EOS 5D item")
	public void user_click_on_canon_eos_5d_item() {
	    desktopPage.ClickOnCannonEosCameraLink();
	    logger.info("user clicked on the Cannon successfully for the second time!");
	    Utils.hardWait(2000);
	}
	
	@When("User click on write a review link")
	public void user_click_on_write_a_review_link() {
		desktopPage.ClickOnReviewLink();
		logger.info("user clicked on the Review Link");
		Utils.hardWait(1000);
	   
	}
	
	@When("user fill the review information with below information")
	public void user_fill_the_review_information_with_below_information(DataTable dataTable) {
	   List<Map<String,String>> dataReview = dataTable.asMaps(String.class,String.class);
		desktopPage.enterYourName(dataReview.get(0).get("yourname"));
		desktopPage.WriteYourReviewOnProduct(dataReview.get(0).get("yourReview"));
		desktopPage.SelectRating(dataReview.get(0).get("Rating"));
		logger.info("user clicked on the reviewinformation table successfully");
		Utils.hardWait(2000);
	    }
	
	@When("User click on Continue Button")
	public void user_click_on_continue_button() {
		desktopPage.ContinueButton();
		logger.info("user clicked on the continue button successfully");
	    Utils.hardWait(2000);
	}
	
	@Then("User should see a message with {string};")
	public void user_should_see_a_message_with(String string) {
		desktopPage.TextReview();
	 // System.out.println(desktopPage.TextReview() + "print name");
	  Utils.hardWait(2000);
	
	}




}
