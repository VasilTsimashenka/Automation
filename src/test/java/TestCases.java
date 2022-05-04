import com.codeborne.selenide.Selenide;
import org.apache.commons.lang.RandomStringUtils;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class TestCases {
    @Test
    public void testCase1() {
        Selenide.open("http://automationpractice.com/index.php");
        $(".login").click();
        sleep(5000);

    }

    @Test
    public void testcase2() {
        Selenide.open("http://automationpractice.com/index.php");
        $(".login").click();
        sleep(2000);
        $("#email_create").sendKeys(RandomStringUtils.randomAlphabetic(5) + "@gmail.com");
        sleep(2000);
        $("#SubmitCreate").click();
        sleep(2000);
        $("#uniform-id_gender1").click();
        sleep(1000);
        $("#customer_firstname").sendKeys("Vasil");
        $("#customer_lastname").sendKeys("Tim");
        $("#passwd").sendKeys("12345");
        $("#uniform-days").click();
        $("#days").sendKeys("1");
        sleep(2000);
        $("#uniform-months").click();
        $("#months > option:nth-child(2)").click();
        sleep(2000);
        $("#uniform-years").click();
        $("#years").sendKeys("2020");
        sleep(2000);
        $("#uniform-newsletter").click();
        $("#uniform-optin").click();
        sleep(1000);
        $("#company").sendKeys("Kaseya");
        $("#address1").sendKeys("701 Brickell Avenue");
        sleep(3000);
        $("#city").sendKeys("Miami");
        $("#uniform-id_state").click();
        $("#id_state").sendKeys("Florida");
        sleep(2000);
        $("#postcode").sendKeys("33131");
        $("#uniform-id_country").click();
        $("#id_country").sendKeys("United States)");
        sleep(1000);
        $("#other").sendKeys("Additional information");
        $("#phone").sendKeys("+375292929297");
        $("#phone_mobile").sendKeys("+375333333333");
        $("#alias").sendKeys("18, Baker street");
        sleep(5000);
        $("#submitAccount").click();
        sleep(2000);

    }
}
