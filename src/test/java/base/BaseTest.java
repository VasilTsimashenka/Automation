package base;

import com.codeborne.selenide.Browsers;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.Step;
import io.qameta.allure.selenide.AllureSelenide;
import io.qameta.allure.selenide.LogType;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.chrome.ChromeOptions;
import model.config.TestConfig;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import utils.TestConfigSettings;

import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URI;
import java.util.Map;
import java.util.logging.Level;

import static com.codeborne.selenide.Browsers.CHROME;



public class BaseTest {
    private static final String ALLURE = "Allure";
    public static final TestConfig CONFIG = TestConfigSettings.getInstance().getTestConfig();
    @BeforeAll
    public static void setUp()  {
        Configuration.baseUrl = CONFIG.getBaseUrl();
        Configuration.timeout = CONFIG.getTimeout();
        Configuration.browserVersion = CONFIG.getBrowserVersion();
        Configuration.browser = CONFIG.getBrowser();
        Configuration.browserSize = CONFIG.getBrowserSize();
        Configuration.headless = CONFIG.getHeadless();
        Configuration.savePageSource = CONFIG.getSelenideSavePageSource();
        final DesiredCapabilities capabilities = new DesiredCapabilities();

        if (Configuration.browser.equals("firefox")) {
            capabilities.setBrowserName(Browsers.FIREFOX);
            final FirefoxOptions options = new FirefoxOptions().addArguments("private");
            capabilities.setCapability(FirefoxOptions.FIREFOX_OPTIONS, options);
        }
        if (Configuration.browser.equals("chrome")) {
            capabilities.setBrowserName(Browsers.CHROME);
            final ChromeOptions options = new ChromeOptions().addArguments("incognito");
            capabilities.setCapability(ChromeOptions.CAPABILITY, options);
        }
        Configuration.fastSetValue = true;
        capabilities.setCapability("selenoid:options", Map.<String, Object>of(
                "enableVNC", true,
                "enableVideo", true
        ));
        Configuration.browserCapabilities = capabilities;


    }

    @BeforeEach
    public void begin() {
        SelenideLogger.addListener(ALLURE, new AllureSelenide()
                .savePageSource(CONFIG.getSelenideSavePageSource())
                .screenshots(CONFIG.getSelenideScreenshots())
                .enableLogs(LogType.BROWSER, Level.SEVERE)
                .enableLogs(LogType.CLIENT, Level.SEVERE)
                .enableLogs(LogType.SERVER, Level.SEVERE)
                .enableLogs(LogType.PERFORMANCE, Level.SEVERE));
    }

    @AfterEach
    @Step("Close window")
    public void tearDown() {
        Selenide.closeWindow();
        SelenideLogger.removeListener(ALLURE);
    }


}
