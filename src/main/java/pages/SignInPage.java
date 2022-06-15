package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class SignInPage {
    static SelenideElement signInField = $(".login");
    static SelenideElement emailField = $("#email");
    static SelenideElement password = $("#passwd");
    static SelenideElement submitBtn = $("#SubmitLogin");

    public static void loginAs(String email, String passwd) {
        signInField.click();
        emailField.sendKeys(email);
        password.sendKeys(passwd);
        submitBtn.click();
    }
}
