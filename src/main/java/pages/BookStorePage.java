package pages;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

public class BookStorePage {

    private SelenideElement firstNameTextbox = $("#firstname");
    private SelenideElement lastNameTextbox = $("#lastname");
    private SelenideElement userNameTextbox = $("#userName");
    private SelenideElement passwordTextbox = $("#password");
    private SelenideElement registerBtn = $("#register");
    private SelenideElement errorMessage = $("#name");

    public void openBookStorePage(){
        open("https://demoqa.com/register");
    }

    public void fillAndSubmitRegisterForm(){
        firstNameTextbox.setValue("Bariss");
        lastNameTextbox.setValue("Yasa");
        userNameTextbox.setValue("barisyasa");
        passwordTextbox.setValue("Baris.yasa1");
        registerBtn.click();
    }

    public void verifyErrorMessage(){
        errorMessage.shouldHave(Condition.text("Please verify reCaptcha to register!"));
    }



}
