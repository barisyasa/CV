package pages;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;



public class LoginPage {

    private SelenideElement userNameTextBox = $("#user-name");
    private SelenideElement passwordTextBox = $("#password");
    private SelenideElement loginButton = $("#login-button");
    private SelenideElement shoppingCard = $(".shopping_cart_container");
    String username = "standard_user";
    String password = "secret_sauce";


    public void openLoginPage(){
        open("https://www.saucedemo.com");
    }

    public void fillUsernameAndPassword(){
        userNameTextBox.setValue(username);
        passwordTextBox.setValue(password);
    }

    public void clickLoginButton(){
        loginButton.click();
    }

    public void checkLogin(){
        if (shoppingCard.exists()) {
            System.out.println("Buton sayfada mevcut.");
        } else {
            System.out.println("Buton sayfada mevcut değil.");
        }
    }
}
