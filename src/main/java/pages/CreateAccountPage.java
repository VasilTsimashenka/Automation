package pages;

import com.codeborne.selenide.SelenideElement;
import org.apache.commons.lang3.RandomStringUtils;

import static com.codeborne.selenide.Selenide.$;
import static service.InputDateofBirth.createDateOfBirth;


public class CreateAccountPage {

    static SelenideElement genderMan = $("#uniform-id_gender1");
    static SelenideElement firstName = $("#customer_firstname");
    static SelenideElement lastNameCustomer = $("#customer_lastname");
    static SelenideElement password = $("#passwd");
    static SelenideElement uniformNewsLetter = $("#uniform-newsletter");
    static SelenideElement uniformOptin = $("#uniform-optin");
    static SelenideElement selectCompany = $("#company");
    static SelenideElement address1 = $("#address1");
    static SelenideElement city = $("#city");
    static SelenideElement uniformState = $("#uniform-id_state");
    static SelenideElement selectState = $("#id_state");
    static SelenideElement postcode = $("#postcode");
    static SelenideElement uniformCountry = $("#uniform-id_country");
    static SelenideElement selectCountry = $("#id_country");
    static SelenideElement fieldOther = $("#other");
    static SelenideElement fieldPhone = $("#phone");
    static SelenideElement fieldPhoneMobile = $("#phone_mobile");
    static SelenideElement fieldAlias = $("#alias");
    static SelenideElement submitCreateAccountBtn = $("#submitAccount");


    public static void createAccount(String name, String lastName, String passwd) {

        genderMan.click();
        firstName.sendKeys(name);
        lastNameCustomer.sendKeys(lastName);
        password.sendKeys(passwd);
        createDateOfBirth();
        uniformNewsLetter.click();
        uniformOptin.click();
        selectCompany.sendKeys("Kaseya");
        address1.sendKeys("701 Brickell Avenue");
        city.sendKeys("Miami");
        uniformState.click();
        selectState.sendKeys("Florida");
        postcode.sendKeys("33131");
        uniformCountry.click();
        selectCountry.sendKeys("United States)");
        fieldOther.sendKeys("Additional information");
        fieldPhone.sendKeys("+375292929297");
        fieldPhoneMobile.sendKeys("+375333333333");
        fieldAlias.sendKeys("18, Baker street");
        submitCreateAccountBtn.click();

    }
}
