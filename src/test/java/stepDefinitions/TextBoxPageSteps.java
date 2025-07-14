package stepDefinitions;

import io.cucumber.java.en.*;
import pages.ButtonsPage;
import pages.TextBoxPage;

public class TextBoxPageSteps {
     TextBoxPage textBoxPage = new TextBoxPage();

     @Given("User is on the TextBox page")
     public void user_is_on_the_textbox_page(){
         textBoxPage.openTextBoxPage();
     }

     @When("User fill form and click on the Submit button")
     public void user_fill_form_and_click_on_the_submit_button(){
         textBoxPage.fillTextBoxPageForm();
         textBoxPage.clickSubmitButton();
     }

     @Then("A output is displayed")
    public void a_output_is_displayed(){
         textBoxPage.isOutputShown();
     }
}
