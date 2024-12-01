package pages;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;


public class AlertPage {

    private SelenideElement alertButton = $("#alertButton");

    public void openAlertPage(){
        open("https://demoqa.com/alerts");
    }

    public void clickAlertButton(){
        alertButton.shouldBe(visible).click();
    }

    public void closeAlert(){
        switchTo().alert().dismiss();
    }
}
