package stepDefinitions;

import io.cucumber.java.en.*;
import pages.ButtonsPage;

public class ButtonsPageSteps {
    ButtonsPage buttonsPage = new ButtonsPage();

    @Given("User is on the Buttons page")
    public void user_is_on_the_buttons_page() {
        buttonsPage.openButtonsPage();
    }

    @When("User double clicks on the Double Click Me button")
    public void user_double_clicks_on_the_double_click_me_button() {
        buttonsPage.doubleClickButton();
    }

    @Then("A double click message is displayed")
    public void a_double_click_message_is_displayed() {
        buttonsPage.verifyDoubleClickMessage();
    }

    @When("User right clicks on the Right Click Me button")
    public void user_right_clicks_on_the_right_click_me_button() {
        buttonsPage.rightClickButton();
    }

    @Then("A right click message is displayed")
    public void a_right_click_message_is_displayed() {
        buttonsPage.verifyRightClickMessage();
    }


}
