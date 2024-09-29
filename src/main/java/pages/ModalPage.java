package pages;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

import com.codeborne.selenide.SelenideElement;

public class ModalPage {
    private SelenideElement openModalButton = $("#showSmallModal");
    private SelenideElement closeModalButton = $("#closeSmallModal");

    public void openModalPage(){
        open("https://demoqa.com/modal-dialogs");
    }

    public void clickOpenModalButton(){
        openModalButton.click();
    }

    public void verifyModal(){
        closeModalButton.shouldBe(visible);
    }

    public void clickCloseModalButton(){
        closeModalButton.click();
    }
}
