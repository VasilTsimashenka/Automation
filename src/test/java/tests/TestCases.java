package tests;

import base.BaseTest;
import com.codeborne.selenide.Selenide;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.*;
import enums.Feature;
import service.ui.ScreenshotService;


import static com.codeborne.selenide.Selenide.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static pages.Blouses.*;
import static pages.CreateAccountPage.createAccount;
import static pages.MainPage.*;
import static pages.MyAccountPage.*;
import static pages.SignInPage.loginAs;
import static pages.SummerDresses.*;
import static service.Proceed_Checkout.clickConfirmOrderPaymentPageBtn;
import static service.Proceed_Checkout.proceedCheckoutPrintedDress;
import static service.ui.ScreenshotService.uiExecutor;
import static utils.CreateRandomEmail.mailRandom;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class TestCases extends BaseTest {

    @Epic("TESTING FOR http://automationpractice.com/ tasks")
    @Test
    @Owner("Tsimashenka Vasil")
    @Order(5)
    public void orderPaymentOfGoods() {
        String expectedMessage = "Your order on My Store is complete.\n"
                + "Please send us a bank wire with\n"
                + "- Amount $29.12\n"
                + "- Name of account owner Pradeep Macharla\n"
                + "- Include these details xyz\n"
                + "- Bank name RTP\n";
        open("/");
        loginAs("tests891@gmail.com", "12345");
        selectCasualDresses();
        addCartPrintedDress();
        proceedCheckoutPrintedDress();
        clickConfirmOrderPaymentPageBtn();
        Assertions.assertTrue(Selenide.$(".box").getText().contains(expectedMessage));
//        uiExecutor(Feature.EXAMPLE_2);
    }

    @Epic("TESTING FOR http://automationpractice.com/ tasks")
    @Order(4)
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

    @Epic("TESTING FOR http://automationpractice.com/ tasks")
    @Order(3)
    @Test
    public void writeReview() {
        open("/");
        loginAs("tests891@gmail.com", "12345");
        selectT_Shirts();
        fadedShortSleeveT_shirtsAndClickOnMoreBtn();
        clickFieldWriteReview();
        chooseFiveStar();
        sendTextFieldTitleWriteReview("High quality product");
        sendTextFieldCommentWriteReviewAndSendClick("Faded short sleeve t-shirt with high neckline. Soft and stretchy " +
                "material for a comfortable fit. Accessorize with a straw hat and you're ready for summer!");
        windowClosingWaitDisappear();
        assertEquals(
                "New comment\n" +
                        "Your comment has been added and will be available once approved by a moderator\n" +
                        "\n" +
                        "OK",
                $(".fancybox-inner").getText());
        fieldNewCommentOkBtnClick();
    }

    @Epic("TESTING FOR http://automationpractice.com/ tasks")
    @Order(2)
    @Test
    public void addBlouseToWishlist() {
        open("/");
        loginAs("tests891@gmail.com", "12345");
        clickBlousesWomenField();
        clickMoreBtnBlouse();
        addWishList();
        clickMyAccountField();
        clickMyWishListsField();
        clickfirstMyWishListWishListsField();
        deleteMyWishList();
        Assertions.assertFalse($("#block-history > table").isDisplayed());
    }

    @Epic("TESTING FOR http://automationpractice.com/ tasks")
    @Order(1)
    @Test
    public void checkColorSelection() {
        open("/");
        selectSummerDresses();
        selectPrintedSummerDressesWithFourColor();
        ScreenshotService.uiExecutor(Feature.EXAMPLE);
        uiExecutor(Feature.EXAMPLE);
        clickBlackColorPrintedSummerDress();
        Assertions.assertTrue(Selenide.$(".color_pick.selected").exists());
        clickOrangeColorPrintedSummerDress();
        Assertions.assertTrue(Selenide.$(".color_pick.selected").exists());
        clickBlueColorPrintedSummerDress();
        Assertions.assertTrue(Selenide.$(".color_pick.selected").exists());
        clickYellowPrintedSummerDress();
        Assertions.assertTrue(Selenide.$(".color_pick.selected").exists());
    }
}
