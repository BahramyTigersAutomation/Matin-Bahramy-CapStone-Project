package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class RetailPageObject extends Base {

	public RetailPageObject() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//span[text()='My Account']")
	private WebElement myAccountButton;
	@FindBy(xpath = "//ul//a[text()='Login']")
	private WebElement loginLink;
	@FindBy(id = "input-email")
	private WebElement emailAddressField;
	@FindBy(id = "input-password")
	private WebElement passwordField;
	@FindBy(xpath = "//input[@value='Login']")
	private WebElement loginButton;
	@FindBy(xpath = "//*[@id=\"content\"]/ul[3]/li/a")
	private WebElement RegisterForAffiliateLink;
	@FindBy(xpath = "//input[@id='input-company']")
	private WebElement CompanyName;
	@FindBy(xpath = "//input[@id='input-website']")
	private WebElement WebSiteField;
	@FindBy(xpath = "//input[@name='tax']")
	private WebElement TaxIDField;
	@FindBy(xpath = "//input[@id='input-cheque']")
	private WebElement PayeeName;
	@FindBy(xpath = "//input[@value='Continue']")
	private WebElement ContinueButton;
	@FindBy(xpath = "//a[text()='Edit your affiliate information']")
	private WebElement EditAffiliateAccount;
	@FindBy(xpath = "//*[@id=\"content\"]/form/fieldset[2]/div[2]/div/div[3]/label")
	private WebElement BankTransferButton;
	@FindBy(xpath = "//input[@id='input-bank-name']")
	private WebElement BankName;
	@FindBy(xpath = "//*[@id=\"input-bank-branch-number\"]")
	private WebElement AbaNumber;
	@FindBy(xpath = "//input[@id='input-bank-swift-code']")
	private WebElement SwiftCode;
	@FindBy(xpath = "//input[@id='input-bank-account-name']")
	private WebElement AccountName;
    @FindBy(xpath = "//input[@id='input-bank-account-number']")
    private WebElement AccountNumber;
    @FindBy(xpath = "//a[text()='Edit your account information']")
    private WebElement AccountEditLink;
    @FindBy(xpath = "//input[@id='input-firstname']")
    private WebElement FirstNameField;
	@FindBy(xpath = "//input[@id='input-lastname']")
	private WebElement LastNameField;
    @FindBy(xpath = "//input[@id='input-email']")
    private WebElement EditEmailField;   
    @FindBy(xpath = "//input[@id='input-telephone']")
    private WebElement EditTelephoneField;
  
    
    
    public void clickOnMyAccountButton() {
		myAccountButton.click();
	}

	public void clickOnLoginLink() {
		loginLink.click();
	}

	public void enterEmail(String email) {
		emailAddressField.sendKeys(email);
	}

	public void enterPassword(String password) {
		passwordField.sendKeys(password);
	}

	public void clickOnLoginButton() {
		loginButton.click();
	}

	public void ClickOnAffiliateAccountLink() {
		RegisterForAffiliateLink.click();
	}

	public void enterCompanyName(String company) {
		CompanyName.clear();
		CompanyName.sendKeys(company);
	}

	public void enterWebSiteField(String website) {
		WebSiteField.clear();
		WebSiteField.sendKeys(website);
	}

	public void enterTaxIDField(String taxID) {
		TaxIDField.clear();
		TaxIDField.sendKeys(taxID);
	}

	 public void ClickOnPayeeName(String payeeName) {
		 PayeeName.clear();
		 PayeeName.sendKeys(payeeName);
	 }

	
	public void ClickOnContinueButton() {
		ContinueButton.click();
	}
    
	public void ClickOnEditAffiliateAccount() {
		EditAffiliateAccount.click();
	}
    
	public void ClickOnBankTransferButton() {
		BankTransferButton.click();
	}
   public void EnterBankName(String bankName) {
	   BankName.sendKeys(bankName);
   }
  
   public void EnterAbaNumber(String abaNumber) {
	   AbaNumber.sendKeys(abaNumber);
   }

   public void EnterSwiftCode(String swiftCode) {
	   SwiftCode.sendKeys(swiftCode);
   }
   
   public void EnterAccountName(String accountName) {
	   AccountName.sendKeys(accountName);
   }

   public void EnterAccountNumber(String accountNumber) {
	   AccountNumber.sendKeys(accountNumber);
   }
   
   public void ClickOnAccountEditLink() {
	   AccountEditLink.click();
   }
   
   public void EditFirstNameField(String firstname) {
	   FirstNameField.clear();
	   FirstNameField.sendKeys(firstname);
   }
   
   public void EditLastNameField(String lastName) {
	   LastNameField.clear();
	   LastNameField.sendKeys(lastName);
   }
   
   public void EditEmailField(String email) {
	   EditEmailField.clear();
	   EditEmailField.sendKeys(email);
   }

   public void EditTelephoneField(String telephone) {
	   EditTelephoneField.clear();
	   EditTelephoneField.sendKeys(telephone);
   }
   
  

}
