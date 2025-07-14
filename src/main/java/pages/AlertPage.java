package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

import java.time.Duration;



public class AlertPage {

    private SelenideElement alertButton = $("#alertButton");
    private SelenideElement fiveSecondAlertButton = $("#timerAlertButton");

    public void openAlertPage(){
        open("https://demoqa.com/alerts");
    }

    public void clickAlertButton(){
        alertButton.shouldBe(visible).click();
    }

    public void clickFiveSecondAlertButton(){
        fiveSecondAlertButton.scrollTo().shouldBe(visible).click();
        WebDriverWait wait = new WebDriverWait(getWebDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent());

    }
    public void closeAlert(){
        switchTo().alert().dismiss();
    }

    public void closeTimerAlert() {

        switchTo().alert().dismiss();// Alert'in açılmasını bekler

    }

}
