package pages;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

import com.codeborne.selenide.SelenideElement;

public class ButtonsPage {
    // Butonlar için Selenide elementlerini tanımlıyoruz
    private SelenideElement doubleClickMeButton = $("#doubleClickBtn");
    private SelenideElement doubleClickMessage = $("#doubleClickMessage");
    private SelenideElement rightClickMeButton = $("#rightClickBtn");
    private SelenideElement rightClickMessage = $("#rightClickMessage");

    // Buton sayfasına gitme metodu
    public void openButtonsPage() {
        open("https://demoqa.com/buttons");
    }

    // Butona çift tıklama metodu
    public void doubleClickButton() {
        doubleClickMeButton.scrollIntoView(true).doubleClick();
    }

    // Çift tıklama mesajını kontrol eden metod
    public void verifyDoubleClickMessage() {
        doubleClickMessage.shouldHave(text("You have done a double click"));
    }

    public void rightClickButton(){
        rightClickMeButton.scrollIntoView(true).contextClick();
    }

    public void  verifyRightClickMessage(){
        rightClickMessage.shouldHave(text("You have done a right click"));
    }
}
