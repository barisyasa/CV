package stepDefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SelectablePage;

public class SelectablePageSteps {

    SelectablePage selectablePage = new SelectablePage();

    @Given("Go selectable page")
    public void go_selectable_page(){
        selectablePage.openSelectablePage();
    }

    @When("Click first item")
    public void click_first_item(){
        selectablePage.clickFirstItem();
    }

    @Then("First item must be selected")
    public void first_item_must_be_selected(){
        selectablePage.verifyFirstItem("Cras justo odio");
    }


}
