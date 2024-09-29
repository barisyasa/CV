package  pages;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import java.time.Duration;


public class TextBoxPage {
    private SelenideElement userNameTextBox = $("#userName");
    private SelenideElement userMailTextBox = $("#userEmail");
    private SelenideElement currentAddressTextBox = $("#currentAddress");
    private SelenideElement permanentAddressTextBox = $("#permanentAddress");
    private SelenideElement submitButton = $("#submit");
    private SelenideElement outputShown = $("#output");

    public void openTextBoxPage(){
        open("https://demoqa.com/text-box");
    }

    public void clickSubmitButton(){
        submitButton.scrollIntoView(true).click();
    }

    public void fillTextBoxPageForm(){
        userNameTextBox.setValue("Barış Yasa");
        userMailTextBox.setValue("barisyasa1@gmail.com");
        currentAddressTextBox.setValue("Örnek Mah. Gezgin Sok. No 12 Daire 2");
        permanentAddressTextBox.setValue("Eğitim Mah. Harun Sok. No 12 Daire 2");

    };

    public void isOutputShown(){
        outputShown.shouldBe(visible);
    };

}
