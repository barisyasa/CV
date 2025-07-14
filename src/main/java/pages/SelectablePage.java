package pages;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.junit.Assert;

public class SelectablePage {

    private SelenideElement firstItem = $("ul#verticalListContainer li:first-child");

    public void openSelectablePage() {
        open("https://demoqa.com/selectable");
    }

    public void clickFirstItem() {
        firstItem.click();
    }

    public void verifyFirstItem(String expectedText) {
        SelenideElement topSelectedItem = $("ul#verticalListContainer li.active");


        // Seçili öğe ile beklenen değeri karşılaştırıyoruz
        Assert.assertEquals(expectedText, topSelectedItem.getText());
    }
}
