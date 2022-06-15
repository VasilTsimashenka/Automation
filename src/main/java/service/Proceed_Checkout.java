package service;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class Proceed_Checkout {
    static SelenideElement shoppingCartSummaryPage =  $(".col-md-6 > div.button-container > a");
    static SelenideElement summaryPage = $(" .standard-checkout.button-medium");
    static SelenideElement adressesPage = $("#center_column > form > p > button");
    static SelenideElement termsOfServiceShippingPage = $("#uniform-cgv");
    static SelenideElement shippingPage = $("#form > p > button");
    static SelenideElement payByBankPaymentPage = $("#HOOK_PAYMENT > div:nth-child(1) > div > p > a");
    static SelenideElement confirmOrderPaymentPage = $("#cart_navigation > button");

    public static void proceedCheckoutPrintedDress() {
        shoppingCartSummaryPage.click();
        summaryPage.click();
        adressesPage.click();
        termsOfServiceShippingPage.click();
        shippingPage.click();
        payByBankPaymentPage.click();
    }

    public static void clickConfirmOrderPaymentPageBtn() {
        confirmOrderPaymentPage.click();
    }

}

