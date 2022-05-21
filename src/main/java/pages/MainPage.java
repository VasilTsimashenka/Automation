package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class MainPage {
    static SelenideElement signInButton = $(".login");
    static SelenideElement hoverDresses = $("#block_top_menu > ul > li:nth-child(2) > a");
    static SelenideElement selectCasualDressesFromDresses = $("#block_top_menu > " +
            "ul > li:nth-child(2) > ul > li:nth-child(1) > a");
    static SelenideElement printedDressCasualDresses = $("#center_column > ul > li > " +
            "div > div.right-block > h5 > a");
    static SelenideElement addCartBtn = $(".ajax_add_to_cart_button");
    static SelenideElement contactUsBtn = $("#contact-link");
    static SelenideElement subjectHeadingField = $("#id_contact");
    static SelenideElement orderReference = $(".col-md-3 > div:nth-child(6) > div > select");
    static SelenideElement selectProductField = $("div:nth-child(6) > div > select > option:nth-child(2)");
    static SelenideElement orderIdContactUsField = $("div.selector [name=\"id_order\"");
    static SelenideElement selectOrder = $("select[name=\"id_product\"][id=\"" + orderIdContactUsField + "_order_products\"]");
    static SelenideElement messageFieldContactUs = $("#message");
    static SelenideElement submitBtnContactUs = $("#submitMessage");




    public static void clickSignInButton() {
        signInButton.click();
    }

    public static void selectCasualDresses() {
        hoverDresses.hover();
        selectCasualDressesFromDresses.click();
    }
    public static void addCartPrintedDress() {
        printedDressCasualDresses.hover();
        addCartBtn.click();
    }

    public static void customerServiceContactUsPage() {
        contactUsBtn.click();
        subjectHeadingField.sendKeys("Customer service");
        orderReference.click();
        selectProductField.click();
        orderIdContactUsField.getValue();
        selectOrder.selectOption(1);
        messageFieldContactUs.sendKeys("I have a problem with my order. Could you help me?");
        submitBtnContactUs.click();


    }



}
