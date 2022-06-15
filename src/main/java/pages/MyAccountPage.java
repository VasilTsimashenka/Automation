package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class MyAccountPage {
    static SelenideElement myAccountField =$("a[title='View my customer account']");
    static SelenideElement myWishListsField =$("[title='My wishlists']");
    static SelenideElement firstMyWishListWishListsField = $("td:nth-child(1) > a");
    static SelenideElement btnDeleteMyWishLists = $(".wishlist_delete > a");
    static SelenideElement blockMyWishList =$("#block-history > table");

    public static void clickMyAccountField() {
        myAccountField.click();
    }

    public static void clickMyWishListsField() {
        myWishListsField.click();
    }

    public static void clickfirstMyWishListWishListsField() {
        firstMyWishListWishListsField.click();
    }

    public static void deleteMyWishList() {
        btnDeleteMyWishLists.click();
        Selenide.switchTo().alert().accept();
        blockMyWishList.should(Condition.disappear);
    }
}
