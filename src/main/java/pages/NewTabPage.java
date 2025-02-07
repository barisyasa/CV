package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class NewTabPage {
    private SelenideElement newTabButton = $("#tabButton");
    private SelenideElement newTabText = $("#sampleHeading");

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
}
