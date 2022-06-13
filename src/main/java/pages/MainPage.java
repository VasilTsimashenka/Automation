package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Condition.disappear;
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
    static String selectOrder = "select[name=\"id_product\"][id=\"%s_order_products\"]";
    static SelenideElement messageFieldContactUs = $("#message");
    static SelenideElement submitBtnContactUs = $("#submitMessage");
    static SelenideElement selectT_Shirts = $("li:nth-child(3) > a[title='T-shirts']");
    static SelenideElement fadedShortSleeveT_shirts = $(".product_img_link > img");
    static SelenideElement onMoreBtn = $(".button.lnk_view.btn.btn-default");
    static SelenideElement fieldWriteReview = $("#product_comments_block_extra > ul > li > a");
    static SelenideElement fieldFiveStarWriteReview = $(".star_content > div:nth-child(7) > a");
    static SelenideElement fieldTitleWriteReview = $("#comment_title");
    static SelenideElement fieldCommentWriteReview = $("#content");
    static SelenideElement sendBtn = $("#submitNewMessage");
    static SelenideElement fieldNewCommentOkBtn = $(".fancybox-opened > div > div > div > p.submit > button");
    static SelenideElement windowClosingWait = $("#id_new_comment_form");
    static SelenideElement selectSummerDresses = $("#block_top_menu > ul > li:nth-child(2) > " +
            "ul > li:nth-child(3) > a");

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
        $(String.format(selectOrder, orderIdContactUsField.getValue())).selectOption(1);
        messageFieldContactUs.sendKeys("I have a problem with my order. Could you help me?");
        submitBtnContactUs.click();
    }

    public static void selectT_Shirts() {
        selectT_Shirts.click();
    }

    public static void fadedShortSleeveT_shirtsAndClickOnMoreBtn() {
        fadedShortSleeveT_shirts.hover();
        onMoreBtn.click();
    }

    public static void clickFieldWriteReview() {
        fieldWriteReview.click();
    }

    public static void chooseFiveStar() {
        fieldFiveStarWriteReview.click();
    }

    public static void sendTextFieldTitleWriteReview(String text) {
        fieldTitleWriteReview.sendKeys(text);
    }

    public static void sendTextFieldCommentWriteReviewAndSendClick(String text) {
        fieldCommentWriteReview.sendKeys(text);
        sendBtn.click();
    }

    public static void fieldNewCommentOkBtnClick() {
        fieldNewCommentOkBtn.click();
    }

    public static void windowClosingWaitDisappear() {
        windowClosingWait.should(disappear);
    }

    public static void selectSummerDresses() {
        hoverDresses.hover();
        selectSummerDresses.click();
    }
}

