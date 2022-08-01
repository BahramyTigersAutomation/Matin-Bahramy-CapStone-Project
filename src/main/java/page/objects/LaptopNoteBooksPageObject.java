package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class LaptopNoteBooksPageObject extends Base {
	 
	public LaptopNoteBooksPageObject() {
		 PageFactory.initElements(driver, this);
	 }
	
	@FindBy(xpath = "//a[text()='Laptops & Notebooks']" )
	private WebElement LapTopNoteBooksLink;
	@FindBy(xpath = "//a[text()='Show All Laptops & Notebooks']")
	private WebElement ShowAllLapTopsNoteBooksLink;
	@FindBy(xpath = "//a[text()='MacBook']")
	private WebElement MacBookLapTop;
	@FindBy(xpath = "//button[@id='button-cart']")
	private WebElement AddToCartButton;
	@FindBy(xpath = "//*[@id=\"cart\"]/button")
	private WebElement ClickOnCartItems;
	@FindBy(xpath = "//button[@title='Remove']")
	private WebElement RemoveItem;
	@FindBy(xpath = "//*[@id=\"content\"]/div[4]/div[2]/div/div[2]/div[2]/button[3]")
	private WebElement AddMacBookTocompareList;
	@FindBy(xpath = "//*[@id=\"content\"]/div[4]/div[3]/div/div[2]/div[2]/button[3]")
	private WebElement AddMacBookAirToCompareList;
	@FindBy(xpath = "//a[@id='compare-total'] ")
	private WebElement ProductCompareLink;
	@FindBy(xpath = "//*[@id=\"content\"]/div[4]/div[5]/div/div[2]/div[2]/button[2]")
	private WebElement AddSonyVAIOToWishList;
	@FindBy(xpath = "//a[text()='MacBook Air']")
	private WebElement ShowMacPrice;
	
	
	public void ClickOnLapTopNoteBookLink() {
		LapTopNoteBooksLink.click();
	}
	
	public void ClickOnShowAllLapTopsNoteBooksLink() {
		ShowAllLapTopsNoteBooksLink.click();
	}

    public void ClickOnMacBookLapTop() {
    	MacBookLapTop.click();
    	
    }
    
    public void ClickOnAddMacBookToCartButton() {
    	AddToCartButton.click();
    }

   public void ClickOnCartOption() {
	   ClickOnCartItems.click();
   }

   public void ClickOnRemoveItem() {
	   RemoveItem.click();
   }
  
   public void AddMacBookToProductCompareList() {
	   AddMacBookTocompareList.click();
   }
    
   public void ClickOnMacBookAirToAddToCompareList() {
	   AddMacBookAirToCompareList.click();
   }
   
   public void ClickOnProductCompareLink() {
	   ProductCompareLink.click();
	   
   }
   
   public void ClickAddSonyToWishList() {
	   AddSonyVAIOToWishList.click();
   }
   
   public void ClickOnMacProLapTop() {
	   ShowMacPrice.click();
   }

}
