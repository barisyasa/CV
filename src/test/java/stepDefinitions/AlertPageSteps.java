package stepDefinitions;

import io.cucumber.java.en.*;
import pages.AlertPage;

public class AlertPageSteps {
    AlertPage alertPage = new AlertPage();

    @Given("User is on the Alert page")
    public void user_is_on_the_alert_page() {
        alertPage.openAlertPage();
    }

  @When("User clicks on the alert button")
    public void user_clicks_on_the_alert_button(){
      alertPage.clickAlertButton();
  }

  @Then("User close alert")
    public void user_close_alert(){
      alertPage.closeAlert();
  }
}
