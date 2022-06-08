package tests;

import base.BaseTest;
import com.codeborne.selenide.Selenide;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import enums.Feature;
import service.ui.ScreenshotService;


import static com.codeborne.selenide.Condition.disappear;
import static com.codeborne.selenide.Selenide.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static pages.CreateAccountPage.createAccount;
import static pages.MainPage.*;
import static pages.SignInPage.loginAs;
import static service.Proceed_Checkout.clickConfirmOrderPaymentPageBtn;
import static service.Proceed_Checkout.proceedCheckoutPrintedDress;
import static service.ui.ScreenshotService.uiExecutor;
import static utils.CreateRandomEmail.mailRandom;

public class TestCases extends BaseTest {

    @Test
    @Owner("Tsimashenka Vasil")
    public void orderPaymentOfGoods() {
        String expectedMessage = "Your order on My Store is complete.\n"
                + "Please send us a bank wire with\n"
                + "- Amount $29.12\n"
                + "- Name of account owner Pradeep Macharla\n"
                + "- Include these details xyz\n"
                + "- Bank name RTP\n";
        open("/");
//        ScreenshotService.uiExecutor(Feature.EXAMPLE);
//        uiExecutor(Feature.EXAMPLE);
        loginAs("tests891@gmail.com", "12345");
        selectCasualDresses();
        addCartPrintedDress();
        proceedCheckoutPrintedDress();
        clickConfirmOrderPaymentPageBtn();
        Assertions.assertTrue(Selenide.$(".box").getText().contains(expectedMessage));
//        assertEquals(
//                "New comment\n" +
//                        "Your comment has been added and will be available once approved by a moderator\n" +
//                        "\n" +
//                        "OK",
//                $(".box").getText());
////        uiExecutor(Feature.EXAMPLE_2);
    }

    @Test
    public void sendEmailToCustomerService() {
        String expectedMessage = "Your message has been successfully sent to our team.";
        open("/");
//        uiExecutor(Feature.EXAMPLE);
        clickSignInButton();
        mailRandom(5);
        createAccount("Vasil", "Tim", "12345");
        selectCasualDresses();
        addCartPrintedDress();
        proceedCheckoutPrintedDress();
        clickConfirmOrderPaymentPageBtn();
        customerServiceContactUsPage();
        Assertions.assertTrue(Selenide.$(".alert.alert-success").getText().contains(expectedMessage));
    }

    @Test
    public void writeReview() {
        open("/");
        loginAs("tests891@gmail.com", "12345");
        selectT_Shirts();
        fadedShortSleeveT_shirtsAndClickOnMoreBtn();


//        $("div > a.product_img_link > img").hover();
//        $(".button.lnk_view.btn.btn-default").click();
//        $("#product_comments_block_extra > ul > li > a").click();
//        $("#criterions_list > li > div.star_content > div:nth-child(7) > a").click();
//        $("#comment_title").sendKeys("High quality product");
//        $("#content").sendKeys("Faded short sleeve t-shirt with high neckline. Soft and " +
//                "stretchy material for a comfortable fit. Accessorize with a straw hat and you're ready for summer!");
//        $("#submitNewMessage").click();
//        $("#id_new_comment_form").should(disappear);
//
//        assertEquals(
//                "New comment\n" +
//                        "Your comment has been added and will be available once approved by a moderator\n" +
//                        "\n" +
//                        "OK",
//                $(".fancybox-inner").getText());
//        $(".fancybox-opened div > div > div > p.submit > button").click();

    }

    @Test
    public void addBlouseToWishlist() {
        open("/");
        $(".login").click();
        $("#email").sendKeys("tests891@gmail.com");
        $("#passwd").sendKeys("12345");
        $("#SubmitLogin").click();
        $("#block_top_menu > ul > li:nth-child(1) > a").hover();
        $("#block_top_menu > ul > li:nth-child(1) > ul > li:nth-child(1) > ul > li:nth-child(2) > a").click();
        $("div.right-block > h5 > a").hover();
        $("a.button.lnk_view.btn.btn-default").click();
        $("#wishlist_button").click();
        $(".fancybox-overlay-fixed > div > div > a").click();
        $("nav > div:nth-child(1) > a").click();
        $(".icon-heart").click();
        $("td:nth-child(1) > a").click();
        $(".wishlist_delete > a").click();
        Selenide.switchTo().alert().accept();
        $("#block-history > table").should(disappear);
        Assertions.assertFalse($("#block-history > table").isDisplayed());

    }

    @Test
    public void checkColorSelection() {
        open("/");
        $("#block_top_menu > ul > li:nth-child(2) > a").hover();
        $("#block_top_menu > ul > li:nth-child(2) > ul > li:nth-child(3) > a").click();
        $(".last-mobile-line > div > div.left-block > div > a.product_img_link").hover();
        $(".first-item-of-mobile-line.last-mobile-line > div > div.right-block > div." +
                "button-container > a.button.lnk_view.btn.btn-default").click();
        $("#color_11").click();
        $("#color_13").click();
        $("#color_14").click();
        $("#color_16").click();


    }
}
