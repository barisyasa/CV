package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class LoginPageSteps {

    LoginPage loginPage = new LoginPage();

    @Given("User is on the Login page")
    public void User_is_on_the_Login_page(){
        loginPage.openLoginPage();
    }

    @When("User fill form and click on the Login button")
    public void User_fill_form_and_click_on_the_Login_button(){
        loginPage.fillUsernameAndPassword();
        loginPage.clickLoginButton();
    }

    @Then("A shopping card displayed")
    public void A_shopping_card_displayed(){
        loginPage.checkLogin();
    }
}
