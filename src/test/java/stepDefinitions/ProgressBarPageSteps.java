package stepDefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ProgressBarPage;

public class ProgressBarPageSteps {
    ProgressBarPage progressBarPage = new ProgressBarPage();

    @Given("User is on progressbar Page")
    public void user_is_on_progressbar_page(){
        progressBarPage.openProgressBarPage();
    }

    @When("Click progressbar button")
    public void click_progressbar_button(){
        progressBarPage.startProgressBar();
    }

    @Then("Stop progressbar when full")
    public void stop_progressbar_when_full(){
        progressBarPage.stopProgressBar("100%");
    }
}
