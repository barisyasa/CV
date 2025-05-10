package stepDefinitions;

import io.cucumber.java.en.*;
import pages.BookStorePage;

public class BookStorePageSteps {

    BookStorePage bookStorePage = new BookStorePage();

    @Given("User is on Book Store Page")
    public void user_is_on_book_store_page(){
        bookStorePage.openBookStorePage();
    }

    @When("User fill form and click on the Register button")
    public void user_fill_form_and_click_on_the_register_button(){
        bookStorePage.fillAndSubmitRegisterForm();
    }

    @Then("Verify error message")
    public void verify_error_message(){
        bookStorePage.verifyErrorMessage();
    }
}
