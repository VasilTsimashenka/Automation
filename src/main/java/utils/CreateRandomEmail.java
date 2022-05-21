package utils;

import com.codeborne.selenide.SelenideElement;
import org.apache.commons.lang3.RandomStringUtils;

import static com.codeborne.selenide.Selenide.$;

public class CreateRandomEmail {

    static SelenideElement createRandomEmail = $("#email_create");
    static SelenideElement submitCreateBtn = $("#SubmitCreate");

    public static String mailRandom(int size) {
        createRandomEmail.val(RandomStringUtils.randomAlphabetic(size) + "@gmail.com");
        submitCreateBtn.click();
        return null;
    }
}

