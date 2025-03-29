package pages;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.cucumber.java.eo.Se;
import org.junit.Assert;
import static com.codeborne.selenide.Selenide.$;
public class ProgressBarPage {

    private SelenideElement startStopButton = $("#startStopButton");
    private SelenideElement progressBar = $(".progress-bar.bg-success");

    public void openProgressBarPage(){
        open("https://demoqa.com/progress-bar");
    }

    public void startProgressBar(){
        startStopButton.click();
        sleep(10000);
    }

    public void stopProgressBar(String percent){

        progressBar.should(matchText(percent));

    }

}
