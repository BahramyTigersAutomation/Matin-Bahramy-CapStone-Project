package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class HomePageObject extends Base{
	public HomePageObject() {
		PageFactory.initElements(driver, this);
	}
    
	@FindBy(xpath = "//*[@id=\"form-currency\"]/div/button/span")
	private WebElement CurrencyButton;
	@FindBy(xpath  = "//*[@id=\"form-currency\"]/div/ul/li[1]/button")
	private WebElement EuroCurrency;
	@FindBy(xpath = "//span[@id='cart-total']")
	private WebElement ClickOnCart;


   public void ClickOnCurrencyButton() {
	 CurrencyButton.click();
 }
   public void ChooseEuroCurrency() {
	   EuroCurrency.click();
   }
   
   public void ClickOnCartOption() {
	   ClickOnCart.click();
   }

}
