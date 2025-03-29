package pages;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.junit.Assert;
import static com.codeborne.selenide.Selenide.$;

public class DatePickerPage {

    private SelenideElement selectDateItem = $("#datePickerMonthYearInput");
    private SelenideElement selectDateAndTimeItem = $("#dateAndTimePickerInput");

    public void openDatePickerPage(){
        open("https://demoqa.com/date-picker");
    }

    public void selectDate(){
        selectDateItem.click();
        selectDateItem.setValue("01/01/1995");
    }

    public void SelectDateAndTime(){
        selectDateAndTimeItem.click();
        selectDateAndTimeItem.setValue("March 10, 2025 12:55 AM");
    }

    public void verifySelectedDate(){
        selectDateItem.shouldHave(value("01/01/1995"));
    }

    public void verifySelectedDateAndTime(){
        selectDateAndTimeItem.scrollTo();
        selectDateAndTimeItem.shouldHave(value("March 10, 2025 12:55 AM"));
    }


}
