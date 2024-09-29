package stepDefinitions;

import io.cucumber.java.en.*;
import pages.ButtonsPage;
import pages.ModalPage;

public class ModalPageSteps {

    ModalPage modalPage = new ModalPage();

    @Given("User is on the modal page")
    public void user_is_on_the_modal_page(){
        modalPage.openModalPage();
    }

    @When("User clicks on the small modal button")
    public void user_clicks_on_the_small_modal_button(){
        modalPage.clickOpenModalButton();
    }

    @Then("A close modal button is displayed and click")
    public void a_close_modal_button_is_displayed_and_click(){
        modalPage.verifyModal();
        modalPage.clickCloseModalButton();
    }

}
