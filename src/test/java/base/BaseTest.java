package base;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.chrome.ChromeOptions;
import model.config.TestConfig;
import utils.TestConfigSettings;

import org.openqa.selenium.remote.DesiredCapabilities;

import static com.codeborne.selenide.Browsers.CHROME;



public class BaseTest {
    public static final TestConfig CONFIG = TestConfigSettings.getInstance().getTestConfig();
    @BeforeAll
    public static void setUp() {
        Configuration.baseUrl = CONFIG.getBaseUrl();
        Configuration.timeout = CONFIG.getTimeout();
        Configuration.browserVersion = CONFIG.getBrowserVersion();
        Configuration.browser = CONFIG.getBrowser();
        Configuration.browserSize = CONFIG.getBrowserSize();
        Configuration.headless = CONFIG.getHeadless();
        Configuration.savePageSource = CONFIG.getSelenideSavePageSource();
        final DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("enableVNC", CONFIG.getEnabledVnc());
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
