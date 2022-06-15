package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class SummerDresses {
    static SelenideElement selectorPrintedSummerDresses = $$("img[alt='Printed Summer Dress']").get(0);
    static SelenideElement selectorMoreBtn = $$("a.button.lnk_view.btn.btn-default").get(0);
    static SelenideElement blackColorPrintedSummerDress = $("a[title='Black']");
    static SelenideElement orangeColorPrintedSummerDress = $("a[title='Orange']");
    static SelenideElement blueColorPrintedSummerDress = $("a[title='Blue']");
    static SelenideElement yellowPrintedSummerDress = $("a[title='Yellow']");

    public static void selectPrintedSummerDressesWithFourColor() {
        selectorPrintedSummerDresses.hover();
        selectorMoreBtn.click();
    }

    public static void clickBlackColorPrintedSummerDress() {
        blackColorPrintedSummerDress.click();
    }

    public static void clickOrangeColorPrintedSummerDress() {
        orangeColorPrintedSummerDress.click();
    }

    public static void clickBlueColorPrintedSummerDress() {
        blueColorPrintedSummerDress.click();
    }

    public static void clickYellowPrintedSummerDress() {
        yellowPrintedSummerDress.click();
    }
}
