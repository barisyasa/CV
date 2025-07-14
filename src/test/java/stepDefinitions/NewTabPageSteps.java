package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.NewTabPage;

public class NewTabPageSteps {

    NewTabPage newTabPage = new NewTabPage();

    @Given("User is on New Tab page")
    public void user_is_on_new_tab_page(){
        newTabPage.openNewTabPage();
    }

    @When("User click new tab button")
    public void user_click_new_tab_button(){
        newTabPage.clickNewTabButton();
    }

    @Then("User should see new tab text")
    public void user_should_see_new_tab_text(){
        newTabPage.seeNewTabText();
    }

    @When("User click new window button")
    public void user_click_new_window_button(){
        newTabPage.clickNewWindowButton();
    }

    @Then("User should see new window text")
    public void user_should_see_new_window_text(){
        newTabPage.seeNewWindowText();
    }

    @When("User click new window message button")
    public void user_click_new_window_message_button(){
        newTabPage.clickNewWindowMsgButton();
    }

    @Then("User should see message")
    public void user_should_see_message(){
        newTabPage.seeNewWindowMsg();
    }
}
