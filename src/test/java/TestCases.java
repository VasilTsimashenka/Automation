import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.apache.commons.lang.RandomStringUtils;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCases {
    @Test
    public void orderPaymentOfGoods() {
        Selenide.open("http://automationpractice.com/index.php");
        $(".login").click();
        $("#email").sendKeys("tests891@gmail.com");
        $("#passwd").sendKeys("12345");
        $("#SubmitLogin").click();
        $("#block_top_menu > ul > li:nth-child(2) > a").hover();
        $("#block_top_menu > ul > li:nth-child(2) > ul > li:nth-child(1) > a").click();
        $("#center_column > ul > li > div > div.right-block > h5 > a").scrollIntoView(true).hover();
        $(".ajax_add_to_cart_button").click();
        $("div.layer_cart_cart.col-xs-12.col-md-6 > div.button-container > a").click();
        $(" .standard-checkout.button-medium").click();
        $("#center_column > form > p > button").click();
        $("#uniform-cgv").click();
        $("#form > p > button").click();
        $("#HOOK_PAYMENT > div:nth-child(1) > div > p > a").click();
        $("#cart_navigation > button").click();

    }

    @Test
    public void sendEmailToCustomerService() {
        Selenide.open("http://automationpractice.com/index.php");
        $(".login").click();
        $("#email_create").sendKeys(RandomStringUtils.randomAlphabetic(5) + "@gmail.com");
        $("#SubmitCreate").click();
        $("#uniform-id_gender1").click();
        $("#customer_firstname").sendKeys("Vasil");
        $("#customer_lastname").sendKeys("Tim");
        $("#passwd").sendKeys("12345");
        $("#uniform-days").click();
        $("#days").sendKeys("1");
        $("#uniform-months").click();
        $("#months > option:nth-child(2)").click();
        $("#uniform-years").click();
        $("#years").sendKeys("2020");
        $("#uniform-newsletter").click();
        $("#uniform-optin").click();
        $("#company").sendKeys("Kaseya");
        $("#address1").sendKeys("701 Brickell Avenue");
        $("#city").sendKeys("Miami");
        $("#uniform-id_state").click();
        $("#id_state").sendKeys("Florida");
        $("#postcode").sendKeys("33131");
        $("#uniform-id_country").click();
        $("#id_country").sendKeys("United States)");
        $("#other").sendKeys("Additional information");
        $("#phone").sendKeys("+375292929297");
        $("#phone_mobile").sendKeys("+375333333333");
        $("#alias").sendKeys("18, Baker street");
        $("#submitAccount").click();
        $("#block_top_menu > ul > li:nth-child(2) > a").hover();
        $("#block_top_menu > ul > li:nth-child(2) > ul > li:nth-child(1) > a").click();
        $("#center_column > ul > li > div > div.right-block > h5 > a").hover();
        $(".ajax_add_to_cart_button").click();
        $("div.layer_cart_cart.col-xs-12.col-md-6 > div.button-container > a").click();
        $(" .standard-checkout.button-medium").click();
        $("#center_column > form > p > button").click();
        $("#uniform-cgv").click();
        $("#form > p > button").click();
        $("#HOOK_PAYMENT > div:nth-child(1) > div > p > a").click();
        $("#cart_navigation > button").click();
        $("#contact-link > a").click();
        $("#id_contact").sendKeys("Customer service");
        $("div.clearfix > div.col-xs-12.col-md-3 > div:nth-child(6) > div").click();
        $("div:nth-child(6) > div > select > option:nth-child(2)").click();
        String orderId = $("div.selector [name=\"id_order\"").getValue();
        $("select[name=\"id_product\"][id=\"" + orderId + "_order_products\"]").selectOption(1);
        $("#message").sendKeys("I have a problem with my order. Could you help me?");
        $("#submitMessage").click();
    }

    @Test
    public void writeReview() {
        Selenide.open("http://automationpractice.com/index.php");
        $(".login").click();
        $("#email").sendKeys("tests891@gmail.com");
        $("#passwd").sendKeys("12345");
        $("#SubmitLogin").click();
        $("#block_top_menu > ul > li:nth-child(3) > a").click();
        $("div > a.product_img_link > img").hover();
        $(".button.lnk_view.btn.btn-default").click();
        $("#product_comments_block_extra > ul > li > a").click();
        $("#criterions_list > li > div.star_content > div:nth-child(7) > a").click();
        $("#comment_title").sendKeys("High quality product");
        $("#content").sendKeys("Faded short sleeve t-shirt with high neckline. Soft and " +
                "stretchy material for a comfortable fit. Accessorize with a straw hat and you're ready for summer!");
        $("#submitNewMessage").click();
        $("#id_new_comment_form").should(Condition.disappear);

        assertEquals(
                "New comment\n" +
                        "Your comment has been added and will be available once approved by a moderator\n" +
                        "\n" +
                        "OK",
                $(".fancybox-inner").getText());
        $(".fancybox-opened div > div > div > p.submit > button").click();

    }

    @Test
    public void addBlouseToWishlist() {
        Selenide.open("http://automationpractice.com/index.php");
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

    }

    @Test
    public void checkColorSelection () {
        Selenide.open("http://automationpractice.com/index.php");
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
