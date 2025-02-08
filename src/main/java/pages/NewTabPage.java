package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.empty;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class NewTabPage {
    private SelenideElement newTabButton = $("#tabButton");
    private SelenideElement newTabText = $("#sampleHeading");
    private SelenideElement newWindowButton = $("#windowButton");
    private SelenideElement newWindowText = $("#windowButton");
    private SelenideElement newWindowMsgButton = $("#messageWindowButton");


    public void openNewTabPage(){
        open("https://demoqa.com/browser-windows");
    }

    public void clickNewTabButton(){
        newTabButton.click();
    }

    public void seeNewTabText(){
        switchTo().window(1);
        newTabText.shouldBe(visible);
    }

    public void clickNewWindowButton(){
        newWindowButton.click();
    }

    public void seeNewWindowText(){
        switchTo().window(1);
        newWindowText.shouldBe(visible);
    }

    public void clickNewWindowMsgButton(){
        newWindowMsgButton.click();
    }

    public void seeNewWindowMsg(){
        switchTo().window(1);
        $("body").shouldNotBe(empty);
    }
}
