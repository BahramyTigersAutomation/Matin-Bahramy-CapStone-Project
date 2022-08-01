package page.objects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import core.Base;
import utilities.Utils;

public class DesktopPageObject extends Base {
	public DesktopPageObject() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='Desktops']")
	private WebElement desktops;

	@FindBy(xpath = "//a[text()='Show All Desktops']")
	private WebElement showalldesktops;

	@FindBy(tagName = "img")
	private List<WebElement> items;

	@FindBy(xpath = "//a[text()='HP LP3065']")
	private WebElement hpLp3065;
    
	@FindBy(id = "input-quantity")
	private WebElement quantityInput;
	
	@FindBy(id = "button-cart")
	private WebElement addToCartButton;
	
	@FindBy(xpath = "//a[text()='Canon EOS 5D Camera']")
	private WebElement CannonEos;
	
	@FindBy(xpath = "//select[@id='input-option226']")
	private WebElement DropDownMenue;
	
	@FindBy(xpath = "//a[text()='Canon EOS 5D Camera']")
	private WebElement CannonEosCamera;
	
	@FindBy(xpath = "//a[text()='Write a review']")
	private WebElement ReviewLink;
	
	@FindBy(xpath = "//input[@id='input-name']")
	private WebElement YourNameField;
	
	@FindBy(xpath = "//textarea[@id='input-review']")
	private WebElement YourReviewField;
	
	@FindBy(xpath = "//input[@type='radio']")
	private List <WebElement> rating;
	
	@FindBy(xpath = "//button[@id='button-review']")
	private WebElement clickOnContinue;
	 
	@FindBy(xpath = "//*[@id=\"form-review\"]/div[2]/text()")
	private String SubmittReview;
	
	public void clickondesktoptab() {
		Utils.hoveMouseOverElement(desktops);
	}

	public void clickShowAllDesktops() {
		showalldesktops.click();
	}

	public List<WebElement> desktopItems() {
		List<WebElement> itemsDesk = items;
		return itemsDesk;
	}

	public void ClickOnHPLP3065Item() {
		hpLp3065.click();

	}

	public void selectQuantity(String quantityValue) {
		quantityInput.clear();
		quantityInput.sendKeys(quantityValue);
		
	}
	
	public void clickOnAddToCartButton() {
		addToCartButton.click();
	}
	
	
	public void ClickOnCannonEos() {
		CannonEos.click();
	}
 
	
	public void SelectDropDownMenue() {
		Select select = new Select(DropDownMenue);
		select.selectByValue("15");
		
	}

   public void ClickOnCannonEosCameraLink() {
	   CannonEosCamera.click();
   }

   public void ClickOnReviewLink() {
	   ReviewLink.click();
   }

   public void SelectRating(String ratingValue) {
	   List <WebElement> ratingElements = rating;
	   for(WebElement element:ratingElements) {
		   if(element.getAttribute("value").equalsIgnoreCase(ratingValue.trim())) {
			   element.click();
			   break;
		   }
	   }
	  
  }
   

   public void ContinueButton() {
	   clickOnContinue.click();
   }

    public void enterYourName(String nameValue) {
    	YourNameField.sendKeys(nameValue);
    }
  
   
     public void WriteYourReviewOnProduct( String reviewValue) {
    	  YourReviewField.sendKeys(reviewValue);
      }
    
    public String TextReview() {
    	 return SubmittReview;
     }
}