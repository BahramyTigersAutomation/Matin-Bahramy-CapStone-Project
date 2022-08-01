package step.definition;

import core.Base;
import io.cucumber.java.en.When;
import page.objects.LaptopNoteBooksPageObject;
import utilities.Utils;

public class LaptopNoteBooksStepDefinition extends Base {
	
	LaptopNoteBooksPageObject LapTopNoteBooks = new LaptopNoteBooksPageObject();
	
	
	@When("User click on Laptop NoteBook tab")
	public void user_click_on_laptop_note_book_tab() {
		LapTopNoteBooks.ClickOnLapTopNoteBookLink();
		logger.info("user clicked on the notebook tab sucessfully");
	   Utils.hardWait(4000);
	}

	@When("User click on Show all Laptop NoteBook option")
	public void user_click_on_show_all_laptop_note_book_option() {
		LapTopNoteBooks.ClickOnShowAllLapTopsNoteBooksLink();
		logger.info("user clicked on the show all laptop notebooks link");
		Utils.hardWait(4000);
	}

	@When("User click on MacBook item")
	public void user_click_on_mac_book_item() {
		LapTopNoteBooks.ClickOnMacBookLapTop();
		logger.info("User clicked on macbook item sucessfully");
		Utils.hardWait(4000);
	}

	@When("User click on cart option")
	public void user_click_on_cart_option() {
		LapTopNoteBooks.ClickOnAddMacBookToCartButton();
		logger.info("user clicked on the cart option sucessfully");
		Utils.hardWait(4000);
	}
    
	@When("User click on cart option items")
	public void user_click_on_cart_option_itmes() {
		LapTopNoteBooks.ClickOnCartOption();
		logger.info(" user clicked on the cart option items sucessfully");
		Utils.hardWait(4000);
	}
	
	
	@When("user click on red X button to remove the item from cart")
	public void user_click_on_red_x_button_to_remove_the_item_from_cart() {
		LapTopNoteBooks.ClickOnRemoveItem();
		logger.info("user clicked on remove button sucessfully");
		Utils.hardWait(4000);
	}

	@When("User click on product comparison icon on MacBook")
	public void user_click_on_product_comparison_icon_on_mac_book() {
		LapTopNoteBooks.AddMacBookToProductCompareList();
		logger.info("user clicked on the comparison icon sucsessfully");
		Utils.hardWait(4000);
	}

	@When("User click on product comparison icon on MacBook Air")
	public void user_click_on_product_comparison_icon_on_mac_book_air() {
		LapTopNoteBooks.ClickOnMacBookAirToAddToCompareList();
		logger.info("user clicked on macbook air compariosn icon sucsessfully");
		Utils.hardWait(4000);
	}

	@When("User click on Product comparison link")
	public void user_click_on_product_comparison_link() {
		LapTopNoteBooks.ClickOnProductCompareLink();
		logger.info("user clicked on product comparison link sucsessfully");
		Utils.hardWait(4000);
	}

	
	@When("User click on heart icon to add Sony VAIO laptop to wish list")
	public void user_click_on_heart_icon_to_add_sony_vaio_laptop_to_wish_list() {
		LapTopNoteBooks.ClickAddSonyToWishList();
		logger.info("user added the sony vaio to wish list sucessfully");
		Utils.hardWait(4000);
	}

	@When("User click on MacBook Pro item")
	public void user_click_on_mac_book_pro_item() {
		LapTopNoteBooks.ClickOnMacProLapTop();
		logger.info("user clicked on macbook pro air sucsessfully");
		Utils.hardWait(4000);
	   
	}


}
