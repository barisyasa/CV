package  pages;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

public class RadioButtonPage {


    private SelenideElement yesRadioButton = $("label[for='yesRadio']");
    private SelenideElement successText = $(".text-success");

    public void openRadioButtonPage(){
        open("https://demoqa.com/radio-button");
    }

    public void clickYesRadioButton(){
        yesRadioButton.scrollIntoView(true).click();
    }

    public void verifySuccessText(){
        successText.shouldHave(text("Yes"));
    }
}
