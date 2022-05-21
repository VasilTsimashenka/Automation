package service;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class InputDateofBirth {

    static SelenideElement selectFieldDays = $("#uniform-days");
    static SelenideElement selectDays = $("#days");
    static SelenideElement selectFieldMonth = $("#uniform-months");
//    static SelenideElement selectMonth = $("#months)");
    static SelenideElement selectMonth = $("#months > option:nth-child(2)");
    static SelenideElement selectFieldYears = $("#uniform-years");
    static SelenideElement selectYears = $("#years");

    public static void createDateOfBirth() {
        selectFieldDays.click();
        selectDays.sendKeys("1");
        selectFieldMonth.click();
        selectMonth.click();
        selectFieldYears.click();
        selectYears.sendKeys("2020");
    }

}
