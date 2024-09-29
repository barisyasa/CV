package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.RadioButtonPage;

public class RadioButtonPageSteps {
  RadioButtonPage radioButtonPage = new RadioButtonPage();

  @Given("User is on the Radio Button page")
  public void user_is_on_the_radio_button_page(){
      radioButtonPage.openRadioButtonPage();
  }

  @When("User clicks on the Yes Radio Button")
  public void user_clicks_on_the_yes_radio_button(){
      radioButtonPage.clickYesRadioButton();
  }

  @Then("A yes radio button message is displayed")
    public void a_yes_radio_button_message_is_displayed(){
      radioButtonPage.verifySuccessText();
  }
}
