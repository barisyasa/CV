package stepDefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.UploadAndDownloadPage;

public class UploadAndDownloadPageSteps {

    UploadAndDownloadPage uploadAndDownloadPage = new UploadAndDownloadPage();

    @Given("User is on upload and download page")
    public void user_in_on_upload_and_download_page(){
        uploadAndDownloadPage.openUploadAndDownloadPage();
    }

    @When("User download file")
    public void user_download_file(){
        uploadAndDownloadPage.downloadFile();
    }

    @Then("User close page")
    public void user_close_page(){
        uploadAndDownloadPage.closeUploadAndDownloadPage();
    }

}
