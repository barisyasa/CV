package stepDefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.TheInternetPage;

public class TheInternetPageSteps {

    TheInternetPage theInternetPage = new TheInternetPage();

    @Given("User is on the The Internet Page")
    public void user_is_on_the_internet_page(){
        theInternetPage.openTheInternetPage();
    }

    @When("User fill form and click submit button")
    public void user_fill_form_and_click_submit_button(){
        theInternetPage.loginTheInternetPage();
    }

    @Then("A toas message must display")
    public void a_toas_message_must_display(){
        theInternetPage.verifyLoginProcess();
    }
}
