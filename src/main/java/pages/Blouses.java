package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class Blouses {
    static SelenideElement womenFieldMenuLine = $("a[title='Women']");
    static SelenideElement blousesWomenField = $("a[title='Blouses']");
    static SelenideElement blouseBlousesMenu = $("img[title='Blouse']");
    static SelenideElement moreBtnBlouse = $("[title='View']");
    static SelenideElement addWishListBtn = $("#wishlist_button");
    static SelenideElement clickOkWishList = $("a[title='Close']");

    public static void clickBlousesWomenField() {
        womenFieldMenuLine.hover();
        blousesWomenField.click();
    }

    public static void clickMoreBtnBlouse() {
        blouseBlousesMenu.hover();
        moreBtnBlouse.click();
    }

    public static void addWishList() {
        addWishListBtn.click();
        clickOkWishList.click();
    }
}
