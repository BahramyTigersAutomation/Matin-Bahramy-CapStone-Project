package step.definition;

import java.util.List;
import java.util.Map;

import core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import page.objects.RetailPageObject;
import utilities.Utils;

public class RetailStepDefinition extends Base {
	RetailPageObject RetailPage = new RetailPageObject();
	
	
	@Given("User click on MyAccount")
	public void user_click_on_my_account() {
	  RetailPage.clickOnMyAccountButton();
	  logger.info(" user clicked on my account button");
	  Utils.hardWait(4000);
	}
	@When("User click on Login")
	public void user_click_on_login() {
	 RetailPage.clickOnLoginLink();
	 logger.info("user clicked on the loggin Button");
	 Utils.hardWait(4000);
	}
	@When("User enter username and password")
	public void user_enter_username_and_password() {
	   RetailPage.enterEmail("matin123@gmail.com"); 
	   RetailPage.enterPassword("mahyad123");
	   logger.info(" user entered email and password successfully");
	   Utils.hardWait(4000);
	}
	@When("User click on Login button")
	public void user_click_on_login_button() {
		RetailPage.clickOnLoginButton();
		logger.info(" user clicked on the login button");
		Utils.hardWait(4000);
	    
	}
	
	@When("User click on Register for an Affiliate Account link")
	public void user_click_on_register_for_an_affiliate_account_link() {
		RetailPage.ClickOnAffiliateAccountLink();
		logger.info("user clicked on the affiliate account link");
		Utils.hardWait(4000);
	   
	}
	@When("User fill affiliate form with below information")
	public void user_fill_affiliate_form_with_below_information(DataTable dataTable) {
		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		RetailPage.enterCompanyName(data.get(0).get("company"));
	    RetailPage.enterWebSiteField(data.get(0).get("website"));
	    RetailPage.enterTaxIDField(data.get(0).get("taxID"));
	    logger.info("User clicked on Entering data Successfully ");
	    Utils.hardWait(4000);
	    }
	
	@When("User click on Payeename")
	public void user_click_on_payeename() {
	   RetailPage.ClickOnPayeeName("Matin Bahramy");
	   logger.info("user clicked on the payeeName successfully");
	   Utils.hardWait(4000);
	}

	@When("User click on Continue button")
	public void user_click_on_continue_button() {
	    RetailPage.ClickOnContinueButton();
	    logger.info("User Clicked on the Continue Button Successfully");
	   Utils.hardWait(4000);
	}

	@When("User click on Edit your affiliate information link")
	public void user_click_on_edit_your_affiliate_information_link() {
		RetailPage.ClickOnEditAffiliateAccount();
		logger.info("User Clicked On Edit Affiliate Account Successfully");
		Utils.hardWait(4000);
	    
	}
	
	@When("user click on Bank Transfer radio button")
	public void user_click_on_bank_transfer_radio_button() {
	    RetailPage.ClickOnBankTransferButton();
	    logger.info("User clicked on bank transfer button successfullly");
	    Utils.hardWait(4000);
	}
	
	@When("User fill Bank information with below information")
	public void user_fill_bank_information_with_below_information(DataTable dataTable) {
		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		RetailPage.EnterBankName(data.get(0).get("bankName"));
	    RetailPage.EnterAbaNumber(data.get(0).get("abaNumber"));
	    RetailPage.EnterSwiftCode(data.get(0).get("swiftCode")); 
	    RetailPage.EnterAccountName(data.get(0).get("accountName"));
	    RetailPage.EnterAccountNumber(data.get(0).get("accountNumber"));
	    logger.info("User enterd bank data inforamtion successfully");
	    Utils.hardWait(4000);
	}
	
	@When("User click on Edit your account information link")
	public void user_click_on_edit_your_account_information_link() {
	    RetailPage.ClickOnAccountEditLink();
	    logger.info("User Clicked on account edit link succsessfully");
	    Utils.hardWait(4000);
	}
	
	@When("User modify below information")
	public void user_modify_below_information(DataTable dataTable) {
		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		RetailPage.EditFirstNameField(data.get(0).get("firstname"));
	    RetailPage.EditLastNameField(data.get(0).get("lastName"));
	    RetailPage.EditEmailField(data.get(0).get("email")); 
	    RetailPage.EditTelephoneField(data.get(0).get("telephone"));
	    logger.info("User edited the account information successfully");
	    Utils.hardWait(4000);
	}
	
   






}
