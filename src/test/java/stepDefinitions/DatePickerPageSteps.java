package stepDefinitions;
import pages.DatePickerPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class DatePickerPageSteps {

    DatePickerPage datePickerPage = new DatePickerPage();

    @Given("Open date picker page")
    public void open_date_picker_page(){
        datePickerPage.openDatePickerPage();
    }

    @When("Select date")
    public void select_date(){
        datePickerPage.selectDate();
    }

    @When("Select date and time")
    public void select_date_and_time(){
        datePickerPage.SelectDateAndTime();
    }


    @Then("Verify selected date")
    public void verify_selected_date(){
        datePickerPage.verifySelectedDate();
    }

    @Then("Verify selected date and time")
    public void verify_selected_date_and_time(){
        datePickerPage.verifySelectedDateAndTime();
    }
}
