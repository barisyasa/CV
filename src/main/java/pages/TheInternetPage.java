package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

import java.time.Duration;

public class TheInternetPage {

    private SelenideElement userName = $("#username");
    private SelenideElement password = $("#password");
    private SelenideElement submit = $(".radius");
    private SelenideElement toasMessage = $("#flash");

    public void openTheInternetPage(){
        open("https://the-internet.herokuapp.com/login");
    }

    public void loginTheInternetPage(){
        userName.shouldBe(visible).setValue("tomsmith");
        password.shouldBe(visible).setValue("SuperSecretPassword!");
        submit.click();
    }

    public void verifyLoginProcess(){
        toasMessage.shouldHave(text(" You logged into a secure area! "));
    }
}
