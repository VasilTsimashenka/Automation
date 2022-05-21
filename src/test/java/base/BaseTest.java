package base;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import static com.codeborne.selenide.Browsers.CHROME;
import static com.codeborne.selenide.Browsers.FIREFOX;

public class BaseTest {
    @BeforeAll
    public static void setUp() {
        Configuration.baseUrl = "http://automationpractice.com/index.php";
        Configuration.timeout = 5000;
        Configuration.browser = "CHROME";
        Configuration.browserSize = "1366x768";
        Configuration.headless = false;
        Configuration.savePageSource = true;
        final DesiredCapabilities capabilities = new DesiredCapabilities();
        Configuration.fastSetValue = true;
        Configuration.browserCapabilities = capabilities;
    }

    @BeforeEach
    public void begin() {
        Selenide.open("/");
    }

    @AfterEach
    public void tearDown() {
        Selenide.closeWindow();
    }

}
